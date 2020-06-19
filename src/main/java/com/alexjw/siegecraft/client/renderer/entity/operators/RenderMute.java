package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityMute;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMute extends RenderLiving<EntityMute> {
    public RenderMute(RenderManager manager) {
        super(manager, SiegeRendererManager.mute.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityMute entity) {
        return SiegeRendererManager.mute.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.mute.getModelBiped();
    }

    public void doRender(EntityMute entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityMute entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
