package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityJackal;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJackal extends RenderLivingBase<EntityJackal> {
    public RenderJackal(RenderManager manager) {
        super(manager, SiegeRendererManager.jackal.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityJackal entity) {
        return SiegeRendererManager.jackal.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.jackal.getModelBiped();
    }

    public void doRender(EntityJackal entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityJackal entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
