package com.alexjw.siegecraft.client.renderer.entity.player;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SiegeRenderPlayer extends RenderLivingBase<AbstractClientPlayer> {
    private float invisValue = 99.0f;

    public SiegeRenderPlayer(RenderManager renderManager, float invisValue) {
        super(renderManager, new ModelPlayer(0.0F, false), 0.5f);
        this.addLayer(new LayerBipedArmor(this));
        this.addLayer(new LayerHeldItem(this));
        this.addLayer(new LayerCustomHead(this.getMainModel().bipedHead));
        this.invisValue = invisValue;
        this.shadowOpaque = 0.0f;
        this.shadowSize = 0.0f;
    }

    public ModelPlayer getMainModel() {
        return (ModelPlayer) super.getMainModel();
    }

    public void doRender(AbstractClientPlayer abstractClientPlayer, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.color(1, 1, 1, invisValue);
        this.setModelVisibilities(abstractClientPlayer);
        GlStateManager.enableBlendProfile(GlStateManager.Profile.PLAYER_SKIN);
        super.doRender(abstractClientPlayer, x, y, z, entityYaw, partialTicks);
        GlStateManager.disableBlendProfile(GlStateManager.Profile.PLAYER_SKIN);
    }

    private void setModelVisibilities(AbstractClientPlayer abstractClientPlayer) {
        ModelPlayer modelplayer = this.getMainModel();
        if (abstractClientPlayer.isSpectator()) {
            modelplayer.setVisible(false);
            modelplayer.bipedHead.showModel = true;
            modelplayer.bipedHeadwear.showModel = false;
        } else {
            ItemStack itemstack = abstractClientPlayer.getHeldItemMainhand();
            ItemStack itemstack1 = abstractClientPlayer.getHeldItemOffhand();
            modelplayer.setVisible(true);
            modelplayer.bipedHeadwear.showModel = false;
            modelplayer.bipedBodyWear.showModel = false;
            modelplayer.bipedLeftLegwear.showModel = false;
            modelplayer.bipedRightLegwear.showModel = false;
            modelplayer.bipedLeftArmwear.showModel = false;
            modelplayer.bipedRightArmwear.showModel = false;
            modelplayer.isSneak = abstractClientPlayer.isSneaking();
            ModelBiped.ArmPose modelbiped$armpose = ModelBiped.ArmPose.EMPTY;
            ModelBiped.ArmPose modelbiped$armpose1 = ModelBiped.ArmPose.EMPTY;
            EnumAction enumaction1;
            if (!itemstack.isEmpty()) {
                modelbiped$armpose = ModelBiped.ArmPose.ITEM;
                if (abstractClientPlayer.getItemInUseCount() > 0) {
                    enumaction1 = itemstack.getItemUseAction();
                    if (enumaction1 == EnumAction.BLOCK) {
                        modelbiped$armpose = ModelBiped.ArmPose.BLOCK;
                    } else if (enumaction1 == EnumAction.BOW) {
                        modelbiped$armpose = ModelBiped.ArmPose.BOW_AND_ARROW;
                    }
                }
            }

            if (!itemstack1.isEmpty()) {
                modelbiped$armpose1 = ModelBiped.ArmPose.ITEM;
                if (abstractClientPlayer.getItemInUseCount() > 0) {
                    enumaction1 = itemstack1.getItemUseAction();
                    if (enumaction1 == EnumAction.BLOCK) {
                        modelbiped$armpose1 = ModelBiped.ArmPose.BLOCK;
                    } else if (enumaction1 == EnumAction.BOW) {
                        modelbiped$armpose1 = ModelBiped.ArmPose.BOW_AND_ARROW;
                    }
                }
            }

            if (abstractClientPlayer.getPrimaryHand() == EnumHandSide.RIGHT) {
                modelplayer.rightArmPose = modelbiped$armpose;
                modelplayer.leftArmPose = modelbiped$armpose1;
            } else {
                modelplayer.rightArmPose = modelbiped$armpose1;
                modelplayer.leftArmPose = modelbiped$armpose;
            }
        }

    }

    public ResourceLocation getEntityTexture(AbstractClientPlayer abstractClientPlayer) {
        return abstractClientPlayer.getLocationSkin();
    }

    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0F, 0.1875F, 0.0F);
    }

    protected void preRenderCallback(AbstractClientPlayer p_preRenderCallback_1_, float p_preRenderCallback_2_) {
        float f = 0.9375F;
        GlStateManager.scale(0.9375F, 0.9375F, 0.9375F);
    }

    protected void renderEntityName(AbstractClientPlayer p_renderEntityName_1_, double p_renderEntityName_2_, double p_renderEntityName_4_, double p_renderEntityName_6_, String p_renderEntityName_8_, double p_renderEntityName_9_) {
        //super.renderEntityName(p_renderEntityName_1_, p_renderEntityName_2_, p_renderEntityName_4_, p_renderEntityName_6_, p_renderEntityName_8_, p_renderEntityName_9_);
    }

    public void renderRightArm(AbstractClientPlayer p_renderRightArm_1_) {
        float f = 1.0F;
        GlStateManager.color(1.0F, 1.0F, 1.0F);
        float f1 = 0.0625F;
        ModelPlayer modelplayer = this.getMainModel();
        this.setModelVisibilities(p_renderRightArm_1_);
        GlStateManager.enableBlend();
        modelplayer.swingProgress = 0.0F;
        modelplayer.isSneak = false;
        modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, p_renderRightArm_1_);
        modelplayer.bipedRightArm.rotateAngleX = 0.0F;
        modelplayer.bipedRightArm.render(0.0625F);
        modelplayer.bipedRightArmwear.rotateAngleX = 0.0F;
        modelplayer.bipedRightArmwear.render(0.0625F);
        GlStateManager.disableBlend();
    }

    public void renderLeftArm(AbstractClientPlayer p_renderLeftArm_1_) {
        float f = 1.0F;
        GlStateManager.color(1.0F, 1.0F, 1.0F);
        float f1 = 0.0625F;
        ModelPlayer modelplayer = this.getMainModel();
        this.setModelVisibilities(p_renderLeftArm_1_);
        GlStateManager.enableBlend();
        modelplayer.isSneak = false;
        modelplayer.swingProgress = 0.0F;
        modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, p_renderLeftArm_1_);
        modelplayer.bipedLeftArm.rotateAngleX = 0.0F;
        modelplayer.bipedLeftArm.render(0.0625F);
        modelplayer.bipedLeftArmwear.rotateAngleX = 0.0F;
        modelplayer.bipedLeftArmwear.render(0.0625F);
        GlStateManager.disableBlend();
    }

    protected void renderLivingAt(AbstractClientPlayer p_renderLivingAt_1_, double p_renderLivingAt_2_, double p_renderLivingAt_4_, double p_renderLivingAt_6_) {
        if (p_renderLivingAt_1_.isEntityAlive() && p_renderLivingAt_1_.isPlayerSleeping()) {
            super.renderLivingAt(p_renderLivingAt_1_, p_renderLivingAt_2_ + (double) p_renderLivingAt_1_.renderOffsetX, p_renderLivingAt_4_ + (double) p_renderLivingAt_1_.renderOffsetY, p_renderLivingAt_6_ + (double) p_renderLivingAt_1_.renderOffsetZ);
        } else {
            super.renderLivingAt(p_renderLivingAt_1_, p_renderLivingAt_2_, p_renderLivingAt_4_, p_renderLivingAt_6_);
        }

    }

    protected void applyRotations(AbstractClientPlayer p_applyRotations_1_, float p_applyRotations_2_, float p_applyRotations_3_, float p_applyRotations_4_) {
        if (p_applyRotations_1_.isEntityAlive() && p_applyRotations_1_.isPlayerSleeping()) {
            GlStateManager.rotate(p_applyRotations_1_.getBedOrientationInDegrees(), 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(this.getDeathMaxRotation(p_applyRotations_1_), 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(270.0F, 0.0F, 1.0F, 0.0F);
        } else if (p_applyRotations_1_.isElytraFlying()) {
            super.applyRotations(p_applyRotations_1_, p_applyRotations_2_, p_applyRotations_3_, p_applyRotations_4_);
            float f = (float) p_applyRotations_1_.getTicksElytraFlying() + p_applyRotations_4_;
            float f1 = MathHelper.clamp(f * f / 100.0F, 0.0F, 1.0F);
            GlStateManager.rotate(f1 * (-90.0F - p_applyRotations_1_.rotationPitch), 1.0F, 0.0F, 0.0F);
            Vec3d vec3d = p_applyRotations_1_.getLook(p_applyRotations_4_);
            double d0 = p_applyRotations_1_.motionX * p_applyRotations_1_.motionX + p_applyRotations_1_.motionZ * p_applyRotations_1_.motionZ;
            double d1 = vec3d.x * vec3d.x + vec3d.z * vec3d.z;
            if (d0 > 0.0D && d1 > 0.0D) {
                double d2 = (p_applyRotations_1_.motionX * vec3d.x + p_applyRotations_1_.motionZ * vec3d.z) / (Math.sqrt(d0) * Math.sqrt(d1));
                double d3 = p_applyRotations_1_.motionX * vec3d.z - p_applyRotations_1_.motionZ * vec3d.x;
                GlStateManager.rotate((float) (Math.signum(d3) * Math.acos(d2)) * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
            }
        } else {
            super.applyRotations(p_applyRotations_1_, p_applyRotations_2_, p_applyRotations_3_, p_applyRotations_4_);
        }
    }
}