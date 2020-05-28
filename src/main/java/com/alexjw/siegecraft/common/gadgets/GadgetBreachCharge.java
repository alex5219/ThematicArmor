package com.alexjw.siegecraft.common.gadgets;

import com.alexjw.siegecraft.common.items.ItemBreachCharge;
import com.alexjw.siegecraft.common.operators.Operator;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GadgetBreachCharge extends Gadget {
    public void onUpdate(Operator operator, ItemStack itemStack, World world, Entity entity) {

    }

    public String getName() {
        return "Breach Charge";
    }

    public Item getItem() {
        return new ItemBreachCharge();
    }
}
