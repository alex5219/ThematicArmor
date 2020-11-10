package com.alexjw.thematicarmor.server.helper;

import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.items.armor.ItemThemeArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThematicHelper {
    public static Armor getTheme(EntityPlayer entityPlayer) {
        if (!entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST).equals(new ItemStack(Items.AIR))) {
            return getThemeFromArmor(entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST));
        } else {
            return null;
        }
    }

    public static Armor getThemeFromArmor(ItemStack itemstack) {
        if (itemstack != null) {
            Item item = itemstack.getItem();
            if (item instanceof ItemThemeArmor) {
                return ((ItemThemeArmor) item).getArmor();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
