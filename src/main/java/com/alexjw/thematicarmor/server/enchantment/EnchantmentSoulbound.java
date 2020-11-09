package com.alexjw.thematicarmor.server.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentSoulbound extends Enchantment {
    public EnchantmentSoulbound(String id) {
        super(Rarity.VERY_RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
        setRegistryName(id);
        ModEnchantments.ENCHANTMENTS.add(this);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public String getName() {
        return "enchantment.thematiccore.soulbound";
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.VANISHING_CURSE;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }
}