package com.alexjw.siegecraft.common.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemWallReinforcement extends Item {
    public ItemWallReinforcement() {
        super();
        this.setUnlocalizedName("wall_reinforcement");
        this.setRegistryName(Siege.MODID, "wall_reinforcement");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        this.setMaxStackSize(1);
        ModItems.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
        ItemStack itemstack = player.getHeldItem(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}