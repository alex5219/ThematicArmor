package com.alexjw.thematicarmor.client.model.operators;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorTachanka extends ModelBiped {
	private final ModelRenderer bipedHeadHelmet;
	private final ModelRenderer bipedBodyArmor;
	private final ModelRenderer bipedBodyArmorStrap;
	private final ModelRenderer bipedBodyArmorStrap2;
	private final ModelRenderer bipedLeftArmFlag;

	public ModelOperatorTachanka() {
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
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 90, 31, -4.0F, -32.5F, -4.0F, 8, 3, 8, 0.25F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 90, 31, -4.0F, -30.9F, -4.6F, 8, 2, 3, 0.5F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 98, 33, -0.5F, -32.9F, -0.35F, 1, 1, 1, 0.5F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 90, 31, -4.0F, -26.725F, -4.6F, 8, 2, 3, 0.5F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 90, 31, 4.0F, -28.175F, -4.6F, 0, 1, 3, 0.4F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 90, 31, -3.9F, -28.075F, -4.6F, 0, 1, 2, 0.4F, false));
		bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 92, 32, -4.0F, -29.95F, -2.0F, 8, 5, 6, 0.225F, false));

		bipedBodyArmor = new ModelRenderer(this);
		bipedBodyArmor.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBodyArmor);
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 93, 9, -4.0F, -22.75F, -2.0F, 8, 10, 4, 0.3F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 16, -2.0F, -13.975F, -2.0F, 4, 3, 0, 0.45F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 16, -4.0F, -16.975F, -2.0F, 8, 3, 0, 0.475F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 16, 2.0F, -23.975F, -2.0F, 2, 3, 4, 0.475F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 16, -0.5F, -23.225F, -2.0F, 1, 3, 4, 0.475F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 37, 54, -3.525F, -15.925F, 2.6F, 1, 1, 0, 0.525F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 37, 54, -3.525F, -16.425F, 2.6F, 1, 2, 0, 0.425F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 99, 65, 2.725F, -16.175F, 2.6F, 1, 2, 0, 0.45F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 29, 15, 1.725F, -16.175F, 2.85F, 0, 2, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 29, 15, -1.525F, -16.175F, 2.85F, 0, 2, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 2.475F, -21.175F, 2.6F, 0, 1, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 1.225F, -21.175F, 2.6F, 0, 1, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 1.825F, -21.175F, 2.6F, 0, 1, 0, 0.15F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 1.325F, -21.425F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 1.325F, -20.0F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -0.9F, -20.0F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -2.7F, -20.0F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -2.7F, -20.425F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -0.9F, -21.375F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -2.725F, -21.375F, 2.6F, 1, 0, 0, 0.225F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, 0.225F, -21.175F, 2.6F, 0, 1, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 31, 18, -1.85F, -21.175F, 2.6F, 0, 1, 0, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 91, 81, 2.725F, -16.575F, 3.1F, 1, 2, 0, 0.2F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 20, 4, -3.025F, -16.925F, 2.6F, 0, 2, 0, 0.325F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 20, 4, -2.375F, -20.2F, 2.675F, 0, 0, 0, 0.275F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, -4.0F, -16.1F, -2.5F, 8, 0, 4, 0.375F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, 3.55F, -21.1F, -2.5F, 0, 5, 4, 0.4F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, -3.325F, -21.1F, -2.5F, 0, 5, 4, 0.4F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, -3.9F, -24.1F, 1.125F, 0, 8, 1, 0.425F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, 0.1F, -24.1F, 1.125F, 0, 8, 1, 0.45F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, 3.95F, -24.1F, 1.125F, 0, 8, 1, 0.45F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, -4.0F, -19.85F, -2.5F, 8, 0, 4, 0.375F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 76, 85, -4.0F, -14.6F, -2.5F, 8, 0, 4, 0.4F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 113, 96, -0.6F, -19.85F, -2.5F, 1, 0, 4, 0.525F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 113, 96, -0.6F, -16.1F, -2.5F, 1, 0, 4, 0.525F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 113, 96, -0.6F, -14.6F, -2.5F, 1, 0, 4, 0.6F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 10, 4, -2.05F, -14.6F, -2.5F, 0, 1, 2, 0.75F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 10, 2, -2.3F, -13.975F, -2.5F, 0, 0, 0, 0.825F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 111, 86, 2.5F, -19.975F, -2.5F, 1, 2, 4, 0.7F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 82, 83, 2.25F, -19.975F, -3.0F, 1, 2, 4, 0.5F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 111, 86, 3.75F, -15.975F, -2.25F, 0, 2, 4, 0.9F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 111, 86, -3.75F, -15.975F, -2.25F, 0, 2, 4, 0.9F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 88, -2.0F, -15.975F, 1.5F, 4, 2, 0, 1.1F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 18, 12, -2.0F, -20.725F, 1.5F, 4, 0, 0, 1.1F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 68, -2.0F, -15.225F, 2.375F, 4, 0, 0, 0.5F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 98, 68, -2.6F, -14.025F, 2.375F, 5, 0, 0, 0.3F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 22, 20, -2.0F, -23.725F, 0.75F, 4, 0, 1, 1.1F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 111, 86, -3.5F, -21.775F, -2.75F, 1, 2, 4, 0.45F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 89, 87, -3.25F, -21.775F, -3.0F, 1, 2, 4, 0.25F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 111, 86, 3.425F, -21.975F, -2.5F, 0, 0, 4, 0.75F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 10, 3, 3.425F, -22.725F, -2.5F, 0, 0, 1, 0.6F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 10, 3, 3.75F, -24.475F, -2.8F, 0, 1, 0, 0.2F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 86, 60, 2.8F, -24.0F, -2.25F, 1, 2, 4, 0.55F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 95, 63, -3.85F, -24.05F, -2.25F, 1, 2, 4, 0.575F, false));
		bipedBodyArmor.cubeList.add(new ModelBox(bipedBodyArmor, 92, 16, -4.0F, -23.975F, -2.0F, 2, 3, 4, 0.475F, false));

		bipedBodyArmorStrap = new ModelRenderer(this);
		bipedBodyArmorStrap.setRotationPoint(-0.25F, -20.475F, 0.0F);
		bipedBodyArmor.addChild(bipedBodyArmorStrap);
		setRotationAngle(bipedBodyArmorStrap, 0.0F, 0.0F, -0.7854F);
		bipedBodyArmorStrap.cubeList.add(new ModelBox(bipedBodyArmorStrap, 104, 59, -0.8409F, -4.8409F, -2.75F, 1, 11, 1, 0.1F, false));
		bipedBodyArmorStrap.cubeList.add(new ModelBox(bipedBodyArmorStrap, 104, 59, -0.7525F, -4.7525F, 1.4F, 1, 11, 1, 0.1F, false));

		bipedBodyArmorStrap2 = new ModelRenderer(this);
		bipedBodyArmorStrap2.setRotationPoint(1.0F, -19.725F, 0.0F);
		bipedBodyArmor.addChild(bipedBodyArmorStrap2);
		setRotationAngle(bipedBodyArmorStrap2, 0.0F, 0.0F, 0.7854F);
		bipedBodyArmorStrap2.cubeList.add(new ModelBox(bipedBodyArmorStrap2, 104, 59, -1.2475F, -4.7525F, -2.75F, 1, 11, 1, 0.1F, false));
		bipedBodyArmorStrap2.cubeList.add(new ModelBox(bipedBodyArmorStrap2, 104, 59, -1.2475F, -4.7525F, 1.45F, 1, 11, 1, 0.1F, false));

		bipedLeftArmFlag = new ModelRenderer(this);
		bipedLeftArmFlag.setRotationPoint(-5.0F, 21.0F, 3.0F);
		bipedLeftArm.addChild(bipedLeftArmFlag);
		setRotationAngle(bipedLeftArmFlag, 0.1745F, 0.0F, 0.0F);
		bipedLeftArmFlag.cubeList.add(new ModelBox(bipedLeftArmFlag, 100, 108, 7.5F, -22.4653F, -1.303F, 1, 3, 4, -0.7F, false));
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