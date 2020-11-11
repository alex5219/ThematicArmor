package com.alexjw.thematicarmor.server.data;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class TADataManager {
    public static TAData<Integer> TIME_DEAD = new TAData<>();
    public static TAData<Boolean> HAS_DIED = new TAData<>();
    public static TAData<Integer> LAST_HEAL = new TAData<>();
    public static TAData<Boolean> TENACITY = new TAData<>();

    public static void incr(EntityPlayer entityPlayer, TAData taData) {
        if (taData.get(entityPlayer) != null) {
            if (taData.getInteger(entityPlayer) < 300) {
                taData.replace(entityPlayer, (taData.getInteger(entityPlayer) + 1));
            }
        } else {
            taData.put(entityPlayer, 0);
        }
    }
}
