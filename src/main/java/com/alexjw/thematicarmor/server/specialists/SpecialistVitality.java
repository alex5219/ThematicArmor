package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TAData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SpecialistVitality extends SpecialistSkill {
    Random random = new Random();

    public SpecialistVitality() {
        super("Vitality", "Regenerate faster after getting out of combat.");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TAData.incr(entityPlayer, TAData.LAST_HEAL);

        int chance = random.nextInt(20);

        if (entityPlayer.getHealth() < entityPlayer.getMaxHealth() && TAData.LAST_HEAL.getInteger(entityPlayer) > 120)
        {
            if(chance == 1) {
                entityPlayer.heal(1.0F);
            }
        }
    }
}
