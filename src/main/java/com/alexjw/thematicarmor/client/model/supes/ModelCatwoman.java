package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCatwoman extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodyDetail;
    private final ModelRenderer bipedBodyDetail2;
    private final ModelRenderer bipedLeftLegWhip;

    public ModelCatwoman() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, 1.425F, -30.75F, -4.65F, 3, 2, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 0, 0, -4.0F, -32.725F, -4.0F, 8, 2, 8, 0.125F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 94, 19, 0.925F, -31.75F, -5.1F, 3, 2, 2, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 94, 19, -3.575F, -31.75F, -5.1F, 3, 2, 2, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 76, 26, -3.5F, -30.25F, -5.25F, 3, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 0.75F, -30.25F, -5.25F, 3, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -3.25F, -32.4F, -5.25F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 1.75F, -32.4F, -5.25F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 3.35F, -32.0F, -5.25F, 1, 2, 2, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 9, 2, 2.85F, -33.75F, -0.75F, 1, 2, 2, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 9, 2, -3.65F, -33.75F, -0.75F, 1, 2, 2, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -4.075F, -32.0F, -5.25F, 1, 2, 2, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 0.25F, -31.0F, -5.25F, 1, 1, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -0.75F, -31.0F, -5.25F, 1, 1, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -1.0F, -30.5F, -5.25F, 1, 1, 2, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -1.0F, -31.5F, -5.25F, 1, 1, 2, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 0.775F, -31.925F, -5.25F, 1, 1, 2, -0.025F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, -1.475F, -31.925F, -5.25F, 1, 1, 2, -0.025F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 0.25F, -30.5F, -5.25F, 1, 1, 2, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 78, 18, 0.25F, -31.5F, -5.25F, 1, 1, 2, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, 2.6F, -29.0F, -4.6F, 2, 1, 3, 0.075F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, -4.4F, -30.25F, -4.6F, 1, 4, 1, -0.025F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, -4.65F, -29.65F, -3.85F, 1, 4, 1, -0.075F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, -4.65F, -30.225F, -4.35F, 1, 4, 2, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 108, 5, 0.6F, -28.5F, -4.45F, 3, 1, 1, -0.325F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 108, 5, -3.525F, -28.5F, -4.475F, 3, 1, 1, -0.325F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 77, 9, -3.525F, -29.0F, -4.45F, 3, 1, 1, -0.275F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 77, 9, 0.6F, -29.0F, -4.55F, 3, 1, 1, -0.275F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 110, 19, -1.0F, -26.0F, -4.3F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 82, 4, 3.425F, -28.0F, -4.45F, 1, 1, 4, 0.0F, false));


        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.0F, 24.0F, -1.75F);
        bipedBody.addChild(bipedBodyDetail);
        setRotationAngle(bipedBodyDetail, -0.1527F, 0.0F, 0.0F);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 20, 22, -3.0F, -21.2158F, -3.9724F, 6, 3, 1, 0.2F, false));

        bipedBodyDetail2 = new ModelRenderer(this);
        bipedBodyDetail2.setRotationPoint(0.225F, 5.025F, 5.975F);
        bipedBody.addChild(bipedBodyDetail2);
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 78, 22, -0.725F, 0.255F, -8.579F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 78, 22, -0.725F, -4.795F, -8.754F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 78, 22, -1.225F, 0.755F, -8.629F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 78, 22, -0.725F, 1.255F, -8.554F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 30, 53, -0.725F, -0.245F, -8.504F, 1, 7, 1, -0.3F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 90, 30, -4.725F, 5.03F, -8.504F, 9, 2, 5, -0.25F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 29, 22, -2.225F, -5.72F, -8.879F, 4, 2, 5, -0.575F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 73, 18, -1.25F, 4.53F, -9.004F, 2, 3, 6, -0.55F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 90, 30, -4.3F, 4.53F, -9.004F, 2, 3, 2, -0.35F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 90, 30, 1.95F, 4.53F, -9.004F, 2, 3, 2, -0.35F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 90, 30, 1.95F, 4.53F, -5.254F, 2, 3, 2, -0.35F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 90, 30, -4.3F, 4.53F, -5.254F, 2, 3, 2, -0.35F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 78, 22, -0.225F, 0.755F, -8.554F, 1, 1, 1, -0.225F, false));


        bipedLeftLegWhip = new ModelRenderer(this);
        bipedLeftLegWhip.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegWhip);
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, -0.25F, -2.0F, 1, 1, 4, -0.1F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, 3.25F, -2.0F, 1, 1, 4, -0.1F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 76, 37, 1.5F, 2.75F, -2.0F, 1, 1, 4, -0.25F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 78, 18, 1.5F, 2.3F, -1.625F, 1, 1, 2, -0.3F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 104, 6, 1.625F, 2.3F, -0.375F, 1, 1, 1, -0.225F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 76, 37, 1.5F, 0.75F, -2.0F, 1, 3, 1, -0.25F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 76, 37, 1.5F, 0.75F, 1.0F, 1, 3, 1, -0.25F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 76, 37, 1.5F, 0.5F, -2.0F, 1, 1, 4, -0.25F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, 0.25F, -2.0F, 1, 1, 4, -0.25F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, 0.5F, -2.5F, 1, 3, 1, -0.1F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, 0.5F, 1.5F, 1, 3, 1, -0.1F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 75, 18, 1.75F, 3.25F, 1.25F, 1, 3, 1, -0.125F, false));
        bipedLeftLegWhip.cubeList.add(new ModelBox(bipedLeftLegWhip, 106, 8, 1.75F, 4.75F, 1.25F, 1, 3, 1, -0.175F, false));

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