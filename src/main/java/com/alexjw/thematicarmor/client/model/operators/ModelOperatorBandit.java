package com.alexjw.thematicarmor.client.model.operators;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorBandit extends ModelBiped {
    private final ModelRenderer bipedHeadHelmet;
    private final ModelRenderer bipedHeadHelmetVisor;
    private final ModelRenderer bipedBodyVest;
    private final ModelRenderer bipedBodyVestSlant1;
    private final ModelRenderer bipedBodyVestWalkie;
    private final ModelRenderer bipedBodyVestSlant2;
    private final ModelRenderer bipedRightArmShoulder;
    private final ModelRenderer bipedRightLegHolster;

    public ModelOperatorBandit() {
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
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 38, 97, -4.5F, -29.0F, -3.25F, 1, 4, 7, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 43, 96, -4.75F, -32.0F, -4.25F, 1, 4, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 34, 98, -4.0F, -32.25F, -5.0F, 8, 3, 9, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 35, 93, -4.5F, -32.0F, 2.5F, 9, 7, 2, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 40, 98, 3.75F, -32.0F, -4.25F, 1, 4, 8, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 32, 98, 3.5F, -29.0F, -3.25F, 1, 4, 7, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 27, 82, 3.5F, -29.5F, -3.0F, 2, 3, 3, 0.0F, false));
        bipedHeadHelmet.cubeList.add(new ModelBox(bipedHeadHelmet, 23, 81, -5.5F, -29.5F, -3.0F, 2, 3, 3, 0.0F, false));

        bipedHeadHelmetVisor = new ModelRenderer(this);
        bipedHeadHelmetVisor.setRotationPoint(-4.0F, -27.25F, -1.0F);
        bipedHeadHelmet.addChild(bipedHeadHelmetVisor);
        setRotationAngle(bipedHeadHelmetVisor, -0.1745F, 0.0F, 0.0F);
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 58, 55, 8.0F, -4.0868F, -6.5076F, 1, 3, 4, 0.0F, false));
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 57, 53, -1.0F, -4.0868F, -6.5076F, 1, 3, 4, 0.0F, false));
        bipedHeadHelmetVisor.cubeList.add(new ModelBox(bipedHeadHelmetVisor, 53, 52, -0.5F, -4.52F, -6.9517F, 9, 4, 2, 0.0F, false));



        bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 30, -2.25F, -22.0F, -2.5F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 112, 42, 1.25F, -22.0F, -2.5F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -4.0F, -20.0F, -2.5F, 8, 7, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -4.5F, -20.0F, -2.5F, 1, 7, 5, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, 3.5F, -20.0F, -2.5F, 1, 7, 5, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -4.0F, -23.0F, 1.5F, 8, 10, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -4.0F, -24.0F, -2.5F, 2, 4, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, 2.0F, -24.0F, -2.5F, 2, 4, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 111, 84, 2.5F, -20.5F, -3.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -4.0F, -24.0F, 1.25F, 2, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, 2.0F, -24.0F, 1.25F, 2, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -3.5F, -13.5F, -2.25F, 7, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -2.5F, -13.0F, -2.5F, 5, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 108, 77, -3.75F, -20.5F, -3.0F, 2, 2, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 107, -1.0F, -20.0F, -2.75F, 2, 7, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 102, 72, 2.75F, -16.0F, -3.0F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 107, 104, 2.75F, -16.25F, -3.25F, 1, 2, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, 1.75F, -24.25F, -2.0F, 2, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 28, -3.75F, -24.25F, -2.0F, 2, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 90, 112, -4.0F, -15.0F, -2.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 90, 112, -4.0F, -15.0F, 1.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 117, -4.0F, -17.0F, -2.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 117, -4.0F, -17.0F, 1.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 107, -4.0F, -19.0F, -2.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 107, -4.0F, -19.0F, 1.75F, 8, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 107, -2.5F, -21.5F, 1.75F, 5, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 17, -1.5F, -24.0F, -2.25F, 1, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 17, 0.5F, -24.0F, -2.25F, 1, 1, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 22, 16, -1.0F, -23.5F, -2.5F, 2, 1, 1, -0.2F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 103, -2.75F, -24.5F, -2.5F, 1, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 95, 103, 1.75F, -24.5F, -2.5F, 1, 1, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 45, 21, 0.75F, -24.25F, -2.25F, 1, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 45, 21, -1.75F, -24.25F, -2.25F, 1, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 27, 22, -2.5F, -24.25F, 2.25F, 5, 3, 1, -0.1F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 46, 24, -1.5F, -22.5F, 2.0F, 3, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 32, 23, -1.5F, -23.75F, 2.5F, 3, 2, 1, 0.0F, false));

        bipedBodyVestSlant1 = new ModelRenderer(this);
        bipedBodyVestSlant1.setRotationPoint(-1.75F, -17.5F, -3.0F);
        bipedBodyVest.addChild(bipedBodyVestSlant1);
        setRotationAngle(bipedBodyVestSlant1, 0.0F, 0.0F, 0.4363F);
        bipedBodyVestSlant1.cubeList.add(new ModelBox(bipedBodyVestSlant1, 100, 111, 0.6525F, -7.5621F, 0.25F, 1, 5, 1, 0.0F, false));

        bipedBodyVestWalkie = new ModelRenderer(this);
        bipedBodyVestWalkie.setRotationPoint(3.25F, 4.0F, -2.75F);
        bipedBody.addChild(bipedBodyVestWalkie);
        setRotationAngle(bipedBodyVestWalkie, 0.0F, 0.6109F, 0.0F);
        bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 100, 109, -0.5084F, -2.0F, -0.2662F, 1, 2, 1, -0.4F, false));

        bipedBodyVestSlant2 = new ModelRenderer(this);
        bipedBodyVestSlant2.setRotationPoint(0.25F, 6.5F, -3.0F);
        bipedBody.addChild(bipedBodyVestSlant2);
        setRotationAngle(bipedBodyVestSlant2, 0.0F, 0.0F, -0.4363F);
        bipedBodyVestSlant2.cubeList.add(new ModelBox(bipedBodyVestSlant2, 97, 110, -0.4412F, -7.0153F, 0.25F, 1, 5, 1, 0.0F, false));



        bipedRightArmShoulder = new ModelRenderer(this);
        bipedRightArmShoulder.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmShoulder);
        bipedRightArmShoulder.cubeList.add(new ModelBox(bipedRightArmShoulder, 0, 0, -9.0F, -23.25F, -2.0F, 2, 3, 4, -0.875F, false));




        bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 11.75F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -4.25F, -8.5F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -4.25F, -10.0F, -2.5F, 4, 1, 5, -0.1F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -4.25F, -10.25F, -1.5F, 1, 3, 3, -0.1F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -5.0F, -9.75F, -1.0F, 1, 2, 2, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -0.75F, -8.5F, -2.5F, 1, 1, 5, -0.1F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 76, 8, -0.75F, -10.0F, -2.5F, 1, 1, 5, -0.1F, false));


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