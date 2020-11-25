package com.alexjw.thematicarmor.server.drugs.modifiers;

import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.Random;

public class DrugEffectDeadpool extends DrugEffect {
    private Random random = new Random();

    public DrugEffectDeadpool() {
        super(10);
    }

    public void onConsume(EntityPlayer entityPlayer, Drug drug) {
        int randomPotion = (random.nextInt(5) + 1);

        switch (randomPotion) {
            case 1:
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(1), random.nextInt(750) + 250, random.nextInt(2)));
                break;
            case 2:
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(5), random.nextInt(750) + 250, random.nextInt(2)));
                break;
            case 3:
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(8), random.nextInt(750) + 250, random.nextInt(2)));
                break;
            case 4:
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(9), random.nextInt(300) + 250, random.nextInt(2)));
                break;
            case 5:
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(19), random.nextInt(300) + 250, random.nextInt(1)));
                break;
        }
    }
}