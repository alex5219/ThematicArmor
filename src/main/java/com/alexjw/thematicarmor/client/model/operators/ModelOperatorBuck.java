package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorBuck extends ModelBiped {
	private final ModelRenderer bipedHeadFace;
	private final ModelRenderer bipedHeadFaceEyebrow1;
	private final ModelRenderer bipedHeadFaceEyebrow2;
	private final ModelRenderer bipedHeadHat;
	private final ModelRenderer bipedHeadHat2;
	private final ModelRenderer bipedBodyVest;
	private final ModelRenderer bipedBodyVestWire;
	private final ModelRenderer bipedLeftArmSleeve;
	private final ModelRenderer bipedRightLegHolster;
	private final ModelRenderer bipedLeftLegStrap;
	private final ModelRenderer bipedRightArmSleeve;

	public ModelOperatorBuck() {
		super(0.1f, 0.0f, 128, 128);
		textureWidth = 128;
		textureHeight = 128;
		this.bipedLeftArm.mirror = false;
		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		this.bipedLeftArm.mirror = false;

		bipedHeadFace = new ModelRenderer(this);
		bipedHeadFace.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bipedHeadFace);
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 25, 20, 3.75F, -25.75F, -2.5F, 1, 2, 7, -0.1F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 25, 20, -4.75F, -25.75F, -2.5F, 1, 2, 7, -0.1F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 38, -4.5F, -25.75F, 2.5F, 9, 2, 2, -0.3F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 17, 24, -4.5F, -26.0F, 2.5F, 9, 2, 2, 0.0F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 16, 20, -4.5F, -25.75F, -2.0F, 9, 2, 6, 0.0F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 19, 9, -2.0304F, -26.8027F, -4.5F, 4, 1, 1, -0.2F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 21, 10, -2.0304F, -24.8277F, -4.025F, 4, 1, 1, 0.075F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 19, 9, 1.2196F, -26.0027F, -4.1F, 2, 1, 1, 0.1F, false));
		bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 24, 9, -3.2804F, -26.0027F, -4.1F, 2, 1, 1, 0.1F, false));

		bipedHeadFaceEyebrow1 = new ModelRenderer(this);
		bipedHeadFaceEyebrow1.setRotationPoint(4.0F, -28.425F, -4.5F);
		bipedHeadFace.addChild(bipedHeadFaceEyebrow1);
		setRotationAngle(bipedHeadFaceEyebrow1, 0.0F, 0.0F, -0.0567F);
		bipedHeadFaceEyebrow1.cubeList.add(new ModelBox(bipedHeadFaceEyebrow1, 8, 3, -3.1182F, -0.6848F, 0.225F, 2, 1, 1, -0.1F, false));

		bipedHeadFaceEyebrow2 = new ModelRenderer(this);
		bipedHeadFaceEyebrow2.setRotationPoint(0.0F, -28.0F, -4.5F);
		bipedHeadFace.addChild(bipedHeadFaceEyebrow2);
		setRotationAngle(bipedHeadFaceEyebrow2, 0.0F, 0.0F, 0.0873F);
		bipedHeadFaceEyebrow2.cubeList.add(new ModelBox(bipedHeadFaceEyebrow2, 8, 3, -2.8743F, -0.8358F, 0.275F, 2, 1, 1, -0.1F, false));

		bipedHeadHat = new ModelRenderer(this);
		bipedHeadHat.setRotationPoint(0.0F, 25.5F, -13.0F);
		bipedHead.addChild(bipedHeadHat);
		setRotationAngle(bipedHeadHat, -0.2618F, 0.0F, 0.0F);
		bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 82, 16, -4.0F, -34.7585F, 0.0647F, 8, 3, 9, 0.2F, false));

		bipedHeadHat2 = new ModelRenderer(this);
		bipedHeadHat2.setRotationPoint(0.0F, 30.25F, -5.75F);
		bipedHead.addChild(bipedHeadHat2);
		setRotationAngle(bipedHeadHat2, -0.0873F, 0.0F, 0.0F);
		bipedHeadHat2.cubeList.add(new ModelBox(bipedHeadHat2, 85, 40, -4.0F, -39.1052F, -1.1F, 8, 3, 8, 0.175F, false));

		bipedBodyVest = new ModelRenderer(this);
		bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBodyVest);
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 33, -4.0F, -22.0F, -2.5F, 8, 8, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 16, 3.25F, -22.0F, -2.0F, 1, 8, 4, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 16, -4.25F, -22.0F, -2.0F, 1, 8, 4, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 73, 83, -4.0F, -22.0F, 1.325F, 8, 8, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 101, -3.275F, -22.725F, 1.575F, 6, 6, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 89, 84, -2.75F, -22.0F, 2.325F, 5, 6, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 25, 0.5F, -21.25F, 2.825F, 1, 3, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 25, -3.25F, -21.25F, 1.825F, 6, 1, 2, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 25, -3.25F, -18.5F, 1.875F, 6, 1, 2, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 25, -3.25F, -17.75F, 1.875F, 6, 1, 2, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 28, -2.0F, -21.25F, 2.825F, 1, 3, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 77, -2.25F, -20.325F, 2.325F, 4, 4, 1, 0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 11, 86, -1.5F, -21.775F, -2.925F, 3, 2, 2, -0.125F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 89, 99, -1.525F, -21.775F, -2.725F, 3, 2, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 72, -3.75F, -18.575F, -2.875F, 2, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 70, -1.75F, -18.575F, -2.875F, 2, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 60, -1.75F, -18.825F, -3.125F, 2, 2, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 56, -3.75F, -18.825F, -3.125F, 2, 2, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 99, 30, 0.425F, -17.575F, -2.875F, 2, 2, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 59, 0.425F, -17.075F, -2.875F, 2, 1, 1, -0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 107, 2.175F, -18.325F, -3.125F, 2, 3, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 103, 2.325F, -19.3F, -3.025F, 1, 2, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 99, 2.7F, -20.35F, -3.025F, 1, 2, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 83, 101, 1.625F, -21.475F, -3.1F, 1, 2, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 98, 3.075F, -21.225F, -3.025F, 1, 2, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 99, 3.25F, -23.35F, -2.95F, 1, 3, 2, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 88, 100, 3.075F, -18.875F, -3.025F, 1, 2, 1, -0.375F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 78, 83, 2.175F, -17.325F, -3.625F, 2, 2, 2, -0.525F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 28, 2.175F, -17.575F, -3.875F, 2, 2, 2, -0.625F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 98, 1.175F, -21.825F, -3.425F, 2, 2, 2, -0.625F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 27, -3.5F, -21.55F, -3.325F, 2, 2, 2, -0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 85, -3.5F, -21.8F, -3.425F, 2, 2, 2, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 90, 68, -3.325F, -22.075F, -3.425F, 2, 2, 2, -0.675F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 60, 0.425F, -18.575F, -2.875F, 2, 2, 2, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 46, 1.0F, -24.0F, -2.5F, 3, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 102, -4.5F, -14.0F, -2.5F, 9, 2, 5, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 98, -3.95F, -14.0F, 1.5F, 1, 2, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 77, 83, -3.7F, -14.0F, -2.5F, 2, 2, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 79, -0.95F, -14.0F, -2.5F, 2, 2, 1, -0.225F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 115, 83, 3.05F, -14.0F, -2.5F, 1, 2, 5, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 98, 0.05F, -14.0F, 0.5F, 3, 2, 2, -0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 98, -2.925F, -14.0F, 0.5F, 3, 2, 2, -0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 72, -3.175F, -14.0F, 0.875F, 3, 2, 2, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 72, 0.325F, -14.0F, -2.125F, 3, 2, 5, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 74, -3.75F, -16.75F, 0.6F, 2, 2, 2, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 98, 72, -3.75F, -16.35F, 0.7F, 2, 2, 2, -0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 64, 72, -3.25F, -16.75F, 1.8F, 1, 2, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 64, 78, -3.75F, -16.25F, 1.9F, 2, 1, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 66, -3.75F, -14.25F, -2.75F, 2, 2, 5, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 25, 2.25F, -24.0F, -2.5F, 2, 1, 1, -0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 25, -4.25F, -24.0F, -2.5F, 2, 1, 1, -0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 25, -2.75F, -24.0F, -2.5F, 2, 1, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 25, 0.5F, -24.0F, -2.5F, 2, 1, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 20, 25, -1.0F, -23.25F, -2.5F, 2, 1, 1, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 78, 39, -4.0F, -24.0F, -2.5F, 3, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 16, -4.0F, -24.0F, 1.225F, 8, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 24, 25, -3.5F, -24.75F, 1.725F, 7, 2, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 24, 25, 3.15F, -24.725F, -2.4F, 1, 2, 5, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 24, 25, -3.875F, -24.725F, -2.4F, 1, 2, 5, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.5F, -21.5F, -3.25F, 1, 2, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.5F, -21.325F, -3.25F, 1, 1, 1, -0.225F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.7F, -21.75F, -3.25F, 1, 1, 1, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.125F, -21.25F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, 0.25F, -21.45F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.5F, -22.0F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.525F, -21.7F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.3F, -21.75F, -3.25F, 1, 1, 1, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.275F, -21.0F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -1.3F, -21.425F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.75F, -21.0F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, 0.125F, -21.25F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -0.9F, -21.25F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 75, -1.15F, -21.25F, -3.25F, 1, 1, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 13, 76, -1.25F, -19.25F, 2.625F, 4, 3, 1, -1.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 102, -1.25F, -19.25F, 2.75F, 4, 3, 1, -0.875F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 38, -4.55F, -24.05F, -2.0F, 3, 1, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 38, 1.6F, -24.05F, -2.0F, 3, 1, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 68, -2.25F, -22.75F, 2.375F, 4, 3, 1, -1.1F, false));

		bipedBodyVestWire = new ModelRenderer(this);
		bipedBodyVestWire.setRotationPoint(3.3F, -21.925F, -2.95F);
		bipedBodyVest.addChild(bipedBodyVestWire);
		setRotationAngle(bipedBodyVestWire, 0.0F, 0.0F, -0.6981F);
		bipedBodyVestWire.cubeList.add(new ModelBox(bipedBodyVestWire, 95, 99, -2.6415F, 0.3755F, -0.25F, 1, 3, 1, -0.4F, false));

		bipedLeftArmSleeve = new ModelRenderer(this);
		bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArmSleeve);
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 101, 29, 7.25F, -22.5F, -1.0F, 1, 3, 2, 0.0F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 101, 29, 7.25F, -22.8F, -1.525F, 1, 2, 3, -0.1F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 14, 73, 7.5F, -23.25F, -2.0F, 1, 3, 4, -0.8F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 99, 31, 5.0F, -20.0F, 1.25F, 2, 3, 1, 0.0F, false));

		bipedRightLegHolster = new ModelRenderer(this);
		bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedRightLeg.addChild(bipedRightLegHolster);
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 77, 84, -4.175F, -10.5F, -2.5F, 4, 1, 5, -0.125F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 78, 102, -4.475F, -10.975F, -1.95F, 1, 3, 4, -0.175F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 85, 96, -4.875F, -11.45F, -0.425F, 1, 3, 2, -0.175F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 94, -4.875F, -11.95F, -1.175F, 2, 3, 2, -0.275F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 83, -4.175F, -9.35F, -2.45F, 4, 1, 5, -0.125F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 98, 98, -4.175F, -6.6F, -2.45F, 4, 1, 5, -0.125F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 93, 99, -3.5F, -7.25F, -2.5F, 3, 2, 1, -0.2F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 93, 72, -3.725F, -10.5F, -2.25F, 4, 1, 4, -0.125F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 98, 98, -3.725F, -6.6F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 94, 71, -3.725F, -9.35F, -2.25F, 4, 1, 4, -0.125F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 80, 88, -3.0F, -7.25F, -2.5F, 2, 2, 1, 0.0F, false));

		bipedLeftLegStrap = new ModelRenderer(this);
		bipedLeftLegStrap.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedLeftLeg.addChild(bipedLeftLegStrap);
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 98, 98, 0.15F, -6.6F, -2.45F, 4, 1, 5, -0.125F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 28, 23, 3.325F, -10.35F, -1.375F, 1, 3, 3, -0.25F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 28, 23, 3.45F, -10.55F, -1.4F, 1, 1, 3, -0.175F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 98, 98, 0.025F, -6.6F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 80, 85, 1.0F, -7.25F, -2.5F, 2, 2, 1, 0.0F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 93, 99, 0.5F, -7.25F, -2.5F, 3, 2, 1, -0.2F, false));

		bipedRightArmSleeve = new ModelRenderer(this);
		bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArmSleeve);
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 101, 29, -8.25F, -22.5F, -1.0F, 1, 3, 2, 0.0F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 96, 25, -7.0F, -20.0F, 1.25F, 2, 3, 1, 0.0F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 9, 73, -8.5F, -23.25F, -2.0F, 1, 3, 4, -0.8F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 101, 29, -8.275F, -22.8F, -1.525F, 1, 2, 3, -0.1F, false));
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