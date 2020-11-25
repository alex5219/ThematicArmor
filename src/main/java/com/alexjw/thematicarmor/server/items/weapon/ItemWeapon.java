package com.alexjw.thematicarmor.server.items.weapon;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.ThematicTabs;
import com.alexjw.thematicarmor.server.items.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemWeapon extends ItemSword {
    private float weaponSpeed;

    public ItemWeapon(String weaponName, float weaponDamage, float weaponSpeed, int durability) {
        super(EnumHelper.addToolMaterial(weaponName, 1, durability, 5f, weaponDamage, 12));
        this.setUnlocalizedName("weapon_" + weaponName);
        this.setRegistryName(ThematicArmor.MODID, weaponName);
        this.setCreativeTab(ThematicTabs.tabArmors);
        ModItems.ITEMS.add(this);
        this.weaponSpeed = weaponSpeed;
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot p_getItemAttributeModifiers_1_) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(p_getItemAttributeModifiers_1_);
        if (p_getItemAttributeModifiers_1_ == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", this.getAttackDamage(), 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", this.weaponSpeed, 0));
        }
        return multimap;
    }
}
