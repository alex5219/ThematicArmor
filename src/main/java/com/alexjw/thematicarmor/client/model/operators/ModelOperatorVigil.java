package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorVigil extends ModelBiped {

    public ModelOperatorVigil() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        ModelRenderer bipedHeadMask = new ModelRenderer(this);
        bipedHeadMask.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadMask);
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -4.0F, -26.75F, -4.5F, 8, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 80, 1, -4.0F, -31.5F, -4.5F, 8, 3, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, 3.25F, -30.5F, -4.0F, 1, 5, 2, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, 3.25F, -27.25F, -1.75F, 1, 1, 6, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -4.25F, -27.25F, -1.75F, 1, 1, 6, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, 3.25F, -29.5F, -1.75F, 1, 1, 6, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -4.25F, -29.5F, -1.75F, 1, 1, 6, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -4.25F, -29.5F, -2.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, 3.25F, -29.5F, -2.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, 3.25F, -27.25F, -2.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -4.25F, -27.25F, -2.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -0.5F, -32.25F, -3.5F, 1, 1, 8, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 94, 49, -0.5F, -32.0F, 3.5F, 1, 3, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, 3.25F, -31.5F, -4.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, 3.25F, -25.75F, -4.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -4.25F, -25.75F, -4.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -4.25F, -31.5F, -4.0F, 1, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -4.25F, -30.5F, -4.0F, 1, 5, 2, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -3.5F, -32.25F, -4.5F, 7, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -3.0F, -25.0F, -4.5F, 6, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -2.0F, -24.25F, -4.5F, 4, 1, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -3.5F, -25.75F, -4.25F, 7, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -4.0F, -28.5F, -4.5F, 1, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, 3.0F, -28.5F, -4.5F, 1, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 100, 18, -1.0F, -29.25F, -4.75F, 2, 3, 1, -0.1F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 102, 46, -1.0F, -29.0F, 3.5F, 2, 2, 1, 0.0F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 71, 82, -3.0F, -31.0F, -5.0F, 2, 1, 1, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 71, 82, 0.75F, -31.0F, -5.0F, 2, 1, 1, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 72, 80, -1.0F, -31.0F, -5.0F, 2, 1, 1, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 72, 81, -1.0F, -30.0F, -5.0F, 2, 1, 1, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 73, 80, 0.0F, -31.0F, -5.0F, 1, 2, 1, -0.3F, false));
        bipedHeadMask.cubeList.add(new ModelBox(bipedHeadMask, 66, 84, -1.0F, -31.0F, -5.0F, 1, 2, 1, -0.3F, false));

        ModelRenderer bipedHeadMaskStrap2 = new ModelRenderer(this);
        bipedHeadMaskStrap2.setRotationPoint(4.25F, -28.25F, 3.25F);
        bipedHeadMask.addChild(bipedHeadMaskStrap2);
        setRotationAngle(bipedHeadMaskStrap2, 0.0F, 0.0F, 0.2618F);
        bipedHeadMaskStrap2.cubeList.add(new ModelBox(bipedHeadMaskStrap2, 102, 52, -8.0647F, 1.0085F, 0.0F, 8, 1, 1, 0.0F, false));

        ModelRenderer bipedHeadMaskStrap1 = new ModelRenderer(this);
        bipedHeadMaskStrap1.setRotationPoint(6.75F, -2.25F, -0.75F);
        bipedHeadMask.addChild(bipedHeadMaskStrap1);
        setRotationAngle(bipedHeadMaskStrap1, 0.0F, 0.0F, -0.2618F);
        bipedHeadMaskStrap1.cubeList.add(new ModelBox(bipedHeadMaskStrap1, 100, 47, -3.7585F, -26.9353F, 4.0F, 8, 1, 1, 0.0F, false));

        ModelRenderer bipedHeadMask7 = new ModelRenderer(this);
        bipedHeadMask7.setRotationPoint(-6.0F, -0.25F, 0.0F);
        bipedHeadMask.addChild(bipedHeadMask7);
        setRotationAngle(bipedHeadMask7, 0.0F, 0.0F, 0.1745F);
        bipedHeadMask7.cubeList.add(new ModelBox(bipedHeadMask7, 75, 80, -1.2925F, -30.9744F, -5.0F, 1, 2, 1, -0.3F, false));
        bipedHeadMask7.cubeList.add(new ModelBox(bipedHeadMask7, 75, 80, 2.4006F, -31.6256F, -5.0F, 1, 2, 1, -0.3F, false));

        ModelRenderer bipedBodyVest = new ModelRenderer(this);
        bipedBodyVest.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyVest);
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -4.0F, -22.5F, -2.5F, 8, 4, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -4.0F, -22.75F, 1.5F, 8, 4, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -3.0F, -18.5F, -2.5F, 6, 1, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, 2.0F, -24.0F, -2.25F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 72, 3.0F, -24.25F, -2.5F, 2, 2, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 112, 70, -5.0F, -24.25F, -2.5F, 2, 2, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -3.25F, -23.25F, -2.5F, 2, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 82, 70, 1.25F, -23.25F, -2.5F, 2, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 104, 13, -2.0F, -21.5F, -2.0F, 4, 2, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 106, 52, -2.5F, -21.75F, -1.75F, 1, 2, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -4.0F, -19.25F, -2.5F, 3, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, 1.0F, -19.25F, -2.5F, 3, 1, 5, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 108, 71, -2.0F, -24.25F, -0.25F, 4, 2, 3, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 23, 1.0F, -24.0F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 23, -2.0F, -24.0F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -4.0F, -24.0F, -2.25F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 19, 27, -4.0F, -16.0F, -2.25F, 8, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 80, 104, -4.0F, -18.75F, 1.25F, 8, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 110, 119, -4.0F, -16.25F, 1.25F, 8, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 25, -4.0F, -14.0F, -2.25F, 8, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 25, -4.0F, -14.0F, 1.25F, 8, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 25, 3.25F, -14.0F, -2.25F, 1, 2, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 97, 25, -4.25F, -14.0F, -2.25F, 1, 2, 4, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 82, 40, -3.75F, -15.0F, -2.75F, 1, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 81, 40, -2.5F, -15.0F, -2.75F, 1, 3, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 8, 24, -2.5F, -18.0F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 8, 22, 1.5F, -18.0F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 93, 79, -1.0F, -14.0F, -2.5F, 2, 2, 1, 0.0F, false));
        bipedBodyVest.cubeList.add(new ModelBox(bipedBodyVest, 94, 79, -3.5F, -21.75F, -2.25F, 7, 4, 1, 0.0F, false));

        ModelRenderer bipedBodyVestWalkie = new ModelRenderer(this);
        bipedBodyVestWalkie.setRotationPoint(-6.0F, 0.25F, -3.25F);
        bipedBodyVest.addChild(bipedBodyVestWalkie);
        setRotationAngle(bipedBodyVestWalkie, 0.0F, 0.6981F, 0.0F);
        bipedBodyVestWalkie.cubeList.add(new ModelBox(bipedBodyVestWalkie, 81, 40, -1.0F, -23.25F, 6.0F, 1, 2, 1, 0.0F, false));

        ModelRenderer bipedRightArmSleeve = new ModelRenderer(this);
        bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmSleeve);
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -8.25F, -21.25F, 1.25F, 3, 2, 1, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 108, 70, -8.5F, -24.25F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -8.25F, -21.25F, -2.25F, 3, 2, 4, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -5.75F, -21.25F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -5.75F, -21.25F, 1.25F, 1, 2, 1, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -8.25F, -23.25F, -2.25F, 2, 2, 4, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -6.5F, -23.25F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -8.25F, -23.25F, 1.25F, 2, 2, 1, 0.0F, false));
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 105, 84, -6.5F, -23.25F, 1.25F, 1, 2, 1, 0.0F, false));

        ModelRenderer bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 5.25F, -21.25F, -2.25F, 3, 2, 4, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 108, 70, 4.5F, -24.25F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 4.75F, -21.25F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 4.75F, -21.25F, -1.75F, 1, 2, 4, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 6.25F, -23.25F, -2.25F, 2, 2, 4, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 118, 96, 6.75F, -22.5F, -1.25F, 2, 2, 3, -0.4F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 5.5F, -23.25F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 5.5F, -23.25F, 1.25F, 1, 2, 1, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 6.25F, -23.25F, 1.25F, 2, 2, 1, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 105, 84, 5.25F, -21.25F, 1.25F, 3, 2, 1, 0.0F, false));

        ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 87, 46, -4.0F, -9.75F, -2.5F, 4, 1, 5, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 87, 46, -4.0F, -11.5F, -1.5F, 1, 3, 3, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 87, 46, -4.0F, -12.5F, 0.0F, 1, 1, 1, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 105, 45, -4.25F, -10.75F, -1.0F, 1, 3, 2, 0.0F, false));
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