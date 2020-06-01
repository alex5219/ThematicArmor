package com.alexjw.siegecraft.server.blocks;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.data.SiegePlayer;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.items.ModItems;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class BlockRookArmor extends Block {
    public BlockRookArmor() {
        super(Material.BARRIER);
        this.setUnlocalizedName("rook_armor");
        this.setRegistryName(Siege.MODID, "rook_armor");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(ChatFormatting.GRAY + "Right click to deploy the rook armor.");
        super.addInformation(stack, player, tooltip, advanced);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        SiegePlayer siegePlayer = SiegeHelper.getSiegePlayerByEntity(playerIn);
        if (siegePlayer != null) {
            if (!siegePlayer.isArmored()) {
                siegePlayer.setArmored(true);
                playerIn.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 6000, 0));
            }
        }
        return false;
    }
}