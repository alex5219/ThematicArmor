package com.alexjw.thematicarmor.client.model.walkingdead;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNegan extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedHeadDetail2;
    private final ModelRenderer bipedHeadDetail3;
    private final ModelRenderer bipedBodyBarbs;
    private final ModelRenderer bipedBodyLuicille;
    private final ModelRenderer bipedBodyLuicille4;
    private final ModelRenderer bipedBodyLuicille3;
    private final ModelRenderer bipedBodyLuicille2;
    private final ModelRenderer bipedBodyBelt;
    private final ModelRenderer bipedBodyDetail;
    private final ModelRenderer bipedBodyJacket;
    private final ModelRenderer bipedBodyJacket2;
    private final ModelRenderer bipedRightArmBandage1;
    private final ModelRenderer bipedRightArmBandage3;
    private final ModelRenderer bipedRightArmBandage2;
    private final ModelRenderer bipedRightArmDetail;

    public ModelNegan() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;


        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(5.025F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        setRotationAngle(bipedHeadDetail, 0.0F, 0.0F, -0.1789F);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 10, 0.6F, -29.075F, -4.5F, 3, 1, 1, -0.175F, false));

        bipedHeadDetail2 = new ModelRenderer(this);
        bipedHeadDetail2.setRotationPoint(-8.5F, 23.4F, 0.0F);
        bipedHead.addChild(bipedHeadDetail2);
        setRotationAngle(bipedHeadDetail2, 0.0F, 0.0F, 0.1614F);
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 22, 10, 0.6F, -29.075F, -4.5F, 3, 1, 1, -0.175F, false));

        bipedHeadDetail3 = new ModelRenderer(this);
        bipedHeadDetail3.setRotationPoint(3.175F, 26.025F, 0.0F);
        bipedHead.addChild(bipedHeadDetail3);
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 75, 7, -4.875F, -28.35F, -4.475F, 3, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 104, 5, -5.225F, -27.25F, -4.7F, 4, 2, 2, -0.5F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 68, 32, -5.225F, -33.325F, -4.8F, 4, 2, 2, -0.475F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 68, 32, -4.225F, -33.025F, -4.825F, 2, 2, 2, -0.525F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 67, 23, -6.3F, -33.95F, -4.725F, 6, 2, 2, -0.55F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 64, 14, -7.225F, -34.6F, -3.525F, 8, 2, 8, -0.325F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 67, 15, -6.225F, -34.475F, -2.275F, 6, 2, 6, -0.025F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 75, 7, -3.375F, -28.35F, -4.475F, 2, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 39, 23, -4.625F, -27.95F, -4.425F, 3, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 39, 23, -2.425F, -28.1F, -4.4F, 1, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 39, 23, -4.825F, -28.1F, -4.425F, 1, 1, 1, -0.3F, false));



        bipedBodyBarbs = new ModelRenderer(this);
        bipedBodyBarbs.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyBarbs);
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -2.2F, -17.35F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -2.2F, -20.725F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -2.375F, -18.475F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.275F, -18.975F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -2.2F, -19.25F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -0.4F, -17.875F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -0.55F, -16.95F, 3.2F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.55F, -16.15F, 3.075F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.05F, -15.075F, 3.05F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, 1.4F, -13.25F, 3.075F, 1, 2, 1, -1.05F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, 0.4F, -14.925F, 3.075F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, 0.575F, -16.15F, 3.075F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.4F, -15.275F, 3.075F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.4F, -17.625F, 3.225F, 1, 2, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -4.475F, -20.1F, 3.225F, 2, 1, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -3.875F, -18.775F, 2.95F, 2, 1, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -2.425F, -16.025F, 3.15F, 2, 1, 1, -0.925F, false));
        bipedBodyBarbs.cubeList.add(new ModelBox(bipedBodyBarbs, 120, 67, -1.15F, -13.75F, 3.15F, 2, 1, 1, -0.925F, false));

        bipedBodyLuicille = new ModelRenderer(this);
        bipedBodyLuicille.setRotationPoint(-0.225F, 10.5F, 0.375F);
        bipedBody.addChild(bipedBodyLuicille);
        setRotationAngle(bipedBodyLuicille, 0.0F, 0.0F, 0.2749F);
        bipedBodyLuicille.cubeList.add(new ModelBox(bipedBodyLuicille, 106, 58, -1.045F, -3.8834F, 1.0F, 1, 4, 3, -0.375F, false));
        bipedBodyLuicille.cubeList.add(new ModelBox(bipedBodyLuicille, 114, 62, -3.6732F, -6.5709F, 1.0F, 1, 4, 3, -0.375F, false));
        bipedBodyLuicille.cubeList.add(new ModelBox(bipedBodyLuicille, 107, 57, -2.7941F, -5.572F, 1.0F, 1, 4, 3, -0.375F, false));

        bipedBodyLuicille4 = new ModelRenderer(this);
        bipedBodyLuicille4.setRotationPoint(2.475F, 10.125F, 0.375F);
        bipedBody.addChild(bipedBodyLuicille4);
        setRotationAngle(bipedBodyLuicille4, 0.0F, 0.0F, -1.2872F);
        bipedBodyLuicille4.cubeList.add(new ModelBox(bipedBodyLuicille4, 106, 58, -1.045F, -3.8834F, 1.0F, 1, 4, 3, -0.4F, false));
        bipedBodyLuicille4.cubeList.add(new ModelBox(bipedBodyLuicille4, 114, 62, 1.8248F, -6.5589F, 0.25F, 1, 4, 4, -0.625F, false));
        bipedBodyLuicille4.cubeList.add(new ModelBox(bipedBodyLuicille4, 107, 57, 3.2753F, -7.888F, 1.0F, 1, 3, 3, -0.35F, false));

        bipedBodyLuicille3 = new ModelRenderer(this);
        bipedBodyLuicille3.setRotationPoint(2.525F, 11.575F, 0.375F);
        bipedBody.addChild(bipedBodyLuicille3);
        setRotationAngle(bipedBodyLuicille3, 0.0F, 0.0F, -0.9643F);
        bipedBodyLuicille3.cubeList.add(new ModelBox(bipedBodyLuicille3, 101, 62, -1.045F, -3.8834F, 1.0F, 1, 4, 3, -0.375F, false));
        bipedBodyLuicille3.cubeList.add(new ModelBox(bipedBodyLuicille3, 108, 61, 1.0474F, -6.3505F, 1.0F, 1, 4, 3, -0.375F, false));

        bipedBodyLuicille2 = new ModelRenderer(this);
        bipedBodyLuicille2.setRotationPoint(6.75F, 21.2F, -1.55F);
        bipedBody.addChild(bipedBodyLuicille2);
        setRotationAngle(bipedBodyLuicille2, 0.0F, 0.0F, -0.48F);
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 18, 84, -0.8739F, -26.9143F, 3.75F, 1, 5, 1, 0.0F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 115, 47, -1.4003F, -26.4705F, 3.2F, 2, 3, 2, -0.35F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 22, 104, -1.383F, -27.5325F, 3.125F, 2, 1, 2, -0.15F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 15, 96, -0.9113F, -23.2038F, 3.75F, 1, 4, 1, 0.225F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 117, 60, -1.3749F, -18.205F, 3.1F, 2, 0, 2, 0.15F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 118, 66, -1.3974F, -17.5121F, 3.25F, 2, 0, 2, 0.075F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 106, 60, -1.4408F, -15.5336F, 2.225F, 2, 0, 3, 0.175F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 106, 60, -1.4384F, -14.9969F, 2.5F, 2, 0, 3, 0.1F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 106, 60, -1.4138F, -12.3911F, 2.5F, 2, 0, 3, 0.1F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 115, 60, -1.412F, -14.5604F, 2.3F, 2, 0, 3, 0.125F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 115, 60, -1.4154F, -12.9838F, 2.3F, 2, 0, 3, 0.125F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 103, 67, -1.3929F, -13.6767F, 2.15F, 2, 0, 3, 0.25F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 103, 61, -1.4624F, -16.9541F, 3.1F, 2, 0, 2, 0.125F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 15, 100, -0.9037F, -20.2405F, 3.75F, 1, 4, 1, 0.375F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 8, 108, -0.9345F, -14.9297F, 3.75F, 1, 4, 1, 0.325F, false));
        bipedBodyLuicille2.cubeList.add(new ModelBox(bipedBodyLuicille2, 11, 102, -0.9111F, -15.6785F, 3.75F, 1, 4, 1, 0.55F, false));

        bipedBodyBelt = new ModelRenderer(this);
        bipedBodyBelt.setRotationPoint(-3.325F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyBelt);
        setRotationAngle(bipedBodyBelt, 0.0F, 0.0F, 0.24F);
        bipedBodyBelt.cubeList.add(new ModelBox(bipedBodyBelt, 58, 68, -4.4475F, -13.6943F, -2.55F, 10, 2, 5, -0.25F, false));
        bipedBodyBelt.cubeList.add(new ModelBox(bipedBodyBelt, 112, 42, -0.3342F, -13.6955F, -2.1F, 2, 2, 0, -0.5F, false));

        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyDetail);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 107, 28, -0.375F, -17.0F, -2.25F, 1, 4, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 110, 37, -0.125F, -17.575F, -2.725F, 1, 5, 1, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 120, 63, -2.25F, -14.025F, -2.975F, 1, 2, 1, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 120, 63, -2.5F, -13.925F, -2.975F, 2, 1, 1, -0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 120, 63, -4.5F, -14.175F, -2.975F, 2, 1, 1, -0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 120, 63, -4.25F, -14.275F, -2.975F, 1, 2, 1, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 66, 54, -5.45F, -14.35F, -4.175F, 4, 4, 4, -1.15F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 66, 54, -3.475F, -14.025F, -4.175F, 4, 4, 4, -1.15F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 93, 61, 0.85F, -14.0F, -3.85F, 4, 6, 4, -1.3F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 105, 36, 0.325F, -14.25F, -3.975F, 5, 3, 4, -1.375F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 93, 61, 1.075F, -13.175F, -3.925F, 4, 6, 4, -1.55F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 70, 66, 0.825F, -16.9F, -4.1F, 4, 6, 4, -1.65F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 106, 35, 1.225F, -14.95F, -3.975F, 3, 3, 3, -1.6F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 106, 35, 1.225F, -15.7F, -3.975F, 3, 3, 3, -1.6F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 65, 52, -3.475F, -14.525F, -4.175F, 4, 5, 4, -1.375F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 66, 54, -5.475F, -14.825F, -4.175F, 4, 5, 4, -1.375F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 90, 64, 4.275F, -13.075F, -0.9F, 1, 4, 2, 0.15F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 90, 62, 3.9F, -11.525F, -1.05F, 1, 4, 2, 0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 78, 4, -0.875F, -21.625F, -2.925F, 2, 5, 1, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 105, 27, -1.7F, -18.1F, -3.0F, 3, 2, 1, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 72, 7, -1.375F, -23.625F, -3.025F, 3, 3, 1, -0.425F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 100, 3, -1.375F, -24.625F, -3.05F, 3, 2, 4, -0.475F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 108, 38, 1.775F, -20.95F, -2.8F, 1, 1, 1, -0.2F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 108, 38, 1.7F, -23.05F, -2.825F, 1, 1, 1, -0.2F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 108, 38, -2.575F, -23.05F, -2.825F, 1, 1, 1, -0.2F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 108, 38, -2.625F, -21.05F, -2.8F, 1, 1, 1, -0.2F, false));

        bipedBodyJacket = new ModelRenderer(this);
        bipedBodyJacket.setRotationPoint(-4.075F, 23.15F, 0.0F);
        bipedBody.addChild(bipedBodyJacket);
        setRotationAngle(bipedBodyJacket, 0.0F, 0.0F, 0.2051F);
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 104, 24, 0.1573F, -24.1787F, -2.3F, 2, 5, 4, 0.0F, false));
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 108, 26, 0.8264F, -21.3303F, -2.5F, 2, 5, 1, -0.125F, false));
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 110, 37, 2.031F, -14.9763F, -2.5F, 3, 1, 1, -0.275F, false));
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 108, 26, 0.4313F, -23.0401F, -2.95F, 1, 7, 1, -0.125F, false));

        bipedBodyJacket2 = new ModelRenderer(this);
        bipedBodyJacket2.setRotationPoint(0.175F, 23.8F, 0.0F);
        bipedBody.addChild(bipedBodyJacket2);
        setRotationAngle(bipedBodyJacket2, 0.0F, 0.0F, -0.2138F);
        bipedBodyJacket2.cubeList.add(new ModelBox(bipedBodyJacket2, 104, 24, 2.0526F, -24.0591F, -2.425F, 2, 5, 4, 0.0F, false));
        bipedBodyJacket2.cubeList.add(new ModelBox(bipedBodyJacket2, 104, 25, 1.3464F, -21.1812F, -2.5F, 2, 5, 4, -0.125F, false));
        bipedBodyJacket2.cubeList.add(new ModelBox(bipedBodyJacket2, 106, 37, -0.9387F, -14.898F, -2.5F, 3, 1, 4, -0.275F, false));


        bipedRightArmBandage1 = new ModelRenderer(this);
        bipedRightArmBandage1.setRotationPoint(16.775F, 14.875F, -2.925F);
        bipedRightArm.addChild(bipedRightArmBandage1);
        setRotationAngle(bipedRightArmBandage1, 0.0F, 0.0F, -0.2836F);
        bipedRightArmBandage1.cubeList.add(new ModelBox(bipedRightArmBandage1, 97, 43, -18.0808F, -12.733F, 0.0F, 6, 2, 6, -0.7F, false));
        bipedRightArmBandage1.cubeList.add(new ModelBox(bipedRightArmBandage1, 98, 46, -17.825F, -13.7F, 0.0F, 6, 2, 6, -0.7F, false));

        bipedRightArmBandage3 = new ModelRenderer(this);
        bipedRightArmBandage3.setRotationPoint(11.25F, 23.55F, -2.925F);
        bipedRightArm.addChild(bipedRightArmBandage3);
        setRotationAngle(bipedRightArmBandage3, 0.0F, 0.0F, 0.1876F);
        bipedRightArmBandage3.cubeList.add(new ModelBox(bipedRightArmBandage3, 97, 43, -17.8352F, -12.7796F, 0.0F, 6, 2, 6, -0.65F, false));
        bipedRightArmBandage3.cubeList.add(new ModelBox(bipedRightArmBandage3, 98, 46, -17.9882F, -14.5596F, 0.0F, 6, 2, 6, -0.725F, false));

        bipedRightArmBandage2 = new ModelRenderer(this);
        bipedRightArmBandage2.setRotationPoint(0.575F, 7.925F, -2.925F);
        bipedRightArm.addChild(bipedRightArmBandage2);
        setRotationAngle(bipedRightArmBandage2, 0.0F, 0.0F, 0.6152F);
        bipedRightArmBandage2.cubeList.add(new ModelBox(bipedRightArmBandage2, 107, 48, -3.091F, 2.2862F, 0.225F, 4, 0, 1, -0.7F, false));
        bipedRightArmBandage2.cubeList.add(new ModelBox(bipedRightArmBandage2, 111, 49, -2.7549F, -1.7216F, 0.5F, 2, 5, 1, -0.725F, false));
        bipedRightArmBandage2.cubeList.add(new ModelBox(bipedRightArmBandage2, 101, 46, -3.6767F, 1.9628F, -0.05F, 5, 0, 6, -0.775F, false));
        bipedRightArmBandage2.cubeList.add(new ModelBox(bipedRightArmBandage2, 101, 46, -3.349F, 2.7441F, -0.05F, 4, 0, 6, -0.775F, false));
        bipedRightArmBandage2.cubeList.add(new ModelBox(bipedRightArmBandage2, 101, 46, -3.9653F, 1.5545F, 0.0F, 3, 0, 6, -0.8F, false));

        bipedRightArmDetail = new ModelRenderer(this);
        bipedRightArmDetail.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetail);
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 72, 42, -8.55F, -17.525F, -2.525F, 5, 2, 5, -0.275F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 108, 46, -8.65F, -15.225F, 0.475F, 1, 4, 2, -0.45F, false));
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 104, 46, -8.425F, -14.725F, -0.2F, 1, 4, 2, -0.625F, false));

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