package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorThermite extends ModelBiped {

	public ModelOperatorThermite() {
		super(0.1f, 0.0f, 128, 128);
		textureWidth = 128;
		textureHeight = 128;
		this.bipedLeftArm.mirror = false;
		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		this.bipedLeftArm.mirror = false;

		ModelRenderer bipedHeadHelmet = new ModelRenderer(this);
		bipedHeadHelmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.bipedHead.addChild(bipedHeadHelmet);
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 99, -2.75F, -29.0F, -4.5F, 2, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 55, 82, 0.75F, -29.0F, -4.5F, 2, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 0.75F, -29.0F, -4.25F, 2, 2, 1, -0.1F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 2.0F, -29.0F, -4.75F, 1, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -1.5F, -29.0F, -4.75F, 1, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 0.5F, -29.0F, -4.75F, 1, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -3.0F, -29.0F, -4.75F, 1, 2, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 0.75F, -27.75F, -4.75F, 2, 1, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -2.75F, -27.75F, -4.75F, 2, 1, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 0.75F, -29.25F, -4.75F, 2, 1, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -2.75F, -29.25F, -4.75F, 2, 1, 1, -0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -0.5F, -28.25F, -4.0F, 1, 0, 1, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 0.75F, -28.0F, -4.0F, 0, 0, 1, 0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 2.75F, -28.25F, -4.0F, 0, 0, 1, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -2.75F, -28.25F, -4.0F, 0, 0, 1, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -0.75F, -28.0F, -4.0F, 0, 0, 1, 0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -1.0F, -24.25F, -4.0F, 2, 0, 0, 0.4F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 2.75F, -28.0F, -4.0F, 1, 0, 1, 0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -3.75F, -28.0F, -4.0F, 1, 0, 1, 0.3F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, -4.0F, -28.0F, -4.0F, 0, 0, 1, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 18, 4.0F, -28.0F, -4.0F, 0, 0, 1, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 95, 22, -2.75F, -29.0F, -4.25F, 2, 2, 1, -0.1F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 109, 61, -4.5F, -32.25F, -4.5F, 9, 3, 9, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 97, 22, -4.5F, -30.0F, -4.5F, 9, 1, 2, -0.1F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 97, 22, -4.5F, -29.5F, -4.0F, 9, 2, 1, -0.175F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 97, 22, -4.5F, -28.25F, -3.5F, 9, 2, 1, -0.175F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 97, 22, -4.5F, -27.25F, -3.0F, 9, 2, 1, -0.175F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 97, 22, -4.5F, -26.25F, -2.5F, 9, 1, 7, -0.175F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 96, 63, -4.5F, -29.75F, -2.5F, 9, 4, 7, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 98, 68, -4.5F, -29.75F, -3.0F, 9, 3, 1, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 69, -4.5F, -29.75F, -3.5F, 9, 2, 1, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 71, -4.5F, -25.75F, -4.25F, 1, 1, 2, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 71, 3.5F, -25.75F, -4.25F, 1, 1, 2, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 71, 3.5F, -26.0F, -3.25F, 1, 1, 2, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 71, -4.5F, -26.0F, -3.25F, 1, 1, 2, -0.2F, false));

		ModelRenderer bipedHeadHelmetStrap1 = new ModelRenderer(this);
		bipedHeadHelmetStrap1.setRotationPoint(-2.5F, -25.0F, -4.5F);
		bipedHeadHelmet.addChild(bipedHeadHelmetStrap1);
		setRotationAngle(bipedHeadHelmetStrap1, 0.0F, 0.0F, -0.3491F);
		bipedHeadHelmetStrap1.cubeList.add(new ModelBox(bipedHeadHelmetStrap1, 92, 78, 2.7651F, 1.4145F, 0.0F, 4, 1, 1, -0.2F, false));

		ModelRenderer bipedHeadHelmetStrap2 = new ModelRenderer(this);
		bipedHeadHelmetStrap2.setRotationPoint(-3.75F, -26.25F, -4.5F);
		bipedHeadHelmet.addChild(bipedHeadHelmetStrap2);
		setRotationAngle(bipedHeadHelmetStrap2, 0.0F, 0.0F, 0.3491F);
		bipedHeadHelmetStrap2.cubeList.add(new ModelBox(bipedHeadHelmetStrap2, 92, 78, -0.3492F, 0.4739F, 0.0F, 4, 1, 1, -0.2F, false));

		ModelRenderer bipedBodyVest = new ModelRenderer(this);
		bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.bipedBody.addChild(bipedBodyVest);
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 55, -4.0F, -23.0F, -2.5F, 8, 9, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 55, -4.0F, -23.0F, 1.25F, 8, 9, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 54, -4.0F, -21.0F, -2.25F, 1, 7, 4, 0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 54, 3.0F, -21.0F, -2.25F, 1, 7, 4, 0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 60, 1.0F, -24.0F, -2.5F, 3, 1, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 60, 1.0F, -24.0F, 1.25F, 3, 1, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 61, 71, 2.75F, -21.75F, 1.75F, 1, 2, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 122, 54, 2.75F, -21.75F, 2.0F, 1, 2, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 54, 74, 2.5F, -17.0F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 55, 74, -4.5F, -17.0F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 54, 74, 2.5F, -16.25F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 57, 73, -4.5F, -16.25F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 54, 74, 2.5F, -15.5F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 56, 75, -4.5F, -15.5F, 1.75F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 116, 42, -3.75F, -20.5F, 2.5F, 1, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 64, -4.5F, -19.5F, 2.5F, 1, 2, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 13, 107, -4.5F, -18.5F, 2.5F, 1, 2, 1, -0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 13, 107, -5.25F, -19.25F, 2.5F, 1, 2, 1, -0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 64, -5.0F, -19.5F, 2.5F, 1, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 72, -4.0F, -23.25F, 2.0F, 1, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 116, 42, -1.75F, -18.75F, 2.5F, 1, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 51, 73, 3.0F, -23.25F, 1.75F, 1, 2, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 46, -5.0F, -24.0F, 0.75F, 10, 6, 2, -1.8F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 33, -4.75F, -21.0F, 0.75F, 9, 6, 2, -1.8F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 60, -4.0F, -24.0F, 1.25F, 3, 1, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 94, -3.75F, -24.5F, -2.5F, 1, 1, 5, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 94, -4.0F, -24.0F, 1.75F, 1, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 94, -1.75F, -17.5F, 1.75F, 1, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 40, 94, -4.0F, -19.75F, 1.75F, 1, 3, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 42, 0.75F, -24.25F, -3.0F, 2, 1, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -2.75F, -24.25F, -3.0F, 2, 1, 1, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -3.0F, -24.5F, -2.5F, 2, 1, 4, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -2.5F, -24.5F, 0.5F, 5, 2, 2, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, 1.0F, -24.5F, -2.5F, 2, 1, 4, -0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -2.25F, -23.75F, -3.0F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -4.0F, -21.5F, -3.25F, 2, 3, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 19, 106, -3.75F, -22.75F, -3.0F, 1, 3, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 19, 106, -3.0F, -22.75F, -3.0F, 1, 3, 1, -0.325F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 33, -2.25F, -22.25F, -3.0F, 1, 3, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 19, -1.75F, -22.25F, -3.0F, 1, 3, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 72, -3.0F, -22.75F, -3.0F, 1, 1, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -2.5F, -21.5F, -3.25F, 2, 3, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, 0.5F, -21.5F, -3.25F, 2, 3, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, -4.0F, -18.25F, -3.25F, 2, 3, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 68, -5.25F, -24.5F, -2.75F, 3, 3, 2, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 90, 39, 0.25F, -18.5F, -3.5F, 3, 4, 2, -0.7F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 79, 41, 2.25F, -17.75F, -3.25F, 2, 2, 2, -0.5F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 79, 41, -2.5F, -17.0F, -3.25F, 2, 2, 2, -0.5F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 79, 41, -2.5F, -18.25F, -3.25F, 2, 2, 2, -0.5F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 79, 41, 1.25F, -23.25F, -3.25F, 2, 2, 2, -0.5F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 79, 70, 2.25F, -18.0F, -3.5F, 2, 2, 2, -0.6F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 73, 73, -1.0F, -14.5F, -2.75F, 2, 2, 2, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 77, 59, -2.5F, -18.5F, -3.5F, 2, 2, 2, -0.6F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 77, 59, 1.25F, -23.25F, -3.5F, 2, 2, 2, -0.7F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, 2.0F, -21.5F, -3.25F, 2, 3, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 68, 78, 2.0F, -21.75F, -3.5F, 2, 3, 2, -0.5F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 73, 72, 0.5F, -21.75F, -3.5F, 2, 3, 2, -0.6F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 68, -4.0F, -18.5F, -3.5F, 2, 3, 2, -0.6F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 70, 47, 0.25F, -23.75F, -3.0F, 2, 1, 1, -0.2F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 116, 30, -1.0F, -23.5F, -3.0F, 2, 10, 2, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 4, -4.5F, -14.5F, -2.5F, 9, 2, 5, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 60, -4.0F, -24.0F, -2.5F, 3, 1, 1, 0.0F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 55, -4.0F, -24.25F, -2.0F, 2, 1, 4, 0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 55, 2.0F, -24.25F, -2.0F, 2, 1, 4, 0.1F, false));

		ModelRenderer bipedBodyVestBag = new ModelRenderer(this);
		bipedBodyVestBag.setRotationPoint(1.75F, -20.5F, -3.0F);
		bipedBodyVest.addChild(bipedBodyVestBag);
		setRotationAngle(bipedBodyVestBag, 0.0F, 0.0F, 0.6981F);
		bipedBodyVestBag.cubeList.add(new ModelBox(bipedBodyVestBag, 37, 96, -5.25F, 1.5F, 5.0F, 6, 4, 1, -0.2F, false));

		ModelRenderer bipedBodyVestBag2 = new ModelRenderer(this);
		bipedBodyVestBag2.setRotationPoint(1.75F, -20.5F, -2.75F);
		bipedBodyVest.addChild(bipedBodyVestBag2);
		setRotationAngle(bipedBodyVestBag2, 0.0F, 0.0F, 0.6981F);
		bipedBodyVestBag2.cubeList.add(new ModelBox(bipedBodyVestBag2, 49, 94, -5.2192F, 1.1478F, 4.25F, 6, 3, 2, -0.3F, false));

		ModelRenderer bipedRightArmSleeve = new ModelRenderer(this);
		bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
		this.bipedRightArm.addChild(bipedRightArmSleeve);
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 112, 55, -8.0F, -18.75F, -2.0F, 4, 2, 4, 0.2F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -7.75F, -14.5F, -2.0F, 2, 0, 4, 0.3F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -6.25F, -12.5F, -2.0F, 2, 0, 4, 0.275F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -7.0F, -12.25F, -2.0F, 1, 0, 4, 0.275F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -5.25F, -12.0F, -2.0F, 1, 0, 4, 0.175F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -5.25F, -12.25F, -2.0F, 1, 0, 4, 0.2F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -5.75F, -12.0F, -2.0F, 1, 0, 4, 0.175F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -6.25F, -14.75F, -2.0F, 2, 0, 4, 0.275F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 119, -6.25F, -14.5F, -2.0F, 2, 0, 4, 0.325F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 72, 120, -7.75F, -13.75F, -2.0F, 1, 0, 4, 0.4F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 70, 120, -7.75F, -12.75F, -2.0F, 2, 0, 4, 0.3F, false));
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 6, 79, -7.75F, -24.0F, -2.5F, 1, 4, 5, -1.4F, false));

		ModelRenderer bipedRightArmSleeveBandage1 = new ModelRenderer(this);
		bipedRightArmSleeveBandage1.setRotationPoint(-2.25F, -16.25F, 3.0F);
		bipedRightArmSleeve.addChild(bipedRightArmSleeveBandage1);
		setRotationAngle(bipedRightArmSleeveBandage1, 0.0F, 0.0F, 1.1345F);
		bipedRightArmSleeveBandage1.cubeList.add(new ModelBox(bipedRightArmSleeveBandage1, 75, 118, -0.0314F, 2.7961F, -5.5F, 1, 4, 5, -0.15F, false));

		ModelRenderer bipedRightArmSleeveBandage2 = new ModelRenderer(this);
		bipedRightArmSleeveBandage2.setRotationPoint(-1.5F, -12.25F, 3.0F);
		bipedRightArmSleeve.addChild(bipedRightArmSleeveBandage2);
		setRotationAngle(bipedRightArmSleeveBandage2, 0.0F, 0.0F, 1.9199F);
		bipedRightArmSleeveBandage2.cubeList.add(new ModelBox(bipedRightArmSleeveBandage2, 71, 119, 0.3681F, 2.7588F, -5.5F, 1, 4, 5, -0.175F, false));

		ModelRenderer bipedLeftArmSleeve = new ModelRenderer(this);
		bipedLeftArmSleeve.setRotationPoint(7.25F, 22.0F, 0.0F);
		this.bipedLeftArm.addChild(bipedLeftArmSleeve);
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 98, 67, -8.25F, -18.75F, -2.0F, 4, 2, 4, 0.2F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -6.5F, -12.0F, -2.0F, 1, 0, 4, 0.25F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -8.25F, -12.0F, -2.0F, 1, 0, 4, 0.175F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 72, 120, -5.5F, -13.75F, -2.0F, 1, 0, 4, 0.4F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -7.75F, -12.25F, -2.0F, 1, 0, 4, 0.2F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -7.5F, -12.0F, -2.0F, 1, 0, 4, 0.175F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -8.0F, -12.5F, -2.0F, 2, 0, 4, 0.3F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -6.5F, -14.5F, -2.0F, 2, 0, 4, 0.3F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -8.0F, -14.75F, -2.0F, 2, 0, 4, 0.275F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 119, -8.0F, -14.5F, -2.0F, 2, 0, 4, 0.325F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 120, -6.5F, -13.0F, -2.0F, 2, 0, 4, 0.3F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 70, 120, -6.5F, -12.5F, -2.0F, 2, 0, 4, 0.275F, false));

		ModelRenderer bipedLeftArmSleeveBandage2 = new ModelRenderer(this);
		bipedLeftArmSleeveBandage2.setRotationPoint(-13.75F, -12.25F, 3.0F);
		bipedLeftArmSleeve.addChild(bipedLeftArmSleeveBandage2);
		setRotationAngle(bipedLeftArmSleeveBandage2, 0.0F, 0.0F, 1.9199F);
		bipedLeftArmSleeveBandage2.cubeList.add(new ModelBox(bipedLeftArmSleeveBandage2, 71, 119, -4.6119F, -8.7309F, -5.5F, 1, 4, 5, -0.15F, false));

		ModelRenderer bipedLeftArmSleeveBandage1 = new ModelRenderer(this);
		bipedLeftArmSleeveBandage1.setRotationPoint(-2.5F, -15.75F, 3.0F);
		bipedLeftArmSleeve.addChild(bipedLeftArmSleeveBandage1);
		setRotationAngle(bipedLeftArmSleeveBandage1, 0.0F, 0.0F, 1.1345F);
		bipedLeftArmSleeveBandage1.cubeList.add(new ModelBox(bipedLeftArmSleeveBandage1, 75, 118, 0.1952F, 2.9017F, -5.5F, 1, 4, 5, -0.175F, false));

		ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
		bipedRightLegHolster.setRotationPoint(1.9F, 11.75F, 0.0F);
		this.bipedRightLeg.addChild(bipedRightLegHolster);
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.25F, -8.75F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.25F, -6.0F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.25F, -10.25F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.5F, -10.5F, -1.25F, 1, 3, 3, -0.2F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.75F, -11.25F, -0.75F, 1, 3, 2, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -4.25F, -12.75F, 0.25F, 1, 3, 1, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, 3.25F, -12.75F, -0.5F, 1, 3, 1, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -0.75F, -8.75F, -2.5F, 1, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 71, 68, -0.75F, -10.25F, -2.5F, 1, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 45, 75, -3.0F, -7.0F, -2.75F, 2, 3, 2, -0.3F, false));
		ModelRenderer bipedLeftLegStrap = new ModelRenderer(this);
		bipedLeftLegStrap.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.addChild(bipedLeftLegStrap);
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 71, 68, 0.25F, -9.75F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 71, 68, 0.25F, -6.25F, -2.5F, 4, 1, 5, -0.1F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 45, 75, 1.0F, -7.25F, -2.75F, 2, 3, 2, -0.3F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 71, 68, 2.75F, -10.75F, -1.75F, 2, 2, 4, -0.1F, false));
		bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 71, 68, 3.0F, -11.75F, -1.75F, 2, 2, 4, -0.075F, false));
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