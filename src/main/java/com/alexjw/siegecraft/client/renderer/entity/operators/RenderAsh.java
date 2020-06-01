package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityAsh;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAsh extends RenderLivingBase<EntityAsh> {
    public RenderAsh(RenderManager manager) {
        super(manager, SiegeRendererManager.ash.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityAsh entity) {
        return SiegeRendererManager.ash.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.ash.getModelBiped();
    }

    public void doRender(EntityAsh entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityAsh entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
