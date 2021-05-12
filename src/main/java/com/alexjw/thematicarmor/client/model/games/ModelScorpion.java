package com.alexjw.thematicarmor.client.model.games;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScorpion extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodySword;
    private final ModelRenderer bipedBodySword3;
    private final ModelRenderer bipedBodySword2;
    private final ModelRenderer bipedBodyTunic;
    private final ModelRenderer bipedRightArmDetail;
    private final ModelRenderer bipedLeftArmDetail;

    public ModelScorpion() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 32, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 17, 11, -1.0F, -30.0F, -4.35F, 2, 2, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -3.75F, -28.5F, -4.65F, 1, 5, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, 2.775F, -28.5F, -4.65F, 1, 5, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -2.725F, -29.65F, -4.65F, 1, 2, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, 1.725F, -29.65F, -4.65F, 1, 2, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -1.2F, -29.65F, -4.65F, 1, 2, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, 0.175F, -29.65F, -4.65F, 1, 2, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -3.825F, -28.625F, -4.65F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, 1.8F, -28.625F, -4.65F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -2.475F, -29.675F, -4.65F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, 0.475F, -29.675F, -4.65F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -1.025F, -28.5F, -4.65F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 99, 3, -0.525F, -28.25F, -4.65F, 1, 1, 1, -0.25F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 19, 10, -0.525F, -29.625F, -4.8F, 1, 2, 1, -0.25F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 94, 10, -2.0F, -26.95F, -4.65F, 4, 3, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 94, 10, -1.475F, -26.125F, -4.65F, 3, 3, 2, -0.375F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 92, 5, -1.0F, -26.95F, -5.0F, 2, 3, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 21, 56, 0.875F, -28.15F, -4.3F, 2, 0, 1, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 21, 56, -2.875F, -28.275F, -4.3F, 2, 0, 1, -0.175F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 80, 6, -2.0F, -27.95F, -4.425F, 1, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 80, 6, 1.0F, -27.95F, -4.425F, 1, 1, 1, -0.15F, false));


        bipedBodySword = new ModelRenderer(this);
        bipedBodySword.setRotationPoint(7.425F, 14.925F, -3.85F);
        bipedBody.addChild(bipedBodySword);
        setRotationAngle(bipedBodySword, 0.0F, 0.0F, -0.6196F);
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 80, 35, -2.4072F, -19.5054F, 5.3F, 2, 14, 2, -0.325F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 18, 9, -2.4172F, -23.3857F, 5.3F, 2, 5, 2, -0.625F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 95, 2, -2.3942F, -23.8914F, 5.3F, 2, 2, 2, -0.525F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 95, 2, -2.7112F, -24.1789F, 5.3F, 2, 2, 2, -0.6F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 95, 2, -2.9179F, -24.6641F, 5.3F, 2, 2, 2, -0.7F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 17, 59, -3.4405F, -20.119F, 5.3F, 4, 2, 3, -0.75F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 18, 60, -2.4086F, -20.2498F, 5.375F, 2, 2, 2, -0.5F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 1, 28, -3.4405F, -20.119F, 4.825F, 4, 2, 2, -0.75F, false));

        bipedBodySword3 = new ModelRenderer(this);
        bipedBodySword3.setRotationPoint(-5.625F, 16.725F, -3.85F);
        bipedBody.addChild(bipedBodySword3);
        setRotationAngle(bipedBodySword3, 0.0F, 0.0F, 0.6283F);
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 75, 34, -2.4972F, -19.2932F, 5.3F, 2, 14, 2, -0.325F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 18, 9, -2.4172F, -23.3857F, 5.3F, 2, 5, 2, -0.625F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 95, 2, -2.3942F, -23.8914F, 5.3F, 2, 2, 2, -0.525F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 95, 2, -2.088F, -24.3845F, 5.3F, 2, 2, 2, -0.6F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 95, 2, -1.8995F, -24.8787F, 5.3F, 2, 2, 2, -0.7F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 17, 59, -3.4405F, -20.119F, 5.3F, 4, 2, 3, -0.75F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 18, 60, -2.4086F, -20.2498F, 5.375F, 2, 2, 2, -0.5F, false));
        bipedBodySword3.cubeList.add(new ModelBox(bipedBodySword3, 1, 28, -3.4405F, -20.119F, 4.825F, 4, 2, 2, -0.75F, false));

        bipedBodySword2 = new ModelRenderer(this);
        bipedBodySword2.setRotationPoint(7.15F, 15.45F, -3.85F);
        bipedBody.addChild(bipedBodySword2);
        setRotationAngle(bipedBodySword2, 0.0F, 0.0F, -0.6196F);
        bipedBodySword2.cubeList.add(new ModelBox(bipedBodySword2, 79, 14, -0.6778F, -19.5379F, 1.325F, 1, 14, 5, 0.2F, false));
        bipedBodySword2.cubeList.add(new ModelBox(bipedBodySword2, 56, 53, -1.1394F, -13.2148F, 0.55F, 2, 2, 1, -0.425F, false));
        bipedBodySword2.cubeList.add(new ModelBox(bipedBodySword2, 70, 26, -1.1249F, -13.2351F, 0.425F, 2, 2, 1, -0.625F, false));

        bipedBodyTunic = new ModelRenderer(this);
        bipedBodyTunic.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyTunic);
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -1.0F, -12.5F, -2.825F, 2, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -1.0F, -18.75F, -2.45F, 2, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -2.0F, -18.75F, 1.425F, 4, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 100, 9, -2.0F, -12.175F, 1.425F, 4, 4, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -3.25F, -21.25F, 1.3F, 3, 5, 1, -0.05F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -1.525F, -12.45F, 2.05F, 3, 5, 1, -0.15F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, 0.325F, -21.25F, 1.25F, 3, 5, 1, -0.05F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -4.0F, -24.0F, 1.3F, 3, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, 1.0F, -24.0F, 1.3F, 3, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 92, 0, -0.525F, -24.325F, -2.575F, 1, 10, 2, -0.4F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 56, 53, -1.0F, -14.175F, -2.975F, 2, 2, 1, -0.325F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 76, 20, -1.0F, -14.175F, -3.15F, 2, 2, 1, -0.625F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, 0.925F, -23.475F, -2.45F, 2, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, 0.6F, -20.325F, -2.45F, 2, 5, 1, -0.125F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -2.625F, -20.325F, -2.45F, 2, 5, 1, -0.125F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, 2.3F, -24.1F, -2.45F, 2, 5, 1, -0.05F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -4.3F, -24.1F, -2.45F, 2, 5, 1, -0.05F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 102, 5, -3.0F, -23.475F, -2.45F, 2, 5, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 64, 22, -4.0F, -13.475F, -2.1F, 8, 1, 4, 0.375F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 98, 15, -1.5F, -12.5F, -2.45F, 3, 4, 1, 0.0F, false));
        bipedBodyTunic.cubeList.add(new ModelBox(bipedBodyTunic, 0, 0, -1.0F, -14.0F, -3.0F, 1, 1, 1, 0.0F, false));


        bipedRightArmDetail = new ModelRenderer(this);
        bipedRightArmDetail.setRotationPoint(-7.325F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetail);
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 94, 4, 4.025F, -23.575F, -2.05F, 4, 0, 4, 0.55F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 94, 5, 4.2F, -22.775F, -2.05F, 4, 1, 4, 0.275F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 94, 5, 4.375F, -17.25F, -2.05F, 1, 3, 4, 0.275F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 73, 20, 4.75F, -15.35F, -2.55F, 4, 1, 5, -0.075F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 94, 5, 4.2F, -17.875F, -1.05F, 1, 4, 2, 0.275F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 73, 20, 4.75F, -17.2F, -2.55F, 4, 1, 5, -0.075F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 94, 5, 5.975F, -21.325F, -2.05F, 2, 0, 4, 0.4F, false));


        bipedLeftArmDetail = new ModelRenderer(this);
        bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetail);
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 4, 4.425F, -23.575F, -2.05F, 4, 0, 4, 0.55F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 5, 4.3F, -22.775F, -2.05F, 4, 1, 4, 0.275F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 5, 4.4F, -21.325F, -2.05F, 2, 0, 4, 0.4F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 5, 7.05F, -17.25F, -2.05F, 1, 3, 4, 0.25F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 73, 20, 3.675F, -17.2F, -2.55F, 4, 1, 5, -0.075F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 73, 20, 3.675F, -15.35F, -2.55F, 4, 1, 5, -0.075F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 5, 7.175F, -17.875F, -1.05F, 1, 4, 2, 0.275F, false));

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