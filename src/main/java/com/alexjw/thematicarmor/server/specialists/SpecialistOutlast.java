package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TAData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SpecialistOutlast extends SpecialistSkill {

    public SpecialistOutlast() {
        super("Outlast", "When this specialist is defeated, their death is delayed for 3 seconds, in which they can still attack and fight back");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TAData.HAS_DIED.putIfAbsent(entityPlayer, false);
        TAData.TIME_DEAD.putIfAbsent(entityPlayer, 0);

        if(TAData.HAS_DIED.getBoolean(entityPlayer)) {
            TAData.incr(entityPlayer, TAData.TIME_DEAD);

            if(TAData.TIME_DEAD.getInteger(entityPlayer) > 100) {
                TAData.HAS_DIED.replace(entityPlayer, false);
                entityPlayer.setHealth(0);
            }
        }
    }
}
