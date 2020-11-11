package com.alexjw.thematicarmor.server.specialists;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SpecialistHealingFactor extends SpecialistSkill {
    Random random = new Random();

    public SpecialistHealingFactor() {
        super("Healing Factor", "This character will randomly regenerate health.");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        int chance = random.nextInt(250);

        if (entityPlayer.getHealth() < entityPlayer.getMaxHealth())
        {
            if(chance == 1) {
                entityPlayer.heal(1.0F);
            }
        }
    }
}
