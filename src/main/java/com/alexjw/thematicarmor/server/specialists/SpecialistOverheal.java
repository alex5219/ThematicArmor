package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TAData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SpecialistOverheal extends SpecialistSkill {
    public SpecialistOverheal() {
        super("Overheal", "If this character were to be healed over 100% HP, this character gains Bonus HP equal to 20%");
    }

    @Override
    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        if (entityPlayer.getHealth() < entityPlayer.getMaxHealth())
        {
            TAData.incr(entityPlayer, TAData.LAST_HEAL);

            if (entityPlayer.getHealth() < entityPlayer.getMaxHealth() && TAData.LAST_HEAL.getInteger(entityPlayer) > 120)
            {
                entityPlayer.addPotionEffect(new PotionEffect(Potion.getPotionById(21), 10, 2));
            }
        }
    }
}
