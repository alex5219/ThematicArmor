package com.alexjw.thematicarmor;

import com.alexjw.thematicarmor.server.armors.ArmorManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ThematicTabs {
    public static final CreativeTabs tabArmors = (new CreativeTabs("tabThematicArmors") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ArmorManager.operatorMaverick.getChestplate());
        }
    });
}
