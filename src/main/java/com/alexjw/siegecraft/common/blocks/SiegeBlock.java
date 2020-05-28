package com.alexjw.siegecraft.common.blocks;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.common.items.ModItems;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class SiegeBlock extends Block {
    int hits = -1;
    private AxisAlignedBB BLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

    public SiegeBlock(Material material) {
        super(material);
        this.setUnlocalizedName("siegeblock");
        this.setRegistryName(Siege.MODID, getUnlocalizedName());
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(ChatFormatting.BLUE + "Light");
        super.addInformation(stack, player, tooltip, advanced);
    }

    public boolean isFullCube(IBlockState state) {
        return true;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BLOCK_AABB;
    }

    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if (entityIn instanceof EntityArrow) {
            if (hits == -1) {
                hits = 4;
            }
            switch (hits) {
                case 1:
                    BLOCK_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D);
                    break;
                case 2:
                    BLOCK_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D);
                    break;
                case 3:
                    BLOCK_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D);
                    break;
                case 4:
                    BLOCK_AABB = new AxisAlignedBB(1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D);
                    break;
                case 5:
                    worldIn.destroyBlock(pos, false);
                    break;
            }
            hits++;
            entityIn.setDead();
            worldIn.getClosestPlayerToEntity(entityIn, 20).sendMessage(new TextComponentString("Hits Left: " + hits));
        }
    }
}
