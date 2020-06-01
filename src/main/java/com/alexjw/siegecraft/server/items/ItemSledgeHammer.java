package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemSledgeHammer extends ItemSword {
    public ItemSledgeHammer() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("sledge_hammer");
        this.setRegistryName(Siege.MODID, "sledge_hammer");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.getCooldownTracker().setCooldown(this, 45);
        playerIn.addStat(Objects.requireNonNull(StatList.getObjectUseStats(this)));
        RayTraceResult rayTraceResult = playerIn.rayTrace(2, 5);
        assert rayTraceResult != null;
        if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.BLOCK)) {
            int radius = 1;
            int x = rayTraceResult.getBlockPos().getX();
            int y = rayTraceResult.getBlockPos().getY();
            int z = rayTraceResult.getBlockPos().getZ();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(x, y, z, x, y, z).expand(radius, radius, radius);
            removeBlocks(axisAlignedBB, worldIn);
        } else if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.ENTITY)) {
            rayTraceResult.entityHit.attackEntityFrom(DamageSource.GENERIC, 5);
        }
        playerIn.swingArm(EnumHand.MAIN_HAND);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }

    public void removeBlocks(AxisAlignedBB aabb, World world) {
        int i = MathHelper.floor(aabb.minX);
        int j = MathHelper.floor(aabb.maxX + 1.0D);
        int k = MathHelper.floor(aabb.minY);
        int l = MathHelper.floor(aabb.maxY + 1.0D);
        int i1 = MathHelper.floor(aabb.minZ);
        int j1 = MathHelper.floor(aabb.maxZ + 1.0D);

        for (int k1 = i; k1 < j; ++k1) {
            for (int l1 = k; l1 < l; ++l1) {
                for (int i2 = i1; i2 < j1; ++i2) {
                    world.destroyBlock(new BlockPos(k1, l1, i2), false);
                }
            }
        }
    }
}
