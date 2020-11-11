package com.alexjw.thematicarmor.server.specialists;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SpecialistInfection extends SpecialistSkill {
    public SpecialistInfection() {
        super("Infection", "5% chance to inflicts poison for 2 seconds.");
    }
}
