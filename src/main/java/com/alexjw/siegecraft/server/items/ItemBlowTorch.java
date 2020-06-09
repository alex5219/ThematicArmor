package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.network.MessageBlowtorch;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemBlowTorch extends Item {
    public ItemBlowTorch() {
        super();
        this.setUnlocalizedName("blow_torch");
        this.setRegistryName(Siege.MODID, "blow_torch");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            SiegeNetworkHandler.wrapper.sendToServer(new MessageBlowtorch());
        }
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.BOW;
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int p, boolean flag) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) entity;
            if (entityPlayer.getHeldItemMainhand().getItem().equals(stack.getItem())) {
                if (world.isRemote) {
                    RayTraceResult rayTraceResult = entityPlayer.rayTrace(1, 1);
                    if (rayTraceResult != null) {
                        world.spawnParticle(EnumParticleTypes.FLAME, rayTraceResult.getBlockPos().getX(), rayTraceResult.getBlockPos().getY(), rayTraceResult.getBlockPos().getZ(), rayTraceResult.getBlockPos().getX(), rayTraceResult.getBlockPos().getY(), rayTraceResult.getBlockPos().getZ());
                    }
                }
            }
        }
    }
}
