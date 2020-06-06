package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorFinka extends ModelBiped {

    public ModelOperatorFinka() {
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
        bipedHead.addChild(bipedHeadHelmet);
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 27, -4.5F, -30.75F, -4.5F, 1, 4, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 99, 24, 3.5F, -30.75F, -4.5F, 1, 4, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 66, 108, -3.5F, -31.0F, -4.25F, 7, 7, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 22, -4.0F, -31.0F, -4.75F, 8, 1, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 104, 25, -3.0F, -24.5F, -4.5F, 6, 1, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 96, 68, -4.25F, -30.0F, -3.75F, 1, 1, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 101, 68, -4.25F, -27.5F, -3.75F, 1, 1, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 96, 68, 3.25F, -27.5F, -3.75F, 1, 1, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 105, 70, 3.25F, -30.0F, -3.75F, 1, 1, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 40, 24, -1.0F, -29.25F, 3.5F, 2, 2, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 106, 108, -4.25F, -32.5F, -4.25F, 6, 2, 3, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 106, 108, -3.75F, -32.75F, -4.0F, 5, 2, 2, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 106, 108, -3.75F, -32.0F, -4.5F, 5, 1, 2, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 106, 108, -3.0F, -32.25F, -3.75F, 6, 2, 3, 0.0F, false));

        ModelRenderer bipedHeadHelmetGas1 = new ModelRenderer(this);
        bipedHeadHelmetGas1.setRotationPoint(2.0F, -30.75F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetGas1);
        setRotationAngle(bipedHeadHelmetGas1, 0.0F, 0.0F, 0.2618F);
        bipedHeadHelmetGas1.cubeList.add(new ModelBox(bipedHeadHelmetGas1, 108, 21, 2.3019F, 3.3109F, 0.0F, 1, 3, 1, 0.0F, false));
        bipedHeadHelmetGas1.cubeList.add(new ModelBox(bipedHeadHelmetGas1, 41, 25, -3.7998F, 6.687F, -0.25F, 2, 1, 1, 0.0F, false));
        bipedHeadHelmetGas1.cubeList.add(new ModelBox(bipedHeadHelmetGas1, 41, 25, -3.7998F, 6.687F, -0.75F, 2, 1, 1, -0.2F, false));

        ModelRenderer bipedHeadHelmetGas2 = new ModelRenderer(this);
        bipedHeadHelmetGas2.setRotationPoint(-1.5F, -32.0F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetGas2);
        setRotationAngle(bipedHeadHelmetGas2, 0.0F, 0.0F, -0.2618F);
        bipedHeadHelmetGas2.cubeList.add(new ModelBox(bipedHeadHelmetGas2, 98, 20, -4.1475F, 4.2589F, 0.0F, 1, 3, 1, 0.0F, false));
        bipedHeadHelmetGas2.cubeList.add(new ModelBox(bipedHeadHelmetGas2, 41, 24, 0.859F, 7.8592F, -0.25F, 2, 1, 1, 0.0F, false));
        bipedHeadHelmetGas2.cubeList.add(new ModelBox(bipedHeadHelmetGas2, 41, 24, 0.859F, 7.8592F, -0.75F, 2, 1, 1, -0.2F, false));

        ModelRenderer bipedHeadHelmetGas3 = new ModelRenderer(this);
        bipedHeadHelmetGas3.setRotationPoint(-2.5F, -29.75F, -7.75F);
        bipedHeadHelmet.addChild(bipedHeadHelmetGas3);
        setRotationAngle(bipedHeadHelmetGas3, 0.0F, 0.0F, -1.2217F);
        bipedHeadHelmetGas3.cubeList.add(new ModelBox(bipedHeadHelmetGas3, 106, 62, -1.0F, -1.0F, 11.0F, 1, 8, 1, 0.0F, false));

        ModelRenderer bipedHeadHelmetGas4 = new ModelRenderer(this);
        bipedHeadHelmetGas4.setRotationPoint(-3.0F, -27.75F, -7.75F);
        bipedHeadHelmet.addChild(bipedHeadHelmetGas4);
        setRotationAngle(bipedHeadHelmetGas4, 0.0F, 0.0F, -1.9199F);
        bipedHeadHelmetGas4.cubeList.add(new ModelBox(bipedHeadHelmetGas4, 109, 68, -1.0F, -1.0F, 11.0F, 1, 8, 1, 0.0F, false));

        ModelRenderer biedBodyVest = new ModelRenderer(this);
        biedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(biedBodyVest);
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -3.0F, -22.75F, -2.75F, 6, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -3.0F, -23.5F, 1.75F, 6, 4, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -3.0F, -19.5F, 1.5F, 1, 2, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, 2.0F, -19.5F, 1.5F, 1, 2, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 112, 68, 1.0F, -21.0F, 2.75F, 1, 4, 1, -0.2F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 112, 68, -2.0F, -21.0F, 2.75F, 1, 4, 1, -0.2F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -2.5F, -19.5F, 1.75F, 5, 4, 1, -0.2F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 66, 70, -2.0F, -23.25F, 2.25F, 4, 4, 1, -0.2F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 33, 23, -2.5F, -20.5F, 1.5F, 5, 3, 2, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 109, 72, 1.75F, -16.25F, 1.5F, 2, 3, 1, -0.1F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 109, 72, 1.75F, -17.0F, -2.5F, 2, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 113, 76, -3.75F, -17.0F, -2.5F, 2, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 113, 76, -3.75F, -16.25F, 1.5F, 2, 3, 1, -0.1F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, 2.25F, -24.0F, -2.5F, 2, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, 2.25F, -24.25F, -2.5F, 2, 3, 5, -0.1F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -4.25F, -24.25F, -2.5F, 2, 3, 5, -0.1F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -4.25F, -24.0F, -2.5F, 2, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 107, 20, -2.0F, -22.25F, -2.5F, 4, 3, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 106, 28, -1.5F, -18.75F, -2.5F, 3, 1, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 106, 28, -1.0F, -18.25F, -2.25F, 2, 1, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 62, 77, -4.0F, -16.5F, -2.25F, 8, 1, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 59, 75, -4.0F, -15.0F, -2.25F, 8, 1, 1, 0.0F, false));
        biedBodyVest.cubeList.add(new ModelBox(biedBodyVest, 59, 75, -4.0F, -14.75F, 1.25F, 8, 1, 1, 0.0F, false));

        ModelRenderer bipedBodyVestPouch = new ModelRenderer(this);
        bipedBodyVestPouch.setRotationPoint(-1.75F, -21.5F, -2.0F);
        biedBodyVest.addChild(bipedBodyVestPouch);
        setRotationAngle(bipedBodyVestPouch, 0.0F, 0.0F, -0.2618F);
        bipedBodyVestPouch.cubeList.add(new ModelBox(bipedBodyVestPouch, 42, 24, -1.2415F, -1.0647F, -1.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVestPouch.cubeList.add(new ModelBox(bipedBodyVestPouch, 86, 42, -1.1768F, -1.3062F, -1.5F, 1, 2, 1, -0.2F, false));

        ModelRenderer bipedBodyVestOutline = new ModelRenderer(this);
        bipedBodyVestOutline.setRotationPoint(-1.0F, -16.75F, 5.5F);
        biedBodyVest.addChild(bipedBodyVestOutline);
        setRotationAngle(bipedBodyVestOutline, -0.6109F, 0.0F, 0.0F);
        bipedBodyVestOutline.cubeList.add(new ModelBox(bipedBodyVestOutline, 95, 24, -3.0532F, 6.8402F, -4.2048F, 8, 1, 1, 0.0F, false));
        bipedBodyVestOutline.cubeList.add(new ModelBox(bipedBodyVestOutline, 95, 24, -3.0532F, 4.8327F, -1.3378F, 8, 1, 1, 0.0F, false));

        ModelRenderer bipedRightArmPad = new ModelRenderer(this);
        bipedRightArmPad.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmPad);
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 68, 68, -6.75F, -20.75F, -2.25F, 3, 1, 4, 0.0F, false));
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 106, 26, -8.5F, -22.0F, -2.5F, 3, 3, 4, 0.0F, false));
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 68, 68, -8.25F, -22.5F, -2.25F, 3, 4, 4, 0.0F, false));
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 68, 68, -8.25F, -20.75F, 0.25F, 4, 1, 2, 0.0F, false));
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 0, 24, -8.75F, -21.5F, -2.75F, 2, 2, 2, 0.0F, false));

        ModelRenderer bipedLeftArmPad = new ModelRenderer(this);
        bipedLeftArmPad.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmPad);
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 106, 26, 5.5F, -22.0F, -2.5F, 3, 3, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 68, 68, 5.25F, -22.5F, -2.25F, 3, 4, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 68, 68, 3.75F, -20.75F, -2.25F, 3, 1, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 68, 68, 4.25F, -20.75F, 0.25F, 4, 1, 2, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 73, 8, 8.07F, -21.25F, -1.75F, 1, 1, 3, -0.2F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 73, 14, 8.0F, -20.75F, -1.75F, 1, 1, 3, -0.2F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 0, 0, 8.0F, -21.75F, -1.75F, 1, 1, 3, -0.2F, false));

        ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 66, 76, -4.25F, -10.25F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 66, 76, -4.25F, -8.75F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 66, 76, -4.25F, -6.5F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 66, 76, -0.5F, -6.5F, -2.5F, 1, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 107, 27, -3.0F, -7.0F, -2.75F, 2, 2, 1, -0.1F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 32, 23, -3.75F, -9.25F, -2.75F, 2, 2, 2, -0.2F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 98, 31, -4.5F, -10.75F, -1.0F, 1, 4, 2, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 68, 73, -4.25F, -10.25F, -1.5F, 1, 3, 3, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 68, 73, -4.25F, -13.0F, -0.5F, 1, 3, 1, 0.0F, false));

        ModelRenderer bipedLeftLegHolster = new ModelRenderer(this);
        bipedLeftLegHolster.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegHolster);
        bipedLeftLegHolster.cubeList.add(new ModelBox(bipedLeftLegHolster, 66, 76, -0.25F, -6.5F, -2.5F, 1, 1, 5, 0.0F, false));
        bipedLeftLegHolster.cubeList.add(new ModelBox(bipedLeftLegHolster, 66, 76, 0.25F, -6.5F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedLeftLegHolster.cubeList.add(new ModelBox(bipedLeftLegHolster, 107, 27, 1.0F, -7.0F, -2.75F, 2, 2, 1, -0.1F, false));
        bipedLeftLegHolster.cubeList.add(new ModelBox(bipedLeftLegHolster, 66, 76, 0.0F, -9.5F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedLeftLegHolster.cubeList.add(new ModelBox(bipedLeftLegHolster, 106, 20, 2.5F, -11.5F, -2.25F, 2, 3, 4, 0.0F, false));
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