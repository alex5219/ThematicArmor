package com.alexjw.siegecraft.client.renderer.entity.operators;

import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.entity.operator.EntityBandit;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBandit extends RenderLivingBase<EntityBandit> {
    public RenderBandit(RenderManager manager) {
        super(manager, SiegeRendererManager.bandit.getModelBiped(), 0.1f);
    }

    protected ResourceLocation getEntityTexture(EntityBandit entity) {
        return SiegeRendererManager.bandit.getArmorTexture();
    }

    public ModelBiped getMainModel() {
        return SiegeRendererManager.bandit.getModelBiped();
    }

    public void doRender(EntityBandit entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    protected void renderEntityName(EntityBandit entityIn, double x, double y, double z, String name, double distanceSq) {
    }
}
