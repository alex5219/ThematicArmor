package com.alexjw.thematicarmor.client.model.games;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWoods extends ModelBiped {
    private final ModelRenderer bipedHeadBandana;
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodyFrag;
    private final ModelRenderer bipedBodyFrag2;
    private final ModelRenderer bipedBodyKnife;
    private final ModelRenderer bipedBodyVest;
    private final ModelRenderer bipedLeftArmDetail;
    private final ModelRenderer bipedRightLegPants;
    private final ModelRenderer bipedRightLegHolster;
    private final ModelRenderer bipedRightLegHolster2;
    private final ModelRenderer bipedLeftLegPants;

    public ModelWoods() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftLeg.mirror = false;
        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 16, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftLeg.mirror = false;



        bipedHeadBandana = new ModelRenderer(this);
        bipedHeadBandana.setRotationPoint(1.25F, -3.2F, 2.25F);
        bipedHead.addChild(bipedHeadBandana);
        setRotationAngle(bipedHeadBandana, 0.0F, 0.0F, 0.3185F);
        bipedHeadBandana.cubeList.add(new ModelBox(bipedHeadBandana, 70, 9, -4.0F, -1.0F, 0.0F, 0, 1, 2, 0.425F, false));

        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 10, -4.0F, -6.5F, -4.0F, 8, 1, 8, 0.325F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 70, 9, -1.375F, -5.25F, 2.25F, 0, 1, 2, 0.5F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 26, 12, 2.0F, -7.5F, -4.75F, 1, 2, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 11, 0.75F, -7.75F, -4.75F, 1, 2, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 11, 0.65F, -4.75F, -4.45F, 3, 1, 1, -0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 33, 58, -1.0F, -2.025F, -4.45F, 2, 1, 1, -0.25F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 12, -1.6F, -0.575F, -4.375F, 3, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 12, -0.475F, -1.2F, -4.45F, 1, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 40, 57, -1.0F, -1.475F, -4.375F, 2, 1, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 39, 56, 1.5F, -3.225F, -4.375F, 1, 2, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 40, 57, -2.5F, -3.225F, -4.375F, 1, 2, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 12, -1.6F, -3.325F, -4.375F, 3, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 12, 0.4F, -2.825F, -4.25F, 1, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 12, -1.35F, -2.825F, -4.25F, 1, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 11, -3.6F, -4.75F, -4.45F, 3, 1, 1, -0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 11, -3.625F, -7.5F, -4.35F, 7, 1, 2, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 11, -3.625F, -8.35F, -3.85F, 7, 1, 2, -0.05F, false));


        bipedBodyFrag = new ModelRenderer(this);
        bipedBodyFrag.setRotationPoint(1.75F, 21.5F, 1.0F);
        bipedBody.addChild(bipedBodyFrag);
        setRotationAngle(bipedBodyFrag, 0.0F, 0.0F, -0.2094F);
        bipedBodyFrag.cubeList.add(new ModelBox(bipedBodyFrag, 112, 33, -1.0F, -19.25F, -4.0F, 1, 1, 1, 0.175F, false));
        bipedBodyFrag.cubeList.add(new ModelBox(bipedBodyFrag, 23, 11, -0.5292F, -19.6611F, -3.675F, 0, 1, 1, 0.25F, false));
        bipedBodyFrag.cubeList.add(new ModelBox(bipedBodyFrag, 23, 11, -1.2884F, -19.7121F, -3.675F, 1, 0, 1, 0.1F, false));
        bipedBodyFrag.cubeList.add(new ModelBox(bipedBodyFrag, 23, 11, -1.3497F, -19.5288F, -3.675F, 0, 0, 1, 0.15F, false));

        bipedBodyFrag2 = new ModelRenderer(this);
        bipedBodyFrag2.setRotationPoint(3.0F, 23.25F, 1.0F);
        bipedBody.addChild(bipedBodyFrag2);
        setRotationAngle(bipedBodyFrag2, 0.0F, 0.0F, -0.2094F);
        bipedBodyFrag2.cubeList.add(new ModelBox(bipedBodyFrag2, 112, 33, -1.0F, -19.25F, -4.0F, 1, 1, 1, 0.175F, false));
        bipedBodyFrag2.cubeList.add(new ModelBox(bipedBodyFrag2, 23, 11, -0.5292F, -19.6611F, -3.675F, 0, 1, 1, 0.25F, false));
        bipedBodyFrag2.cubeList.add(new ModelBox(bipedBodyFrag2, 23, 11, -1.2884F, -19.7121F, -3.675F, 1, 0, 1, 0.1F, false));
        bipedBodyFrag2.cubeList.add(new ModelBox(bipedBodyFrag2, 23, 11, -1.3497F, -19.5288F, -3.675F, 0, 0, 1, 0.15F, false));

        bipedBodyKnife = new ModelRenderer(this);
        bipedBodyKnife.setRotationPoint(-13.6F, 19.35F, 0.0F);
        bipedBody.addChild(bipedBodyKnife);
        setRotationAngle(bipedBodyKnife, 0.0F, 0.0F, 0.3054F);
        bipedBodyKnife.cubeList.add(new ModelBox(bipedBodyKnife, 99, 69, 10.5F, -22.5F, -3.0F, 1, 3, 1, -0.025F, false));
        bipedBodyKnife.cubeList.add(new ModelBox(bipedBodyKnife, 24, 11, 10.549F, -22.5941F, -3.0F, 1, 0, 1, 0.175F, false));
        bipedBodyKnife.cubeList.add(new ModelBox(bipedBodyKnife, 24, 11, 11.0334F, -23.7206F, -2.775F, 0, 1, 1, 0.225F, false));
        bipedBodyKnife.cubeList.add(new ModelBox(bipedBodyKnife, 99, 69, 10.4119F, -21.948F, -3.0F, 1, 3, 1, -0.125F, false));
        bipedBodyKnife.cubeList.add(new ModelBox(bipedBodyKnife, 99, 69, 10.2487F, -21.6344F, -3.0F, 1, 3, 1, -0.2F, false));

        bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 68, 27, 1.75F, -24.5F, -2.5F, 2, 6, 5, -0.05F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 27, -3.75F, -24.5F, -2.5F, 2, 6, 5, -0.05F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 28, -4.25F, -21.25F, -2.5F, 4, 8, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 28, -2.0F, -21.25F, 0.75F, 4, 8, 2, 0.05F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 50, -2.0F, -22.0F, 2.25F, 4, 6, 2, 0.175F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 53, -2.0F, -19.0F, 3.025F, 4, 3, 2, -0.175F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 57, -2.0F, -18.25F, 3.275F, 4, 1, 2, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 57, 0.75F, -21.25F, 2.775F, 1, 1, 2, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 57, -1.75F, -21.25F, 2.775F, 1, 1, 2, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 26, -1.75F, -21.75F, 2.775F, 1, 2, 2, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 26, 0.75F, -21.75F, 2.775F, 1, 2, 2, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 89, 51, -3.0F, -20.25F, 1.5F, 6, 4, 2, 0.175F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 64, -3.5F, -23.0F, 2.25F, 7, 2, 2, -0.15F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 28, 0.25F, -21.25F, -2.5F, 4, 8, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -0.575F, -21.5F, -2.8F, 1, 9, 3, -0.05F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 1.425F, -24.25F, -2.7F, 1, 3, 4, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 3.675F, -24.25F, -2.5F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 2.675F, -22.5F, -2.5F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 2.8F, -21.6F, -3.0F, 1, 0, 5, 0.15F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 3.575F, -20.0F, -2.5F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 23, 11, 3.875F, -21.925F, -2.95F, 1, 2, 1, 0.025F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 26, 14, 3.875F, -21.875F, -3.25F, 1, 1, 1, -0.15F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 38, 4.125F, -21.875F, -2.5F, 1, 1, 0, -0.15F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 23, 11, 4.15F, -23.175F, -3.125F, 1, 2, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 23, 11, 4.15F, -23.825F, -3.125F, 1, 2, 1, -0.35F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -4.475F, -19.9F, -2.5F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -3.825F, -22.5F, -2.5F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -4.575F, -24.25F, -2.55F, 1, 3, 5, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 1.175F, -24.25F, -3.2F, 1, 3, 4, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 0.425F, -22.25F, -3.075F, 1, 3, 4, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -1.075F, -21.75F, -2.85F, 2, 3, 4, -0.175F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -1.575F, -22.25F, -2.875F, 1, 3, 4, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -2.075F, -24.25F, -3.2F, 1, 3, 4, -0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -2.325F, -24.25F, -2.7F, 1, 3, 4, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, 1.425F, -14.75F, -2.45F, 2, 0, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 52, -3.075F, -14.75F, -0.2F, 6, 0, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 33, 1.175F, -17.1F, -2.725F, 1, 0, 3, 0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 33, -2.325F, -17.1F, -2.725F, 1, 0, 3, 0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 33, -4.325F, -17.1F, -2.725F, 1, 0, 3, 0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 33, 3.175F, -17.1F, -2.725F, 1, 0, 3, 0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 32, 1.175F, -17.75F, -2.7F, 1, 2, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 32, -2.325F, -17.75F, -2.7F, 1, 2, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 32, -4.325F, -17.75F, -2.7F, 1, 2, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 32, 3.175F, -17.75F, -2.7F, 1, 2, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 26, -3.575F, -13.0F, -2.3F, 7, 0, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 37, -3.475F, -13.0F, -0.8F, 7, 0, 3, 0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 27, -3.325F, -14.75F, -2.45F, 2, 0, 3, 0.325F, false));


        bipedLeftArmDetail = new ModelRenderer(this);
        bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetail);
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 86, 50, 4.0F, -20.25F, -2.0F, 4, 1, 4, 0.2F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 51, 7.375F, -21.5F, -1.0F, 1, 3, 2, -0.05F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 33, 7.7F, -21.5F, -1.0F, 1, 3, 2, -0.25F, false));


        bipedRightLegPants = new ModelRenderer(this);
        bipedRightLegPants.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegPants);
        bipedRightLegPants.cubeList.add(new ModelBox(bipedRightLegPants, 59, 63, -3.875F, -3.1F, -2.0F, 4, 1, 4, 0.2F, false));

        bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.15F, 11.25F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        setRotationAngle(bipedRightLegHolster, 0.0F, 0.0F, 0.0785F);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 84, 48, -4.425F, -9.75F, -2.6F, 5, 1, 5, -0.15F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 84, 48, -4.3502F, -8.0059F, -2.6F, 5, 1, 5, -0.15F, false));

        bipedRightLegHolster2 = new ModelRenderer(this);
        bipedRightLegHolster2.setRotationPoint(1.15F, 13.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster2);
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 95, 50, -3.7384F, -11.7058F, -1.0F, 1, 3, 2, 0.0F, false));
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 95, 50, -3.7384F, -12.2058F, -1.0F, 1, 1, 1, 0.05F, false));
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 95, 50, -3.9384F, -11.1808F, -0.75F, 1, 3, 1, 0.0F, false));


        bipedLeftLegPants = new ModelRenderer(this);
        bipedLeftLegPants.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegPants);
        bipedLeftLegPants.cubeList.add(new ModelBox(bipedLeftLegPants, 59, 63, -0.125F, -3.1F, -2.0F, 4, 1, 4, 0.2F, false));

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