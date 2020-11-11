package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.items.armor.ItemThemeArmor;
import com.alexjw.thematicarmor.server.specialists.SpecialistSkill;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Armor {
    protected final Item chestplate;
    private int armor = 0;
    private int speed = 0;
    private boolean isOperator;
    private List<SpecialistSkill> specialistSkill = new ArrayList<>();

    public Armor(boolean isOperator) {
        ArmorManager.armorArrayList.add(this);
        this.chestplate = new ItemThemeArmor(this, isOperator);
        this.isOperator = isOperator;
    }

    public Armor(boolean isOperator, SpecialistSkill... specialistSkill) {
        ArmorManager.armorArrayList.add(this);
        this.chestplate = new ItemThemeArmor(this, isOperator);
        this.isOperator = isOperator;
        this.specialistSkill = Arrays.asList(specialistSkill);
    }

    public void init() {

    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity) {
        for(SpecialistSkill specialistSkill1:specialistSkill)
            specialistSkill1.onUpdate((EntityPlayer) entity, itemStack);
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

    public List<SpecialistSkill> getSpecialistSkill() {
        return specialistSkill;
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
