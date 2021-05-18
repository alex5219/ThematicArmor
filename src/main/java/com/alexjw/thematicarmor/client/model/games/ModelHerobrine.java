package com.alexjw.thematicarmor.client.model.games;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHerobrine extends ModelBiped {
    private final ModelRenderer bipedHelmetHorn2;
    private final ModelRenderer bipedHelmetHorn;
    private final ModelRenderer bipedHeadHelmet;
    private final ModelRenderer bipedHeadMask;
    private final ModelRenderer bipedBodySword;
    private final ModelRenderer bipedBodySkull;
    private final ModelRenderer bipedBodySkull2;
    private final ModelRenderer bipedBodyArmor;
    private final ModelRenderer bipedBodyEChest;
    private final ModelRenderer bipedBodyNotch;
    private final ModelRenderer bipedRightArmArmor;
    private final ModelRenderer bipedRightArmGlove;
    private final ModelRenderer bipedLeftArmArmor;
    private final ModelRenderer bipedLeftArmGlove;
    private final ModelRenderer bipedRightLegArmor;
    private final ModelRenderer bipedLeftLegArmor;

    public ModelHerobrine() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;




        bipedHelmetHorn2 = new ModelRenderer(this);
        bipedHelmetHorn2.setRotationPoint(21.15F, 19.8F, -1.25F);
        bipedHead.addChild(bipedHelmetHorn2);
        setRotationAngle(bipedHelmetHorn2, 0.0F, 0.0F, -0.925F);
        bipedHelmetHorn2.cubeList.add(new ModelBox(bipedHelmetHorn2, 90, 14, 4.65F, -38.75F, 0.0F, 3, 4, 3, 0.0F, false));
        bipedHelmetHorn2.cubeList.add(new ModelBox(bipedHelmetHorn2, 97, 8, 5.0516F, -40.5809F, 0.5F, 2, 3, 2, 0.0F, false));

        bipedHelmetHorn = new ModelRenderer(this);
        bipedHelmetHorn.setRotationPoint(-28.6F, 10.025F, -1.25F);
        bipedHead.addChild(bipedHelmetHorn);
        setRotationAngle(bipedHelmetHorn, 0.0F, 0.0F, 0.925F);
        bipedHelmetHorn.cubeList.add(new ModelBox(bipedHelmetHorn, 94, 8, 4.65F, -38.75F, 0.0F, 3, 4, 3, 0.0F, false));
        bipedHelmetHorn.cubeList.add(new ModelBox(bipedHelmetHorn, 97, 8, 5.0516F, -40.5809F, 0.5F, 2, 3, 2, 0.0F, false));

        bipedHeadHelmet = new ModelRenderer(this);
        bipedHeadHelmet.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadHelmet);
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 109, 64, -1.0F, -8.95F, -4.775F, 2, 4, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 15, -8.0F, -10.7F, -0.275F, 1, 2, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 15, 6.825F, -10.7F, -0.275F, 1, 2, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 102, 59, -1.0F, -8.95F, -3.775F, 2, 1, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 86, 2, -0.55F, -9.375F, -5.225F, 1, 3, 10, -0.125F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 98, 7, -0.55F, -7.1F, -5.1F, 1, 3, 2, -0.125F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 86, 2, -0.55F, -8.075F, -5.225F, 1, 2, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 118, 97, -0.55F, -8.075F, -5.675F, 1, 2, 1, -0.35F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 117, 98, -0.55F, -7.575F, -5.7F, 1, 1, 1, -0.225F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 121, 16, -0.55F, -8.075F, -6.025F, 1, 2, 2, -0.45F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 121, 16, -0.55F, -8.075F, -6.2F, 1, 2, 2, -0.55F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 58, -4.0F, -8.125F, -4.075F, 8, 2, 8, 0.45F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 86, 58, -4.0F, -7.975F, 3.675F, 8, 6, 1, 0.25F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 57, 3.35F, -6.05F, -4.025F, 1, 2, 8, 0.325F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 57, 3.45F, -4.05F, -1.625F, 1, 2, 6, 0.125F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 57, -4.35F, -4.05F, -1.625F, 1, 2, 6, 0.125F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 61, -4.35F, -6.05F, -4.025F, 1, 2, 8, 0.325F, false));

        bipedHeadMask = new ModelRenderer(this);
        bipedHeadMask.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadMask);
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 106, 11, 2.825F, -4.05F, -4.325F, 2, 3, 2, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 106, 10, -4.8F, -4.05F, -4.325F, 2, 3, 2, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, -2.975F, -1.275F, -4.925F, 6, 1, 2, -0.35F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, 2.125F, -1.85F, -4.925F, 1, 1, 2, -0.4F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, -3.05F, -1.85F, -4.925F, 1, 1, 2, -0.4F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, -3.05F, -2.025F, -4.925F, 1, 1, 2, -0.375F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 89, 69, -2.65F, -1.95F, -4.925F, 1, 1, 2, -0.35F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 88, 64, 1.675F, -1.95F, -4.925F, 1, 1, 2, -0.35F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, -2.475F, -1.775F, -4.925F, 5, 1, 2, -0.35F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 37, 2.125F, -2.025F, -4.925F, 1, 1, 2, -0.375F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 87, 8, -0.475F, -3.6F, -5.15F, 1, 2, 2, -0.275F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 87, 8, -0.475F, -2.95F, -4.55F, 1, 1, 2, 0.075F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 114, 11, -1.0F, -2.85F, -4.25F, 2, 3, 2, 0.125F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 117, 82, -2.0F, -1.575F, -4.475F, 4, 0, 0, 0.2F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 112, 82, -2.0F, -0.575F, -4.475F, 4, 0, 0, 0.2F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 91, 17, -2.5F, -1.175F, -3.9F, 5, 0, 0, 0.525F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 117, 81, -2.8F, -1.75F, -4.475F, 1, 0, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 25, 13, -3.125F, -4.225F, -4.0F, 2, 0, 0, 0.2F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 118, 79, -2.8F, -0.725F, -4.475F, 1, 0, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 12, 5, 1.475F, -5.975F, -4.425F, 1, 1, 1, -0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 25, 13, 1.125F, -4.225F, -3.975F, 2, 0, 0, 0.2F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 119, 82, 1.875F, -1.725F, -4.475F, 1, 0, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 121, 78, 1.875F, -0.725F, -4.475F, 1, 0, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 89, 4, -4.0F, -2.175F, -4.05F, 8, 2, 8, 0.2F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 75, 74, -2.95F, -1.825F, -4.35F, 0, 1, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 119, 82, 3.025F, -1.825F, -4.35F, 0, 1, 0, 0.15F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 95, 4, -4.0F, -1.9F, -4.0F, 8, 1, 8, 0.3F, false));

        bipedBodySword = new ModelRenderer(this);
        bipedBodySword.setRotationPoint(-3.625F, 11.6F, -3.45F);
        bipedBody.addChild(bipedBodySword);
        setRotationAngle(bipedBodySword, 0.0F, 0.0F, 0.5803F);
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 121, 2, -1.0F, -15.0F, 6.725F, 2, 15, 1, 0.0F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 39, 83, -1.8965F, -15.6379F, 5.5F, 4, 1, 3, -0.3F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 31, 76, -2.8965F, -15.6379F, 5.5F, 6, 1, 3, -0.375F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 32, 80, -0.9847F, -19.7017F, 6.025F, 2, 5, 2, -0.575F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 32, 80, -1.315F, -20.0232F, 6.025F, 2, 2, 2, -0.675F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 32, 80, -1.535F, -20.2676F, 6.025F, 2, 2, 2, -0.775F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 120, 93, -1.7694F, -20.4427F, 6.025F, 2, 2, 2, -0.825F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 104, 12, -0.9925F, -16.577F, 6.025F, 2, 2, 2, -0.4F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 121, 2, -0.3704F, -14.6264F, 6.45F, 2, 14, 1, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 122, 12, -0.9606F, -3.973F, 6.675F, 2, 5, 1, -0.25F, false));

        bipedBodySkull = new ModelRenderer(this);
        bipedBodySkull.setRotationPoint(-5.8F, 29.575F, -6.425F);
        bipedBody.addChild(bipedBodySkull);
        setRotationAngle(bipedBodySkull, 0.4581F, -2.3911F, -0.0916F);
        bipedBodySkull.cubeList.add(new ModelBox(bipedBodySkull, 19, 77, -6.5595F, -25.9915F, -9.5411F, 8, 8, 8, -2.225F, false));

        bipedBodySkull2 = new ModelRenderer(this);
        bipedBodySkull2.setRotationPoint(8.85F, 32.075F, 0.6F);
        bipedBody.addChild(bipedBodySkull2);
        setRotationAngle(bipedBodySkull2, 0.4014F, 2.8536F, -0.0916F);
        bipedBodySkull2.cubeList.add(new ModelBox(bipedBodySkull2, 19, 77, -0.1483F, -25.2817F, 0.0581F, 8, 8, 8, -2.25F, false));

        bipedBodyArmor = new ModelRenderer(this);
        bipedBodyArmor.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyArmor);
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 95, 64, 2.325F, -25.175F, -3.0F, 2, 5, 6, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 86, 60, -4.0F, -22.0F, -2.4F, 8, 10, 1, -1.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 86, 60, -4.0F, -21.025F, -1.975F, 8, 10, 1, -1.325F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 89, 62, -3.0F, -14.075F, -1.575F, 6, 4, 1, -1.5F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 96, 12, 0.05F, -16.5F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 94, 12, -0.2F, -14.75F, -3.05F, 3, 2, 1, -0.65F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 12, -2.7F, -14.75F, -3.05F, 3, 2, 1, -0.65F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 1, -2.95F, -18.25F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 1, -2.95F, -16.5F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 1, -2.95F, -20.0F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 109, 12, 0.05F, -18.25F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 96, 12, 0.05F, -20.0F, -3.3F, 3, 2, 1, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 88, 44, -2.95F, -23.0F, -3.2F, 6, 2, 2, -0.35F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 82, 18, -2.95F, -24.375F, -2.75F, 6, 2, 2, -0.15F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 82, 18, -2.95F, -24.525F, -1.25F, 6, 2, 4, -0.15F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 101, 11, -3.1F, -24.25F, -3.725F, 2, 4, 2, -0.65F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 101, 11, 1.025F, -24.25F, -3.725F, 2, 4, 2, -0.65F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 101, 11, 1.025F, -23.725F, -3.725F, 2, 4, 2, -0.8F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 101, 11, -0.975F, -22.975F, -3.725F, 2, 4, 2, -0.8F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 101, 11, -3.1F, -23.725F, -3.725F, 2, 4, 2, -0.8F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 108, 10, -0.975F, -23.525F, -3.575F, 2, 4, 2, -0.575F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 119, 95, -0.975F, -22.775F, -4.075F, 2, 3, 2, -0.825F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 90, 53, -4.0F, -22.0F, -2.8F, 8, 8, 6, -0.225F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 106, 58, -2.65F, -24.25F, 2.425F, 5, 8, 1, 0.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 58, 100, -5.85F, -19.225F, -1.9F, 12, 12, 9, -4.1F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 90, 5, -5.0F, -22.0F, -3.0F, 10, 10, 6, -0.775F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 91, 58, -4.425F, -25.175F, -3.0F, 2, 5, 6, 0.0F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 120, 17, -3.425F, -23.95F, -3.525F, 1, 1, 1, -0.225F, false));
        bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 97, 10, 2.325F, -23.975F, -3.525F, 1, 1, 1, -0.225F, false));

        bipedBodyEChest = new ModelRenderer(this);
        bipedBodyEChest.setRotationPoint(2.8F, 23.075F, -10.475F);
        bipedBody.addChild(bipedBodyEChest);
        bipedBodyEChest.cubeList.add(new ModelBox(bipedBodyEChest, 3, 96, -4.65F, -16.225F, 9.925F, 7, 2, 6, -1.5F, false));
        bipedBodyEChest.cubeList.add(new ModelBox(bipedBodyEChest, 12, 101, -4.65F, -16.25F, 9.925F, 7, 4, 6, -1.5F, false));
        bipedBodyEChest.cubeList.add(new ModelBox(bipedBodyEChest, 47, 95, -1.7F, -15.65F, 14.05F, 1, 2, 1, -0.3F, false));

        bipedBodyNotch = new ModelRenderer(this);
        bipedBodyNotch.setRotationPoint(-17.775F, 16.325F, -0.2F);
        bipedBody.addChild(bipedBodyNotch);
        setRotationAngle(bipedBodyNotch, 0.0F, 1.1257F, 0.4581F);
        bipedBodyNotch.cubeList.add(new ModelBox(bipedBodyNotch, 65, 77, -3.0865F, -24.0064F, 6.1486F, 7, 8, 8, -2.75F, false));
        bipedBodyNotch.cubeList.add(new ModelBox(bipedBodyNotch, 102, 105, -0.5598F, -19.0021F, 8.5424F, 7, 8, 3, 0.0F, false));
        bipedBodyNotch.cubeList.add(new ModelBox(bipedBodyNotch, 102, 105, -1.3477F, -18.3697F, 7.9358F, 7, 8, 3, -0.325F, false));


        bipedRightArmArmor = new ModelRenderer(this);
        bipedRightArmArmor.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmArmor);
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 77, 57, -8.0F, -24.5F, -2.0F, 4, 2, 4, 0.4F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 77, 57, -8.0F, -16.175F, -2.0F, 4, 2, 4, 0.375F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 109, 32, -8.0F, -14.0F, -2.0F, 2, 1, 4, 0.15F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 100, 16, -8.9F, -25.45F, -0.775F, 5, 3, 2, -0.125F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 91, 12, -9.25F, -25.8F, -0.775F, 4, 3, 2, -0.25F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 89, 16, -9.675F, -26.25F, -0.775F, 3, 3, 2, -0.45F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 83, 60, -8.6F, -18.15F, -1.5F, 2, 6, 3, -0.1F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 116, 61, -8.95F, -17.15F, -1.0F, 2, 4, 2, -0.1F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 83, 16, -9.4F, -27.15F, -0.775F, 2, 3, 2, -0.7F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 100, 74, -8.95F, -19.975F, -0.175F, 2, 4, 1, -0.2F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 116, 61, -8.85F, -23.2F, -0.75F, 2, 4, 2, -0.25F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 118, 90, -9.575F, -15.225F, -1.0F, 2, 2, 2, -0.525F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 77, 57, -8.0F, -21.0F, -2.0F, 4, 1, 4, 0.4F, false));
        bipedRightArmArmor.cubeList.add(new ModelBox(bipedRightArmArmor, 102, 7, -8.0F, -22.15F, -2.0F, 4, 6, 4, 0.125F, false));

        bipedRightArmGlove = new ModelRenderer(this);
        bipedRightArmGlove.setRotationPoint(2.775F, 22.45F, 0.0F);
        bipedRightArm.addChild(bipedRightArmGlove);
        setRotationAngle(bipedRightArmGlove, 0.0F, 0.0F, 0.1658F);
        bipedRightArmGlove.cubeList.add(new ModelBox(bipedRightArmGlove, 76, 61, -8.0F, -12.875F, -2.0F, 4, 1, 4, 0.25F, false));


        bipedLeftArmArmor = new ModelRenderer(this);
        bipedLeftArmArmor.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmArmor);
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 89, 11, 4.25F, -25.5F, -1.025F, 5, 3, 2, -0.125F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 98, 13, 5.625F, -25.9F, -1.025F, 4, 3, 2, -0.35F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 83, 16, 6.025F, -26.325F, -1.025F, 4, 3, 2, -0.55F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 83, 16, 7.85F, -27.15F, -1.025F, 2, 3, 2, -0.7F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 105, 56, 4.25F, -24.5F, -2.0F, 4, 3, 4, 0.55F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 109, 56, 5.5F, -24.0F, -2.5F, 2, 2, 5, 0.55F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 104, 62, 3.425F, -21.225F, -2.525F, 5, 1, 5, -0.05F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 102, 7, 3.475F, -20.725F, -2.525F, 5, 1, 5, -0.25F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 74, 63, 3.975F, -15.75F, -1.975F, 4, 2, 4, 0.225F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 94, 66, 5.725F, -17.5F, -0.975F, 3, 5, 2, 0.05F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 109, 66, 5.8F, -22.25F, -0.975F, 3, 5, 2, -0.25F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 90, 25, 5.075F, -16.55F, -1.975F, 3, 1, 4, 0.275F, false));
        bipedLeftArmArmor.cubeList.add(new ModelBox(bipedLeftArmArmor, 103, 55, 3.425F, -19.725F, -2.525F, 5, 1, 5, -0.05F, false));

        bipedLeftArmGlove = new ModelRenderer(this);
        bipedLeftArmGlove.setRotationPoint(-2.1F, 22.4F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmGlove);
        setRotationAngle(bipedLeftArmGlove, 0.0F, 0.0F, -0.2051F);
        bipedLeftArmGlove.cubeList.add(new ModelBox(bipedLeftArmGlove, 74, 63, 3.8137F, -12.5361F, -2.1F, 4, 1, 4, 0.25F, false));


        bipedRightLegArmor = new ModelRenderer(this);
        bipedRightLegArmor.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegArmor);
        bipedRightLegArmor.cubeList.add(new ModelBox(bipedRightLegArmor, 95, 65, -3.5F, -11.1F, -2.0F, 3, 4, 4, 0.1F, false));
        bipedRightLegArmor.cubeList.add(new ModelBox(bipedRightLegArmor, 92, 64, -4.0F, -4.85F, -2.0F, 4, 5, 4, 0.175F, false));
        bipedRightLegArmor.cubeList.add(new ModelBox(bipedRightLegArmor, 93, 64, -4.0F, -11.6F, -2.0F, 3, 5, 4, 0.175F, false));


        bipedLeftLegArmor = new ModelRenderer(this);
        bipedLeftLegArmor.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegArmor);
        bipedLeftLegArmor.cubeList.add(new ModelBox(bipedLeftLegArmor, 96, 64, -1.9F, 7.15F, -2.0F, 4, 5, 4, 0.175F, false));
        bipedLeftLegArmor.cubeList.add(new ModelBox(bipedLeftLegArmor, 96, 64, -0.9F, 0.4F, -2.0F, 3, 5, 4, 0.175F, false));
        bipedLeftLegArmor.cubeList.add(new ModelBox(bipedLeftLegArmor, 94, 65, -1.4F, 0.9F, -2.0F, 3, 4, 4, 0.1F, false));

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