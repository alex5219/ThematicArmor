package com.alexjw.siegecraft.server.items.armor;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.client.renderer.entity.SiegeRenderer;
import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.gadgets.Gadget;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.items.ModItems;
import com.alexjw.siegecraft.server.operators.Operator;
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

public class ItemOperatorArmor extends ItemArmor {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    private Operator operator;
    private static final ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("operator", "operatorArmor", 99, new int[]{2, 3, 3, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0);

    public ItemOperatorArmor(EntityEquipmentSlot compatibleEntityEquipmentSlot, Operator operator) {
        super(armorMaterial, 0, compatibleEntityEquipmentSlot);
        this.operator = operator;
        this.setUnlocalizedName(operator.getUnlocalizedName() + "_" + compatibleEntityEquipmentSlot.toString().toLowerCase());
        this.setRegistryName(Siege.MODID, operator.getUnlocalizedName() + "_" + compatibleEntityEquipmentSlot.toString().toLowerCase());
        if(!operator.isHidden()) {
            this.setCreativeTab(SiegeTabs.tabOperatorsArmor);
        }
        ModItems.ITEMS.add(this);
    }

    public Operator getOperator() {
        return this.operator;
    }

    @SideOnly(Side.CLIENT)
    public String getItemStackDisplayName(ItemStack itemstack) {
        String part = "piece." + this.armorType.toString().toLowerCase();

        return I18n.format(SiegeHelper.getOperatorFromArmor(itemstack).getUnlocalizedName().replace('_', '.')) + "'s " + I18n.format(part);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List list, ITooltipFlag iTooltipFlag) {
        switch (operator.getTeam()) {
            case ATTACKER:
                list.add("Team: " + TextFormatting.BLUE + TextFormatting.BOLD + "Attacker");
                break;
            case DEFENDER:
                list.add("Team: " + TextFormatting.RED + TextFormatting.BOLD + "Defender");
                break;
            default:
                list.add("Team: " + TextFormatting.WHITE + TextFormatting.BOLD + "None");
                break;
        }
        switch (operator.getSpeed()) {
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
        if (operator.getGadgets().size() > 0) {
            list.add("Gadgets: ");
            for (Gadget gadget : operator.getGadgets()) {
                list.add("- " + gadget.getName());
            }
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Siege.MODID + ":textures/models/" + operator.getUnlocalizedName() + ".png";
    }

    public boolean isDamageable() {
        return false;
    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity, int itemSlot, boolean isSelected) {
        operator.onUpdate(itemStack, world, entity);
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ModelBiped armorModel = null;
        if (itemStack != null) {
            if (itemStack.getItem() instanceof ItemOperatorArmor) {
                for (SiegeRenderer siegeRenderer : SiegeRendererManager.siegeRenderers) {
                    if (siegeRenderer.getOperator().equals(SiegeHelper.getOperatorFromArmor(itemStack))) {
                        armorModel = siegeRenderer.getModelBiped();
                    }
                }
            }
            if (armorModel != null) {
                armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
                armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
                armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
                armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
                armorModel.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                armorModel.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
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
            switch (operator.getSpeed()) {
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
            switch (operator.getArmor()) {
                case 1:
                    armor = 0f;
                    break;
                case 2:
                    armor = 0.25f;
                    break;
                case 3:
                    armor = 1.25f;
                    break;
            }
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor speed", speed, 1));
            multimap.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor health", -1.25 + armor, 0));
        }

        return multimap;
    }
}
