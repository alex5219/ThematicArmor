package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.model.ModelGadgetDrone;
import com.alexjw.siegecraft.common.entity.EntityDrone;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDrone extends RenderLiving<EntityDrone> {
    protected ModelBase mainModel;

    public RenderDrone(RenderManager manager) {
        super(manager, new ModelGadgetDrone(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityDrone entity) {
        return new ResourceLocation(Siege.MODID, "textures/models/gadget_drone.png");
    }

    public ModelBase getMainModel() {
        return new ModelGadgetDrone();
    }

    protected void applyRotations(EntityDrone entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        GlStateManager.rotate(180.0F - rotationYaw, 0.0F, 1.0F, 0.0F);
        float f = (float) (entityLiving.world.getTotalWorldTime()) + partialTicks;

        if (f < 5.0F) {
            GlStateManager.rotate(MathHelper.sin(f / 1.5F * (float) Math.PI) * 3.0F, 0.0F, 1.0F, 0.0F);
        }
    }

    protected void renderModel(EntityDrone entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        if (!this.bindEntityTexture(entitylivingbaseIn)) {
            return;
        }
        this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }

    /**
     * Returns a rotation angle that is inbetween two other rotation angles. par1 and par2 are the angles between which
     * to interpolate, par3 is probably a float between 0.0 and 1.0 that tells us where "between" the two angles we are.
     * Example: par1 = 30, par2 = 50, par3 = 0.5, then return = 40
     */
    protected float interpolateRotation(float prevYawOffset, float yawOffset, float partialTicks) {
        float f;

        for (f = yawOffset - prevYawOffset; f < -180.0F; f += 360.0F) {
        }

        while (f >= 180.0F) {
            f -= 360.0F;
        }

        return prevYawOffset + partialTicks * f;
    }

    public void transformHeldFull3DItemLayer() {
    }

    public void doRender(EntityDrone entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
        this.mainModel = new ModelGadgetDrone();
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        boolean shouldSit = entity.isRiding() && (entity.getRidingEntity() != null && entity.getRidingEntity().shouldRiderSit());
        this.mainModel.isRiding = shouldSit;
        this.mainModel.isChild = entity.isChild();
        try {
            float f = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);
            float f1 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, partialTicks);
            float f2 = f1 - f;

            if (shouldSit && entity.getRidingEntity() instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase = (EntityLivingBase) entity.getRidingEntity();
                f = this.interpolateRotation(entitylivingbase.prevRenderYawOffset, entitylivingbase.renderYawOffset, partialTicks);
                f2 = f1 - f;
                float f3 = MathHelper.wrapDegrees(f2);

                if (f3 < -85.0F) {
                    f3 = -85.0F;
                }

                if (f3 >= 85.0F) {
                    f3 = 85.0F;
                }

                f = f1 - f3;

                if (f3 * f3 > 2500.0F) {
                    f += f3 * 0.2F;
                }

                f2 = f1 - f;
            }

            float f7 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
            this.renderLivingAt(entity, x, y, z);
            float f8 = this.handleRotationFloat(entity, partialTicks);
            this.applyRotations(entity, f8, f, partialTicks);
            float f4 = this.prepareScale(entity, partialTicks);
            float f5 = 0.0F;
            float f6 = 0.0F;

            if (!entity.isRiding()) {
                f5 = entity.prevLimbSwingAmount + (entity.limbSwingAmount - entity.prevLimbSwingAmount) * partialTicks;
                f6 = entity.limbSwing - entity.limbSwingAmount * (1.0F - partialTicks);

                if (entity.isChild()) {
                    f6 *= 3.0F;
                }

                if (f5 > 1.0F) {
                    f5 = 1.0F;
                }
                f2 = f1 - f; // Forge: Fix MC-1207
            }
            this.renderModel(entity, f6, f5, f8, f2, f7, f4);

            GlStateManager.enableAlpha();
            this.mainModel.setLivingAnimations(entity, f6, f5, partialTicks);
            this.mainModel.setRotationAngles(f6, f5, f8, f2, f7, f4, entity);
            GlStateManager.disableRescaleNormal();
        } catch (Exception e) {
            e.printStackTrace();
        }

        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }

    protected boolean canRenderName(EntityDrone entity) {
        return entity.getAlwaysRenderNameTag();
    }

    protected void renderLivingAt(EntityDrone entityLivingBaseIn, double x, double y, double z) {
        GlStateManager.translate((float) x, (float) y, (float) z);
    }


    /**
     * Returns where in the swing animation the living entity is (from 0 to 1).  Args : entity, partialTickTime
     */
    protected float getSwingProgress(EntityDrone livingBase, float partialTickTime) {
        return livingBase.getSwingProgress(partialTickTime);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityDrone livingBase, float partialTicks) {
        return (float) livingBase.ticksExisted + partialTicks;
    }


    public float prepareScale(EntityDrone entitylivingbaseIn, float partialTicks) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        this.preRenderCallback(entitylivingbaseIn, partialTicks);
        float f = 0.0625F;
        GlStateManager.translate(0.0F, -1.501F, 0.0F);
        return 0.0625F;
    }

    protected float getDeathMaxRotation(EntityDrone entityLivingBaseIn) {
        return 90.0F;
    }

    /**
     * Gets an RGBA int color multiplier to apply.
     */
    protected int getColorMultiplier(EntityDrone entitylivingbaseIn, float lightBrightness, float partialTickTime) {
        return 0;
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityDrone entitylivingbaseIn, float partialTickTime) {
    }

    public boolean shouldRender(EntityDrone livingEntity, ICamera camera, double camX, double camY, double camZ) {
        return true;
    }
}