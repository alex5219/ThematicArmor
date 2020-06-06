package com.alexjw.siegecraft.server.gadgets;

import com.alexjw.siegecraft.server.items.ItemBlowTorch;
import com.alexjw.siegecraft.server.items.ItemFuelCanister;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class GadgetERC extends Gadget {
    public ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new ItemBlowTorch());
        items.add(new ItemFuelCanister());
        return items;
    }

    public String getName() {
        return "ERC";
    }
}