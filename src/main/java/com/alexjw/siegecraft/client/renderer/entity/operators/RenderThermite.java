package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityThermite;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThermite extends RenderLivingBase<EntityThermite> {
    public RenderThermite(RenderManager manager) { super(manager, SiegeRendererManager.thermite.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityThermite entity) {
        return SiegeRendererManager.thermite.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.thermite.getModelBiped();
    }

    public void doRender(EntityThermite entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityThermite entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
