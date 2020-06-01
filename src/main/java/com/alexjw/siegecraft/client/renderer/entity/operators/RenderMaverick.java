package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityMaverick;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaverick extends RenderLiving<EntityMaverick> {
    public RenderMaverick(RenderManager manager) {
        super(manager, SiegeRendererManager.maverick.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityMaverick entity) {
        return SiegeRendererManager.maverick.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.maverick.getModelBiped();
    }

    public void doRender(EntityMaverick entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityMaverick entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
