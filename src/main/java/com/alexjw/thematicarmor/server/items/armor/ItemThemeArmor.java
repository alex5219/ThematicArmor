package com.alexjw.thematicarmor.server.items.armor;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.ThematicTabs;
import com.alexjw.thematicarmor.client.renderer.SiegeRenderer;
import com.alexjw.thematicarmor.client.renderer.SiegeRendererManager;
import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import com.alexjw.thematicarmor.server.items.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unchecked")
public class ItemThemeArmor extends ItemArmor {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    private final Armor armor;
    private static final ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("armor", "thematicArmor", 16384, new int[]{0, 12, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
    private boolean isOperator;

    public ItemThemeArmor(Armor armor, boolean isOperator) {
        super(armorMaterial, 0, EntityEquipmentSlot.CHEST);
        this.armor = armor;
        this.isOperator = isOperator;
        this.setUnlocalizedName(armor.getUnlocalizedName() + "_" + EntityEquipmentSlot.CHEST.toString().toLowerCase());
        this.setRegistryName(ThematicArmor.MODID, armor.getUnlocalizedName() + "_" + EntityEquipmentSlot.CHEST.toString().toLowerCase());
        if (!armor.isHidden()) {
            this.setCreativeTab(ThematicTabs.tabArmors);
        }
        ModItems.ITEMS.add(this);
    }

    public Armor getArmor() {
        return this.armor;
    }

    @SideOnly(Side.CLIENT)
    public String getItemStackDisplayName(ItemStack itemstack) {
        String part = "piece." + this.armorType.toString().toLowerCase();

        return I18n.format(ThematicHelper.getThemeFromArmor(itemstack).getUnlocalizedName().replace('_', '.')) + "'s " + I18n.format(part);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List list, ITooltipFlag iTooltipFlag) {
        if(isOperator) {
            switch (armor.getSpeed()) {
                case 1:
                    list.add("Armor: " + TextFormatting.WHITE + "***");
                    list.add("Speed: " + TextFormatting.WHITE + "*" + TextFormatting.DARK_GRAY + "**");
                    break;
                case 2:
                    list.add("Armor: " + TextFormatting.WHITE + "**" + TextFormatting.DARK_GRAY + "*");
                    list.add("Speed: " + TextFormatting.WHITE + "**" + TextFormatting.DARK_GRAY + "*");
                    break;
                case 3:
                    list.add("Armor: " + TextFormatting.WHITE + "*" + TextFormatting.DARK_GRAY + "**");
                    list.add("Speed: " + TextFormatting.WHITE + "***");
                    break;
            }
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return ThematicArmor.MODID + ":textures/models/" + armor.getUnlocalizedName() + ".png";
    }

    public boolean isDamageable() {
        return false;
    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity, int itemSlot, boolean isSelected) {
        armor.onUpdate(itemStack, world, entity);
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ModelBiped armorModel = null;
        if (itemStack != null) {
            if (itemStack.getItem() instanceof ItemThemeArmor) {
                for (SiegeRenderer siegeRenderer : SiegeRendererManager.siegeRenderers) {
                    if (siegeRenderer.getArmor().equals(ThematicHelper.getThemeFromArmor(itemStack))) {
                        armorModel = siegeRenderer.getModelBiped();
                    }
                }
            }
            if (armorModel != null) {
                armorModel.bipedHead.showModel = true;
                armorModel.bipedHeadwear.showModel = true;
                armorModel.bipedBody.showModel = true;
                armorModel.bipedRightArm.showModel = true;
                armorModel.bipedLeftArm.showModel = true;
                armorModel.bipedRightLeg.showModel = true;
                armorModel.bipedLeftLeg.showModel = true;
                armorModel.isSneak = entityLiving.isSneaking();
                armorModel.isRiding = entityLiving.isRiding();
                armorModel.isChild = entityLiving.isChild();
                if (entityLiving instanceof EntityPlayer) {
                    Render<AbstractClientPlayer> entityRenderObject = Minecraft.getMinecraft().getRenderManager().getEntityRenderObject(entityLiving);
                    RenderPlayer renderPlayer = (RenderPlayer) entityRenderObject;
                    assert renderPlayer != null;
                    armorModel.leftArmPose = renderPlayer.getMainModel().leftArmPose;
                    armorModel.rightArmPose = renderPlayer.getMainModel().rightArmPose;
                }

                return armorModel;
            }
        }
        return null;
    }


    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
        if (equipmentSlot == this.armorType) {
            float speed = 0, armor = 0;
            switch (this.armor.getSpeed()) {
                case 1:
                    speed = -0.025f;
                    break;
                case 2:
                    speed = 0.0f;
                    break;
                case 3:
                    speed = 0.025f;
                    break;
            }
            switch (this.armor.getArmor()) {
                case 1:
                    armor = -0.075f;
                    break;
                case 2:
                    armor = -0.050f;
                    break;
                case 3:
                    armor = -0.025f;
                    break;
            }
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor speed", speed, 1));
            multimap.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor health", armor, 1));
        }

        return multimap;
    }
}
