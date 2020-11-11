package com.alexjw.thematicarmor.server.data;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class TAData<V> extends HashMap<EntityPlayer, V> {
    public static TAData<Integer> TIME_DEAD = new TAData<>();
    public static TAData<Boolean> HAS_DIED = new TAData<>();
    public static TAData<Integer> LAST_HEAL = new TAData<>();
    public static TAData<Boolean> TENACITY = new TAData<>();

    public int getInteger(EntityPlayer entityPlayer) {
        return (int) get(entityPlayer);
    }

    public float getFloat(EntityPlayer entityPlayer) {
        return (float) get(entityPlayer);
    }

    public double getDouble(EntityPlayer entityPlayer) {
        return (double) get(entityPlayer);
    }

    public boolean getBoolean(EntityPlayer entityPlayer) {
        return (boolean) get(entityPlayer);
    }

    public String getString(EntityPlayer entityPlayer) {
        return (String) get(entityPlayer);
    }

    public ItemStack getItemStack(EntityPlayer entityPlayer) {
        return (ItemStack) get(entityPlayer);
    }

    public static void incr(EntityPlayer entityPlayer, TAData taData) {
        if(taData.get(entityPlayer) != null) {
            if (taData.getInteger(entityPlayer) < 300) {
                taData.replace(entityPlayer, (taData.getInteger(entityPlayer) + 1));
            }
        } else {
            taData.put(entityPlayer, 0);
        }
    }
}
