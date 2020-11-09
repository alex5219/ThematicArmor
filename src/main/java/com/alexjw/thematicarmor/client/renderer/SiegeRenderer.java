package com.alexjw.thematicarmor.client.renderer;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.armors.Armor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;

public class SiegeRenderer {
    private final Armor armor;
    private final ModelBiped modelBiped;

    public SiegeRenderer(Armor armor, ModelBiped modelBiped) {
        SiegeRendererManager.siegeRenderers.add(this);
        this.armor = armor;
        this.modelBiped = modelBiped;
    }

    public void init() {

    }

    public ResourceLocation getArmorTexture() {
        return new ResourceLocation(ThematicArmor.MODID, "textures/models/" + armor.getUnlocalizedName() + ".png");
    }

    public Armor getArmor() {
        return armor;
    }

    public ModelBiped getModelBiped() {
        return modelBiped;
    }
}