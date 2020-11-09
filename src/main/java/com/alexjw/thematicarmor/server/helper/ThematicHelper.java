package com.alexjw.thematicarmor.server.helper;

import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.items.armor.ItemThemeArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThematicHelper {
    public static Armor getTheme(EntityPlayer entityPlayer) {
        if (entityPlayer.getArmorInventoryList().iterator().next() != null) {
            return getThemeFromArmor(entityPlayer.getArmorInventoryList());
        } else {
            return null;
        }
    }

    public static Armor getThemeFromArmor(Iterable<ItemStack> equipmentAndArmor) {
        return getThemeFromArmor(equipmentAndArmor.iterator().next());
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
