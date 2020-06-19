package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityEcho;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEcho extends RenderLivingBase<EntityEcho> {
    public RenderEcho(RenderManager manager) {
        super(manager, SiegeRendererManager.echo.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityEcho entity) { return SiegeRendererManager.echo.getArmorTexture(); }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.echo.getModelBiped();
    }

    public void doRender(EntityEcho entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityEcho entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
