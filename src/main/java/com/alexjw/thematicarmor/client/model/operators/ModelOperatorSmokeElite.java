package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorSmokeElite extends ModelBiped {
	private final ModelRenderer bipedHeadStrap2;
	private final ModelRenderer bipedHeadStrap1;
	private final ModelRenderer bipedHeadLenses;
	private final ModelRenderer bipedGasMaskDetail;
	private final ModelRenderer bipedGasMaskDetail2;
	private final ModelRenderer bipedHeadGasMask;
	private final ModelRenderer bipedBodyBack;
	private final ModelRenderer bipedBodyDetailing;
	private final ModelRenderer bipedBodyDetailing2;
	private final ModelRenderer bipedRightLegBandolier;
	private final ModelRenderer bipedRightLegHolsterStrap;
	private final ModelRenderer bipedRightLegHolsterStrap2;

	public ModelOperatorSmokeElite() {
		super(0.1f, 0.0f, 128, 128);
		textureWidth = 128;
		textureHeight = 128;
		this.bipedLeftArm.mirror = false;
		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		this.bipedLeftArm.mirror = false;

		bipedHeadStrap2 = new ModelRenderer(this);
		bipedHeadStrap2.setRotationPoint(4.2F, -6.0F, -1.0F);
		bipedHead.addChild(bipedHeadStrap2);
		setRotationAngle(bipedHeadStrap2, 0.0F, 0.0F, 0.3491F);
		bipedHeadStrap2.cubeList.add(new ModelBox(bipedHeadStrap2, 81, 22, -8.0F, 2.0F, 4.224F, 9, 1, 1, 0.0F, false));

		bipedHeadStrap1 = new ModelRenderer(this);
		bipedHeadStrap1.setRotationPoint(4.2F, -6.0F, -1.0F);
		bipedHead.addChild(bipedHeadStrap1);
		setRotationAngle(bipedHeadStrap1, 0.0F, 0.0F, -0.3491F);
		bipedHeadStrap1.cubeList.add(new ModelBox(bipedHeadStrap1, 76, 21, -8.756F, -1.0F, 4.2144F, 9, 1, 1, 0.0F, false));

		bipedHeadLenses = new ModelRenderer(this);
		bipedHeadLenses.setRotationPoint(3.0F, 21.0F, -5.0F);
		bipedHead.addChild(bipedHeadLenses);
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.175F, -28.0F, 0.6F, 2, 1, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -6.5F, -27.0F, 0.6F, 3, 1, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -2.5F, -27.0F, 0.6F, 3, 1, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 22, 10, -2.0F, -25.975F, 0.35F, 2, 1, 1, -0.15F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 22, 10, -6.0F, -25.925F, 0.35F, 2, 1, 1, -0.15F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -6.5F, -23.625F, 0.6F, 7, 1, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -6.0F, -22.875F, 0.6F, 6, 2, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -4.0F, -26.5F, 0.35F, 2, 5, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -2.95F, -21.75F, -1.9F, 0, 1, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -3.2F, -20.75F, -1.75F, 0, 1, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -4.275F, -19.5F, -1.475F, 1, 0, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -5.15F, -19.35F, -1.275F, 1, 0, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -5.85F, -19.2F, -1.075F, 1, 0, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.6F, -19.425F, -0.775F, 1, 0, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.95F, -19.5F, -0.6F, 1, 0, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.85F, -19.65F, -0.5F, 0, 0, 1, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.65F, -19.9F, 0.225F, 0, 0, 1, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.375F, -20.25F, 1.45F, 0, 0, 1, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.175F, -20.4F, 2.225F, 0, 0, 1, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -5.925F, -22.4F, 2.725F, 0, 2, 0, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 52, 77, -6.55F, -20.075F, 0.8F, 0, 0, 1, 0.175F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -0.85F, -28.0F, 0.6F, 2, 1, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, 0.15F, -26.0F, 0.6F, 1, 3, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.1F, -26.0F, 0.6F, 1, 3, 1, 0.075F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 73, 58, -2.0F, -25.75F, 0.6F, 2, 2, 1, 0.2F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 73, 58, -6.0F, -25.75F, 0.6F, 2, 2, 1, 0.2F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -0.75F, -28.0F, 1.1F, 2, 1, 3, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.25F, -28.0F, 1.375F, 2, 1, 3, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -0.75F, -25.0F, 1.1F, 2, 1, 3, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.25F, -25.0F, 1.25F, 2, 1, 3, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.245F, -25.0F, 4.15F, 1, 1, 5, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -7.2F, -28.0F, 4.175F, 1, 1, 5, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, 0.3F, -28.0F, 4.1F, 1, 1, 5, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, 0.257F, -25.0F, 4.075F, 1, 1, 5, 0.0F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 32, 81, -6.5F, -29.75F, -0.06F, 7, 2, 9, -0.2F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 32, 81, -7.5F, -27.25F, 1.44F, 9, 1, 7, -0.2F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 32, 81, -7.025F, -28.75F, 1.44F, 8, 1, 7, 0.2F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 36, 83, -5.5F, -29.975F, -0.56F, 5, 2, 9, -0.3F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -3.5F, -26.5F, 8.49F, 1, 2, 1, 0.1F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -3.5F, -26.325F, 8.14F, 1, 1, 1, 0.35F, false));
		bipedHeadLenses.cubeList.add(new ModelBox(bipedHeadLenses, 93, 23, -3.5F, -26.5F, 8.44F, 1, 2, 1, 0.1F, false));

		bipedGasMaskDetail = new ModelRenderer(this);
		bipedGasMaskDetail.setRotationPoint(-28.75F, -16.75F, 0.0F);
		bipedHeadLenses.addChild(bipedGasMaskDetail);
		setRotationAngle(bipedGasMaskDetail, 0.0F, 0.0F, 1.2217F);
		bipedGasMaskDetail.cubeList.add(new ModelBox(bipedGasMaskDetail, 85, 8, -1.0F, -30.5F, 0.0F, 1, 3, 1, 0.0F, false));
		bipedGasMaskDetail.cubeList.add(new ModelBox(bipedGasMaskDetail, 85, 8, -1.1278F, -31.6107F, 0.0F, 1, 2, 1, 0.0F, false));

		bipedGasMaskDetail2 = new ModelRenderer(this);
		bipedGasMaskDetail2.setRotationPoint(-32.0F, -36.25F, 0.0F);
		bipedHeadLenses.addChild(bipedGasMaskDetail2);
		setRotationAngle(bipedGasMaskDetail2, 0.0F, 0.0F, 1.9024F);
		bipedGasMaskDetail2.cubeList.add(new ModelBox(bipedGasMaskDetail2, 85, 8, -0.8818F, -30.5407F, 0.0F, 1, 3, 1, 0.0F, false));
		bipedGasMaskDetail2.cubeList.add(new ModelBox(bipedGasMaskDetail2, 85, 8, -1.0453F, -28.4797F, 0.0F, 1, 2, 1, 0.0F, false));

		bipedHeadGasMask = new ModelRenderer(this);
		bipedHeadGasMask.setRotationPoint(0.0F, 24.0F, 11.0F);
		bipedHead.addChild(bipedHeadGasMask);
		setRotationAngle(bipedHeadGasMask, 0.3491F, 0.0F, 0.0F);
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 99, 54, -1.0F, -30.5283F, -6.7462F, 2, 2, 2, 0.0F, false));
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 86, 19, 0.25F, -29.9126F, -6.3403F, 1, 1, 2, 0.0F, false));
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 86, 19, -1.25F, -29.9126F, -6.3403F, 1, 1, 2, 0.0F, false));
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 86, 19, -0.4528F, -31.5077F, -5.7579F, 1, 2, 1, 0.05F, false));
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 101, 63, -1.0F, -30.4777F, -7.8941F, 2, 2, 1, 0.2F, false));
		bipedHeadGasMask.cubeList.add(new ModelBox(bipedHeadGasMask, 86, 19, -0.46F, -30.0837F, -8.4458F, 1, 1, 2, 0.0F, false));


		bipedBodyBack = new ModelRenderer(this);
		bipedBodyBack.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBodyBack);
		bipedBodyBack.cubeList.add(new ModelBox(bipedBodyBack, 31, 98, -6.0F, -26.0F, -0.425F, 12, 16, 4, -2.6F, false));
		bipedBodyBack.cubeList.add(new ModelBox(bipedBodyBack, 2, 95, -3.25F, -26.0F, -6.55F, 12, 13, 10, -5.6F, false));
		bipedBodyBack.cubeList.add(new ModelBox(bipedBodyBack, 2, 91, -3.25F, -25.2F, -6.675F, 12, 10, 10, -5.5F, false));

		bipedBodyDetailing = new ModelRenderer(this);
		bipedBodyDetailing.setRotationPoint(-12.0F, 19.75F, 0.0F);
		bipedBody.addChild(bipedBodyDetailing);
		setRotationAngle(bipedBodyDetailing, 0.0F, 0.0F, 0.7069F);
		bipedBodyDetailing.cubeList.add(new ModelBox(bipedBodyDetailing, 80, 79, -1.7049F, -25.3055F, -2.5F, 1, 9, 1, 0.0F, false));
		bipedBodyDetailing.cubeList.add(new ModelBox(bipedBodyDetailing, 80, 79, -1.7049F, -25.3055F, 1.35F, 1, 9, 1, 0.0F, false));
		bipedBodyDetailing.cubeList.add(new ModelBox(bipedBodyDetailing, 80, 79, -1.7049F, -25.3055F, -2.5F, 1, 1, 5, -0.05F, false));

		bipedBodyDetailing2 = new ModelRenderer(this);
		bipedBodyDetailing2.setRotationPoint(2.0F, 28.25F, 0.0F);
		bipedBody.addChild(bipedBodyDetailing2);
		setRotationAngle(bipedBodyDetailing2, 0.0F, 0.0F, 0.0305F);
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 80, 79, -6.507F, -22.0582F, 1.25F, 2, 1, 1, -0.05F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 80, 79, -6.507F, -22.0582F, -2.5F, 2, 1, 1, -0.05F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 80, 79, -6.7416F, -21.5508F, -2.5F, 2, 2, 1, -0.15F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 84, 28, -6.7416F, -21.5508F, -2.95F, 2, 2, 1, -0.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 86, 32, -6.7459F, -20.8754F, -2.95F, 2, 1, 1, -0.25F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 86, 32, -6.736F, -20.5505F, -2.95F, 2, 1, 1, -0.25F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 80, 79, -7.1567F, -22.0384F, -2.65F, 1, 1, 5, -0.175F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 80, 79, -3.1524F, -26.9606F, -2.375F, 1, 11, 2, -0.175F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 96, 49, -6.8791F, -28.5976F, -2.45F, 2, 5, 5, -0.275F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 96, 49, -7.2234F, -24.5866F, -2.475F, 2, 2, 5, -0.25F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 13, 87, -1.0206F, -26.2268F, -2.8F, 2, 2, 5, -0.55F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 86, 28, -6.943F, -25.5947F, 1.525F, 3, 4, 2, -0.45F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 99, 50, -6.9659F, -25.3444F, 2.025F, 3, 3, 2, -0.75F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -6.9735F, -25.5942F, 2.275F, 3, 3, 2, -1.25F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -6.7237F, -27.6019F, 2.025F, 3, 5, 3, -1.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -7.0117F, -28.8437F, 1.775F, 3, 5, 3, -1.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -7.2883F, -29.7106F, 1.525F, 3, 5, 3, -1.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -7.2883F, -29.7106F, -3.975F, 4, 3, 5, -1.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 39, 81, -7.2929F, -29.8605F, -3.75F, 3, 3, 8, -1.35F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 84, 32, -6.9888F, -27.094F, 1.525F, 3, 4, 2, -0.65F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 6, 76, -5.6193F, -28.9783F, 1.275F, 6, 4, 2, -0.6F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 13, 86, -5.0962F, -28.2134F, 1.275F, 5, 4, 2, -0.7F, false));
		bipedBodyDetailing2.cubeList.add(new ModelBox(bipedBodyDetailing2, 12, 89, -6.1344F, -29.4628F, 1.275F, 7, 4, 2, -0.7F, false));



		bipedRightLegBandolier = new ModelRenderer(this);
		bipedRightLegBandolier.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedRightLeg.addChild(bipedRightLegBandolier);
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 10, -4.0F, -9.0F, 1.1648F, 4, 1, 1, 0.0F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 17, 54, -3.0F, -11.25F, 1.4148F, 2, 2, 1, 0.0F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 36, 55, -3.0F, -12.75F, 1.4148F, 2, 2, 1, -0.2F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 100, 60, -2.0F, -12.75F, 1.6648F, 1, 1, 1, -0.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 100, 60, -2.3F, -12.75F, 1.6648F, 1, 1, 1, -0.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 100, 60, -1.95F, -12.525F, 1.7148F, 1, 1, 1, -0.4F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 42, 83, -2.025F, -12.75F, 1.7898F, 1, 1, 1, -0.425F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 10, -0.7F, -9.0F, -2.0F, 1, 1, 4, 0.025F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 10, -4.525F, -10.0F, -1.0F, 1, 3, 2, 0.0F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 85, 97, -7.025F, -12.25F, -4.0F, 5, 8, 7, -2.8F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 85, 97, -7.025F, -11.5F, -4.0F, 5, 8, 7, -2.9F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 85, 97, -7.525F, -10.75F, -4.0F, 6, 8, 7, -3.2F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 82, 100, -7.95F, -10.5F, -4.0F, 7, 8, 7, -3.3F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 85, 97, -7.425F, -14.0F, -4.25F, 6, 8, 7, -3.3F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 101, -7.425F, -14.75F, -4.0F, 6, 8, 7, -3.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 101, -7.425F, -11.25F, -4.6F, 6, 8, 7, -3.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 84, 101, -7.425F, -12.25F, -4.6F, 6, 7, 7, -3.15F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 82, 103, -7.425F, -15.0F, -4.25F, 6, 7, 8, -3.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 82, 103, -7.425F, -13.0F, -4.5F, 6, 7, 8, -3.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 82, 103, -7.425F, -12.75F, -2.75F, 6, 7, 8, -3.35F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 88, 100, -7.025F, -11.75F, -2.4F, 5, 7, 6, -2.9F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 88, 100, -7.025F, -11.25F, -2.725F, 5, 6, 6, -2.9F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 88, 100, -7.025F, -10.75F, -3.4F, 5, 6, 7, -2.9F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 85, 97, -6.775F, -12.25F, -3.0F, 5, 7, 8, -3.1F, false));
		bipedRightLegBandolier.cubeList.add(new ModelBox(bipedRightLegBandolier, 81, 99, -7.525F, -12.25F, -1.75F, 6, 7, 8, -3.2F, false));

		bipedRightLegHolsterStrap = new ModelRenderer(this);
		bipedRightLegHolsterStrap.setRotationPoint(0.0F, -7.0F, -1.16F);
		bipedRightLegBandolier.addChild(bipedRightLegHolsterStrap);
		setRotationAngle(bipedRightLegHolsterStrap, 0.4363F, 0.0F, 0.0F);
		bipedRightLegHolsterStrap.cubeList.add(new ModelBox(bipedRightLegHolsterStrap, 84, 10, -4.2F, -5.0F, 2.0F, 1, 5, 1, 0.0F, false));

		bipedRightLegHolsterStrap2 = new ModelRenderer(this);
		bipedRightLegHolsterStrap2.setRotationPoint(0.675F, -13.15F, -4.835F);
		bipedRightLegBandolier.addChild(bipedRightLegHolsterStrap2);
		setRotationAngle(bipedRightLegHolsterStrap2, -0.0524F, 0.0F, -1.4792F);
		bipedRightLegHolsterStrap2.cubeList.add(new ModelBox(bipedRightLegHolsterStrap2, 84, 10, -5.1692F, -4.7804F, 2.5122F, 1, 4, 1, 0.0F, false));


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