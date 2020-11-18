package com.alexjw.thematicarmor.server.drugs.modifiers;

import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.Random;

public class DrugEffectPotion extends DrugEffect {
    private Random random = new Random();

    public DrugEffectPotion() {
        super(10);
    }

    public void onConsume(EntityPlayer entityPlayer, Drug drug) {
        Potion randomPotion = Potion.getPotionById(random.nextInt(24) + 1);
        if (randomPotion != null)
            entityPlayer.addPotionEffect(new PotionEffect(randomPotion, random.nextInt(750) + 250, random.nextInt(5) + 1));
    }
}
