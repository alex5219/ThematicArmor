package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.server.items.armor.ItemDroneArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static ItemBreachCharge itemBreachCharge = new ItemBreachCharge();
    public static final ItemBlowTorch itemBlowTorch = new ItemBlowTorch();
    public static ItemFuelCanister itemFuelCanister = new ItemFuelCanister();
    public static ItemSledgeHammer itemSledgeHammer = new ItemSledgeHammer();
    public static final ItemDroneArmor itemDroneArmorHead = new ItemDroneArmor(EntityEquipmentSlot.HEAD);
    public static final ItemDroneArmor itemDroneArmorChest = new ItemDroneArmor(EntityEquipmentSlot.CHEST);
    public static final ItemDroneArmor itemDroneArmorLegs = new ItemDroneArmor(EntityEquipmentSlot.LEGS);
    public static final ItemDroneArmor itemDroneArmorFeet = new ItemDroneArmor(EntityEquipmentSlot.FEET);
    public static ItemDroneAccess itemDroneAccess = new ItemDroneAccess();
    public static final ItemSwapDevice itemSwapDevice = new ItemSwapDevice();
    public static final ItemCameraMonitor itemCameraMonitor = new ItemCameraMonitor();
    public static ItemCamera itemCamera = new ItemCamera();
    public static ItemERC7 itemERC7 = new ItemERC7();
}
