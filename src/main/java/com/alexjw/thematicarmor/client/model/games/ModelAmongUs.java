package com.alexjw.thematicarmor.client.model.games;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmongUs extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodyOxygen;
    private final ModelRenderer bipedRightArmDetail;
    private final ModelRenderer bipedLeftArmDetail;
    private final ModelRenderer bipedRightLegDetail;
    private final ModelRenderer bipedLeftLegDetail;

    public ModelAmongUs() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 15, -3.475F, -29.5F, -5.1F, 7, 4, 3, -0.425F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 15, -3.475F, -30.5F, -5.1F, 7, 6, 3, -0.775F, false));


        bipedBodyOxygen = new ModelRenderer(this);
        bipedBodyOxygen.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyOxygen);
        bipedBodyOxygen.cubeList.add(new ModelBox(bipedBodyOxygen, 65, 29, -3.5F, -23.5F, 1.75F, 7, 9, 3, 0.0F, false));



        bipedRightArmDetail = new ModelRenderer(this);
        bipedRightArmDetail.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetail);



        bipedLeftArmDetail = new ModelRenderer(this);
        bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetail);



        bipedRightLegDetail = new ModelRenderer(this);
        bipedRightLegDetail.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegDetail);



        bipedLeftLegDetail = new ModelRenderer(this);
        bipedLeftLegDetail.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegDetail);


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