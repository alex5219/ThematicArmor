package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeadpool extends ModelBiped {
    private final ModelRenderer bipedHeadMask;
    private final ModelRenderer bipedHeadMask3;
    private final ModelRenderer bipedHeadMask4;
    private final ModelRenderer bipedHeadMask2;
    private final ModelRenderer bipedbodyDetailing;
    private final ModelRenderer bipedbodyDetailing2;
    private final ModelRenderer bipedbodyDetailing3;
    private final ModelRenderer bipedBodyStrap;
    private final ModelRenderer bipedBodyStrap2;
    private final ModelRenderer bipedBodySwords;
    private final ModelRenderer bipedBodySwords2;
    private final ModelRenderer bipedBodySwords4;
    private final ModelRenderer bipedBodySwords3;
    private final ModelRenderer bipedRightArmDetailing;
    private final ModelRenderer bipedLeftArmDetailing;
    private final ModelRenderer bipedRightLegHolster;
    private final ModelRenderer bipedRightLegHolster2;
    private final ModelRenderer bipedRightLegDetailing;
    private final ModelRenderer bipedLeftLegDetailing3;
    private final ModelRenderer bipedLeftLegDetailing;

    public ModelDeadpool() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadMask = new ModelRenderer(this);
        bipedHeadMask.setRotationPoint(-3.5F, 0.75F, 0.0F);
        bipedHead.addChild(bipedHeadMask);
        setRotationAngle(bipedHeadMask, 0.0F, 0.0F, 0.7854F);
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 82, 11, 0.1491F, -7.5784F, -4.25F, 2, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 82, 11, -2.6568F, -4.7677F, -4.25F, 2, 2, 1, 0.0F, false));

        bipedHeadMask3 = new ModelRenderer(this);
        bipedHeadMask3.setRotationPoint(0.75F, -2.25F, 0.0F);
        bipedHead.addChild(bipedHeadMask3);
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 72, 35, -3.5198F, -1.7448F, -4.65F, 2, 1, 1, -0.175F, false));
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 72, 35, -0.0198F, -1.7448F, -4.65F, 2, 1, 1, -0.175F, false));
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 10, 3, -1.6948F, -6.1948F, 3.575F, 2, 1, 1, 0.0F, false));
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 9, 10, -2.6948F, -5.9448F, 3.35F, 4, 1, 1, -0.05F, false));
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 97, 17, -2.1448F, -3.4698F, -4.5F, 1, 3, 1, -0.2F, false));
        bipedHeadMask3.cubeList.add(new ModelBox(bipedHeadMask3, 96, 17, -0.3948F, -3.4698F, -4.5F, 1, 3, 1, -0.2F, false));

        bipedHeadMask4 = new ModelRenderer(this);
        bipedHeadMask4.setRotationPoint(-3.3F, -1.075F, 0.75F);
        bipedHead.addChild(bipedHeadMask4);
        setRotationAngle(bipedHeadMask4, 0.0F, 0.0F, 0.2356F);
        bipedHeadMask4.cubeList.add(new ModelBox(bipedHeadMask4, 94, 16, -0.6274F, -4.9168F, -5.0F, 2, 3, 1, 0.0F, false));

        bipedHeadMask2 = new ModelRenderer(this);
        bipedHeadMask2.setRotationPoint(1.725F, -7.725F, 0.75F);
        bipedHead.addChild(bipedHeadMask2);
        setRotationAngle(bipedHeadMask2, 0.0F, 0.0F, 2.9234F);
        bipedHeadMask2.cubeList.add(new ModelBox(bipedHeadMask2, 94, 16, -0.6164F, -4.9275F, -5.0F, 2, 3, 1, 0.0F, false));


        bipedbodyDetailing = new ModelRenderer(this);
        bipedbodyDetailing.setRotationPoint(-10.5F, 19.75F, 0.5F);
        bipedBody.addChild(bipedbodyDetailing);
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 72, 16, 6.3F, -10.45F, -3.125F, 2, 1, 5, -0.025F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 81, 39, 6.425F, -9.6F, -3.125F, 3, 1, 5, 0.2F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 120, 35, 9.925F, -9.65F, -3.375F, 1, 1, 1, 0.175F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 120, 35, 9.925F, -9.9F, -3.375F, 1, 0, 1, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 120, 35, 9.925F, -8.4F, -3.375F, 1, 0, 1, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 20, 10.225F, -9.65F, -3.625F, 0, 1, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 72, 19, 10.65F, -9.65F, -3.625F, 0, 1, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 72, 19, 10.85F, -9.65F, -3.625F, 0, 1, 1, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 38, 10.625F, -9.275F, -3.725F, 0, 0, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 38, 10.25F, -9.275F, -3.725F, 0, 0, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 38, 10.625F, -9.025F, -3.725F, 0, 0, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 38, 10.25F, -9.025F, -3.725F, 0, 0, 1, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 72, 19, 10.025F, -9.65F, -3.625F, 0, 1, 1, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 88, 40, 11.4F, -9.6F, -3.125F, 3, 1, 5, 0.2F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 78, 20, 9.15F, -9.6F, -3.125F, 3, 1, 5, 0.125F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 78, 20, 7.425F, -15.7F, 0.875F, 6, 2, 1, 0.175F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 20, 11.35F, -9.6F, -3.325F, 0, 0, 4, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 20, 11.35F, -9.1F, -3.325F, 0, 0, 5, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 20, 9.5F, -9.6F, -3.325F, 0, 0, 5, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 73, 20, 9.5F, -9.1F, -3.325F, 0, 0, 5, 0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 54, 12.075F, -10.05F, -3.5F, 1, 2, 6, 0.0F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 64, 46, 12.575F, -9.3F, -3.5F, 0, 0, 6, 0.15F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 64, 45, 8.7F, -9.3F, -3.5F, 0, 0, 6, 0.15F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 64, 47, 7.025F, -9.3F, -3.5F, 0, 0, 5, 0.15F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 62, 45, 13.825F, -9.3F, -3.5F, 0, 0, 5, 0.15F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 54, 13.35F, -10.05F, -3.5F, 1, 2, 5, 0.0F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 54, 8.175F, -10.05F, -3.5F, 1, 2, 6, 0.0F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 22, 8.175F, -9.3F, -3.5F, 1, 0, 6, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 22, 6.5F, -9.3F, -3.5F, 1, 0, 5, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 22, 12.075F, -9.3F, -3.5F, 1, 0, 6, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 22, 13.325F, -9.3F, -3.5F, 1, 0, 5, 0.075F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 54, 6.525F, -10.05F, -3.5F, 1, 2, 5, 0.0F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 84, 54, 9.925F, -10.15F, 1.5F, 1, 2, 1, 0.05F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 78, 11, 8.475F, -20.2F, -3.125F, 4, 1, 5, -0.25F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 70, 17, 6.475F, -13.7F, -3.125F, 2, 6, 5, -0.1F, false));
        bipedbodyDetailing.cubeList.add(new ModelBox(bipedbodyDetailing, 72, 16, 12.5F, -13.7F, -3.125F, 2, 6, 5, -0.1F, false));

        bipedbodyDetailing2 = new ModelRenderer(this);
        bipedbodyDetailing2.setRotationPoint(-1.5F, -0.5F, 0.0F);
        bipedbodyDetailing.addChild(bipedbodyDetailing2);
        setRotationAngle(bipedbodyDetailing2, 0.0F, 0.0F, 0.0873F);
        bipedbodyDetailing2.cubeList.add(new ModelBox(bipedbodyDetailing2, 70, 16, 6.7097F, -16.1243F, -3.125F, 2, 1, 5, -0.025F, false));
        bipedbodyDetailing2.cubeList.add(new ModelBox(bipedbodyDetailing2, 94, 17, 6.8557F, -14.4557F, -3.125F, 2, 1, 5, -0.1F, false));

        bipedbodyDetailing3 = new ModelRenderer(this);
        bipedbodyDetailing3.setRotationPoint(7.125F, 1.05F, 0.0F);
        bipedbodyDetailing.addChild(bipedbodyDetailing3);
        setRotationAngle(bipedbodyDetailing3, 0.0F, 0.0F, -0.0873F);
        bipedbodyDetailing3.cubeList.add(new ModelBox(bipedbodyDetailing3, 69, 17, 6.7228F, -16.2738F, -3.125F, 2, 1, 5, -0.025F, false));
        bipedbodyDetailing3.cubeList.add(new ModelBox(bipedbodyDetailing3, 94, 17, 6.5612F, -14.5317F, -3.125F, 2, 1, 5, -0.1F, false));

        bipedBodyStrap = new ModelRenderer(this);
        bipedBodyStrap.setRotationPoint(-2.5F, 21.0F, 0.5F);
        bipedBody.addChild(bipedBodyStrap);
        setRotationAngle(bipedBodyStrap, 0.0F, 0.0F, 0.3229F);
        bipedBodyStrap.cubeList.add(new ModelBox(bipedBodyStrap, 71, 6, -2.4784F, -22.1745F, -3.0F, 3, 3, 5, -0.1F, false));

        bipedBodyStrap2 = new ModelRenderer(this);
        bipedBodyStrap2.setRotationPoint(-10.5F, 19.75F, 0.5F);
        bipedBody.addChild(bipedBodyStrap2);
        setRotationAngle(bipedBodyStrap2, 0.0F, 0.0F, 0.6501F);
        bipedBodyStrap2.cubeList.add(new ModelBox(bipedBodyStrap2, 72, 8, -0.4826F, -22.3934F, -3.0F, 1, 10, 5, 0.05F, false));
        bipedBodyStrap2.cubeList.add(new ModelBox(bipedBodyStrap2, 61, 46, -1.0566F, -22.2396F, -2.975F, 2, 1, 5, -0.15F, false));

        bipedBodySwords = new ModelRenderer(this);
        bipedBodySwords.setRotationPoint(-11.375F, 18.0F, 0.5F);
        bipedBody.addChild(bipedBodySwords);
        setRotationAngle(bipedBodySwords, 0.0F, 0.0F, 0.7854F);
        bipedBodySwords.cubeList.add(new ModelBox(bipedBodySwords, 97, 71, -2.658F, -18.7662F, 1.075F, 2, 2, 1, 0.325F, false));
        bipedBodySwords.cubeList.add(new ModelBox(bipedBodySwords, 91, 96, -2.658F, -18.7662F, 1.55F, 2, 2, 1, 0.15F, false));

        bipedBodySwords2 = new ModelRenderer(this);
        bipedBodySwords2.setRotationPoint(-13.225F, 15.8F, 0.9F);
        bipedBody.addChild(bipedBodySwords2);
        setRotationAngle(bipedBodySwords2, 0.0F, 0.0F, 0.9992F);
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -5.658F, -17.7662F, 1.075F, 12, 1, 1, 0.0F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 77, 16, -5.658F, -17.7662F, 1.35F, 12, 1, 1, -0.125F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -4.6894F, -21.227F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -4.9731F, -22.0338F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -5.2854F, -22.4724F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -5.7267F, -23.5886F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 90, 73, -5.4535F, -22.9967F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 100, 96, -9.3223F, -17.7666F, 1.075F, 4, 1, 1, -0.125F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 102, 72, -9.2998F, -17.663F, 1.075F, 4, 0, 1, -0.075F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 102, 72, -9.294F, -16.8864F, 1.075F, 4, 0, 1, -0.05F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 96, 78, -9.1976F, -17.7756F, 1.075F, 0, 1, 1, -0.075F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 96, 78, -9.0519F, -17.7711F, 1.075F, 0, 1, 1, -0.075F, false));
        bipedBodySwords2.cubeList.add(new ModelBox(bipedBodySwords2, 106, 93, -5.8874F, -18.747F, 0.825F, 1, 3, 2, -0.325F, false));

        bipedBodySwords4 = new ModelRenderer(this);
        bipedBodySwords4.setRotationPoint(-13.2F, -23.6F, -2.6F);
        bipedBody.addChild(bipedBodySwords4);
        setRotationAngle(bipedBodySwords4, 0.0F, 0.0F, 0.0611F);
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 11.75F, 23.75F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 11.3F, 23.025F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 10.875F, 22.425F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 10.3968F, 21.9784F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 10.2343F, 21.6293F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 15.9233F, 23.5949F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 16.2859F, 22.9716F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 16.5503F, 22.3794F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 17.1879F, 21.3385F, 4.0F, 2, 1, 2, -0.4F, false));
        bipedBodySwords4.cubeList.add(new ModelBox(bipedBodySwords4, 86, 71, 16.8737F, 21.9338F, 4.0F, 2, 1, 2, -0.4F, false));

        bipedBodySwords3 = new ModelRenderer(this);
        bipedBodySwords3.setRotationPoint(-15.55F, -2.975F, 0.9F);
        bipedBody.addChild(bipedBodySwords3);
        setRotationAngle(bipedBodySwords3, 0.0F, 0.0F, 2.1555F);
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 83, 74, -5.658F, -17.7662F, 1.075F, 12, 1, 1, 0.0F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 91, 20, -5.658F, -17.7662F, 1.375F, 12, 1, 1, -0.125F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 97, 96, -9.3223F, -17.7666F, 1.075F, 4, 1, 1, -0.125F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 100, 74, -9.2184F, -17.7455F, 1.075F, 0, 1, 1, -0.075F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 100, 74, -9.1074F, -17.759F, 1.075F, 0, 1, 1, -0.075F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 103, 80, -9.3152F, -16.8013F, 1.075F, 4, 0, 1, -0.075F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 103, 80, -9.3678F, -17.6959F, 1.075F, 4, 0, 1, -0.075F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 107, 72, -5.9097F, -11.8408F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 107, 72, -5.525F, -12.8449F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 107, 72, -5.7418F, -12.3117F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 107, 72, -5.2596F, -13.4404F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 107, 72, -4.9175F, -14.1465F, 0.575F, 2, 1, 2, -0.4F, false));
        bipedBodySwords3.cubeList.add(new ModelBox(bipedBodySwords3, 102, 97, -5.8874F, -18.747F, 0.825F, 1, 3, 2, -0.325F, false));


        bipedRightArmDetailing = new ModelRenderer(this);
        bipedRightArmDetailing.setRotationPoint(-7.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetailing);
        bipedRightArmDetailing.cubeList.add(new ModelBox(bipedRightArmDetailing, 70, 6, 4.375F, -19.775F, -2.5F, 4, 1, 5, -0.225F, false));
        bipedRightArmDetailing.cubeList.add(new ModelBox(bipedRightArmDetailing, 70, 6, 3.575F, -24.4F, -2.5F, 5, 3, 5, -0.225F, false));
        bipedRightArmDetailing.cubeList.add(new ModelBox(bipedRightArmDetailing, 70, 6, 3.55F, -23.525F, -2.5F, 4, 3, 5, -0.3F, false));
        bipedRightArmDetailing.cubeList.add(new ModelBox(bipedRightArmDetailing, 70, 6, 3.6F, -19.775F, -2.5F, 4, 1, 5, -0.225F, false));


        bipedLeftArmDetailing = new ModelRenderer(this);
        bipedLeftArmDetailing.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetailing);
        bipedLeftArmDetailing.cubeList.add(new ModelBox(bipedLeftArmDetailing, 70, 6, 4.375F, -19.775F, -2.5F, 4, 1, 5, -0.225F, false));
        bipedLeftArmDetailing.cubeList.add(new ModelBox(bipedLeftArmDetailing, 70, 6, 3.375F, -24.375F, -2.5F, 5, 3, 5, -0.225F, false));
        bipedLeftArmDetailing.cubeList.add(new ModelBox(bipedLeftArmDetailing, 70, 6, 4.375F, -23.525F, -2.5F, 4, 3, 5, -0.3F, false));
        bipedLeftArmDetailing.cubeList.add(new ModelBox(bipedLeftArmDetailing, 70, 6, 3.6F, -19.775F, -2.5F, 4, 1, 5, -0.225F, false));


        bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.6F, 12.85F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        setRotationAngle(bipedRightLegHolster, 0.0F, 0.0F, 0.0611F);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 84, 15, -4.1747F, -9.2393F, -2.0F, 4, 0, 4, 0.4F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 84, 15, -4.908F, -8.944F, -1.0F, 4, 0, 2, 0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 47, -4.9926F, -8.6884F, 0.1F, 1, 0, 0, 0.2F, false));

        bipedRightLegHolster2 = new ModelRenderer(this);
        bipedRightLegHolster2.setRotationPoint(1.6F, 11.2F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster2);
        setRotationAngle(bipedRightLegHolster2, 0.0F, 0.0F, 0.0611F);
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 84, 15, -4.2495F, -9.2347F, -2.0F, 4, 0, 4, 0.4F, false));

        bipedRightLegDetailing = new ModelRenderer(this);
        bipedRightLegDetailing.setRotationPoint(-2.45F, 0.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegDetailing);
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 72, 16, 0.175F, -0.2F, -2.625F, 2, 3, 5, -0.075F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 102, 92, 0.025F, 0.375F, -0.425F, 0, 2, 1, 0.475F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 91, 56, 0.025F, 3.275F, -0.425F, 0, 1, 1, 0.35F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 70, 19, 0.2F, 2.0F, -2.625F, 1, 2, 5, -0.1F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 16, 11, 1.5F, 4.6F, -2.775F, 2, 3, 2, -0.15F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 17, 1, 1.5F, 7.6F, -2.35F, 2, 3, 2, -0.15F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 102, 92, 0.175F, -0.375F, -1.0F, 0, 2, 2, 0.4F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 70, 19, 0.375F, 5.625F, -2.0F, 4, 1, 4, 0.2F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 70, 19, 1.5F, 4.625F, -2.375F, 2, 3, 2, 0.075F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 70, 19, 1.05F, 5.85F, -3.125F, 3, 1, 2, -0.35F, false));
        bipedRightLegDetailing.cubeList.add(new ModelBox(bipedRightLegDetailing, 70, 19, 1.05F, 9.35F, -2.75F, 3, 1, 2, -0.35F, false));


        bipedLeftLegDetailing3 = new ModelRenderer(this);
        bipedLeftLegDetailing3.setRotationPoint(-5.275F, 8.8F, 0.5F);
        bipedLeftLeg.addChild(bipedLeftLegDetailing3);
        setRotationAngle(bipedLeftLegDetailing3, 0.0F, 0.0F, -0.0873F);


        bipedLeftLegDetailing = new ModelRenderer(this);
        bipedLeftLegDetailing.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegDetailing);
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, 0.25F, -0.2F, -2.625F, 2, 3, 5, -0.075F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.0F, 4.625F, -2.375F, 2, 3, 2, 0.075F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.975F, 5.625F, -2.0F, 4, 1, 4, 0.2F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.975F, 1.625F, -2.0F, 4, 0, 4, 0.4F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.975F, 8.625F, -2.0F, 4, 0, 4, 0.325F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, 1.425F, 7.95F, -0.525F, 1, 2, 1, -0.025F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 91, 73, 1.4F, 7.875F, -0.525F, 1, 0, 1, 0.2F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 91, 73, 1.6F, 6.75F, -0.525F, 1, 2, 1, -0.25F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, 2.15F, 8.1F, -0.025F, 0, 2, 0, 0.175F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 102, 92, 2.275F, -0.375F, -1.0F, 0, 2, 2, 0.4F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 102, 92, 2.525F, 0.375F, -0.425F, 0, 2, 1, 0.475F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.45F, 5.85F, -3.125F, 3, 1, 2, -0.35F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, -1.45F, 9.35F, -2.775F, 3, 1, 2, -0.35F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 16, 11, -1.0F, 4.6F, -2.775F, 2, 3, 2, -0.15F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 16, 1, -1.0F, 7.6F, -2.4F, 2, 3, 2, -0.15F, false));
        bipedLeftLegDetailing.cubeList.add(new ModelBox(bipedLeftLegDetailing, 70, 19, 1.275F, 2.0F, -2.625F, 1, 2, 5, -0.1F, false));
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