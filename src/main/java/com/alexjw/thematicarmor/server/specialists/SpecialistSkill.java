package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public abstract class SpecialistSkill {
    private String name, lore;

    public SpecialistSkill(String name, String lore) {
        this.name = name;
        this.lore = lore;
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        Armor armor = ThematicHelper.getTheme(entityPlayer);
    }

    public String getName() {
        return name;
    }

    public String getLore() {
        return lore;
    }
}
