package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.ThematicData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class SpecialistVitality extends SpecialistSkill {
    public SpecialistVitality() {
        super("Vitality", "Regenerate faster after getting out of combat.");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        ThematicData.LAST_HEAL.incr(entityPlayer, "last_heal");

        if (entityPlayer.getHealth() < entityPlayer.getMaxHealth() && ThematicData.LAST_HEAL.getInteger(entityPlayer, "last_heal") > 50)
        {
            entityPlayer.heal(0.5F);
        }
    }
}
