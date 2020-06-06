package com.alexjw.siegecraft.client.model;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGadgetDrone extends ModelBiped {
    public final ModelRenderer entityDrone;
    public final ModelRenderer entityDroneLights;
    public final ModelRenderer entityDroneWheels;

    public ModelGadgetDrone() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        entityDrone = new ModelRenderer(this);
        entityDrone.setRotationPoint(2.0F, 24.0F, 0.0F);
        bipedBody.addChild(entityDrone);
        entityDrone.cubeList.add(new ModelBox(entityDrone, 23, 89, -3.5F, -2.0F, 0.5F, 2, 1, 1, 0.0F, false));

        entityDroneLights = new ModelRenderer(this);
        entityDroneLights.setRotationPoint(-1.5F, -1.0F, 0.5F);
        entityDrone.addChild(entityDroneLights);


        entityDroneWheels = new ModelRenderer(this);
        entityDroneWheels.setRotationPoint(0.0F, 0.0F, 0.0F);
        entityDrone.addChild(entityDroneWheels);
        setRotationAngle(entityDroneWheels, 0.5236F, 0.0F, 0.0F);
        entityDroneWheels.cubeList.add(new ModelBox(entityDroneWheels, 23, 76, -4.0F, -1.067F, 1.0365F, 3, 1, 1, 0.0F, false));
        entityDroneWheels.cubeList.add(new ModelBox(entityDroneWheels, 23, 76, -5.0F, -1.6016F, 0.5879F, 1, 2, 2, 0.0F, false));
        entityDroneWheels.cubeList.add(new ModelBox(entityDroneWheels, 23, 76, -1.0F, -1.6016F, 0.5879F, 1, 2, 2, 0.0F, false));
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}