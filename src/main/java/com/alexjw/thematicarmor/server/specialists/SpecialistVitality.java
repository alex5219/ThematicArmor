package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TADataManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SpecialistVitality extends SpecialistSkill {
    Random random = new Random();

    public SpecialistVitality() {
        super("Vitality", "Regenerate faster after getting out of combat.");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TADataManager.incr(entityPlayer, TADataManager.LAST_HEAL);

        int chance = random.nextInt(20);

        if (entityPlayer.getHealth() < entityPlayer.getMaxHealth() && TADataManager.LAST_HEAL.getInteger(entityPlayer) > 120)
        {
            if(chance == 1) {
                entityPlayer.heal(1.0F);
            }
        }
    }
}
