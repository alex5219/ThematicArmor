package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.common.entity.operator.EntitySledge;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSledge extends RenderLivingBase<EntitySledge> {
    public RenderSledge(RenderManager manager) {
        super(manager, SiegeRendererManager.sledge.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntitySledge entity) {
        return SiegeRendererManager.sledge.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.sledge.getModelBiped();
    }

    public void doRender(EntitySledge entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntitySledge entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
