package com.alexjw.thematicarmor.client.model.southpark;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRandy extends ModelBiped {
    private final ModelRenderer bipedHeadFace;
    private final ModelRenderer bipedHeadMustache1;
    private final ModelRenderer bipedHeadMustache2;
    private final ModelRenderer bipedHeadEye;
    private final ModelRenderer bipedHeadEye2;
    private final ModelRenderer bipedBodyShirt;
    private final ModelRenderer bipedBodyShirt2;
    private final ModelRenderer bipedRightArmSleeve;
    private final ModelRenderer bipedLeftArmSleeve;


    public ModelRandy() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHeadFace = new ModelRenderer(this);
        bipedHeadFace.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadFace);
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 116, 32, -1.75F, -25.5F, -4.5F, 3, 1, 1, -0.3F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 116, 32, -1.75F, -28.0F, -4.75F, 1, 1, 2, -0.225F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 116, 32, 0.5F, -28.0F, -4.75F, 1, 1, 2, -0.225F, false));

        bipedHeadMustache1 = new ModelRenderer(this);
        bipedHeadMustache1.setRotationPoint(-0.25F, 24.0F, 0.25F);
        bipedHead.addChild(bipedHeadMustache1);
        setRotationAngle(bipedHeadMustache1, 0.0F, 0.0F, -0.0436F);
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, -0.7502F, -26.4891F, -4.75F, 2, 1, 1, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 110, 19, -1.7492F, -32.2445F, -4.75F, 3, 2, 3, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, -3.0416F, -31.3F, -1.0F, 3, 2, 3, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, -3.118F, -29.5517F, -2.0F, 3, 2, 3, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 31, -1.6184F, -29.5299F, -5.0F, 3, 1, 1, -0.4F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, -0.5649F, -30.7351F, -4.75F, 2, 1, 1, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, 0.9119F, -30.1701F, -4.75F, 2, 1, 1, 0.0F, false));
        bipedHeadMustache1.cubeList.add(new ModelBox(bipedHeadMustache1, 114, 21, -2.1061F, -29.8451F, -4.75F, 1, 1, 1, 0.0F, false));

        bipedHeadMustache2 = new ModelRenderer(this);
        bipedHeadMustache2.setRotationPoint(-2.5F, 24.0F, 0.25F);
        bipedHead.addChild(bipedHeadMustache2);
        setRotationAngle(bipedHeadMustache2, 0.0F, 0.0F, 0.1091F);
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 114, 21, -0.503F, -26.5544F, -4.75F, 2, 1, 1, 0.0F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 116, 32, -0.5865F, -29.6135F, -5.0F, 3, 1, 1, -0.4F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 24, 9, 1.8828F, -29.9756F, -4.75F, 1, 1, 1, 0.0F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 24, 9, 0.6402F, -29.8395F, -4.75F, 1, 1, 1, 0.0F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 108, 15, 1.0248F, -29.6242F, -2.0F, 3, 2, 3, 0.0F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 108, 15, 0.8615F, -31.1153F, -0.25F, 3, 2, 3, 0.05F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 104, 12, -0.2958F, -32.4975F, -4.5F, 3, 2, 3, 0.05F, false));
        bipedHeadMustache2.cubeList.add(new ModelBox(bipedHeadMustache2, 24, 9, -3.1691F, -30.1768F, -4.75F, 1, 1, 1, 0.0F, false));

        bipedHeadEye = new ModelRenderer(this);
        bipedHeadEye.setRotationPoint(-2.5F, 24.0F, 0.25F);
        bipedHead.addChild(bipedHeadEye);
        setRotationAngle(bipedHeadEye, 0.0F, 0.0F, 0.1091F);
        bipedHeadEye.cubeList.add(new ModelBox(bipedHeadEye, 80, 15, -0.0024F, -28.8727F, -4.5F, 2, 2, 1, 0.0F, false));

        bipedHeadEye2 = new ModelRenderer(this);
        bipedHeadEye2.setRotationPoint(-0.5F, 24.2F, 0.25F);
        bipedHead.addChild(bipedHeadEye2);
        setRotationAngle(bipedHeadEye2, 0.0F, 0.0F, -0.0829F);
        bipedHeadEye2.cubeList.add(new ModelBox(bipedHeadEye2, 78, 16, -0.0024F, -28.8727F, -4.5F, 2, 2, 1, 0.0F, false));



        bipedBodyShirt = new ModelRenderer(this);
        bipedBodyShirt.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyShirt);
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 103, 17, 1.375F, -19.5F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 112, 18, 1.375F, -20.5F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 114, 11, 2.5F, -20.75F, -2.5F, 1, 2, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 92, 49, 1.9F, -20.0F, -2.225F, 1, 1, 1, -0.05F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 77, 32, 1.5F, -21.25F, -2.55F, 1, 2, 1, -0.4F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 80, 12, 1.35F, -21.25F, -2.5F, 2, 2, 1, -0.425F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 90, 35, 1.75F, -21.15F, -2.55F, 1, 2, 1, -0.4F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 114, 17, 1.25F, -20.75F, -2.5F, 1, 2, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 89, 51, 1.0F, -24.5F, -2.5F, 2, 3, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 89, 51, -3.0F, -24.5F, -2.5F, 2, 3, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 89, 51, 1.0F, -24.5F, -2.5F, 2, 3, 1, -0.3F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 114, 17, -0.25F, -20.75F, -2.5F, 1, 8, 1, -0.25F, false));
        bipedBodyShirt.cubeList.add(new ModelBox(bipedBodyShirt, 114, 17, -0.25F, -21.25F, -2.5F, 1, 2, 1, -0.25F, false));

        bipedBodyShirt2 = new ModelRenderer(this);
        bipedBodyShirt2.setRotationPoint(-4.75F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyShirt2);
        bipedBodyShirt2.cubeList.add(new ModelBox(bipedBodyShirt2, 103, 17, 1.375F, -19.5F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyShirt2.cubeList.add(new ModelBox(bipedBodyShirt2, 112, 18, 1.375F, -20.5F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyShirt2.cubeList.add(new ModelBox(bipedBodyShirt2, 114, 11, 2.5F, -20.75F, -2.5F, 1, 2, 1, -0.3F, false));
        bipedBodyShirt2.cubeList.add(new ModelBox(bipedBodyShirt2, 114, 17, 1.25F, -20.75F, -2.5F, 1, 2, 1, -0.3F, false));


        bipedRightArmSleeve = new ModelRenderer(this);
        bipedRightArmSleeve.setRotationPoint(-7.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmSleeve);
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 19, 24, 4.0F, -18.25F, -2.0F, 4, 2, 4, 0.15F, false));


        bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 19, 24, 4.0F, -18.25F, -2.0F, 4, 2, 4, 0.15F, false));


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