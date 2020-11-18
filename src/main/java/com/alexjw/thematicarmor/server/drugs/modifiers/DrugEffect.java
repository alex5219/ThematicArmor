package com.alexjw.thematicarmor.server.drugs.modifiers;

import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;

public class DrugEffect {
    private float chance;

    public DrugEffect(float chance) {
        this.chance = chance;
    }

    public void onConsume(EntityPlayer entityPlayer, Drug drug) {

    }

    public float getChance() {
        return chance;
    }
}
