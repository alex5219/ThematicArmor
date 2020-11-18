package com.alexjw.thematicarmor.server.drugs.modifiers;

import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

public class DrugEffectFire extends DrugEffect {
    private Random random = new Random();

    public DrugEffectFire() {
        super(10);
    }

    public void onConsume(EntityPlayer entityPlayer, Drug drug) {
        entityPlayer.setFire(random.nextInt(750) + 250);
    }
}
