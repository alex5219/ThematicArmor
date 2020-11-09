package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorMozzie extends ModelBiped {
	private final ModelRenderer bipedHeadHelmet;
	private final ModelRenderer bipedHeadHelmetSunglasses;
	private final ModelRenderer bipedHeadHelmetAntenna;
	private final ModelRenderer bipedHeadHelmetAntenna2;
	private final ModelRenderer bipedHeadHelmetAntenna3;
	private final ModelRenderer bipedHeadHelmetVisor;
	private final ModelRenderer bipedBodyVest;
	private final ModelRenderer bipedBodyVestWalkie;
	private final ModelRenderer bipedBodyVestGPS;
	private final ModelRenderer bipedBodyVestGPS2;
	private final ModelRenderer bipedRightArmDetail;
	private final ModelRenderer bipedLeftArmDetail;
	private final ModelRenderer bipedRightLegHolster;
	private final ModelRenderer bipedLeftLegStraps;
	private final ModelRenderer bipedLeftLegStraps2;

	public ModelOperatorMozzie() {
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
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 87, 8, 3.45F, -30.75F, -4.25F, 1, 4, 8, 0.0F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 84, 8, -4.05F, -32.0F, -4.0F, 8, 2, 8, 0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 10, -4.05F, -31.925F, 3.25F, 8, 7, 1, 0.225F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 8, 3.3F, -28.45F, -4.25F, 1, 4, 8, -0.05F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 86, 9, -4.25F, -28.5F, -4.25F, 1, 4, 8, -0.05F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 88, 8, -4.425F, -30.75F, -4.25F, 1, 4, 8, 0.0F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 93, 12, -1.0F, -27.5F, -5.0F, 2, 4, 2, -0.1F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 111, 12, -1.5F, -27.25F, -4.75F, 3, 2, 2, -0.1F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 112, 11, -1.0F, -27.5F, -5.325F, 2, 4, 2, -0.325F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 113, 20, -0.75F, -27.5F, -5.0F, 2, 4, 2, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 72, 18, -1.25F, -27.5F, -5.0F, 2, 4, 2, -0.2F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 85, 13, -4.0F, -27.375F, -4.75F, 8, 4, 2, -0.4F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 87, 11, -4.0F, -31.75F, -4.75F, 8, 3, 2, -0.35F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 71, 48, -2.5F, -30.5107F, -6.1915F, 5, 1, 3, -0.1F, false));

		bipedHeadHelmetSunglasses = new ModelRenderer(this);
		bipedHeadHelmetSunglasses.setRotationPoint(2.0F, -25.0F, -4.5F);
		bipedHeadHelmet.addChild(bipedHeadHelmetSunglasses);
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 111, 32, 0.0F, -4.0F, 0.0F, 1, 2, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -5.0F, -4.0F, 0.0F, 1, 2, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.0F, -3.85F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.15F, -4.175F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.875F, -4.175F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.5F, -4.2F, 0.0F, 1, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.5F, -4.2F, 0.0F, 1, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -4.825F, -4.2F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.175F, -4.2F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, 0.325F, -3.7F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -6.175F, -3.7F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 112, 45, -1.425F, -3.775F, 0.25F, 2, 1, 2, -0.1F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 112, 45, -4.425F, -3.775F, 0.25F, 2, 1, 2, -0.1F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 112, 45, -1.425F, -3.275F, 0.25F, 2, 1, 2, -0.2F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 112, 45, -4.575F, -3.275F, 0.25F, 2, 1, 2, -0.2F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -4.825F, -2.825F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.075F, -2.825F, 0.0F, 2, 1, 2, -0.325F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -2.025F, -3.85F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -2.275F, -3.85F, 0.0F, 1, 1, 2, -0.35F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -2.525F, -4.0F, 0.0F, 1, 1, 2, -0.375F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -2.775F, -3.85F, 0.0F, 1, 1, 2, -0.35F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.0F, -4.275F, -0.15F, 2, 1, 2, -0.425F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.1F, -3.475F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.275F, -3.1F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.825F, -3.1F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -3.575F, -2.95F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.425F, -2.95F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -0.375F, -2.95F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -4.625F, -2.95F, 0.0F, 1, 1, 2, -0.3F, false));
		bipedHeadHelmetSunglasses.cubeList.add(new ModelBox(bipedHeadHelmetSunglasses, 109, 34, -1.925F, -3.475F, 0.0F, 1, 1, 2, -0.3F, false));

		bipedHeadHelmetAntenna = new ModelRenderer(this);
		bipedHeadHelmetAntenna.setRotationPoint(-0.5F, -31.75F, -4.5F);
		bipedHeadHelmet.addChild(bipedHeadHelmetAntenna);
		setRotationAngle(bipedHeadHelmetAntenna, -0.2618F, 0.0F, 0.0F);
		bipedHeadHelmetAntenna.cubeList.add(new ModelBox(bipedHeadHelmetAntenna, 103, 45, 4.5F, 0.0F, 5.0F, 1, 2, 2, -0.05F, false));
		bipedHeadHelmetAntenna.cubeList.add(new ModelBox(bipedHeadHelmetAntenna, 103, 45, 4.2F, 0.7175F, 5.6064F, 2, 2, 2, -0.5F, false));

		bipedHeadHelmetAntenna2 = new ModelRenderer(this);
		bipedHeadHelmetAntenna2.setRotationPoint(-0.5F, -33.25F, -4.25F);
		bipedHeadHelmet.addChild(bipedHeadHelmetAntenna2);
		setRotationAngle(bipedHeadHelmetAntenna2, -0.2618F, 0.0F, 0.0F);
		bipedHeadHelmetAntenna2.cubeList.add(new ModelBox(bipedHeadHelmetAntenna2, 103, 45, 4.5F, 0.0F, 6.0F, 1, 2, 1, -0.1F, false));

		bipedHeadHelmetAntenna3 = new ModelRenderer(this);
		bipedHeadHelmetAntenna3.setRotationPoint(-0.5F, -34.5F, -3.9F);
		bipedHeadHelmet.addChild(bipedHeadHelmetAntenna3);
		setRotationAngle(bipedHeadHelmetAntenna3, -0.2618F, 0.0F, 0.0F);
		bipedHeadHelmetAntenna3.cubeList.add(new ModelBox(bipedHeadHelmetAntenna3, 103, 45, 4.5F, -1.0F, 6.0F, 1, 3, 1, -0.2F, false));

		bipedHeadHelmetVisor = new ModelRenderer(this);
		bipedHeadHelmetVisor.setRotationPoint(-0.5F, -30.75F, -5.5F);
		bipedHeadHelmet.addChild(bipedHeadHelmetVisor);
		setRotationAngle(bipedHeadHelmetVisor, -0.8727F, 0.0F, 0.0F);
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 71, 48, -3.0F, -3.1607F, -0.1915F, 7, 4, 3, -0.75F, false));
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 71, 48, -4.575F, -3.5437F, 0.1299F, 10, 4, 3, -0.675F, false));
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 105, 47, -4.575F, 0.1831F, 4.1824F, 2, 4, 2, -0.675F, false));
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 75, 46, -2.0F, -2.4821F, -0.5745F, 5, 3, 3, -0.75F, false));
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 106, 48, -4.5F, 2.4871F, 4.1558F, 3, 2, 2, -0.75F, false));
		bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 106, 48, -3.25F, 2.4871F, 4.1558F, 2, 2, 2, -0.65F, false));

		bipedBodyVest = new ModelRenderer(this);
		bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBodyVest);
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -3.5F, -24.0F, -2.25F, 2, 3, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 12, -2.75F, -24.25F, -2.75F, 0, 3, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -3.5F, -24.0F, 2.0F, 2, 3, 0, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, 1.5F, -24.0F, 2.0F, 2, 3, 0, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -3.0F, -21.5F, -2.25F, 6, 7, 1, 0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -3.0F, -21.5F, 1.0F, 6, 7, 1, 0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 60, -1.0F, -22.0F, 2.0F, 2, 7, 1, 0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 60, -3.0F, -23.0F, 2.0F, 1, 2, 1, 0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 60, -3.375F, -21.625F, 1.975F, 1, 1, 1, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 49, -3.425F, -23.075F, 2.075F, 1, 2, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 49, -3.225F, -24.225F, 2.525F, 0, 2, 0, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 49, -2.725F, -23.725F, 2.675F, 0, 2, 0, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 60, 2.0F, -23.0F, 2.0F, 1, 2, 1, 0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 90, 58, -1.0F, -19.0F, 2.5F, 2, 4, 1, 0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 78, 61, -2.0F, -21.75F, 1.75F, 4, 3, 1, 0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 10, -2.0F, -20.0F, -3.0F, 4, 2, 1, 0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 76, -4.0F, -13.5F, -2.0F, 8, 1, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 45, -1.0F, -13.5F, -2.25F, 2, 1, 1, 0.225F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 109, 50, -1.5F, -20.25F, -3.5F, 3, 1, 1, -0.3F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -1.5F, -20.25F, -3.725F, 3, 1, 1, -0.4F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 55, 40, -2.0F, -20.275F, -4.25F, 4, 3, 3, -1.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.6F, -20.05F, -4.175F, 2, 2, 2, -0.9F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.6F, -19.85F, -4.15F, 2, 2, 2, -0.9F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.6F, -19.775F, -4.175F, 2, 2, 2, -0.9F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.75F, -19.925F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.85F, -19.925F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.475F, -19.925F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -1.475F, -20.075F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -1.475F, -19.775F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -1.225F, -19.525F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -0.825F, -19.775F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -0.375F, -20.025F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 67, -0.225F, -19.525F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 66, -1.725F, -20.075F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 59, 66, -1.725F, -19.775F, -4.15F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 58, 56, -1.325F, -19.925F, -4.175F, 2, 2, 2, -0.925F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 10, -2.25F, -17.0F, -3.0F, 1, 2, 1, 0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 29, -3.75F, -17.0F, -2.75F, 1, 2, 1, -0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 47, -0.375F, -17.225F, -3.5F, 1, 1, 1, -0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 47, -2.5F, -17.225F, -3.6F, 1, 1, 1, -0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 47, -2.75F, -16.625F, -3.6F, 2, 2, 1, -0.375F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 60, 67, -2.0F, -17.225F, -3.6F, 1, 1, 1, -0.275F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 60, 67, -2.5F, -17.225F, -3.8F, 1, 1, 1, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 32, 20, -4.25F, -17.0F, -3.25F, 2, 1, 2, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 32, 20, -4.25F, -16.0F, -3.25F, 2, 1, 2, -0.35F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 10, -0.5F, -17.0F, -3.0F, 1, 2, 1, 0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 10, 1.25F, -17.0F, -3.0F, 1, 2, 1, 0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -4.0F, -17.75F, -2.25F, 8, 3, 4, 0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 72, 21, -4.0F, -17.75F, 1.0F, 8, 3, 1, 0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, 1.5F, -24.0F, -2.25F, 2, 3, 4, 0.15F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 35, 0.75F, -24.25F, -2.75F, 1, 3, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 17, 1.5F, -24.75F, -2.75F, 1, 3, 1, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 48, 17, -2.5F, -24.75F, -2.75F, 1, 3, 1, -0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 33, -2.0F, -24.5F, -2.75F, 4, 3, 1, 0.025F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 37, 0.4F, -23.75F, -3.0F, 1, 3, 1, -0.075F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 85, 38, -0.575F, -22.575F, -3.0F, 1, 2, 1, 0.1F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 82, 36, -1.475F, -23.75F, -3.0F, 1, 3, 1, -0.175F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 84, 33, -1.75F, -24.25F, -2.75F, 1, 3, 1, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 78, 27, -2.0F, -24.5F, -1.75F, 4, 2, 4, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 35, -1.5F, -24.0F, 1.75F, 3, 1, 1, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 43, 21, -1.125F, -15.75F, 3.25F, 0, 1, 0, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 35, -0.05F, -21.75F, 3.25F, 0, 3, 0, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 44, 22, -0.05F, -21.75F, 3.25F, 0, 0, 0, 0.45F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 36, 22, 1.0F, -15.75F, 3.25F, 0, 1, 0, 0.25F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, 0.75F, -24.25F, -2.0F, 2, 1, 4, 0.05F, false));
		bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 74, 15, -2.75F, -24.25F, -2.0F, 2, 1, 4, 0.05F, false));

		bipedBodyVestWalkie = new ModelRenderer(this);
		bipedBodyVestWalkie.setRotationPoint(-2.0F, -27.25F, 3.25F);
		bipedBodyVest.addChild(bipedBodyVestWalkie);
		setRotationAngle(bipedBodyVestWalkie, 0.0F, 0.0F, -0.5236F);
		bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 108, 48, -0.9509F, 7.365F, -6.5F, 1, 1, 1, -0.05F, false));
		bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 108, 48, -4.1249F, 9.8625F, -6.75F, 1, 1, 1, -0.15F, false));
		bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 110, 64, -4.1249F, 9.8625F, -7.0F, 1, 1, 1, -0.275F, false));
		bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 108, 48, -0.667F, 7.6732F, -6.5F, 1, 1, 1, -0.2F, false));

		bipedBodyVestGPS = new ModelRenderer(this);
		bipedBodyVestGPS.setRotationPoint(-2.0F, -27.25F, -2.75F);
		bipedBodyVest.addChild(bipedBodyVestGPS);
		setRotationAngle(bipedBodyVestGPS, 0.0F, 0.0F, 0.1745F);

		bipedBodyVestGPS2 = new ModelRenderer(this);
		bipedBodyVestGPS2.setRotationPoint(-2.125F, -26.65F, -2.8F);
		bipedBodyVest.addChild(bipedBodyVestGPS2);
		setRotationAngle(bipedBodyVestGPS2, 0.0F, 0.0F, 0.1745F);
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 111, 65, 5.0622F, 2.5F, 0.0F, 1, 1, 1, -0.05F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 111, 65, 5.1133F, 1.913F, 0.05F, 1, 1, 1, 0.05F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 115, 44, 5.1012F, 2.7216F, -0.4F, 1, 1, 1, -0.35F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 115, 44, 5.1101F, 1.9077F, -0.175F, 1, 1, 1, -0.125F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 83, 47, 5.1216F, 1.8295F, -0.325F, 1, 1, 1, -0.2F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 115, 44, 5.5083F, 1.8628F, -0.375F, 1, 2, 2, -0.4F, false));
		bipedBodyVestGPS2.cubeList.add(new ModelBox(bipedBodyVestGPS2, 115, 44, 4.6988F, 1.8787F, -0.375F, 1, 2, 2, -0.4F, false));

		bipedRightArmDetail = new ModelRenderer(this);
		bipedRightArmDetail.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArmDetail);
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 77, 33, -8.0F, -16.5F, -2.0F, 4, 1, 4, 0.2F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 79, 34, -7.0F, -18.25F, -0.25F, 2, 1, 2, 0.275F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 72, 27, -8.0F, -17.75F, -2.0F, 4, 0, 4, 0.325F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 108, 64, -8.15F, -23.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 109, 49, -8.35F, -23.0F, -1.0F, 1, 2, 2, -0.1F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 83, 48, -8.65F, -23.0F, -0.5F, 1, 2, 1, -0.3F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 109, 62, -8.675F, -22.75F, -0.9F, 1, 1, 1, -0.3F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 109, 62, -8.7F, -22.75F, -0.15F, 1, 1, 1, -0.3F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 109, 62, -8.675F, -23.0F, -1.1F, 1, 1, 1, -0.325F, false));
		bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 109, 62, -8.725F, -23.0F, 0.075F, 1, 1, 1, -0.325F, false));

		bipedLeftArmDetail = new ModelRenderer(this);
		bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArmDetail);
		bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 77, 33, 4.0F, -16.5F, -2.0F, 4, 1, 4, 0.2F, false));
		bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 79, 34, 5.0F, -18.25F, 0.0F, 2, 1, 2, 0.275F, false));
		bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 72, 27, 4.0F, -17.75F, -2.0F, 4, 0, 4, 0.325F, false));

		bipedRightLegHolster = new ModelRenderer(this);
		bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedRightLeg.addChild(bipedRightLegHolster);
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 105, 50, -4.25F, -10.0F, -2.5F, 4, 1, 5, 0.0F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 75, 74, -4.25F, -5.75F, -2.525F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 75, 74, -4.25F, -7.25F, -2.525F, 4, 1, 5, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 105, 50, -4.5F, -10.5F, -1.5F, 1, 2, 3, 0.0F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 105, 50, -4.5F, -11.75F, -1.0F, 1, 2, 2, 0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 105, 50, -4.5F, -13.25F, -0.5F, 1, 2, 1, -0.1F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 74, 31, -0.575F, -5.75F, -2.525F, 1, 1, 5, -0.075F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 74, 31, -0.575F, -7.25F, -2.525F, 1, 1, 5, -0.075F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 74, 31, -2.75F, -7.5F, -2.725F, 2, 3, 1, -0.225F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 78, 75, -2.75F, -7.5F, -2.275F, 2, 3, 1, 0.025F, false));
		bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 79, 73, -2.95F, -4.35F, -2.525F, 2, 4, 1, -0.075F, false));

		bipedLeftLegStraps = new ModelRenderer(this);
		bipedLeftLegStraps.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedLeftLeg.addChild(bipedLeftLegStraps);
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 101, 48, 0.1F, -9.75F, -2.525F, 4, 1, 5, 0.0F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 78, 75, 1.0F, -7.5F, -2.275F, 2, 3, 1, 0.025F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 75, 76, 0.25F, -5.75F, -2.525F, 4, 1, 5, -0.1F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 75, 76, 0.25F, -7.25F, -2.525F, 4, 1, 5, -0.1F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 74, 31, -0.25F, -5.75F, -2.525F, 1, 1, 5, -0.075F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 74, 31, -0.25F, -7.25F, -2.525F, 1, 1, 5, -0.075F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 74, 31, 1.0F, -7.5F, -2.7F, 2, 3, 1, -0.225F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 79, 73, 0.9F, -4.35F, -2.525F, 2, 4, 1, -0.075F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 82, 32, 3.35F, -11.75F, -1.025F, 1, 3, 2, 0.025F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 84, 32, 3.35F, -10.75F, -0.475F, 1, 3, 1, 0.1F, false));
		bipedLeftLegStraps.cubeList.add(new ModelBox(bipedLeftLegStraps, 92, 30, 3.275F, -13.25F, -0.475F, 1, 3, 1, 0.05F, false));

		bipedLeftLegStraps2 = new ModelRenderer(this);
		bipedLeftLegStraps2.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedLeftLegStraps.addChild(bipedLeftLegStraps2);
		setRotationAngle(bipedLeftLegStraps2, 0.0F, 0.0F, -0.0873F);
		bipedLeftLegStraps2.cubeList.add(new ModelBox(bipedLeftLegStraps2, 101, 48, 0.0564F, -11.2519F, -2.525F, 4, 1, 5, 0.0F, false));
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