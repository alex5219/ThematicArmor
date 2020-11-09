package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorMute extends ModelBiped {

    public ModelOperatorMute() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        ModelRenderer bipedHeadStrap2 = new ModelRenderer(this);
        bipedHeadStrap2.setRotationPoint(4.2F, -6.0F, -1.0F);
        bipedHead.addChild(bipedHeadStrap2);
        setRotationAngle(bipedHeadStrap2, 0.0F, 0.0F, 0.3491F);
        bipedHeadStrap2.cubeList.add(new ModelBox(bipedHeadStrap2, 92, 56, -8.0F, 2.0F, 4.224F, 9, 1, 1, 0.0F, false));

        ModelRenderer bipedHeadTape1 = new ModelRenderer(this);
        bipedHeadTape1.setRotationPoint(-17.5F, 17.25F, 0.75F);
        bipedHead.addChild(bipedHeadTape1);
        setRotationAngle(bipedHeadTape1, 0.0F, 0.0F, 0.7854F);
        bipedHeadTape1.cubeList.add(new ModelBox(bipedHeadTape1, 96, 104, -1.0F, -26.75F, -6.0F, 1, 3, 1, -0.2F, false));

        ModelRenderer bipedHeadTape2 = new ModelRenderer(this);
        bipedHeadTape2.setRotationPoint(18.25F, 16.75F, 0.75F);
        bipedHead.addChild(bipedHeadTape2);
        setRotationAngle(bipedHeadTape2, 0.0F, 0.0F, -0.7854F);
        bipedHeadTape2.cubeList.add(new ModelBox(bipedHeadTape2, 96, 110, -0.8554F, -26.9562F, -6.0F, 1, 3, 1, -0.225F, false));

        ModelRenderer bipedHeadStrap1 = new ModelRenderer(this);
        bipedHeadStrap1.setRotationPoint(4.2F, -6.0F, -1.0F);
        bipedHead.addChild(bipedHeadStrap1);
        setRotationAngle(bipedHeadStrap1, 0.0F, 0.0F, -0.3491F);
        bipedHeadStrap1.cubeList.add(new ModelBox(bipedHeadStrap1, 94, 56, -8.756F, -1.0F, 4.2144F, 9, 1, 1, 0.0F, false));

        ModelRenderer bipedHeadLenses = new ModelRenderer(this);
        bipedHeadLenses.setRotationPoint(3.0F, 21.0F, -5.0F);
        bipedHead.addChild(bipedHeadLenses);
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -2.0F, -26.0F, 0.35F, 2, 2, 1, 0.1F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 34, 100, -4.0F, -23.0F, 0.35F, 2, 2, 1, 0.2F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 34, 100, -3.5F, -24.25F, 0.1F, 1, 2, 1, -0.1F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 40, 102, -3.5F, -21.5F, -0.15F, 1, 1, 1, -0.2F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -1.5F, -26.0F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -6.5F, -26.0F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -6.0F, -25.5F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -5.5F, -26.0F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -2.0F, -25.5F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -2.5F, -26.0F, 0.35F, 2, 2, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 101, 56, -4.0F, -25.75F, 0.35F, 2, 1, 1, 0.2F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 7, 8, -7.0F, -28.0F, 0.6F, 8, 7, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 7, 8, -7.0F, -28.0F, 0.6F, 8, 7, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 10, 8, -7.0F, -29.0F, 0.6F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 11, 8, -1.0F, -29.0F, 0.6F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 12, 14, -0.75F, -28.0F, 3.1F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 5, 11, -7.25F, -28.0F, 3.1F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 14, 6, -0.75F, -25.0F, 3.1F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 8, 7, -7.25F, -25.0F, 3.1F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 11, 8, 0.25F, -28.75F, 1.35F, 1, 8, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 11, 8, -7.25F, -28.75F, 1.35F, 1, 8, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 11, 8, 0.25F, -28.0F, 2.1F, 1, 5, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 11, 8, -7.25F, -28.0F, 2.1F, 1, 5, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -2.5F, -26.5F, 0.1F, 3, 3, 1, -0.4F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -6.5F, -26.5F, 0.1F, 3, 3, 1, -0.4F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -6.5F, -26.75F, 0.1F, 7, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -7.0F, -26.5F, 0.1F, 8, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -7.0F, -25.5F, 0.1F, 4, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -6.5F, -25.0F, 0.1F, 3, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -2.5F, -25.0F, 0.1F, 3, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -3.0F, -25.5F, 0.1F, 4, 2, 1, -0.3F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 87, 98, -4.5F, -26.0F, 0.1F, 3, 2, 1, -0.4F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 103, 57, -6.0F, -26.0F, 0.35F, 2, 2, 1, 0.1F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 103, 57, -4.0F, -26.0F, 0.35F, 2, 1, 1, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 105, 56, -7.12F, -25.0F, 4.0F, 1, 1, 5, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 103, 58, -7.2F, -28.0F, 4.0F, 1, 1, 5, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 102, 54, 0.2F, -28.0F, 4.0F, 1, 1, 5, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 102, 57, 0.182F, -25.0F, 4.0F, 1, 1, 5, 0.0F, false));
        bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 106, 56, -4.0F, -27.0F, 8.44F, 2, 2, 1, 0.0F, false));

        ModelRenderer bipedHeadGasMask = new ModelRenderer(this);
        bipedHeadGasMask.setRotationPoint(-6.25F, 24.75F, 8.75F);
        bipedHead.addChild(bipedHeadGasMask);
        setRotationAngle(bipedHeadGasMask, 0.3491F, -0.6109F, 0.0F);
        bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 30, 98, -1.0F, -30.5283F, -6.7462F, 2, 2, 2, 0.0F, false));
        bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 98, 59, -0.7657F, -30.4876F, -8.0717F, 2, 2, 1, 0.3F, false));

        ModelRenderer bipedHeadGasMask2 = new ModelRenderer(this);
        bipedHeadGasMask2.setRotationPoint(8.75F, 24.75F, 1.5F);
        bipedHead.addChild(bipedHeadGasMask2);
        setRotationAngle(bipedHeadGasMask2, 0.3491F, 0.6109F, 0.0F);
        bipedHeadGasMask2.cubeList.add(new ModelBox(bipedHeadGasMask2, 30, 98, -7.205F, -28.9798F, -2.4921F, 2, 2, 2, 0.0F, false));
        bipedHeadGasMask2.cubeList.add(new ModelBox(bipedHeadGasMask2, 105, 59, -7.3803F, -28.8409F, -3.5481F, 2, 2, 1, 0.3F, false));

        ModelRenderer bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 3.0F, -3.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 26, 95, -4.0F, -1.0F, 0.6F, 8, 9, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 39, 101, 2.0F, -3.0F, 0.78F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 42, 101, -4.0F, -3.0F, 0.78F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 38, 100, -4.0F, -3.04F, 1.0F, 2, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 30, 100, 2.0F, -3.04F, 1.0F, 2, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 58, -1.6F, 4.35F, 0.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 58, -4.0256F, 8.0F, 0.2797F, 8, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 54, -0.506F, -1.0F, 0.36F, 1, 9, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 57, -3.104F, 0.0F, 5.0F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 55, 0.3F, 0.0F, 5.0F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 88, -3.7F, 4.0F, 0.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 88, -3.7F, 4.75F, 0.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 88, -3.7F, 5.5F, 0.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 92, 2.05F, 3.5F, 5.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 92, 2.05F, 4.25F, 5.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 92, 2.05F, 5.0F, 5.0F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 96, -4.28F, 0.0F, 1.2F, 1, 7, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 97, 3.4F, 0.0F, 1.2F, 1, 7, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 112, 57, 1.2F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 101, 1.2F, 0.0F, -0.25F, 1, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 101, -1.55F, 4.25F, -0.25F, 1, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 101, 2.45F, 0.0F, -0.25F, 1, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 101, 1.2F, 4.0F, -0.25F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 103, 56, 2.48F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 61, 1.24F, 4.0F, 0.0F, 2, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 58, -3.5F, 3.25F, 5.0F, 2, 3, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 56, 97, -3.5F, 3.25F, 5.25F, 2, 3, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 55, 101, -1.5F, 3.25F, 5.25F, 2, 3, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 57, 0.5F, 3.5F, 4.25F, 2, 3, 2, -0.375F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 57, 2.5F, 3.25F, 4.25F, 1, 3, 2, -0.275F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 57, 0.5F, 3.25F, 4.5F, 2, 2, 2, -0.35F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 102, -1.75F, 3.5F, 5.0F, 1, 2, 1, -0.275F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 102, -3.75F, 3.5F, 5.0F, 1, 2, 1, -0.275F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 58, -1.5F, 3.25F, 5.0F, 2, 3, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 38, 102, -4.0F, -3.0F, 4.32F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 28, 95, -4.0F, -1.0F, 4.6F, 8, 8, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 37, 99, 2.0F, -3.0F, 4.3392F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 59, -3.25F, 3.68F, -0.25F, 1, 3, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 59, -3.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        ModelRenderer bipedBodyVestWalkieTalkie = new ModelRenderer(this);
        bipedBodyVestWalkieTalkie.setRotationPoint(0.0F, 2.0F, -2.0F);
        bipedBody.addChild(bipedBodyVestWalkieTalkie);
        setRotationAngle(bipedBodyVestWalkieTalkie, 0.0F, 0.0F, 0.4363F);
        bipedBodyVestWalkieTalkie.cubeList.add(new ModelBox(bipedBodyVestWalkieTalkie, 104, 56, 2.0F, -2.44F, -0.44F, 1, 2, 1, 0.0F, false));
        bipedBodyVestWalkieTalkie.cubeList.add(new ModelBox(bipedBodyVestWalkieTalkie, 104, 56, 2.804F, -3.452F, -0.44F, 0, 2, 1, -0.2F, false));

        ModelRenderer bipedRightArmFlag = new ModelRenderer(this);
        bipedRightArmFlag.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmFlag);
        bipedRightArmFlag.cubeList.add(new ModelBox(bipedRightArmFlag, 0, 0, -8.2128F, -23.0F, -1.3502F, 1, 2, 3, -0.2F, false));

        ModelRenderer bipedRightLegBandolier = new ModelRenderer(this);
        bipedRightLegBandolier.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegBandolier);
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 109, 78, -4.28F, -9.0F, -2.16F, 4, 1, 4, 0.0F, false));
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 110, 76, -4.0F, -9.0F, 1.1648F, 4, 1, 1, 0.0F, false));
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 87, 58, -2.098F, -9.52F, -2.4108F, 1, 2, 1, 0.0F, false));
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 91, 56, -3.44F, -9.56F, -2.4F, 1, 2, 1, 0.0F, false));
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 112, 82, -0.7F, -9.0F, -2.0F, 1, 1, 4, 0.0F, false));
        bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 99, 58, -4.6F, -10.0F, -1.0F, 1, 3, 2, 0.0F, false));

        ModelRenderer bipedRightLegStrap = new ModelRenderer(this);
        bipedRightLegStrap.setRotationPoint(0.0F, -9.0F, -3.0F);
        bipedRightLegBandolier.addChild(bipedRightLegStrap);
        setRotationAngle(bipedRightLegStrap, 0.0F, 0.0F, -0.6109F);
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 109, 88, -1.0F, -5.0F, 0.858F, 1, 5, 1, 0.0F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 108, 82, -1.0F, -5.0F, 4.12F, 1, 5, 1, 0.0F, false));

        ModelRenderer bipedRightLegHolsterStrap = new ModelRenderer(this);
        bipedRightLegHolsterStrap.setRotationPoint(0.0F, -7.0F, -1.16F);
        bipedRightLegBandolier.addChild(bipedRightLegHolsterStrap);
        setRotationAngle(bipedRightLegHolsterStrap, 0.4363F, 0.0F, 0.0F);
        bipedRightLegHolsterStrap.cubeList.add(new ModelBox(bipedRightLegHolsterStrap, 111, 83, -4.2F, -5.0F, 2.0F, 1, 5, 1, 0.0F, false));

        ModelRenderer bipedLeftLegStrap = new ModelRenderer(this);
        bipedLeftLegStrap.setRotationPoint(6.1F, 8.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegStrap);
        setRotationAngle(bipedLeftLegStrap, 0.0F, 0.0F, -1.0472F);
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 106, 83, 0.3F, -9.0F, -2.16F, 5, 1, 1, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 111, 80, 0.3301F, -8.6962F, 1.12F, 5, 1, 1, 0.0F, false));

        ModelRenderer bipedLeftLegPouch = new ModelRenderer(this);
        bipedLeftLegPouch.setRotationPoint(6.1F, 8.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegPouch);
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 26, 54, -6.64F, -4.0F, -2.22F, 2, 3, 1, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 115, 81, -7.878F, -5.0F, -2.2032F, 1, 1, 1, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 113, 85, -7.92F, -5.0F, 1.28F, 2, 1, 1, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 110, 84, -8.33F, -5.0F, -2.0F, 1, 1, 4, 0.0F, false));
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