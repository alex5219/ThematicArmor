package com.alexjw.thematicarmor.client.model.games;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMario extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedHeadM1;
    private final ModelRenderer bipedHeadM3;
    private final ModelRenderer bipedHeadM4;
    private final ModelRenderer bipedHeadM2;
    private final ModelRenderer bipedBodyDetail;

    public ModelMario() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 21, -1.5F, -27.0F, -4.75F, 3, 2, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 32, -3.5F, -29.75F, -5.25F, 7, 1, 2, 0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 37, -3.5F, -32.25F, -4.0F, 7, 2, 8, 0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 73, 43, -3.0F, -29.975F, 0.0F, 6, 2, 4, 0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 36, -4.0F, -32.0F, -4.0F, 8, 3, 8, 0.125F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 32, -2.5F, -29.75F, -6.25F, 5, 1, 1, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 36, 61, -1.5F, -31.75F, -4.25F, 3, 2, 1, 0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 21, 3.75F, -28.25F, -1.25F, 1, 2, 2, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 73, 4, 3.5F, -29.25F, -1.0F, 1, 3, 3, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 73, 4, -4.5F, -29.25F, -1.0F, 1, 3, 3, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 68, 21, -4.75F, -28.25F, -1.25F, 1, 2, 2, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 76, 10, -2.5F, -26.25F, -4.5F, 5, 2, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 103, 11, -1.0F, -24.85F, -4.5F, 2, 1, 1, -0.3F, false));

        bipedHeadM2 = new ModelRenderer(this);
        bipedHeadM2.setRotationPoint(1.525F, -25.0F, -4.5F);
        bipedHeadDetail.addChild(bipedHeadM2);
        setRotationAngle(bipedHeadM2, 0.0F, 0.0F, -0.1963F);
        bipedHeadM2.cubeList.add(new ModelBox(bipedHeadM2, 72, 33, -0.1913F, -6.8135F, -0.5F, 1, 2, 1, -0.3F, false));

        bipedHeadM3 = new ModelRenderer(this);
        bipedHeadM3.setRotationPoint(1.525F, -25.25F, -4.5F);
        bipedHeadDetail.addChild(bipedHeadM3);
        setRotationAngle(bipedHeadM3, 0.0F, 0.0F, -0.4189F);
        bipedHeadM3.cubeList.add(new ModelBox(bipedHeadM3, 71, 33, 0.2387F, -6.9174F, -0.5F, 1, 2, 1, -0.3F, false));

        bipedHeadM4 = new ModelRenderer(this);
        bipedHeadM4.setRotationPoint(-2.625F, -25.625F, -4.5F);
        bipedHeadDetail.addChild(bipedHeadM4);
        setRotationAngle(bipedHeadM4, 0.0F, 0.0F, 0.3578F);
        bipedHeadM4.cubeList.add(new ModelBox(bipedHeadM4, 71, 34, 0.3528F, -7.0035F, -0.5F, 1, 2, 1, -0.3F, false));

        bipedHeadM1 = new ModelRenderer(this);
        bipedHeadM1.setRotationPoint(-2.125F, -25.175F, -4.5F);
        bipedHeadDetail.addChild(bipedHeadM1);
        setRotationAngle(bipedHeadM1, 0.0F, 0.0F, 0.1484F);
        bipedHeadM1.cubeList.add(new ModelBox(bipedHeadM1, 71, 34, 0.1987F, -6.7726F, -0.5F, 1, 2, 1, -0.3F, false));


        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyDetail);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 98, 21, -3.75F, -20.0F, -2.5F, 2, 2, 1, 0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 98, 21, 1.8F, -20.0F, -2.5F, 2, 2, 1, 0.025F, false));

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