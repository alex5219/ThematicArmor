package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityCapitao;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCapitao extends RenderLivingBase<EntityCapitao> {
    public RenderCapitao(RenderManager manager) {
        super(manager, SiegeRendererManager.capitao.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityCapitao entity) {
        return SiegeRendererManager.capitao.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.capitao.getModelBiped();
    }

    public void doRender(EntityCapitao entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityCapitao entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}