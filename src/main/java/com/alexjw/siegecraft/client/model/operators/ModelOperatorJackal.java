package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorJackal extends ModelBiped {
    private final ModelRenderer bipedHeadHelmet;
    private final ModelRenderer bipedHeadHelmetBattery;
    private final ModelRenderer bipedHeadHelmetStrap2;
    private final ModelRenderer bipedHeadHelmetStrap4;
    private final ModelRenderer bipedHeadHelmetStrap;
    private final ModelRenderer bipedHeadHelmetStrap5;
    private final ModelRenderer bipedHeadHelmetStrap6;
    private final ModelRenderer bipedHeadHelmetStrap3;
    private final ModelRenderer bipedBodyVest;
    private final ModelRenderer bipedBodyVestSlant1;
    private final ModelRenderer bipedBodyVestSlant2;
    private final ModelRenderer bipedRightArmStraps;
    private final ModelRenderer bipedLeftArmStraps;
    private final ModelRenderer bipedRightLegStrap2;
    private final ModelRenderer bipedRightLegStrap;
    private final ModelRenderer bipedLeftLegStrap2;
    private final ModelRenderer bipedLeftLegStrap;

    public ModelOperatorJackal() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        bipedHeadHelmet = new ModelRenderer(this);
        bipedHeadHelmet.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadHelmet);
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -1.0F, -24.75F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -4.5F, -31.25F, -4.5F, 9, 2, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 82, -4.5F, -30.0F, -4.25F, 9, 3, 2, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 82, -3.75F, -27.25F, -4.25F, 3, 1, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 82, 0.75F, -27.25F, -4.25F, 3, 1, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -4.5F, -31.25F, 2.75F, 9, 2, 2, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -3.5F, -30.0F, 3.5F, 7, 2, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -2.5F, -28.25F, 3.5F, 5, 1, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -2.5F, -29.5F, 3.75F, 5, 1, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, 3.75F, -31.25F, -4.0F, 1, 2, 8, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 51, -1.0F, -32.5F, -4.25F, 2, 2, 8, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 53, -4.5F, -32.5F, -1.0F, 9, 2, 2, -0.3F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 53, -5.0F, -33.0F, -4.0F, 10, 3, 2, -0.7F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -3.75F, -32.75F, -4.5F, 1, 1, 9, -0.3F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, 2.75F, -32.75F, -4.5F, 1, 1, 9, -0.3F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 52, -1.0F, -32.5F, 3.25F, 2, 2, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 120, 24, 3.75F, -29.75F, -2.75F, 1, 3, 3, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 110, 3.0F, -28.5F, -2.75F, 2, 2, 3, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 110, 2.75F, -28.5F, -1.0F, 2, 2, 2, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 110, -4.75F, -28.5F, -1.0F, 2, 2, 2, -0.3F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 21, 2.75F, -30.0F, -1.0F, 2, 2, 2, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 21, -4.75F, -30.0F, -1.0F, 2, 2, 2, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 110, -5.0F, -28.5F, -2.75F, 2, 2, 3, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 105, 18, -5.0F, -30.25F, -2.75F, 2, 2, 3, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 105, 18, 3.0F, -30.25F, -2.75F, 2, 2, 3, -0.2F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 120, 24, -4.75F, -29.75F, -2.75F, 1, 3, 3, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 2, -4.75F, -31.25F, -4.0F, 1, 2, 8, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 103, 60, -1.0F, -31.0F, -4.75F, 2, 2, 1, -0.1F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 103, 43, -1.5F, -31.5F, -5.0F, 2, 2, 1, -0.7F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 103, 43, -1.5F, -30.5F, -5.0F, 2, 2, 1, -0.7F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 103, 43, -0.5F, -31.5F, -5.0F, 2, 2, 1, -0.7F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 103, 43, -0.5F, -30.5F, -5.0F, 2, 2, 1, -0.7F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 76, 55, -1.0F, -31.0F, -5.25F, 2, 2, 1, -0.6F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 96, 21, -1.0F, -31.0F, -5.25F, 2, 2, 1, -0.8F, false));

        bipedHeadHelmetBattery = new ModelRenderer(this);
        bipedHeadHelmetBattery.setRotationPoint(0.0F, -36.0F, -6.25F);
        bipedHeadHelmet.addChild(bipedHeadHelmetBattery);
        setRotationAngle(bipedHeadHelmetBattery, -0.5236F, 0.0F, 0.0F);
        bipedHeadHelmetBattery.cubeList.add(new ModelBox(bipedHeadHelmetBattery, 96, 25, -1.6F, -1.5335F, 11.125F, 3, 1, 1, 0.1F, false));

        bipedHeadHelmetStrap2 = new ModelRenderer(this);
        bipedHeadHelmetStrap2.setRotationPoint(1.5F, -24.0F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap2);
        setRotationAngle(bipedHeadHelmetStrap2, 0.0F, 0.0F, 0.0873F);
        bipedHeadHelmetStrap2.cubeList.add(new ModelBox(bipedHeadHelmetStrap2, 102, 16, -6.0F, -0.5F, 0.0F, 4, 1, 1, -0.3F, false));

        bipedHeadHelmetStrap4 = new ModelRenderer(this);
        bipedHeadHelmetStrap4.setRotationPoint(1.75F, -30.25F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap4);
        setRotationAngle(bipedHeadHelmetStrap4, 0.0F, 0.0F, 0.4363F);
        bipedHeadHelmetStrap4.cubeList.add(new ModelBox(bipedHeadHelmetStrap4, 102, 16, -5.8037F, -0.3157F, 0.0F, 4, 1, 1, -0.3F, false));
        bipedHeadHelmetStrap4.cubeList.add(new ModelBox(bipedHeadHelmetStrap4, 102, 16, -5.8098F, -0.0922F, 8.0F, 4, 1, 1, -0.3F, false));

        bipedHeadHelmetStrap = new ModelRenderer(this);
        bipedHeadHelmetStrap.setRotationPoint(-0.5F, -24.25F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap);
        setRotationAngle(bipedHeadHelmetStrap, 0.0F, 0.0F, -0.0873F);
        bipedHeadHelmetStrap.cubeList.add(new ModelBox(bipedHeadHelmetStrap, 106, 18, 0.8737F, -0.3254F, 0.0F, 4, 1, 1, -0.3F, false));

        bipedHeadHelmetStrap5 = new ModelRenderer(this);
        bipedHeadHelmetStrap5.setRotationPoint(2.5F, -24.25F, -4.25F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap5);
        setRotationAngle(bipedHeadHelmetStrap5, 0.9599F, 0.0873F, -0.0873F);
        bipedHeadHelmetStrap5.cubeList.add(new ModelBox(bipedHeadHelmetStrap5, 106, 18, 0.8737F, -0.3254F, 0.0F, 1, 1, 5, -0.3F, false));
        bipedHeadHelmetStrap5.cubeList.add(new ModelBox(bipedHeadHelmetStrap5, 106, 18, 0.6768F, 2.1378F, 4.7651F, 1, 1, 5, -0.3F, false));

        bipedHeadHelmetStrap6 = new ModelRenderer(this);
        bipedHeadHelmetStrap6.setRotationPoint(-5.25F, -24.25F, -4.25F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap6);
        setRotationAngle(bipedHeadHelmetStrap6, 0.9599F, 0.0873F, -0.0873F);
        bipedHeadHelmetStrap6.cubeList.add(new ModelBox(bipedHeadHelmetStrap6, 106, 18, 0.6986F, 1.9338F, 4.6223F, 1, 1, 5, -0.3F, false));
        bipedHeadHelmetStrap6.cubeList.add(new ModelBox(bipedHeadHelmetStrap6, 106, 18, 0.8737F, -0.3254F, 0.0F, 1, 1, 5, -0.3F, false));

        bipedHeadHelmetStrap3 = new ModelRenderer(this);
        bipedHeadHelmetStrap3.setRotationPoint(-0.75F, -30.75F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetStrap3);
        setRotationAngle(bipedHeadHelmetStrap3, 0.0F, 0.0F, -0.4363F);
        bipedHeadHelmetStrap3.cubeList.add(new ModelBox(bipedHeadHelmetStrap3, 106, 18, 0.4962F, -0.2256F, 0.0F, 4, 1, 1, -0.3F, false));
        bipedHeadHelmetStrap3.cubeList.add(new ModelBox(bipedHeadHelmetStrap3, 106, 18, 0.608F, -0.2287F, 8.0F, 4, 1, 1, -0.3F, false));

        bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -4.0F, -21.5F, -2.5F, 8, 9, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, 2.75F, -21.0F, -1.5F, 1, 8, 3, 0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -3.75F, -21.0F, -1.5F, 1, 8, 3, 0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 6, -4.0F, -21.5F, 1.5F, 8, 9, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 83, 25, -4.0F, -21.5F, 1.25F, 8, 3, 2, -0.5F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 21, -3.5F, -20.0F, 1.25F, 7, 3, 2, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 53, -3.5F, -16.5F, 1.75F, 7, 4, 2, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 4, -3.5F, -16.75F, 2.0F, 7, 3, 2, -0.7F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 33, -4.0F, -17.75F, 1.25F, 8, 2, 2, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, 2.0F, -24.25F, -2.5F, 2, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, 2.0F, -24.25F, 1.25F, 2, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -4.0F, -24.25F, 1.25F, 2, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -4.25F, -24.25F, -1.5F, 2, 3, 3, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, 2.25F, -24.25F, -1.5F, 2, 3, 3, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, 0.25F, -22.25F, 1.5F, 1, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -1.0F, -22.5F, 1.5F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -1.25F, -22.25F, 1.5F, 1, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 29, 17, 0.25F, -21.5F, -3.25F, 2, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 77, 0.75F, -19.25F, -3.0F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 66, -1.0F, -20.75F, -3.0F, 2, 9, 1, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 66, -4.5F, -13.5F, -2.75F, 9, 2, 1, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 66, -4.5F, -13.5F, 1.0F, 9, 2, 2, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 0, 123, -1.5F, -23.0F, -2.5F, 3, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 28, 22, 1.25F, -24.5F, -2.75F, 2, 1, 5, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 28, 22, -3.25F, -24.5F, -2.75F, 2, 1, 5, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 39, 22, -3.0F, -24.5F, 0.75F, 6, 2, 2, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 29, 16, -2.25F, -21.5F, -3.25F, 2, 2, 1, -0.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 37, -4.25F, -19.0F, -3.0F, 4, 2, 1, -0.6F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 52, -0.25F, -21.0F, -2.75F, 5, 3, 1, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, -4.5F, -17.75F, -3.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, -4.5F, -17.0F, 1.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, 1.5F, -17.0F, 1.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, -3.0F, -17.75F, -3.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, -0.25F, -17.75F, -3.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 61, 1.5F, -17.75F, -3.5F, 3, 4, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, -3.0F, -17.75F, -3.75F, 3, 3, 2, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, -0.25F, -17.75F, -3.75F, 3, 3, 2, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, 1.5F, -17.75F, -3.75F, 3, 3, 2, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 67, 56, 2.0F, -17.0F, -2.75F, 2, 2, 1, -0.8F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, -4.5F, -17.75F, -3.75F, 3, 3, 2, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, -4.5F, -17.0F, 1.75F, 3, 3, 2, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 117, 1, 1.5F, -17.0F, 1.75F, 3, 3, 2, -0.9F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 8, -4.0F, -24.25F, -2.5F, 2, 3, 1, 0.0F, false));

        bipedBodyVestSlant1 = new ModelRenderer(this);
        bipedBodyVestSlant1.setRotationPoint(-3.0F, -14.0F, -2.5F);
        bipedBodyVest.addChild(bipedBodyVestSlant1);
        setRotationAngle(bipedBodyVestSlant1, 0.0F, 0.0F, 0.2618F);
        bipedBodyVestSlant1.cubeList.add(new ModelBox(bipedBodyVestSlant1, 34, 24, 1.4589F, -11.0913F, -0.25F, 2, 5, 1, 0.0F, false));
        bipedBodyVestSlant1.cubeList.add(new ModelBox(bipedBodyVestSlant1, 84, 51, 3.3907F, -11.6089F, -0.5F, 1, 6, 1, -0.1F, false));

        bipedBodyVestSlant2 = new ModelRenderer(this);
        bipedBodyVestSlant2.setRotationPoint(0.25F, -13.5F, -2.5F);
        bipedBodyVest.addChild(bipedBodyVestSlant2);
        setRotationAngle(bipedBodyVestSlant2, 0.0F, 0.0F, -0.2618F);
        bipedBodyVestSlant2.cubeList.add(new ModelBox(bipedBodyVestSlant2, 32, 22, -0.6886F, -10.8603F, -0.25F, 2, 5, 1, 0.0F, false));

        bipedRightArmStraps = new ModelRenderer(this);
        bipedRightArmStraps.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmStraps);
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 110, 3, -8.25F, -18.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 110, 3, -7.75F, -18.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 110, 3, -8.25F, -20.25F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 86, 52, -7.5F, -20.5F, 1.75F, 3, 3, 1, -0.2F, false));
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 85, 26, -7.0F, -20.0F, 2.0F, 2, 2, 1, -0.1F, false));
        bipedRightArmStraps.cubeList.add(new ModelBox(bipedRightArmStraps, 110, 3, -7.75F, -20.25F, -2.5F, 4, 1, 5, -0.1F, false));

        bipedLeftArmStraps = new ModelRenderer(this);
        bipedLeftArmStraps.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmStraps);
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 85, 26, 5.0F, -20.0F, 2.0F, 2, 2, 1, -0.1F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 86, 52, 4.5F, -20.5F, 1.75F, 3, 3, 1, -0.2F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 110, 3, 4.25F, -20.25F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 74, 70, 7.25F, -23.75F, -2.0F, 1, 3, 4, -0.9F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 110, 3, 3.75F, -20.25F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 110, 3, 4.25F, -18.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftArmStraps.cubeList.add(new ModelBox(bipedLeftArmStraps, 110, 3, 3.75F, -18.5F, -2.5F, 4, 1, 5, -0.1F, false));

        bipedRightLegStrap2 = new ModelRenderer(this);
        bipedRightLegStrap2.setRotationPoint(8.65F, 8.25F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegStrap2);
        setRotationAngle(bipedRightLegStrap2, 0.0F, 0.0F, -0.7854F);
        bipedRightLegStrap2.cubeList.add(new ModelBox(bipedRightLegStrap2, 86, 4, -1.0F, -13.75F, -2.25F, 1, 4, 1, 0.0F, false));
        bipedRightLegStrap2.cubeList.add(new ModelBox(bipedRightLegStrap2, 86, 4, -1.0F, -13.75F, 1.25F, 1, 4, 1, 0.0F, false));

        bipedRightLegStrap = new ModelRenderer(this);
        bipedRightLegStrap.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegStrap);
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.25F, -9.75F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -0.75F, -9.75F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -0.75F, -8.25F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.25F, -12.75F, 0.0F, 1, 3, 1, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.5F, -10.25F, -1.25F, 1, 3, 3, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.75F, -9.75F, -0.75F, 1, 3, 2, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -1.0F, -9.75F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -0.75F, -10.75F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -1.0F, -10.75F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.25F, -8.25F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -4.25F, -8.25F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightLegStrap.cubeList.add(new ModelBox(bipedRightLegStrap, 110, 3, -1.0F, -8.25F, -2.5F, 1, 1, 5, -0.1F, false));

        bipedLeftLegStrap2 = new ModelRenderer(this);
        bipedLeftLegStrap2.setRotationPoint(-8.9F, 8.25F, 0.75F);
        bipedLeftLeg.addChild(bipedLeftLegStrap2);
        setRotationAngle(bipedLeftLegStrap2, 0.0F, 0.0F, 0.7854F);
        bipedLeftLegStrap2.cubeList.add(new ModelBox(bipedLeftLegStrap2, 86, 2, 0.1464F, -14.0F, -3.0F, 1, 4, 1, 0.0F, false));
        bipedLeftLegStrap2.cubeList.add(new ModelBox(bipedLeftLegStrap2, 86, 2, 0.5F, -14.0F, 0.5F, 1, 4, 1, 0.0F, false));

        bipedLeftLegStrap = new ModelRenderer(this);
        bipedLeftLegStrap.setRotationPoint(2.6F, 12.75F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegStrap);
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -1.0F, -13.5F, 0.0F, 1, 3, 1, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.25F, -9.0F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.25F, -10.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.75F, -10.5F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.25F, -9.0F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.25F, -10.5F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.75F, -9.0F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.5F, -11.5F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 110, 3, -4.75F, -11.5F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 116, 54, -1.0F, -12.25F, -1.5F, 1, 3, 3, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 86, 24, -0.5F, -12.5F, -1.5F, 1, 2, 3, -0.2F, false));
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