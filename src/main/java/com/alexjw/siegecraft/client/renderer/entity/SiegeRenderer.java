package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.common.operators.Operator;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;

public class SiegeRenderer {
    private Operator operator;
    private ModelBiped modelBiped;

    public SiegeRenderer(Operator operator, ModelBiped modelBiped) {
        SiegeRendererManager.siegeRenderers.add(this);
        this.operator = operator;
        this.modelBiped = modelBiped;
    }

    public void init() {

    }

    public ResourceLocation getArmorTexture() {
        return new ResourceLocation(Siege.MODID, "textures/models/" + operator.getUnlocalizedName() + ".png");
    }

    public Operator getOperator() {
        return operator;
    }

    public ModelBiped getModelBiped() {
        return modelBiped;
    }
}
