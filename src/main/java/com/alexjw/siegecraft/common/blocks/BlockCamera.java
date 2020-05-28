package com.alexjw.siegecraft.common.blocks;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.common.items.ModItems;
import com.alexjw.siegecraft.common.tileentity.TileEntityCamera;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class BlockCamera extends Block {
    public BlockCamera() {
        super(Material.BARRIER);
        this.setUnlocalizedName("camera_block");
        this.setRegistryName(Siege.MODID, "camera_block");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(ChatFormatting.BLUE + "Creative Only");
        tooltip.add(ChatFormatting.GRAY + "Place this block where you'd like a camera to spawn.");
        super.addInformation(stack, player, tooltip, advanced);
    }

    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    public TileEntity createTileEntity(final World worldIn, final IBlockState state) {
        return new TileEntityCamera();
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityCamera) {
            tileentity.setPos(pos);
        }
    }

}