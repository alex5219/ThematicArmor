package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.entity.EntityStim;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderStim extends Render<EntityStim> {
    public RenderStim(RenderManager renderManager) {
        super(renderManager);
    }

    protected ResourceLocation getEntityTexture(EntityStim entityStim) {
        return new ResourceLocation(Siege.MODID, "textures/models/stim.png");
    }

    public void doRender(EntityStim p_doRender_1_, double p_doRender_2_, double p_doRender_4_, double p_doRender_6_, float p_doRender_8_, float p_doRender_9_) {
        this.bindEntityTexture(p_doRender_1_);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.pushMatrix();
        GlStateManager.disableLighting();
        GlStateManager.translate((float) p_doRender_2_, (float) p_doRender_4_, (float) p_doRender_6_);
        GlStateManager.rotate(p_doRender_1_.prevRotationYaw + (p_doRender_1_.rotationYaw - p_doRender_1_.prevRotationYaw) * p_doRender_9_ - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(p_doRender_1_.prevRotationPitch + (p_doRender_1_.rotationPitch - p_doRender_1_.prevRotationPitch) * p_doRender_9_, 0.0F, 0.0F, 1.0F);
        Tessellator lvt_10_1_ = Tessellator.getInstance();
        BufferBuilder lvt_11_1_ = lvt_10_1_.getBuffer();
        boolean lvt_12_1_ = false;
        float lvt_13_1_ = 0.0F;
        float lvt_14_1_ = 0.5F;
        float lvt_15_1_ = 0.0F;
        float lvt_16_1_ = 0.15625F;
        float lvt_17_1_ = 0.0F;
        float lvt_18_1_ = 0.15625F;
        float lvt_19_1_ = 0.15625F;
        float lvt_20_1_ = 0.3125F;
        float lvt_21_1_ = 0.05625F;
        GlStateManager.enableRescaleNormal();
        float lvt_22_1_ = (float) p_doRender_1_.arrowShake - p_doRender_9_;
        if (lvt_22_1_ > 0.0F) {
            float lvt_23_1_ = -MathHelper.sin(lvt_22_1_ * 3.0F) * lvt_22_1_;
            GlStateManager.rotate(lvt_23_1_, 0.0F, 0.0F, 1.0F);
        }

        GlStateManager.rotate(45.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05625F, 0.05625F, 0.05625F);
        GlStateManager.translate(-4.0F, 0.0F, 0.0F);
        if (this.renderOutlines) {
            GlStateManager.enableColorMaterial();
            GlStateManager.enableOutlineMode(this.getTeamColor(p_doRender_1_));
        }

        GlStateManager.glNormal3f(0.05625F, 0.0F, 0.0F);
        lvt_11_1_.begin(7, DefaultVertexFormats.POSITION_TEX);
        lvt_11_1_.pos(-7.0D, -2.0D, -2.0D).tex(0.0D, 0.15625D).endVertex();
        lvt_11_1_.pos(-7.0D, -2.0D, 2.0D).tex(0.15625D, 0.15625D).endVertex();
        lvt_11_1_.pos(-7.0D, 2.0D, 2.0D).tex(0.15625D, 0.3125D).endVertex();
        lvt_11_1_.pos(-7.0D, 2.0D, -2.0D).tex(0.0D, 0.3125D).endVertex();
        lvt_10_1_.draw();
        GlStateManager.glNormal3f(-0.05625F, 0.0F, 0.0F);
        lvt_11_1_.begin(7, DefaultVertexFormats.POSITION_TEX);
        lvt_11_1_.pos(-7.0D, 2.0D, -2.0D).tex(0.0D, 0.15625D).endVertex();
        lvt_11_1_.pos(-7.0D, 2.0D, 2.0D).tex(0.15625D, 0.15625D).endVertex();
        lvt_11_1_.pos(-7.0D, -2.0D, 2.0D).tex(0.15625D, 0.3125D).endVertex();
        lvt_11_1_.pos(-7.0D, -2.0D, -2.0D).tex(0.0D, 0.3125D).endVertex();
        lvt_10_1_.draw();

        for (int lvt_23_2_ = 0; lvt_23_2_ < 4; ++lvt_23_2_) {
            GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.glNormal3f(0.0F, 0.0F, 0.05625F);
            lvt_11_1_.begin(7, DefaultVertexFormats.POSITION_TEX);
            lvt_11_1_.pos(-8.0D, -2.0D, 0.0D).tex(0.0D, 0.0D).endVertex();
            lvt_11_1_.pos(8.0D, -2.0D, 0.0D).tex(0.5D, 0.0D).endVertex();
            lvt_11_1_.pos(8.0D, 2.0D, 0.0D).tex(0.5D, 0.15625D).endVertex();
            lvt_11_1_.pos(-8.0D, 2.0D, 0.0D).tex(0.0D, 0.15625D).endVertex();
            lvt_10_1_.draw();
        }

        if (this.renderOutlines) {
            GlStateManager.disableOutlineMode();
            GlStateManager.disableColorMaterial();
        }

        GlStateManager.disableRescaleNormal();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(p_doRender_1_, p_doRender_2_, p_doRender_4_, p_doRender_6_, p_doRender_8_, p_doRender_9_);
    }
}
