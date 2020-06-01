package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityRook;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRook extends RenderLivingBase<EntityRook> {
    public RenderRook(RenderManager manager) {
        super(manager, SiegeRendererManager.rook.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityRook entity) {
        return SiegeRendererManager.rook.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.rook.getModelBiped();
    }

    public void doRender(EntityRook entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityRook entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
