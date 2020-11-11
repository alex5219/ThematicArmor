package com.alexjw.thematicarmor.server.data;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class TAData<V> extends HashMap<EntityPlayer, V> {
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
}
