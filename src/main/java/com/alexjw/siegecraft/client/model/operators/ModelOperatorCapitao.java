package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorCapitao extends ModelBiped {
    private final ModelRenderer bipedHeadPatchStrap1;
    private final ModelRenderer bipedHeadHat;
    private final ModelRenderer bipedHeadPatchHat;
    private final ModelRenderer bipedHeadEyebrow;
    private final ModelRenderer bipedBodyVest;
    private final ModelRenderer bipedBodyVestFlag;
    private final ModelRenderer bipedBodyVestBack;
    private final ModelRenderer bipedRightArmSleeve;
    private final ModelRenderer bipedLeftArmSleeve;
    private final ModelRenderer bipedRightLegHolster;
    private final ModelRenderer bipedLeftLegBag;

    public ModelOperatorCapitao() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        bipedHeadPatchStrap1 = new ModelRenderer(this);
        bipedHeadPatchStrap1.setRotationPoint(1.25F, -4.25F, -4.25F);
        bipedHead.addChild(bipedHeadPatchStrap1);
        setRotationAngle(bipedHeadPatchStrap1, 0.0F, 0.0F, -0.7854F);
        bipedHeadPatchStrap1.cubeList.add(new ModelBox(bipedHeadPatchStrap1, 12, 21, -1.0F, -6.0F, 0.0F, 1, 6, 1, -0.2F, false));
        bipedHeadPatchStrap1.cubeList.add(new ModelBox(bipedHeadPatchStrap1, 13, 22, -0.4697F, -6.1768F, 7.5F, 1, 6, 1, -0.2F, false));

        bipedHeadHat = new ModelRenderer(this);
        bipedHeadHat.setRotationPoint(1.5F, -6.25F, -4.0F);
        bipedHead.addChild(bipedHeadHat);
        setRotationAngle(bipedHeadHat, 0.0F, 0.0F, -1.3963F);
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 76, 24, -0.3506F, -5.837F, -0.25F, 2, 9, 8, -0.1F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 76, 24, 0.7211F, -5.5183F, -0.5F, 2, 9, 9, -0.375F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 76, 24, -0.2346F, -6.6191F, -0.25F, 2, 9, 9, -0.575F, false));

        bipedHeadPatchHat = new ModelRenderer(this);
        bipedHeadPatchHat.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadPatchHat);
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 9, 24, 0.75F, -28.0F, -4.25F, 2, 1, 1, -0.1F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 9, 24, 0.25F, -28.75F, -4.25F, 3, 1, 1, -0.1F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 18, 25, 2.25F, -29.0F, -4.25F, 2, 1, 1, -0.2F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 18, 25, 0.25F, -29.0F, 3.25F, 4, 1, 1, -0.2F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 77, 12, 3.5F, -29.0F, -4.0F, 1, 1, 8, -0.2F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 81, 26, -4.0F, -31.75F, -4.0F, 8, 2, 8, 0.1F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 22, 6, -4.0F, -29.5F, -1.5F, 1, 2, 5, 0.2F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 22, 6, 3.0F, -29.5F, -1.5F, 1, 2, 5, 0.2F, false));
        bipedHeadPatchHat.cubeList.add(new ModelBox(bipedHeadPatchHat, 60, 58, -6.75F, -34.75F, -4.0F, 8, 8, 3, -3.3F, false));

        bipedHeadEyebrow = new ModelRenderer(this);
        bipedHeadEyebrow.setRotationPoint(-6.0F, 23.0F, 0.0F);
        bipedHead.addChild(bipedHeadEyebrow);
        setRotationAngle(bipedHeadEyebrow, 0.0F, 0.0F, 0.1745F);
        bipedHeadEyebrow.cubeList.add(new ModelBox(bipedHeadEyebrow, 10, 3, -1.7538F, -28.5434F, -4.25F, 2, 1, 1, -0.1F, false));

        bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 28, 66, -0.5F, -18.0F, -4.25F, 4, 3, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 101, 11, -3.95F, -21.75F, -2.5F, 8, 9, 1, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 13, -3.95F, -12.75F, -2.5F, 8, 1, 5, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 82, 30, -4.2F, -22.75F, -1.75F, 2, 10, 3, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 28, 2.3F, -22.75F, -1.75F, 2, 10, 3, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 34, -3.95F, -22.75F, 1.25F, 8, 10, 1, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 11, 0.5F, -25.0F, -3.25F, 4, 5, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 75, 30, 0.5F, -25.25F, -3.0F, 4, 3, 6, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 78, 17, -4.5F, -25.25F, -3.0F, 4, 3, 6, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 21, 0.5F, -25.0F, 0.25F, 4, 4, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 22, -0.5F, -25.0F, -3.75F, 3, 4, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 22, -2.75F, -25.0F, -3.75F, 3, 4, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 101, 11, -4.5F, -25.0F, -3.25F, 4, 5, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 99, 16, -4.5F, -25.0F, 0.25F, 4, 4, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 33, -5.0F, -24.5F, -1.25F, 2, 2, 4, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 12, -4.0F, -17.0F, -0.25F, 8, 1, 3, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 12, -4.0F, -15.5F, -0.25F, 8, 1, 3, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 12, -3.75F, -22.75F, 0.5F, 7, 4, 3, -1.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, 0.5F, -17.25F, -3.0F, 2, 3, 1, 0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 118, 35, 0.75F, -21.25F, -3.0F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 116, 22, 0.75F, -21.25F, -3.3F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 30, 0.75F, -21.25F, -3.55F, 1, 1, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 30, 0.75F, -20.25F, -3.55F, 1, 1, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 19, 69, 1.0F, -17.0F, -3.725F, 1, 1, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 30, 0.75F, -20.75F, -3.55F, 1, 1, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 1.675F, -21.25F, -3.55F, 1, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 1.725F, -20.175F, -3.65F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, 0.45F, -20.675F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -0.8F, -20.675F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -0.8F, -21.8F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.025F, -21.125F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.6F, -21.225F, 1.9F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.75F, -21.225F, 1.925F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.85F, -21.225F, 2.0F, 1, 1, 1, -0.425F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.6F, -20.725F, 1.95F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.8F, -20.725F, 1.975F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.925F, -20.725F, 1.975F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.8F, -21.725F, 1.95F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.925F, -21.725F, 1.95F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.6F, -21.725F, 1.95F, 1, 1, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, -2.05F, -21.8F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, 0.45F, -21.8F, 2.1F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 29, 0.475F, -21.225F, 2.025F, 2, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 46, 17, 1.525F, -23.5F, -3.025F, 2, 1, 1, -0.55F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 2.825F, -21.25F, -3.55F, 1, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 1.325F, -21.75F, 1.95F, 1, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.475F, -20.775F, 1.925F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.475F, -21.0F, 1.925F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.55F, -21.2F, 1.9F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.475F, -21.45F, 1.925F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.475F, -21.65F, 1.925F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 0.1F, -21.725F, 1.925F, 1, 2, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -2.4F, -21.725F, 1.925F, 1, 2, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -0.7F, -21.725F, 1.925F, 1, 2, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -1.15F, -21.725F, 1.925F, 1, 2, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -1.95F, -21.65F, 1.925F, 1, 1, 1, -0.35F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -1.95F, -21.375F, 1.925F, 1, 1, 1, -0.35F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, -1.95F, -21.275F, 1.925F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 2.125F, -23.875F, -3.05F, 1, 2, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 1.925F, -23.875F, -3.05F, 1, 2, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 2.025F, -23.75F, -3.05F, 1, 2, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 16, 2.025F, -23.875F, -3.0F, 1, 2, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 30, 2.25F, -20.75F, -3.55F, 1, 1, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 30, 2.25F, -21.0F, -3.55F, 1, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 111, 29, 1.5F, -23.75F, -2.825F, 2, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 101, 27, 1.75F, -21.25F, -3.3F, 2, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, 2.9F, -17.25F, -2.75F, 1, 3, 1, 0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, 3.65F, -24.0F, -2.5F, 0, 2, 5, 0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -1.75F, -17.25F, -2.75F, 1, 3, 1, 0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -3.5F, -17.25F, -2.75F, 1, 3, 1, 0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -2.25F, -21.25F, -3.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -3.5F, -21.5F, -3.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 15, -3.5F, -17.5F, -3.25F, 1, 2, 1, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 82, 14, -3.5F, -22.0F, -3.0F, 1, 2, 1, -0.125F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 2, 67, -2.5F, -22.5F, -3.25F, 1, 2, 1, -0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 17, -2.5F, -22.275F, -3.375F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 17, -2.0F, -22.1F, -3.375F, 1, 1, 1, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 17, 2.1F, -20.95F, -3.825F, 1, 1, 1, -0.425F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 17, 2.4F, -20.95F, -3.825F, 1, 1, 1, -0.425F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 17, 2.25F, -20.8F, -3.825F, 1, 1, 1, -0.45F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 2, 67, -2.0F, -22.25F, -3.25F, 1, 2, 1, -0.325F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 14, -1.75F, -17.5F, -3.25F, 1, 2, 1, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 14, 2.925F, -17.4F, -3.25F, 1, 2, 1, 0.075F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -4.0F, -13.25F, -2.5F, 8, 1, 1, -0.125F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 73, 43, -4.0F, -13.25F, 1.25F, 8, 1, 1, -0.125F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 13, -0.5F, -22.0F, -2.75F, 1, 10, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 0, 0, 1.575F, -17.5F, 2.375F, 1, 1, 1, -0.225F, false));

        bipedBodyVestFlag = new ModelRenderer(this);
        bipedBodyVestFlag.setRotationPoint(1.5F, -15.75F, 1.75F);
        bipedBodyVest.addChild(bipedBodyVestFlag);
        setRotationAngle(bipedBodyVestFlag, 0.0F, 0.0F, 0.7854F);
        bipedBodyVestFlag.cubeList.add(new ModelBox(bipedBodyVestFlag, 0, 0, -1.0177F, -1.0177F, -5.25F, 1, 1, 1, -0.15F, false));

        bipedBodyVestBack = new ModelRenderer(this);
        bipedBodyVestBack.setRotationPoint(1.75F, -15.75F, -4.25F);
        bipedBodyVest.addChild(bipedBodyVestBack);
        setRotationAngle(bipedBodyVestBack, 0.0F, 0.0F, -1.309F);
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 94, 10, -1.2415F, -0.9353F, 6.0F, 3, 2, 1, 0.0F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 112, 14, 4.6868F, -3.2485F, 0.825F, 2, 2, 2, -0.45F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 113, 16, 2.7968F, -2.8029F, 1.075F, 3, 1, 2, -0.375F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 107, 18, 4.6868F, -3.2485F, 0.575F, 2, 2, 2, -0.575F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 108, 17, -0.9532F, -2.5916F, 6.0F, 2, 1, 1, 0.0F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 109, 11, 0.0F, -1.0F, 6.25F, 2, 2, 1, -0.1F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 109, 11, -0.7118F, -2.6563F, 6.25F, 2, 1, 1, -0.1F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 30, 66, -0.2415F, -1.9353F, 6.25F, 3, 4, 1, -1.1F, false));
        bipedBodyVestBack.cubeList.add(new ModelBox(bipedBodyVestBack, 18, 68, 0.8158F, -0.5292F, 6.75F, 1, 1, 1, -0.3F, false));

        bipedRightArmSleeve = new ModelRenderer(this);
        bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmSleeve);
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 81, 20, -8.0F, -18.75F, -2.0F, 4, 2, 4, 0.1F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 101, 24, -8.0F, -24.0F, -1.0F, 2, 3, 2, 0.1F, false));

        bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 101, 24, 4.0F, -18.75F, -2.0F, 4, 2, 4, 0.1F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 101, 24, 6.0F, -24.0F, -1.0F, 2, 3, 2, 0.1F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 74, 56, 6.25F, -25.0F, -3.0F, 2, 5, 6, -1.9F, false));

        bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 20, -4.0F, -10.25F, -2.25F, 4, 1, 4, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 79, 21, -4.0F, -10.25F, -2.25F, 4, 1, 4, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 88, 6, -4.75F, -11.0F, -1.75F, 2, 3, 3, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 88, 6, -4.75F, -10.5F, -1.75F, 2, 3, 3, -0.4F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 20, -4.5F, -13.0F, -0.25F, 2, 3, 1, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -3.5F, -7.0F, -2.5F, 3, 2, 1, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -3.0F, -7.5F, -2.5F, 2, 3, 1, -0.025F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 81, 20, -4.0F, -8.75F, -2.25F, 4, 1, 4, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -0.75F, -6.75F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -0.75F, -6.25F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -4.25F, -6.75F, -2.5F, 4, 1, 5, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 17, -4.25F, -6.25F, -2.5F, 4, 1, 5, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 99, 45, -4.0F, -10.25F, 1.25F, 4, 1, 1, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 103, 40, -4.0F, -8.75F, 1.25F, 4, 1, 1, 0.0F, false));

        bipedLeftLegBag = new ModelRenderer(this);
        bipedLeftLegBag.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegBag);
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 0.0F, -9.75F, -2.0F, 4, 1, 4, 0.1F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 76, 20, 2.5F, -13.0F, -0.25F, 2, 3, 1, -0.2F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 0.25F, -6.75F, -2.5F, 4, 1, 5, -0.2F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 1.0F, -7.5F, -2.5F, 2, 3, 1, -0.125F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, -0.25F, -6.75F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, -0.25F, -6.25F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 0.25F, -6.25F, -2.5F, 4, 1, 5, -0.2F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 0.5F, -7.0F, -2.5F, 3, 2, 1, -0.1F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 80, 17, 2.5F, -11.75F, -1.25F, 2, 3, 3, 0.1F, false));
        bipedLeftLegBag.cubeList.add(new ModelBox(bipedLeftLegBag, 78, 11, 2.75F, -12.0F, -1.25F, 2, 2, 3, -0.1F, false));
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}