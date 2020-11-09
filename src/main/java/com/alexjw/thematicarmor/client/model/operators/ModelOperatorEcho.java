package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

//FIX RENDERING

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorEcho extends ModelBiped {
    public ModelOperatorEcho() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        ModelRenderer bipedHeadGear = new ModelRenderer(this);
        bipedHeadGear.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadGear);
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 8, 3, -3.5F, -5.0F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 8, 3, 0.5F, -5.0F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 9, 90, 0.5F, -2.75F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 4, 90, -4.0F, -1.75F, 3.5F, 8, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 35, 90, 2.25F, -3.25F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 6, 93, 3.5F, -3.25F, -4.25F, 1, 1, 4, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 3, 92, -4.5F, -3.25F, -4.25F, 1, 1, 4, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 7, 94, 3.5F, -2.75F, -1.5F, 1, 1, 3, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 3, 93, -4.5F, -2.75F, -1.5F, 1, 1, 3, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 2, 90, 3.5F, -2.25F, 0.25F, 1, 1, 3, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 4, 91, -4.5F, -2.25F, 0.25F, 1, 1, 3, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 4, 90, 3.5F, -1.75F, 0.5F, 1, 1, 4, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 3, 90, -4.5F, -1.75F, 0.5F, 1, 1, 4, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 4, 92, -4.25F, -3.25F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 2, 93, -3.75F, -2.75F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 8, 92, -1.5F, -3.25F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 9, 10, -0.5F, -3.0F, -4.25F, 1, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 100, 97, -4.5F, -7.25F, -4.5F, 9, 2, 1, -0.4F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 100, 97, -4.5F, -7.25F, 3.5F, 9, 2, 1, -0.4F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 100, 97, 3.5F, -7.25F, -4.5F, 1, 2, 9, -0.4F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 100, 97, 3.5F, -6.75F, -1.5F, 1, 3, 4, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 107, 16, 3.75F, -6.25F, -1.0F, 1, 2, 3, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 104, 20, 3.5F, -2.75F, -4.75F, 1, 1, 3, -0.1F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 104, 14, 2.5F, -2.0F, -4.75F, 2, 1, 1, -0.1F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 60, 102, 2.25F, -2.0F, -4.75F, 1, 1, 1, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 100, 97, -4.5F, -7.25F, -4.5F, 1, 2, 9, -0.4F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 8, 3, -0.25F, -8.5F, -4.5F, 3, 3, 2, -0.3F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 24, 11, -3.75F, -8.0F, -4.5F, 3, 3, 1, -0.1F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 24, 9, -2.25F, -8.25F, -4.5F, 3, 3, 2, -0.2F, false));
        bipedHeadGear.cubeList.add(new ModelBox(bipedHeadGear, 24, 9, -4.25F, -7.75F, -4.5F, 3, 3, 1, -0.2F, false));

        ModelRenderer bipedHeadGearMic = new ModelRenderer(this);
        bipedHeadGearMic.setRotationPoint(9.5F, -3.75F, -1.25F);
        bipedHeadGear.addChild(bipedHeadGearMic);
        setRotationAngle(bipedHeadGearMic, 0.7854F, 0.0F, 0.0F);
        bipedHeadGearMic.cubeList.add(new ModelBox(bipedHeadGearMic, 90, 2, -6.0F, 0.0F, -2.0F, 1, 1, 5, -0.1F, false));

        ModelRenderer bipedBodyHarness = new ModelRenderer(this);
        bipedBodyHarness.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyHarness);
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -3.0F, -20.75F, -2.5F, 6, 6, 1, 0.0F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -3.0F, -20.75F, 1.5F, 6, 6, 1, 0.0F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -2.5F, -21.75F, -2.5F, 5, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -2.5F, -21.75F, 1.5F, 5, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 93, -2.5F, -21.5F, 1.75F, 5, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 93, -2.5F, -20.25F, 1.0F, 5, 2, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 99, 40, -1.5F, -20.25F, 1.25F, 3, 2, 2, -0.6F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 26, 25, -2.5F, -24.75F, 1.5F, 5, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 28, 104, -4.0F, -14.0F, -2.5F, 8, 1, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 28, 104, -4.0F, -14.0F, 1.5F, 8, 1, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, 0.0F, -18.5F, -2.5F, 4, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, 0.0F, -18.5F, 1.5F, 4, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 77, 89, 1.75F, -19.0F, -2.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 77, 89, 1.75F, -19.0F, 1.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, 2.0F, -15.0F, -2.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, 2.0F, -15.0F, 1.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, 0.5F, -15.0F, 1.0F, 2, 3, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, -2.5F, -15.0F, 1.0F, 2, 3, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, -4.0F, -15.0F, 1.0F, 2, 3, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 87, 102, -4.0F, -15.25F, 1.25F, 2, 2, 2, -0.5F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 87, 102, -2.5F, -15.0F, 1.25F, 2, 3, 2, -0.6F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, -1.0F, -14.0F, 1.0F, 2, 2, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, 1.0F, -19.25F, 1.25F, 2, 3, 2, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 93, 106, 1.0F, -19.25F, 1.75F, 2, 3, 2, -0.6F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 6, 95, 2.0F, -20.75F, 2.25F, 1, 3, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, -4.0F, -15.0F, -2.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 90, 102, -4.0F, -15.75F, -2.75F, 2, 3, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 90, 102, 2.0F, -15.75F, -2.75F, 2, 3, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, -2.5F, -15.0F, -3.0F, 2, 3, 2, -0.5F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 8, 22, 0.5F, -15.0F, -3.0F, 2, 3, 2, -0.5F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 94, 0.5F, -15.5F, -3.0F, 2, 3, 2, -0.6F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 88, 94, -2.5F, -15.5F, -3.0F, 2, 3, 2, -0.6F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 82, 94, -3.75F, -19.0F, -2.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 82, 94, -3.75F, -19.0F, 1.75F, 2, 3, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 2, 76, -4.75F, -20.0F, -4.5F, 6, 5, 5, -1.9F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 38, 20, 0.25F, -19.25F, -3.0F, 3, 2, 2, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 61, 77, -3.0F, -24.75F, -0.75F, 6, 5, 5, -2.0F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 52, 118, -4.75F, -21.25F, -4.5F, 6, 5, 5, -1.9F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -4.0F, -18.5F, -2.5F, 4, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -4.25F, -18.5F, -2.5F, 1, 2, 5, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 59, 97, -4.25F, -14.0F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 46, 98, -1.75F, -14.0F, -3.25F, 2, 3, 3, -0.7F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 59, 97, 3.25F, -14.0F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, 3.25F, -18.5F, -2.5F, 1, 2, 5, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 46, 98, -0.25F, -14.0F, -3.25F, 2, 3, 3, -0.7F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 59, -4.0F, -18.5F, 1.5F, 4, 2, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 31, 99, -0.5F, -17.5F, -2.75F, 1, 4, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 31, 99, -0.5F, -21.5F, 1.75F, 1, 8, 1, 0.0F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 98, 97, -1.0F, -18.25F, -3.25F, 2, 2, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 98, 97, 1.0F, -18.75F, -3.0F, 1, 2, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 98, 97, 1.75F, -18.75F, -3.0F, 1, 2, 1, -0.3F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 58, 103, 1.0F, -18.75F, -3.25F, 1, 2, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 58, 103, 1.75F, -18.75F, -3.25F, 1, 2, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 40, -1.0F, -17.0F, -3.25F, 2, 1, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 89, 40, -1.0F, -16.75F, -3.25F, 2, 1, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 98, 97, -1.0F, -14.75F, -3.0F, 2, 2, 1, -0.4F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 43, 96, -1.0F, -18.25F, -3.75F, 2, 2, 2, -0.7F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -4.25F, -12.25F, -2.5F, 3, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -4.25F, -12.25F, 1.5F, 3, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, 1.25F, -12.25F, 1.5F, 3, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -2.5F, -12.75F, 1.5F, 5, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, 1.25F, -12.25F, -2.5F, 3, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, 3.25F, -12.25F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -4.25F, -12.25F, -2.5F, 1, 1, 5, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -1.5F, -13.25F, -2.5F, 3, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, 0.5F, -12.75F, -2.5F, 2, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 100, 67, -2.5F, -12.75F, -2.5F, 2, 1, 1, -0.2F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 95, 40, -1.75F, -21.25F, 2.0F, 1, 1, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 95, 40, -0.5F, -14.0F, 1.75F, 1, 1, 1, -0.1F, false));
        bipedBodyHarness.cubeList.add(new ModelBox(bipedBodyHarness, 95, 40, 0.75F, -21.25F, 2.0F, 1, 1, 1, -0.1F, false));

        ModelRenderer BipedBodyHarnessStrap1 = new ModelRenderer(this);
        BipedBodyHarnessStrap1.setRotationPoint(9.0F, -18.75F, 1.0F);
        bipedBodyHarness.addChild(BipedBodyHarnessStrap1);
        setRotationAngle(BipedBodyHarnessStrap1, 0.0F, 0.0F, 0.3491F);
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 8, 93, -8.2903F, -2.9784F, -3.75F, 1, 8, 2, -0.1F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 80, 94, -8.3258F, -2.9299F, -3.5F, 1, 4, 2, 0.1F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 80, 94, -8.3258F, -2.9299F, -0.5F, 1, 4, 2, 0.1F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 98, 74, -8.0909F, -2.0154F, -3.75F, 1, 1, 1, 0.0F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 91, 37, -8.261F, 0.4409F, -4.0F, 1, 1, 1, -0.2F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 32, 25, -9.1161F, -2.9083F, -4.25F, 1, 3, 3, -0.2F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 32, 25, -9.1161F, -2.9083F, -2.0F, 1, 3, 3, -0.2F, false));
        BipedBodyHarnessStrap1.cubeList.add(new ModelBox(BipedBodyHarnessStrap1, 83, 89, -8.4122F, -3.091F, -2.5F, 1, 1, 4, 0.0F, false));

        ModelRenderer BipedBodyHarnessStrap2 = new ModelRenderer(this);
        BipedBodyHarnessStrap2.setRotationPoint(9.75F, -20.0F, 0.5F);
        bipedBodyHarness.addChild(BipedBodyHarnessStrap2);
        setRotationAngle(BipedBodyHarnessStrap2, 0.0F, 0.0F, -0.3491F);
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 21, 101, -10.8949F, -8.3492F, -3.25F, 1, 8, 2, -0.1F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 76, 89, -10.8949F, -8.3492F, -3.0F, 1, 4, 2, 0.1F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 76, 89, -10.8949F, -8.3492F, 0.0F, 1, 4, 2, 0.1F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 32, 23, -10.1902F, -8.0927F, -3.75F, 1, 3, 3, -0.2F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 32, 23, -10.1902F, -8.0927F, -1.5F, 1, 3, 3, -0.2F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 83, 93, -10.7588F, -8.5426F, -2.0F, 1, 1, 4, 0.0F, false));
        BipedBodyHarnessStrap2.cubeList.add(new ModelBox(BipedBodyHarnessStrap2, 98, 42, -10.8668F, -4.5912F, -3.5F, 1, 1, 1, -0.2F, false));

        ModelRenderer bipedRightArmPouch = new ModelRenderer(this);
        bipedRightArmPouch.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmPouch);
        bipedRightArmPouch.cubeList.add(new ModelBox(bipedRightArmPouch, 64, 92, -8.5F, -23.25F, -1.0F, 1, 3, 2, -0.2F, false));
        bipedRightArmPouch.cubeList.add(new ModelBox(bipedRightArmPouch, 121, 51, -8.75F, -23.0F, -1.0F, 1, 2, 2, -0.4F, false));

        ModelRenderer bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 64, 60, 3.5F, -21.75F, -2.5F, 5, 4, 5, -0.4F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 54, 88, 4.25F, -17.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 54, 88, 3.75F, -17.75F, -2.5F, 1, 3, 5, -0.2F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 104, 10, 3.25F, -17.75F, -2.5F, 2, 3, 5, -0.6F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 54, 90, 4.25F, -16.25F, -2.5F, 4, 1, 5, -0.1F, false));

        ModelRenderer bipedRightLegKneePad = new ModelRenderer(this);
        bipedRightLegKneePad.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegKneePad);
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 64, 91, -3.5F, -8.0F, -2.75F, 3, 3, 1, -0.7F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -5.0F, -8.0F, -3.0F, 6, 3, 6, -0.9F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -4.75F, -11.0F, -3.0F, 5, 2, 6, -0.6F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -5.25F, -11.5F, -1.5F, 2, 4, 3, -0.7F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -5.0F, -12.0F, -2.0F, 2, 4, 3, -0.8F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -1.5F, -10.75F, -3.0F, 2, 2, 6, -0.7F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 104, 36, -1.75F, -11.5F, -3.0F, 2, 2, 6, -0.7F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -2.25F, -13.5F, 1.25F, 2, 4, 2, -0.7F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 92, 102, -3.5F, -8.5F, -2.75F, 3, 4, 2, -0.5F, false));
        bipedRightLegKneePad.cubeList.add(new ModelBox(bipedRightLegKneePad, 46, 98, -2.0F, -13.5F, -3.25F, 2, 4, 2, -0.7F, false));

        ModelRenderer bipedLeftLegKneePad = new ModelRenderer(this);
        bipedLeftLegKneePad.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegKneePad);
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 92, 102, 0.5F, -8.5F, -2.75F, 3, 4, 2, -0.5F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 104, 36, -0.25F, -11.5F, -3.0F, 2, 2, 6, -0.7F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 64, 91, 0.5F, -8.0F, -2.75F, 3, 3, 1, -0.7F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 46, 98, -1.0F, -8.0F, -3.0F, 6, 3, 6, -0.9F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 46, 98, -0.25F, -11.0F, -3.0F, 5, 2, 6, -0.6F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 46, 98, -0.5F, -10.75F, -3.0F, 2, 2, 6, -0.7F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 46, 98, 0.0F, -13.5F, -3.25F, 2, 4, 2, -0.7F, false));
        bipedLeftLegKneePad.cubeList.add(new ModelBox(bipedLeftLegKneePad, 46, 98, 0.25F, -13.5F, 1.25F, 2, 4, 2, -0.7F, false));
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