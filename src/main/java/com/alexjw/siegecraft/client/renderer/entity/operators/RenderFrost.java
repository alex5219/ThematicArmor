package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityFrost;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFrost extends RenderLivingBase<EntityFrost> {
    public RenderFrost(RenderManager manager) {
        super(manager, SiegeRendererManager.frost.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityFrost entity) {
        return SiegeRendererManager.frost.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.frost.getModelBiped();
    }

    public void doRender(EntityFrost entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityFrost entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}

