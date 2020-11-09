package com.alexjw.thematicarmor.client.renderer.layers;

import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;

import java.util.Map;

public abstract class ThematicLayerArmorBase<T extends ModelBase> implements LayerRenderer<EntityLivingBase> {
    protected T modelLeggings;
    protected T modelArmor;
    private final RenderLivingBase<?> renderer;
    private float alpha = 1.0F;
    private float colorR = 1.0F;
    private float colorG = 1.0F;
    private float colorB = 1.0F;
    private boolean skipRenderGlint;
    private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();

    public ThematicLayerArmorBase(RenderLivingBase<?> p_i46125_1_) {
        this.renderer = p_i46125_1_;
        this.initArmor();
    }

    public void doRenderLayer(EntityLivingBase p_doRenderLayer_1_, float p_doRenderLayer_2_, float p_doRenderLayer_3_, float p_doRenderLayer_4_, float p_doRenderLayer_5_, float p_doRenderLayer_6_, float p_doRenderLayer_7_, float p_doRenderLayer_8_) {
        this.renderArmorLayer(p_doRenderLayer_1_, p_doRenderLayer_2_, p_doRenderLayer_3_, p_doRenderLayer_4_, p_doRenderLayer_5_, p_doRenderLayer_6_, p_doRenderLayer_7_, p_doRenderLayer_8_, EntityEquipmentSlot.CHEST);
        this.renderArmorLayer(p_doRenderLayer_1_, p_doRenderLayer_2_, p_doRenderLayer_3_, p_doRenderLayer_4_, p_doRenderLayer_5_, p_doRenderLayer_6_, p_doRenderLayer_7_, p_doRenderLayer_8_, EntityEquipmentSlot.LEGS);
        this.renderArmorLayer(p_doRenderLayer_1_, p_doRenderLayer_2_, p_doRenderLayer_3_, p_doRenderLayer_4_, p_doRenderLayer_5_, p_doRenderLayer_6_, p_doRenderLayer_7_, p_doRenderLayer_8_, EntityEquipmentSlot.FEET);
        this.renderArmorLayer(p_doRenderLayer_1_, p_doRenderLayer_2_, p_doRenderLayer_3_, p_doRenderLayer_4_, p_doRenderLayer_5_, p_doRenderLayer_6_, p_doRenderLayer_7_, p_doRenderLayer_8_, EntityEquipmentSlot.HEAD);
    }

    public boolean shouldCombineTextures() {
        return false;
    }

    private void renderArmorLayer(EntityLivingBase p_renderArmorLayer_1_, float p_renderArmorLayer_2_, float p_renderArmorLayer_3_, float p_renderArmorLayer_4_, float p_renderArmorLayer_5_, float p_renderArmorLayer_6_, float p_renderArmorLayer_7_, float p_renderArmorLayer_8_, EntityEquipmentSlot p_renderArmorLayer_9_) {
        ItemStack itemstack = p_renderArmorLayer_1_.getItemStackFromSlot(p_renderArmorLayer_9_);
        if (itemstack.getItem() instanceof ItemArmor) {
            ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
            if (itemarmor.getEquipmentSlot() == p_renderArmorLayer_9_) {
                T t = this.getModelFromSlot(p_renderArmorLayer_9_);
                t = this.getArmorModelHook(p_renderArmorLayer_1_, itemstack, p_renderArmorLayer_9_, t);
                t.setModelAttributes(this.renderer.getMainModel());
                t.setLivingAnimations(p_renderArmorLayer_1_, p_renderArmorLayer_2_, p_renderArmorLayer_3_, p_renderArmorLayer_4_);
                this.setModelSlotVisible(t, p_renderArmorLayer_9_);
                this.isLegSlot(p_renderArmorLayer_9_);
                this.renderer.bindTexture(this.getArmorResource(p_renderArmorLayer_1_, itemstack, p_renderArmorLayer_9_, (String)null));
                if (itemarmor.hasOverlay(itemstack)) {
                    int i = itemarmor.getColor(itemstack);
                    float f = (float)(i >> 16 & 255) / 255.0F;
                    float f1 = (float)(i >> 8 & 255) / 255.0F;
                    float f2 = (float)(i & 255) / 255.0F;
                    GlStateManager.color(this.colorR * f, this.colorG * f1, this.colorB * f2, this.alpha);
                    t.render(p_renderArmorLayer_1_, p_renderArmorLayer_2_, p_renderArmorLayer_3_, p_renderArmorLayer_5_, p_renderArmorLayer_6_, p_renderArmorLayer_7_, p_renderArmorLayer_8_);
                    this.renderer.bindTexture(this.getArmorResource(p_renderArmorLayer_1_, itemstack, p_renderArmorLayer_9_, "overlay"));
                }

                GlStateManager.color(this.colorR, this.colorG, this.colorB, this.alpha);
                t.render(p_renderArmorLayer_1_, p_renderArmorLayer_2_, p_renderArmorLayer_3_, p_renderArmorLayer_5_, p_renderArmorLayer_6_, p_renderArmorLayer_7_, p_renderArmorLayer_8_);
            }
        }

    }

    public T getModelFromSlot(EntityEquipmentSlot p_getModelFromSlot_1_) {
        return this.isLegSlot(p_getModelFromSlot_1_) ? this.modelLeggings : this.modelArmor;
    }

    private boolean isLegSlot(EntityEquipmentSlot p_isLegSlot_1_) {
        return p_isLegSlot_1_ == EntityEquipmentSlot.LEGS;
    }

    protected abstract void initArmor();

    protected abstract void setModelSlotVisible(T var1, EntityEquipmentSlot var2);

    protected T getArmorModelHook(EntityLivingBase p_getArmorModelHook_1_, ItemStack p_getArmorModelHook_2_, EntityEquipmentSlot p_getArmorModelHook_3_, T p_getArmorModelHook_4_) {
        return p_getArmorModelHook_4_;
    }

    public ResourceLocation getArmorResource(Entity p_getArmorResource_1_, ItemStack p_getArmorResource_2_, EntityEquipmentSlot p_getArmorResource_3_, String p_getArmorResource_4_) {
        ItemArmor item = (ItemArmor)p_getArmorResource_2_.getItem();
        String texture = item.getArmorMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(58);
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }

        String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, this.isLegSlot(p_getArmorResource_3_) ? 2 : 1, p_getArmorResource_4_ == null ? "" : String.format("_%s", p_getArmorResource_4_));
        s1 = ForgeHooksClient.getArmorTexture(p_getArmorResource_1_, p_getArmorResource_2_, s1, p_getArmorResource_3_, p_getArmorResource_4_);
        ResourceLocation resourcelocation = (ResourceLocation)ARMOR_TEXTURE_RES_MAP.get(s1);
        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation(s1);
            ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
        }

        return resourcelocation;
    }
}

