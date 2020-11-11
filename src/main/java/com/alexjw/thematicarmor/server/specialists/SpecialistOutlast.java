package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TADataManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class SpecialistOutlast extends SpecialistSkill {
    public SpecialistOutlast() {
        super("Outlast", "When this specialist is defeated, their death is delayed for 3 seconds, in which they can still attack and fight back");
    }

    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TADataManager.HAS_DIED.putIfAbsent(entityPlayer, false);
        TADataManager.TIME_DEAD.putIfAbsent(entityPlayer, 0);

        if(TADataManager.HAS_DIED.getBoolean(entityPlayer)) {
            TADataManager.incr(entityPlayer, TADataManager.TIME_DEAD);

            if(TADataManager.TIME_DEAD.getInteger(entityPlayer) > 120) {
                TADataManager.HAS_DIED.replace(entityPlayer, false);
                entityPlayer.setHealth(0);
            }
        }
    }
}
