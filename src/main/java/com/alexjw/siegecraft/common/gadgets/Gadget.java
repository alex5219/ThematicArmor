package com.alexjw.siegecraft.common.gadgets;

import com.alexjw.siegecraft.common.operators.Operator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public abstract class Gadget {
    public void onUpdate(Operator operator, ItemStack itemStack, World world, Entity entity) {

    }

    public boolean isActive(EntityLivingBase entity) {
        return true;
    }

    public ArrayList<Item> getItems() {
        return null;
    }

    public abstract String getName();
}
