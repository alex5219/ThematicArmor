package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityEla;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEla extends RenderLivingBase<EntityEla> {
    public RenderEla(RenderManager manager) {
        super(manager, SiegeRendererManager.ela.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityEla entity) {
        return SiegeRendererManager.ela.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.ela.getModelBiped();
    }

    public void doRender(EntityEla entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityEla entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
