package com.alexjw.thematicarmor.client.renderer.layers;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;

public class ThematicLayerBipedArmor extends ThematicLayerArmorBase<ModelBiped> {
    public ThematicLayerBipedArmor(RenderLivingBase<?> p_i46116_1_) {
        super(p_i46116_1_);
    }

    protected void initArmor() {
        this.modelLeggings = new ModelBiped(0.5F);
        this.modelArmor = new ModelBiped(1.0F);
    }

    protected void setModelSlotVisible(ModelBiped p_setModelSlotVisible_1_, EntityEquipmentSlot p_setModelSlotVisible_2_) {
        this.setModelVisible(p_setModelSlotVisible_1_);
        switch(p_setModelSlotVisible_2_) {
            case HEAD:
                p_setModelSlotVisible_1_.bipedHead.showModel = true;
                p_setModelSlotVisible_1_.bipedHeadwear.showModel = true;
                break;
            case CHEST:
                p_setModelSlotVisible_1_.bipedBody.showModel = true;
                p_setModelSlotVisible_1_.bipedRightArm.showModel = true;
                p_setModelSlotVisible_1_.bipedLeftArm.showModel = true;
                break;
            case LEGS:
                p_setModelSlotVisible_1_.bipedBody.showModel = true;
                p_setModelSlotVisible_1_.bipedRightLeg.showModel = true;
                p_setModelSlotVisible_1_.bipedLeftLeg.showModel = true;
                break;
            case FEET:
                p_setModelSlotVisible_1_.bipedRightLeg.showModel = true;
                p_setModelSlotVisible_1_.bipedLeftLeg.showModel = true;
        }

    }

    protected void setModelVisible(ModelBiped p_setModelVisible_1_) {
        p_setModelVisible_1_.setVisible(false);
    }

    protected ModelBiped getArmorModelHook(EntityLivingBase p_getArmorModelHook_1_, ItemStack p_getArmorModelHook_2_, EntityEquipmentSlot p_getArmorModelHook_3_, ModelBiped p_getArmorModelHook_4_) {
        return ForgeHooksClient.getArmorModel(p_getArmorModelHook_1_, p_getArmorModelHook_2_, p_getArmorModelHook_3_, p_getArmorModelHook_4_);
    }
}
