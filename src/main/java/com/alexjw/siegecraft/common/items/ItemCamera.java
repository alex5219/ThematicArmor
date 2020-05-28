package com.alexjw.siegecraft.common.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.common.data.SiegeData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCamera extends Item {
    public ItemCamera() {
        super();
        this.setUnlocalizedName("camera");
        this.setRegistryName(Siege.MODID, "camera");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        this.setMaxStackSize(1);
        ModItems.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
        ItemStack itemstack = player.getHeldItem(handIn);
        if (!SiegeData.isGameSetup())
            SiegeData.setGameSetup(true);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}