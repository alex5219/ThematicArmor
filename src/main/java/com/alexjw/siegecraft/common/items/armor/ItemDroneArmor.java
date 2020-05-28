package com.alexjw.siegecraft.common.items.armor;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.model.ModelGadgetDrone;
import com.alexjw.siegecraft.common.items.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.UUID;

public class ItemDroneArmor extends ItemArmor {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public ItemDroneArmor(EntityEquipmentSlot compatibleEntityEquipmentSlot) {
        super(ArmorMaterial.LEATHER, 0, compatibleEntityEquipmentSlot);
        this.setUnlocalizedName("drone_" + compatibleEntityEquipmentSlot.toString().toLowerCase());
        this.setRegistryName(Siege.MODID, "drone_" + compatibleEntityEquipmentSlot.toString().toLowerCase());
        ModItems.ITEMS.add(this);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Siege.MODID + ":textures/models/gadget_drone.png";
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ModelGadgetDrone armorModel = new ModelGadgetDrone();
        if (itemStack != null) {
            entityLiving.setInvisible(true);
            armorModel.bipedHead.showModel = false;
            armorModel.bipedHeadwear.showModel = false;
            armorModel.bipedBody.showModel = false;
            armorModel.bipedRightArm.showModel = false;
            armorModel.bipedLeftArm.showModel = false;
            armorModel.bipedRightLeg.showModel = false;
            armorModel.bipedLeftLeg.showModel = false;
            armorModel.isSneak = false;
            armorModel.isRiding = false;
            armorModel.isChild = false;

            return armorModel;
        }
        return null;
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
        if (equipmentSlot == this.armorType) {
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor Speed", 0.1f, 1));
            multimap.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor Health", -3.25, 0));
        }

        return multimap;
    }
}
