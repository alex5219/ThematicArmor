package com.alexjw.siegecraft.network;

import com.alexjw.siegecraft.server.entity.EntityStim;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageShootPistol implements IMessageHandler<MessageShootPistol, IMessage>, IMessage {

    public MessageShootPistol() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageShootPistol message, MessageContext ctx) {
        if (ctx.side.isServer()) {
            EntityPlayer entityPlayer = ctx.getServerHandler().player;
            if (SiegeHelper.hasAmmo(entityPlayer)) {
                World world = entityPlayer.getEntityWorld();
                ItemStack itemStack = SiegeHelper.findAmmo(entityPlayer);
                if (!entityPlayer.capabilities.isCreativeMode) {
                    itemStack.shrink(1);
                    if (itemStack.isEmpty()) {
                        entityPlayer.inventory.deleteStack(itemStack);
                    }
                }
                if (!world.isRemote) {
                    entityPlayer.sendMessage(new TextComponentString("Spawning STIM"));
                    EntityStim entityStim = new EntityStim(world);
                    entityStim.shoot(entityPlayer, entityPlayer.rotationPitch, entityPlayer.rotationYaw, 0.0F, 1.5F, 1.0F);
                    world.spawnEntity(entityStim);
                    entityPlayer.sendMessage(new TextComponentString("Spawning STIM2"));
                }
            }
        }

        return null;
    }
}

