package com.alexjw.core.network;

import com.alexjw.core.server.guns.Bullet;
import com.alexjw.core.server.guns.Gun;
import com.alexjw.core.server.items.ItemGun;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.items.ItemHandlerHelper;

public class MessageReload implements IMessageHandler<MessageReload, IMessage>, IMessage {
    public MessageReload() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageReload message, MessageContext ctx)
    {
        FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> {
            EntityPlayer player = ctx.getServerHandler().player;
            World world = player.world;
            ItemStack heldItem = player.getHeldItem(EnumHand.MAIN_HAND);
            if(!heldItem.isEmpty() && heldItem.getItem() instanceof ItemGun)
            {
                ItemGun item = (ItemGun) heldItem.getItem();
                Gun gun = item.getGun();
                if(gun != null)
                {
                    for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                        ItemStack stack = player.inventory.getStackInSlot(i);
                        for(Bullet bullet: gun.getGunBullets()){
                            if(stack.isItemEqual(new ItemStack(bullet.getItemBullet()))){
                                ItemStack itemStack = new ItemStack(stack.getItem(), stack.getCount());
                                ItemHandlerHelper.giveItemToPlayer(player, itemStack, i);
                                item.setLoadedAmmo(new ItemStack(item), bullet, bullet.getBulletMag());
                                CooldownTracker tracker = player.getCooldownTracker();
                                if(!tracker.hasCooldown(heldItem.getItem())) {
                                    tracker.setCooldown(heldItem.getItem(), (int) gun.getReloadTime());
                                }
                                break;
                            }
                        }
                    }
                }
            }
            else {
                world.playSound(null, player.getPosition(), SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, 0.8F);
            }
        });
        return null;
    }
}

