package com.alexjw.siegecraft.server.operators;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.gadgets.Gadget;
import com.alexjw.siegecraft.server.items.armor.ItemOperatorArmor;
import com.alexjw.siegecraft.server.items.armor.ItemOperatorItem;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

public class Operator {
    protected final Item helmet;
    protected final Item chestplate;
    protected final Item leggings;
    protected final Item boots;
    protected final Item operatorItem;
    private int armor = 0, speed = 0, difficulty = 0;
    private final ArrayList<Item> loadoutItems = new ArrayList<Item>();
    private final ArrayList<Gadget> gadgets = new ArrayList<>();
    private final Team enumTeam;

    public Operator(Team enumTeam, int speed, int armor, int difficulty) {
        OperatorManager.operatorArrayList.add(this);
        this.enumTeam = enumTeam;
        this.helmet = new ItemOperatorArmor(EntityEquipmentSlot.HEAD, this);
        this.chestplate = new ItemOperatorArmor(EntityEquipmentSlot.CHEST, this);
        this.leggings = new ItemOperatorArmor(EntityEquipmentSlot.LEGS, this);
        this.boots = new ItemOperatorArmor(EntityEquipmentSlot.FEET, this);
        this.operatorItem = new ItemOperatorItem(this);
        this.armor = armor;
        this.speed = speed;
        this.difficulty = difficulty;
        for (Gadget gadget : gadgets) loadoutItems.addAll(gadget.getItems());
    }

    public void init() {

    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity) {
        for (Gadget gadget : gadgets) {
            gadget.onUpdate(this, itemStack, world, entity);
        }
    }

    public boolean isHidden(){
        return false;
    }

    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    public String getUnlocalizedName() {
        return this.getName().replaceAll("operator", "operator_");
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getIcon() {
        String name = this.getClass().getSimpleName().toLowerCase().replaceAll("operator", "");
        return new ResourceLocation(Siege.MODID, "textures/gui/icon/" + name + ".png");
    }

    public Item getHelmet() {
        return this.helmet;
    }

    public Item getChestplate() {
        return this.chestplate;
    }

    public Item getLeggings() {
        return this.leggings;
    }

    public Item getBoots() {
        return this.boots;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getArmor() {
        return armor;
    }

    public final Team getTeam() {
        return this.enumTeam;
    }

    public ArrayList<Item> getLoadoutItems() {
        return loadoutItems;
    }

    public ArrayList<Gadget> getGadgets() {
        return gadgets;
    }

    public Item getOperatorItem() {
        return operatorItem;
    }

    public Team getEnumTeam() {
        return enumTeam;
    }

    public enum Team {
        ATTACKER, DEFENDER, RECRUIT
    }
}
