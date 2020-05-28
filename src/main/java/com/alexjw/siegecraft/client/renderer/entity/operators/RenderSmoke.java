package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.common.entity.operator.EntitySmoke;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSmoke extends RenderLivingBase<EntitySmoke> {
    public RenderSmoke(RenderManager manager) {
        super(manager, SiegeRendererManager.smoke.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntitySmoke entity) {
        return SiegeRendererManager.smoke.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.smoke.getModelBiped();
    }

    public void doRender(EntitySmoke entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntitySmoke entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
