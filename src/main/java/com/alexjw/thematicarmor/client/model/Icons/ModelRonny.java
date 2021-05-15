package com.alexjw.thematicarmor.client.model.Icons;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRonny extends ModelBiped {
    private final ModelRenderer bipedHeadHair;
    private final ModelRenderer bipedBodyDetail;

    public ModelRonny() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftLeg.mirror = false;
        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 16, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftLeg.mirror = false;



        bipedHeadHair = new ModelRenderer(this);
        bipedHeadHair.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadHair);
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.125F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 30, 0, -1.6F, -8.45F, -4.0F, 5, 3, 8, 0.35F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 25, 12, 1.95F, -5.025F, -4.5F, 1, 1, 1, -0.275F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 87, 4, 1.95F, -5.55F, -4.5F, 1, 2, 1, -0.4F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 87, 4, -2.9F, -5.55F, -4.5F, 1, 2, 1, -0.4F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 25, 12, -2.925F, -5.025F, -4.5F, 1, 1, 1, -0.275F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 72, 3, -2.85F, -5.025F, -4.75F, 1, 1, 1, -0.375F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 72, 3, 1.875F, -5.025F, -4.75F, 1, 1, 1, -0.375F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 48, 9, -3.625F, -3.675F, -4.5F, 7, 1, 1, -0.15F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 9, -1.025F, -4.325F, -4.5F, 2, 1, 1, 0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 41, 2, -1.025F, -4.2F, -4.75F, 2, 1, 1, -0.125F, false));


        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.075F, 24.0F, -0.025F);
        bipedBody.addChild(bipedBodyDetail);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 41, 4, 0.975F, -21.525F, -2.275F, 3, 3, 1, -0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 35, 28, 1.025F, -20.925F, -2.875F, 1, 2, 1, -0.3F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 35, 28, 2.925F, -20.925F, -2.875F, 1, 2, 1, -0.3F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 35, 28, 2.0F, -20.925F, -2.875F, 1, 2, 1, -0.3F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 35, 28, 1.525F, -21.125F, -2.8F, 1, 1, 1, -0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 35, 28, 2.525F, -21.125F, -2.825F, 1, 1, 1, -0.175F, false));

       }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bipedHead.showModel = true;
        this.bipedLeftLeg.showModel = true;
        this.bipedRightLeg.showModel = true;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}