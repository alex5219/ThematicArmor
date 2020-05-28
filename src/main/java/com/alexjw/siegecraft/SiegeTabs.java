package com.alexjw.siegecraft;

import com.alexjw.siegecraft.common.items.ModItems;
import com.alexjw.siegecraft.common.operators.OperatorManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SiegeTabs {
    public static final CreativeTabs tabGadgets = (new CreativeTabs("tabGadgets") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.itemBlowTorch);
        }
    });
    public static final CreativeTabs tabOperatorsArmor = (new CreativeTabs("tabOperatorsArmor") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OperatorManager.operatorMaverick.getChestplate());
        }
    });
    public static final CreativeTabs tabOperators = (new CreativeTabs("tabOperators") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(OperatorManager.operatorMaverick.getOperatorItem());
        }
    });
}
