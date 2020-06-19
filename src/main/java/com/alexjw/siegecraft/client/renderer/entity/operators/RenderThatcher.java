package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityThatcher;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThatcher extends RenderLivingBase<EntityThatcher> {
    public RenderThatcher(RenderManager manager) { super(manager, SiegeRendererManager.thatcher.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityThatcher entity) {
        return SiegeRendererManager.thatcher.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.thatcher.getModelBiped();
    }

    public void doRender(EntityThatcher entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityThatcher entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
