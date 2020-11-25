package com.alexjw.thematicarmor.server.items;

import com.alexjw.thematicarmor.server.items.weapon.ItemWeapon;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static ItemWeapon itemKatana = new ItemWeapon("katana", 4.5f, 0.4f, 1561);
}
