package com.alexjw.siegecraft.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorDoc extends ModelBiped {

    public ModelOperatorDoc() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        ModelRenderer headHelmet = new ModelRenderer(this);
        headHelmet.setRotationPoint(0.0F, 29.75F, 0.0F);
        bipedHead.addChild(headHelmet);
        headHelmet.cubeList.add(new ModelBox(headHelmet, 86, 84, -4.0F, -37.0F, 3.75F, 8, 8, 1, 0.0F, false));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 97, 81, 3.5F, -38.0F, -4.25F, 1, 4, 9, 0.0F, true));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 97, 76, 3.5F, -34.0F, -1.25F, 1, 4, 6, 0.0F, true));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 94, 80, -4.5F, -38.0F, -4.25F, 1, 4, 9, 0.0F, false));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 98, 79, -4.5F, -34.0F, -1.25F, 1, 4, 6, 0.0F, false));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 71, 25, -5.0F, -37.0F, -4.5F, 10, 2, 1, 0.0F, true));
        headHelmet.cubeList.add(new ModelBox(headHelmet, 85, 80, -4.0F, -38.0F, -4.25F, 8, 1, 9, 0.0F, false));

        ModelRenderer visor = new ModelRenderer(this);
        visor.setRotationPoint(0.0F, -34.3333F, -0.8333F);
        headHelmet.addChild(visor);
        setRotationAngle(visor, -0.6109F, 0.0F, 0.0F);
        visor.cubeList.add(new ModelBox(visor, 23, 82, -5.5F, -2.6667F, -4.1667F, 1, 5, 4, 0.0F, false));
        visor.cubeList.add(new ModelBox(visor, 26, 85, 4.5F, -2.6667F, -4.1667F, 1, 5, 4, 0.0F, true));
        visor.cubeList.add(new ModelBox(visor, 18, 88, -5.5F, -2.6667F, -5.1667F, 11, 6, 1, 0.0F, false));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

        ModelRenderer bodyChestplate = new ModelRenderer(this);
        bodyChestplate.setRotationPoint(0.0F, 29.5F, 0.0F);
        bipedBody.addChild(bodyChestplate);
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 94, 86, -4.0F, -29.0F, -3.0F, 8, 12, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 99, 82, -3.0F, -29.25F, -3.75F, 6, 3, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 102, 84, 3.5F, -29.0F, -3.0F, 2, 3, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 100, 82, 3.5F, -30.0F, -3.0F, 2, 1, 6, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 99, 86, -5.5F, -30.0F, -3.0F, 2, 1, 6, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 102, 86, -5.5F, -29.0F, -3.0F, 2, 3, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 101, 79, 4.0F, -26.0F, -3.0F, 1, 2, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 94, 80, -5.0F, -26.0F, -3.0F, 1, 2, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 96, 83, -5.0F, -26.0F, 2.0F, 1, 2, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 103, 84, 4.0F, -26.0F, 2.0F, 1, 2, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 102, 80, -6.0F, -29.0F, 2.0F, 2, 3, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 91, 86, -3.0F, -17.25F, -2.75F, 6, 1, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 94, 84, -2.0F, -16.25F, -2.5F, 4, 1, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 91, 90, -2.0F, -16.0F, 1.5F, 4, 1, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 96, 82, -3.0F, -17.0F, 1.75F, 6, 1, 1, 0.0F, true));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 99, 81, 4.0F, -29.0F, 2.0F, 2, 3, 1, 0.0F, false));
        bodyChestplate.cubeList.add(new ModelBox(bodyChestplate, 87, 89, -4.0F, -29.0F, 2.0F, 8, 12, 1, 0.0F, false));

        ModelRenderer equipment = new ModelRenderer(this);
        equipment.setRotationPoint(0.0F, 0.0F, 0.0F);
        bodyChestplate.addChild(equipment);
        equipment.cubeList.add(new ModelBox(equipment, 81, 30, 1.1F, -25.0F, -3.5F, 1, 2, 1, 0.0F, false));
        equipment.cubeList.add(new ModelBox(equipment, 82, 30, 2.4F, -25.0F, -3.5F, 1, 2, 1, 0.0F, false));
        equipment.cubeList.add(new ModelBox(equipment, 109, 30, -2.35F, -21.6F, -3.5F, 2, 2, 1, 0.0F, false));
        equipment.cubeList.add(new ModelBox(equipment, 106, 28, 0.15F, -21.6F, -3.75F, 3, 2, 1, -0.2F, false));
        equipment.cubeList.add(new ModelBox(equipment, 106, 28, -3.5F, -27.6F, 2.75F, 7, 3, 1, -0.2F, false));
        equipment.cubeList.add(new ModelBox(equipment, 105, 31, 1.0F, -23.35F, 2.75F, 2, 4, 1, -0.2F, false));
        equipment.cubeList.add(new ModelBox(equipment, 109, 28, -1.0F, -23.35F, 2.75F, 2, 4, 1, -0.2F, false));

        ModelRenderer bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-3.95F, 0.35F, 0.0F);
        equipment.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 109, 26, 0.0F, -25.55F, -3.75F, 3, 3, 1, -0.3F, false));
        bone3.cubeList.add(new ModelBox(bone3, 108, 27, 2.95F, -25.4F, -3.75F, 2, 3, 1, -0.2F, false));

        ModelRenderer bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-5.7F, -3.4F, 0.0F);
        equipment.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 102, 37, 0.75F, -23.75F, -3.5F, 2, 1, 1, -0.1F, false));
        bone2.cubeList.add(new ModelBox(bone2, 106, 33, 0.85F, -25.0F, -3.25F, 2, 1, 1, 0.0F, false));

        ModelRenderer bone = new ModelRenderer(this);
        bone.setRotationPoint(4.4F, -29.1F, -3.5F);
        equipment.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, 0.3491F);
        bone.cubeList.add(new ModelBox(bone, 106, 34, -0.75F, 0.5F, 0.0F, 1, 2, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 110, 30, -0.5F, -1.0F, -0.25F, 1, 2, 1, -0.4F, false));

        ModelRenderer rightarmShoulder2 = new ModelRenderer(this);
        rightarmShoulder2.setRotationPoint(5.0F, 27.0F, 0.0F);
        bipedRightArm.addChild(rightarmShoulder2);
        rightarmShoulder2.cubeList.add(new ModelBox(rightarmShoulder2, 102, 27, -8.5F, -29.5F, -2.5F, 3, 4, 5, 0.0F, false));
        rightarmShoulder2.cubeList.add(new ModelBox(rightarmShoulder2, 105, 29, -8.25F, -28.5F, -2.25F, 2, 4, 4, 0.0F, false));
        rightarmShoulder2.cubeList.add(new ModelBox(rightarmShoulder2, 96, 7, -9.0F, -29.0F, -1.5F, 1, 3, 3, 0.0F, false));

        ModelRenderer rightarmShoulder = new ModelRenderer(this);
        rightarmShoulder.setRotationPoint(-5.0F, 27.0F, 0.0F);
        bipedLeftArm.addChild(rightarmShoulder);
        rightarmShoulder.cubeList.add(new ModelBox(rightarmShoulder, 68, 26, 5.5F, -29.5F, -2.5F, 3, 4, 5, 0.0F, false));
        rightarmShoulder.cubeList.add(new ModelBox(rightarmShoulder, 68, 26, 6.25F, -28.5F, -2.25F, 2, 4, 4, 0.0F, false));
        rightarmShoulder.cubeList.add(new ModelBox(rightarmShoulder, 121, 7, 8.0F, -29.0F, -1.0F, 1, 3, 2, 0.0F, false));

        ModelRenderer leftleggin = new ModelRenderer(this);
        leftleggin.setRotationPoint(7.0F, 2.0F, -5.0F);
        bipedRightLeg.addChild(leftleggin);
        leftleggin.cubeList.add(new ModelBox(leftleggin, 102, 77, -9.6415F, -0.5888F, 5.9F, 1, 4, 1, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 101, 81, -9.6415F, -0.5888F, 3.1F, 1, 4, 1, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 106, 32, -10.4415F, -0.5888F, 2.9F, 1, 4, 4, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 90, 82, -9.4415F, -0.5888F, 4.0F, 1, 4, 1, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 101, 79, -9.4415F, -1.2888F, 4.0F, 1, 1, 2, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 110, 34, -9.4415F, -2.0888F, 4.3F, 1, 1, 3, -0.1F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 94, 84, -9.6415F, -0.5888F, 2.9F, 5, 1, 1, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 94, 76, -9.6415F, -0.5888F, 6.1F, 5, 1, 1, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 89, 75, -5.6915F, -0.5888F, 2.9F, 1, 1, 4, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 97, 76, -9.0585F, -0.3888F, 2.9F, 0, 1, 4, 0.0F, true));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 94, 81, -9.6415F, 1.3112F, 2.9F, 5, 1, 1, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 100, 92, -9.6415F, 1.3112F, 6.1F, 5, 1, 1, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 98, 85, -5.6915F, 1.3112F, 2.9F, 1, 1, 4, 0.0F, false));
        leftleggin.cubeList.add(new ModelBox(leftleggin, 94, 84, -9.0585F, 1.5112F, 2.9F, 0, 1, 4, 0.0F, true));

        ModelRenderer rightleggin = new ModelRenderer(this);
        rightleggin.setRotationPoint(3.0F, 2.0F, 5.0F);
        bipedLeftLeg.addChild(rightleggin);
        rightleggin.cubeList.add(new ModelBox(rightleggin, 106, 28, -1.25F, -3.0F, -7.0F, 1, 6, 4, 0.0F, false));
        rightleggin.cubeList.add(new ModelBox(rightleggin, 100, 88, -1.7F, -3.5F, -6.5F, 2, 5, 3, -0.2F, false));
        rightleggin.cubeList.add(new ModelBox(rightleggin, 112, 18, -2.0F, -3.0F, -7.75F, 2, 2, 1, 0.0F, false));
        rightleggin.cubeList.add(new ModelBox(rightleggin, 107, 29, -1.5F, -2.0F, -7.5F, 1, 3, 3, 0.0F, false));
        rightleggin.cubeList.add(new ModelBox(rightleggin, 108, 21, -1.5F, -2.0F, -3.5F, 1, 3, 1, 0.0F, false));
        rightleggin.cubeList.add(new ModelBox(rightleggin, 110, 30, -2.0F, -3.0F, -3.25F, 2, 2, 1, 0.0F, false));
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