package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityDoc;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDoc extends RenderLivingBase<EntityDoc> {
    public RenderDoc(RenderManager manager) {
        super(manager, SiegeRendererManager.doc.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityDoc entity) {
        return SiegeRendererManager.doc.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.doc.getModelBiped();
    }

    public void doRender(EntityDoc entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityDoc entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}