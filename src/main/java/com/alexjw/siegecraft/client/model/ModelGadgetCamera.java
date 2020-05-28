package com.alexjw.siegecraft.client.model;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGadgetCamera extends ModelBase {
    private final ModelRenderer modelEntityCamera;

    public ModelGadgetCamera() {
        textureWidth = 64;
        textureHeight = 64;

        modelEntityCamera = new ModelRenderer(this);
        modelEntityCamera.setRotationPoint(0.0F, 20.0F, 0.0F);
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 2, -1.0F, -19.5F, -2.0F, 4, 1, 4, -0.2F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 5, -1.0F, -19.0F, -2.0F, 4, 1, 4, -0.3F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 5, -1.0F, -19.5F, -2.0F, 4, 2, 4, -0.4F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 45, 35, -0.5F, -19.0F, -1.5F, 3, 2, 3, -0.2F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 44, 36, -1.0F, -18.75F, -1.5F, 4, 2, 3, -0.6F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 42, 36, -0.5F, -18.75F, -2.0F, 3, 2, 4, -0.6F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 31, 0.25F, -18.5F, 0.5F, 2, 2, 2, -0.9F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 31, 0.25F, -18.75F, 0.5F, 2, 2, 2, -0.9F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 31, -0.25F, -18.5F, 0.5F, 2, 2, 2, -0.9F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 31, 0.0F, -18.5F, 0.5F, 2, 2, 2, -0.9F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 40, 31, 0.0F, -18.75F, 0.5F, 2, 2, 2, -0.825F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 25, 31, -0.25F, -18.75F, 0.5F, 2, 2, 2, -0.9F, false));
        modelEntityCamera.cubeList.add(new ModelBox(modelEntityCamera, 46, 37, -0.5F, -17.5F, -1.5F, 3, 1, 3, -0.3F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        modelEntityCamera.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}