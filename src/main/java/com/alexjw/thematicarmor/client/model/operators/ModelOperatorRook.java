package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorRook extends ModelBiped {

    public ModelOperatorRook() {
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
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 92, 36, -4.5F, -32.25F, -4.5F, 9, 3, 9, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 7, -4.5F, -29.25F, -3.5F, 1, 2, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 108, 39, -4.5F, -27.25F, -1.5F, 1, 2, 6, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 108, 39, -3.5F, -29.25F, 3.5F, 7, 5, 1, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 111, 41, 3.5F, -27.25F, -1.5F, 1, 2, 6, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 110, 8, 3.5F, -29.25F, -3.5F, 1, 2, 8, 0.0F, false));

        ModelRenderer bipedHeadHelmetVisor = new ModelRenderer(this);
        bipedHeadHelmetVisor.setRotationPoint(4.5F, -28.25F, -4.5F);
        bipedHeadHelmet.addChild(bipedHeadHelmetVisor);
        setRotationAngle(bipedHeadHelmetVisor, -0.2618F, 0.0F, 0.0F);
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 32, 87, -0.5F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 32, 87, -9.25F, -3.0F, -2.0F, 1, 3, 4, 0.0F, false));
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 27, 89, -9.0F, -3.9653F, -2.0613F, 9, 4, 2, 0.0F, false));

        ModelRenderer bipedBodyChest = new ModelRenderer(this);
        bipedBodyChest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyChest);
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 102, 30, -4.0F, -23.75F, -2.75F, 8, 11, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 102, 30, -4.0F, -23.75F, 0.75F, 8, 11, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 102, 30, -3.0F, -13.25F, 0.5F, 6, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 95, 82, -3.5F, -23.25F, -3.25F, 7, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 95, 82, -3.5F, -23.25F, 1.0F, 7, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 95, 82, -3.5F, -23.75F, 1.5F, 7, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 89, 80, -3.0F, -23.75F, -3.75F, 6, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 94, 82, -3.0F, -19.75F, -3.5F, 6, 5, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 94, 82, -3.0F, -19.75F, 1.5F, 6, 5, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 76, 27, -2.5F, -19.0F, -3.75F, 5, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 76, 27, -2.5F, -19.0F, 1.75F, 5, 2, 2, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 76, 33, -2.5F, -20.75F, -3.25F, 5, 5, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 76, 33, -2.5F, -20.75F, 2.25F, 5, 5, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 101, 86, -3.5F, -14.25F, -3.0F, 7, 1, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 110, 24, -3.5F, -13.0F, -2.5F, 7, 1, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 105, 35, -4.0F, -14.0F, -2.5F, 8, 1, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 110, 24, -1.5F, -12.5F, -2.5F, 3, 2, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 110, 24, -2.5F, -12.5F, -2.75F, 5, 1, 1, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 104, 29, -3.75F, -24.5F, -2.5F, 2, 1, 5, 0.0F, false));
        bipedBodyChest.cubeList.add(new ModelBox(bipedBodyChest, 106, 31, 1.5F, -24.5F, -2.5F, 2, 1, 5, 0.0F, false));

        ModelRenderer bipedBodyChestWalkie = new ModelRenderer(this);
        bipedBodyChestWalkie.setRotationPoint(-2.25F, -15.75F, -2.25F);
        bipedBodyChest.addChild(bipedBodyChestWalkie);
        setRotationAngle(bipedBodyChestWalkie, 0.0F, 0.0F, 0.1745F);
        bipedBodyChestWalkie.cubeList.add(new ModelBox(bipedBodyChestWalkie, 98, 82, 4.2462F, -7.5434F, -1.25F, 1, 2, 1, 0.0F, false));

        ModelRenderer bipedRightArmPad = new ModelRenderer(this);
        bipedRightArmPad.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmPad);
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 112, 31, -8.5F, -24.25F, -2.5F, 4, 3, 5, 0.0F, false));
        bipedRightArmPad.cubeList.add(new ModelBox(bipedRightArmPad, 112, 31, -8.25F, -23.0F, -2.25F, 3, 3, 4, 0.0F, false));

        ModelRenderer bipedLeftArmPad = new ModelRenderer(this);
        bipedLeftArmPad.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmPad);
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 112, 31, 4.5F, -24.25F, -2.5F, 4, 3, 5, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 112, 31, 5.25F, -23.0F, -2.25F, 3, 3, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 109, 27, 5.5F, -18.0F, -2.5F, 3, 3, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, 3.75F, -16.5F, -2.25F, 3, 1, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, 3.75F, -18.0F, -2.25F, 3, 1, 4, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, 3.5F, -24.5F, -1.0F, 3, 1, 2, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, -6.75F, -24.5F, -1.0F, 3, 1, 2, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, 4.25F, -18.0F, 0.25F, 4, 1, 2, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 96, 84, 4.25F, -16.5F, 0.25F, 4, 1, 2, 0.0F, false));
        bipedLeftArmPad.cubeList.add(new ModelBox(bipedLeftArmPad, 109, 27, 6.25F, -19.0F, -2.25F, 2, 5, 3, 0.0F, false));

        ModelRenderer bipedRightLegHolster2 = new ModelRenderer(this);
        bipedRightLegHolster2.setRotationPoint(1.9F, 11.25F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster2);
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 107, 88, -4.75F, -9.75F, -1.0F, 1, 3, 2, 0.0F, false));
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 107, 88, -4.5F, -10.25F, -0.75F, 1, 3, 2, 0.0F, false));
        bipedRightLegHolster2.cubeList.add(new ModelBox(bipedRightLegHolster2, 107, 88, -4.5F, -7.25F, -0.75F, 1, 1, 1, 0.0F, false));

        ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(-0.1F, 11.25F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        setRotationAngle(bipedRightLegHolster, 0.0F, 0.0F, 0.1745F);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 107, 30, -4.0076F, -9.0868F, -2.5F, 5, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 107, 30, -3.7614F, -7.3802F, -2.5F, 5, 1, 5, 0.0F, false));

        ModelRenderer bipedLeftLegStrap = new ModelRenderer(this);
        bipedLeftLegStrap.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegStrap);
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 94, 81, 0.5F, -8.75F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 104, 32, 2.75F, -11.25F, -1.5F, 2, 4, 3, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 94, 81, 2.25F, -12.75F, -1.5F, 2, 3, 3, 0.0F, false));
        bipedLeftLegStrap.cubeList.add(new ModelBox(bipedLeftLegStrap, 104, 34, 3.0F, -11.0F, -1.0F, 2, 2, 2, 0.0F, false));
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