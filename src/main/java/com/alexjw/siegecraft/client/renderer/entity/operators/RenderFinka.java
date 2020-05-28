package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.common.entity.operator.EntityFinka;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFinka extends RenderLivingBase<EntityFinka> {
    public RenderFinka(RenderManager manager) {
        super(manager, SiegeRendererManager.finka.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityFinka entity) {
        return SiegeRendererManager.finka.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.finka.getModelBiped();
    }

    public void doRender(EntityFinka entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityFinka entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
