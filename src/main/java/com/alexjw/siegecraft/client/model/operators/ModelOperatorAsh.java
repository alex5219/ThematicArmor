package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorAsh extends ModelBiped {
    public final ModelRenderer bipedHeadHat;
    public final ModelRenderer bipedBodyVest;
    public final ModelRenderer bipedRightArmShoulder;
    public final ModelRenderer bipedLeftArmShoulder;
    public final ModelRenderer bipedRightLegHolster;
    public final ModelRenderer bipedLeftLegStrap;

    public ModelOperatorAsh() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        bipedHeadHat = new ModelRenderer(this);
        bipedHeadHat.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadHat);
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 91, 36, -4.5F, -32.5F, -4.5F, 9, 3, 9, -0.3F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 91, 36, -4.5F, -30.5F, -0.5F, 9, 2, 5, -0.4F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 89, 70, -4.0F, -30.5F, -7.0F, 8, 1, 3, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 90, 46, -5.0F, -34.25F, -3.5F, 10, 6, 1, -2.2F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 10, -3.75F, -30.25F, -4.5F, 4, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 10, -3.5F, -29.75F, -4.25F, 3, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 10, -0.5F, -30.0F, -4.75F, 3, 1, 1, -0.4F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 10, -3.25F, -29.25F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 25, 8, -1.0F, -26.5F, 3.5F, 2, 2, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 23, 11, 0.25F, -25.25F, 3.75F, 1, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 9, 2, 0.5F, -24.75F, 3.5F, 2, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 9, 2, 2.0F, -24.5F, 3.25F, 2, 1, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 9, 2, 3.25F, -24.5F, 2.0F, 1, 1, 2, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 9, 2, 3.5F, -24.5F, 0.0F, 1, 1, 2, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 22, 9, 4.0F, -24.5F, -2.25F, 1, 1, 3, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 10, 2, 4.0F, -24.0F, -2.5F, 1, 2, 1, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 10, 2, 3.75F, -22.25F, -2.5F, 1, 2, 1, -0.1F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 13, 1, 4.0F, -20.75F, -2.75F, 1, 1, 1, -0.1F, false));

        bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 59, 2.0F, -24.0F, -2.5F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 59, 2.0F, -24.0F, 1.25F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 60, -4.0F, -24.0F, -2.5F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 60, -4.0F, -24.0F, 1.25F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 67, -4.0F, -22.0F, -2.75F, 8, 8, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 22, -4.0F, -14.25F, -2.25F, 8, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 96, 22, -4.0F, -14.25F, 1.25F, 8, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 67, -3.25F, -21.75F, -3.0F, 7, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 67, -4.0F, -22.25F, 1.5F, 8, 8, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 22, 0.5F, -18.0F, -3.0F, 3, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 22, 1.75F, -14.75F, 1.75F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 22, -3.75F, -14.75F, 1.75F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, 1.75F, -20.5F, -3.25F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 86, 68, 1.75F, -20.75F, -3.75F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -4.0F, -20.5F, -3.25F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -3.25F, -20.5F, -3.25F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 22, -4.0F, -19.75F, -3.5F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -2.5F, -20.5F, -3.25F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 21, -3.25F, -19.75F, -3.5F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 21, -1.75F, -19.75F, -3.5F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 21, -2.5F, -19.75F, -3.5F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -1.75F, -20.5F, -3.25F, 1, 2, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, 0.5F, -21.25F, -3.25F, 1, 3, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -2.75F, -17.5F, -3.25F, 2, 2, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 100, 22, -4.25F, -17.5F, -3.25F, 2, 2, 1, -0.3F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 101, 18, -0.75F, -21.75F, -3.25F, 1, 8, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 101, 35, -2.25F, -24.5F, -3.0F, 1, 3, 2, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 114, 45, 1.25F, -24.5F, -3.0F, 1, 3, 2, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 20, -1.5F, -16.5F, 1.75F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 20, 0.5F, -16.5F, 2.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 91, 20, -1.5F, -18.75F, 1.75F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 47, -4.0F, -23.0F, 1.25F, 8, 5, 1, -1.4F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 105, 31, 0.5F, -18.75F, 2.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 25, -4.25F, -18.25F, 1.75F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 25, 2.25F, -18.25F, 1.75F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 25, -4.25F, -16.5F, 1.75F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 92, 25, 2.25F, -16.5F, 1.75F, 2, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 103, 66, 1.75F, -24.25F, -1.75F, 2, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 103, 66, -3.75F, -24.25F, -2.0F, 2, 1, 4, 0.0F, false));

        bipedRightArmShoulder = new ModelRenderer(this);
        bipedRightArmShoulder.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmShoulder);
        bipedRightArmShoulder.cubeList.add(new ModelBox(bipedRightArmShoulder, 6, 79, -7.75F, -24.0F, -2.5F, 1, 4, 5, -1.4F, false));

        bipedLeftArmShoulder = new ModelRenderer(this);
        bipedLeftArmShoulder.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmShoulder);

        bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 94, 26, -4.25F, -9.25F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 90, 26, -4.25F, -10.75F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 90, 26, -0.75F, -10.75F, -2.5F, 1, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 90, 26, -0.75F, -9.25F, -2.5F, 1, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 88, 56, -4.5F, -11.0F, -0.5F, 1, 4, 2, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 88, 56, -4.75F, -11.0F, -1.0F, 1, 3, 2, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 34, 24, -3.0F, -8.0F, -2.25F, 2, 2, 1, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 102, 32, -4.35F, -14.5F, -0.25F, 1, 4, 1, 0.0F, false));

        bipedLeftLegStrap = new ModelRenderer(this);
        bipedLeftLegStrap.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegStrap);
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 92, 22, 0.25F, -8.75F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 102, 32, 3.4F, -14.5F, -0.25F, 1, 4, 1, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 92, 64, 3.75F, -11.25F, -1.5F, 1, 3, 3, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 33, 24, 1.0F, -8.0F, -2.25F, 2, 2, 1, 0.0F, false));
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