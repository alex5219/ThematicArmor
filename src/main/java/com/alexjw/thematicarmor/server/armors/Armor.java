package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.items.armor.ItemThemeArmor;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

public class Armor {
    protected final Item chestplate;
    private int armor = 0, speed = 0, difficulty = 0;
    private final ArrayList<Item> loadoutItems = new ArrayList<Item>();

    public Armor(int speed, int armor, int difficulty) {
        ArmorManager.armorArrayList.add(this);
        this.chestplate = new ItemThemeArmor(EntityEquipmentSlot.CHEST, this);
        this.armor = armor;
        this.speed = speed;
        this.difficulty = difficulty;
    }

    public void init() {

    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity) {
    }

    public boolean isHidden(){
        return false;
    }

    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    public String getUnlocalizedName() {
        return this.getName().replaceAll("armor", "armor_");
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getIcon() {
        String name = this.getClass().getSimpleName().toLowerCase().replaceAll("armor", "");
        return new ResourceLocation(ThematicArmor.MODID, "textures/gui/icon/" + name + ".png");
    }

    public Item getChestplate() {
        return this.chestplate;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }
}
