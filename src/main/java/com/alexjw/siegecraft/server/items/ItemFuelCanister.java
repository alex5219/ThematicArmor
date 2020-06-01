package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import net.minecraft.item.Item;

public class ItemFuelCanister extends Item {
    public ItemFuelCanister() {
        super();
        this.setUnlocalizedName("fuel_canister");
        this.setRegistryName(Siege.MODID, "fuel_canister");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }
}
