package com.alexjw.thematicarmor.client.model.walkingdead;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRickGrimes extends ModelBiped {
    private final ModelRenderer bipedHeadOverlay;
    private final ModelRenderer bipedBodyJacket;
    private final ModelRenderer bipedRightArmSleeve;
    private final ModelRenderer bipedLeftArmSleeve;
    private final ModelRenderer bpedRightLegHolster2;
    private final ModelRenderer bpedLeftLegHolster;

    public ModelRickGrimes() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;



        bipedHeadOverlay = new ModelRenderer(this);
        bipedHeadOverlay.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadOverlay);
        bipedHeadOverlay.cubeList.add(new ModelBox(bipedHeadOverlay, 32, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.25F, false));


        bipedBodyJacket = new ModelRenderer(this);
        bipedBodyJacket.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyJacket);
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 16, 32, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.175F, false));


        bipedRightArmSleeve = new ModelRenderer(this);
        bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmSleeve);
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 72, 12, -8.0F, -16.5F, -2.0F, 4, 1, 4, 0.25F, false));


        bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 74, 16, -1.0F, 5.5F, -2.0F, 4, 1, 4, 0.25F, false));


        bpedRightLegHolster2 = new ModelRenderer(this);
        bpedRightLegHolster2.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bpedRightLegHolster2);
        bpedRightLegHolster2.cubeList.add(new ModelBox(bpedRightLegHolster2, 0, 32, -4.1F, -12.0F, -2.0F, 4, 12, 4, 0.175F, false));


        bpedLeftLegHolster = new ModelRenderer(this);
        bpedLeftLegHolster.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bpedLeftLegHolster);
        bpedLeftLegHolster.cubeList.add(new ModelBox(bpedLeftLegHolster, 0, 48, -0.1F, -12.0F, -2.0F, 4, 12, 4, 0.175F, false));
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