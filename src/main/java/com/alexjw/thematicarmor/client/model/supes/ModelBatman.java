package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBatman extends ModelBiped {
    private final ModelRenderer bipedHeadCowl;
    private final ModelRenderer bipedBodyArmor;
    private final ModelRenderer bipedRightArmDetail;
    private final ModelRenderer bipedLeftArmDetail;

    public ModelBatman() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHeadCowl = new ModelRenderer(this);
        bipedHeadCowl.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadCowl);
        bipedHeadCowl.cubeList.add(new ModelBox(bipedHeadCowl, 20, 1, -3.0F, -34.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bipedHeadCowl.cubeList.add(new ModelBox(bipedHeadCowl, 18, 2, 2.0F, -34.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bipedHeadCowl.cubeList.add(new ModelBox(bipedHeadCowl, 8, 1, -1.0F, -26.75F, -4.25F, 2, 1, 1, 0.0F, false));

        bipedBodyArmor = new ModelRenderer(this);
        bipedBodyArmor.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyArmor);
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 82, 17, -5.0F, -24.0F, 1.5F, 10, 18, 1, 0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, 4.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, 0.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, 2.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, -5.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, -3.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 12, -1.0F, -6.25F, 1.5F, 1, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 64, 3, -1.0F, -21.75F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 62, 0, 0.0F, -21.75F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 27, 25, 0.25F, -17.0F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 27, 25, 0.25F, -15.75F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, 2.0F, -14.0F, -2.325F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, 1.0F, -14.0F, 1.425F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, 3.0F, -14.0F, 1.425F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, -2.0F, -14.0F, 1.425F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, -4.0F, -14.0F, 1.425F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, 1.0F, -14.0F, -2.325F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, -2.0F, -14.0F, -2.325F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, -3.0F, -14.0F, 1.425F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, -1.0F, -14.0F, 1.425F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, 0.0F, -14.0F, 1.425F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, 2.0F, -14.0F, 1.425F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, 3.0F, -14.0F, -2.325F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 71, 28, -4.0F, -14.0F, -2.325F, 1, 2, 1, -0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 69, 28, -0.5F, -13.5F, -2.075F, 1, 1, 1, 0.2F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 65, 28, -3.0F, -14.0F, -2.325F, 1, 2, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 27, 25, 0.25F, -18.25F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 29, 24, -2.25F, -17.0F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 29, 24, -2.25F, -15.75F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 29, 24, -2.25F, -18.25F, -2.325F, 2, 1, 1, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 62, 0, 0.75F, -20.5F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 62, 0, -1.75F, -20.5F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 32, 24, 0.75F, -22.25F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 32, 24, 2.25F, -20.75F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 32, 24, -3.25F, -20.75F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 34, 24, 3.25F, -22.25F, -2.325F, 1, 2, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 34, 24, -4.25F, -22.25F, -2.325F, 1, 2, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 32, 24, -1.75F, -22.25F, -2.325F, 1, 1, 1, -0.175F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 64, 3, -0.5F, -20.25F, -2.325F, 1, 2, 1, -0.175F, false));

        bipedRightArmDetail = new ModelRenderer(this);
        bipedRightArmDetail.setRotationPoint(-11.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetail);
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 17, 1, 7.5F, -16.75F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 20, 3, 7.5F, -15.25F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 20, 3, 7.5F, -13.75F, 0.0F, 1, 1, 1, 0.0F, false));

        bipedLeftArmDetail = new ModelRenderer(this);
        bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetail);
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 17, 1, 7.5F, -16.75F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 20, 3, 7.5F, -15.25F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 20, 3, 7.5F, -13.75F, 0.0F, 1, 1, 1, 0.0F, false));
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