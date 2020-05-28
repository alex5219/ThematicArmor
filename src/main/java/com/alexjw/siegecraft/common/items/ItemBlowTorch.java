package com.alexjw.siegecraft.common.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import mod.chiselsandbits.chiseledblock.data.BitLocation;
import mod.chiselsandbits.helpers.BitOperation;
import mod.chiselsandbits.modes.ChiselMode;
import mod.chiselsandbits.network.NetworkRouter;
import mod.chiselsandbits.network.packets.PacketChisel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
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
        NBTTagCompound nbtTagCompound = playerIn.getHeldItem(handIn).getTagCompound();
        RayTraceResult rayTraceResult = playerIn.rayTrace(1, 5);
        if (rayTraceResult != null) {
            if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.BLOCK)) {
                EnumFacing enumFacing = rayTraceResult.sideHit;
                BitLocation location = new BitLocation(rayTraceResult, true, BitOperation.CHISEL);
                PacketChisel pc = new PacketChisel(BitOperation.CHISEL, location, enumFacing, ChiselMode.CUBE_LARGE, EnumHand.MAIN_HAND);
                NetworkRouter.instance.sendToServer(pc);
            } else if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.ENTITY)) {
                Entity entityHit = rayTraceResult.entityHit;
                entityHit.attackEntityFrom(DamageSource.LAVA, 0.25f);
            }
        }
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
