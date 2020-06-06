package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityVigil;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("ALL")
public class RenderVigil extends RenderLivingBase<EntityVigil> {
    public RenderVigil(RenderManager manager) {
        super(manager, SiegeRendererManager.vigil.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityVigil entity) {
        return SiegeRendererManager.vigil.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.vigil.getModelBiped();
    }

    public void doRender(EntityVigil entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityVigil entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
