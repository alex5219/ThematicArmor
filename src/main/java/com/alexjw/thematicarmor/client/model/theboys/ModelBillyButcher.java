package com.alexjw.thematicarmor.client.model.theboys;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBillyButcher extends ModelBiped {
	private final ModelRenderer bipedHeadHair;
	private final ModelRenderer bipedBodyCoat;
	private final ModelRenderer bipedBosyShirt;
	private final ModelRenderer bipedBosyShirt2;
	private final ModelRenderer bipedBodyCoatFlap1;
	private final ModelRenderer bipedBodyCoatFlap3;
	private final ModelRenderer bipedBodyCoatFlap2;
	private final ModelRenderer bipedBodyCoatFlap4;
	private final ModelRenderer bipedRightArmSleeve;
	private final ModelRenderer bipedLeftArmSleeve;

	public ModelBillyButcher() {
		super(0.1f, 0.0f, 128, 128);
		textureWidth = 128;
		textureHeight = 128;
		this.bipedLeftArm.mirror = false;
		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		this.bipedLeftArm.mirror = false;

		bipedHeadHair = new ModelRenderer(this);
		bipedHeadHair.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bipedHeadHair);
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.05F, -32.375F, -4.675F, 8, 2, 9, 0.1F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.05F, -32.375F, -4.675F, 8, 2, 9, 0.1F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 2.275F, -31.425F, -4.925F, 2, 2, 4, -0.075F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.3F, -31.425F, -4.925F, 1, 2, 6, -0.075F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.55F, -30.425F, -1.675F, 9, 2, 6, -0.1F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.575F, -28.825F, -1.5F, 9, 2, 6, -0.2F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.575F, -27.3F, -1.5F, 9, 1, 6, -0.175F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.575F, -26.9F, -0.5F, 9, 2, 5, -0.2F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -3.575F, -25.9F, -0.5F, 7, 2, 5, -0.25F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 0.95F, -31.175F, -4.925F, 1, 2, 6, -0.075F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -2.975F, -28.875F, -4.275F, 2, 1, 6, -0.05F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 0.975F, -28.9F, -4.25F, 2, 1, 6, -0.05F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 3.25F, -29.675F, -3.175F, 1, 2, 1, -0.075F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.3F, -29.675F, -3.175F, 1, 2, 1, -0.075F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.3F, -27.925F, -3.375F, 1, 2, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 3.2F, -27.925F, -3.375F, 1, 2, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.3F, -26.925F, -4.1F, 1, 2, 1, 0.025F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 3.2F, -26.925F, -4.1F, 1, 2, 1, 0.025F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -4.225F, -25.95F, -4.3F, 3, 2, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, 1.125F, -25.95F, -4.3F, 3, 2, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -1.55F, -24.7F, -4.3F, 3, 1, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -1.55F, -26.7F, -4.3F, 3, 1, 1, 0.0F, false));
		bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 83, 102, -0.55F, -31.675F, -4.925F, 1, 2, 6, -0.075F, false));


		bipedBodyCoat = new ModelRenderer(this);
		bipedBodyCoat.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bipedBodyCoat);
		bipedBodyCoat.cubeList.add(new ModelBox(bipedBodyCoat, 57, 71, -4.25F, 0.0F, -2.0F, 3, 16, 4, 0.3F, false));
		bipedBodyCoat.cubeList.add(new ModelBox(bipedBodyCoat, 57, 71, 1.25F, 0.0F, -2.0F, 3, 16, 4, 0.3F, false));
		bipedBodyCoat.cubeList.add(new ModelBox(bipedBodyCoat, 79, 62, -4.0F, 3.3F, -2.2F, 8, 8, 4, 0.025F, false));
		bipedBodyCoat.cubeList.add(new ModelBox(bipedBodyCoat, 60, 75, -1.5F, -0.15F, 1.1F, 3, 16, 1, 0.225F, false));

		bipedBosyShirt = new ModelRenderer(this);
		bipedBosyShirt.setRotationPoint(1.725F, 0.95F, 2.4F);
		bipedBodyCoat.addChild(bipedBosyShirt);
		setRotationAngle(bipedBosyShirt, 0.0F, 0.0F, 0.2443F);
		bipedBosyShirt.cubeList.add(new ModelBox(bipedBosyShirt, 88, 78, -0.9282F, -1.1392F, -4.6F, 2, 5, 1, 0.0F, false));
		bipedBosyShirt.cubeList.add(new ModelBox(bipedBosyShirt, 87, 81, -1.3514F, 10.464F, -4.6F, 2, 1, 1, 0.05F, false));

		bipedBosyShirt2 = new ModelRenderer(this);
		bipedBosyShirt2.setRotationPoint(-0.375F, 0.05F, 2.4F);
		bipedBodyCoat.addChild(bipedBosyShirt2);
		setRotationAngle(bipedBosyShirt2, 0.0F, 0.0F, -0.1789F);
		bipedBosyShirt2.cubeList.add(new ModelBox(bipedBosyShirt2, 89, 80, -1.4858F, -0.6897F, -4.625F, 1, 5, 1, 0.0F, false));
		bipedBosyShirt2.cubeList.add(new ModelBox(bipedBosyShirt2, 89, 83, -1.2972F, 11.1185F, -4.6F, 1, 1, 1, 0.025F, false));

		bipedBodyCoatFlap1 = new ModelRenderer(this);
		bipedBodyCoatFlap1.setRotationPoint(2.775F, 3.25F, 1.4F);
		bipedBodyCoat.addChild(bipedBodyCoatFlap1);
		setRotationAngle(bipedBodyCoatFlap1, 0.0F, 0.0F, 0.288F);
		bipedBodyCoatFlap1.cubeList.add(new ModelBox(bipedBodyCoatFlap1, 72, 87, -0.9079F, -1.0391F, -4.0F, 1, 4, 1, -0.025F, false));
		bipedBodyCoatFlap1.cubeList.add(new ModelBox(bipedBodyCoatFlap1, 75, 86, -1.4003F, -3.0492F, -4.0F, 1, 2, 1, -0.025F, false));

		bipedBodyCoatFlap3 = new ModelRenderer(this);
		bipedBodyCoatFlap3.setRotationPoint(-1.775F, 3.0F, 1.4F);
		bipedBodyCoat.addChild(bipedBodyCoatFlap3);
		setRotationAngle(bipedBodyCoatFlap3, 0.0F, 0.0F, -0.3011F);
		bipedBodyCoatFlap3.cubeList.add(new ModelBox(bipedBodyCoatFlap3, 76, 82, -1.1391F, -1.0562F, -4.0F, 1, 4, 1, -0.025F, false));
		bipedBodyCoatFlap3.cubeList.add(new ModelBox(bipedBodyCoatFlap3, 73, 86, -0.6902F, -3.0833F, -4.0F, 1, 2, 1, -0.025F, false));

		bipedBodyCoatFlap2 = new ModelRenderer(this);
		bipedBodyCoatFlap2.setRotationPoint(1.075F, 1.025F, 1.4F);
		bipedBodyCoat.addChild(bipedBodyCoatFlap2);
		setRotationAngle(bipedBodyCoatFlap2, 0.0F, 0.0F, -1.4617F);
		bipedBodyCoatFlap2.cubeList.add(new ModelBox(bipedBodyCoatFlap2, 73, 86, -1.2485F, 0.0272F, -4.0F, 1, 2, 1, 0.0F, false));
		bipedBodyCoatFlap2.cubeList.add(new ModelBox(bipedBodyCoatFlap2, 74, 87, -5.7218F, 0.5171F, -4.0F, 1, 1, 1, -0.05F, false));
		bipedBodyCoatFlap2.cubeList.add(new ModelBox(bipedBodyCoatFlap2, 72, 86, 0.6402F, -0.1796F, -4.0F, 1, 2, 2, 0.0F, false));

		bipedBodyCoatFlap4 = new ModelRenderer(this);
		bipedBodyCoatFlap4.setRotationPoint(-3.525F, 1.2F, 1.4F);
		bipedBodyCoat.addChild(bipedBodyCoatFlap4);
		setRotationAngle(bipedBodyCoatFlap4, 0.0F, 0.0F, -1.7671F);
		bipedBodyCoatFlap4.cubeList.add(new ModelBox(bipedBodyCoatFlap4, 73, 87, -1.6744F, 0.3347F, -4.0F, 1, 2, 1, 0.0F, false));
		bipedBodyCoatFlap4.cubeList.add(new ModelBox(bipedBodyCoatFlap4, 74, 87, -5.8624F, 0.4761F, -4.0F, 1, 1, 1, -0.05F, false));
		bipedBodyCoatFlap4.cubeList.add(new ModelBox(bipedBodyCoatFlap4, 74, 87, -8.0692F, 0.0372F, -3.9F, 1, 1, 1, -0.1F, false));
		bipedBodyCoatFlap4.cubeList.add(new ModelBox(bipedBodyCoatFlap4, 73, 85, -10.5211F, -0.4505F, -3.95F, 1, 1, 1, -0.1F, false));
		bipedBodyCoatFlap4.cubeList.add(new ModelBox(bipedBodyCoatFlap4, 72, 86, 0.3201F, 0.6802F, -4.0F, 1, 2, 2, 0.0F, false));


		bipedRightArmSleeve = new ModelRenderer(this);
		bipedRightArmSleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArmSleeve);
		bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 59, 75, -3.0F, -2.0F, -2.0F, 4, 10, 4, 0.15F, false));


		bipedLeftArmSleeve = new ModelRenderer(this);
		bipedLeftArmSleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArmSleeve);
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 63, 74, -1.0F, -2.0F, -2.0F, 4, 10, 4, 0.15F, false));
		bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 63, 74, -1.0F, -2.0F, -2.0F, 4, 10, 4, 0.1F, false));

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