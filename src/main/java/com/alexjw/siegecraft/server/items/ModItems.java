package com.alexjw.siegecraft.server.items;

import com.alexjw.core.server.items.ItemBullet;
import com.alexjw.core.server.items.ItemGun;
import com.alexjw.siegecraft.server.bullets.SiegeBullets;
import com.alexjw.siegecraft.server.guns.SiegeGuns;
import com.alexjw.siegecraft.server.items.armor.ItemDroneArmor;
import com.alexjw.siegecraft.server.items.guns.ItemStimPistol;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<Item>();
    public static ItemBreachCharge itemBreachCharge = new ItemBreachCharge();
    public static ItemBlowTorch itemBlowTorch = new ItemBlowTorch();
    public static ItemFuelCanister itemFuelCanister = new ItemFuelCanister();
    public static ItemSledgeHammer itemSledgeHammer = new ItemSledgeHammer();
    public static ItemDroneArmor itemDroneArmorHead = new ItemDroneArmor(EntityEquipmentSlot.HEAD);
    public static ItemDroneArmor itemDroneArmorChest = new ItemDroneArmor(EntityEquipmentSlot.CHEST);
    public static ItemDroneArmor itemDroneArmorLegs = new ItemDroneArmor(EntityEquipmentSlot.LEGS);
    public static ItemDroneArmor itemDroneArmorFeet = new ItemDroneArmor(EntityEquipmentSlot.FEET);
    public static ItemDroneAccess itemDroneAccess = new ItemDroneAccess();
    public static ItemSwapDevice itemSwapDevice = new ItemSwapDevice();
    public static ItemCameraMonitor itemCameraMonitor = new ItemCameraMonitor();
    public static ItemCamera itemCamera = new ItemCamera();
    public static ItemGun itemStimPistol = new ItemStimPistol(SiegeGuns.stimPistol);
}
