package com.alexjw.thematicarmor.server.drugs.modifiers;

import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class DrugEffectScramble extends DrugEffect {
    private Random random = new Random();

    public DrugEffectScramble() {
        super(5);
    }

    public void onConsume(EntityPlayer entityPlayer, Drug drug) {
        ItemStack heldItem = entityPlayer.getHeldItemMainhand();
        int slotToSwap = random.nextInt(26);
        ItemStack slotItem = entityPlayer.inventory.getStackInSlot(slotToSwap);
        entityPlayer.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, slotItem);
        entityPlayer.inventory.setInventorySlotContents(slotToSwap, heldItem);
    }
}
