package com.alexjw.thematicarmor.server.data;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class TAData<V> extends HashMap<EntityPlayer, V> {
    public int getInteger(EntityPlayer entityPlayer) {
        return (Integer) get(entityPlayer);
    }

    public float getFloat(EntityPlayer entityPlayer) {
        return (Float) get(entityPlayer);
    }

    public double getDouble(EntityPlayer entityPlayer) {
        return (Double) get(entityPlayer);
    }

    public boolean getBoolean(EntityPlayer entityPlayer) {
        return (Boolean) get(entityPlayer);
    }

    public String getString(EntityPlayer entityPlayer) {
        return (String) get(entityPlayer);
    }

    public ItemStack getItemStack(EntityPlayer entityPlayer) {
        return (ItemStack) get(entityPlayer);
    }
}
