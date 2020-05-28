package com.alexjw.siegecraft.common.gadgets;

import com.alexjw.siegecraft.common.items.ItemBlowTorch;
import com.alexjw.siegecraft.common.items.ItemFuelCanister;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class GadgetBlowTorch extends Gadget {
    public ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new ItemBlowTorch());
        items.add(new ItemFuelCanister());
        return items;
    }

    public String getName() {
        return "Maverick's Blow Torch";
    }
}
