package com.alexjw.thematicarmor.client.model.creators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCptSparklez extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodySword;
    private final ModelRenderer bipedLeftArmJerry;


    public ModelCptSparklez() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;



        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 3, -1.5F, -26.125F, -4.5F, 3, 1, 1, -0.2F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 10, -2.75F, -29.625F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 22, 10, 0.75F, -29.625F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 10, 10, -1.0F, -27.625F, -4.675F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 105, 4, -2.05F, -28.625F, -4.425F, 1, 1, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 105, 4, 1.025F, -28.625F, -4.425F, 1, 1, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 104, 12, 0.75F, -28.625F, -4.175F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 106, 13, -2.75F, -28.625F, -4.175F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, -4.5F, -28.125F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, 2.5F, -28.125F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, -4.5F, -28.125F, -3.75F, 1, 1, 5, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, -4.325F, -27.625F, 0.75F, 1, 1, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, 3.325F, -27.625F, 0.75F, 1, 1, 1, -0.05F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, 3.5F, -28.125F, -3.75F, 1, 1, 5, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 71, 12, -1.0F, -28.125F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 88, 2, 0.75F, -28.125F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 88, 2, -2.75F, -28.125F, -4.5F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 19, 9, -0.75F, -31.375F, -4.5F, 5, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 19, 9, -0.75F, -32.625F, -4.25F, 5, 2, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 19, 9, -0.75F, -32.375F, -2.5F, 5, 2, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 19, 9, -3.25F, -32.375F, -3.75F, 5, 2, 2, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 18, 8, -4.25F, -31.625F, -4.15F, 1, 2, 3, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 18, 8, 3.5F, -31.625F, -4.15F, 1, 2, 3, 0.0F, false));


        bipedBodySword = new ModelRenderer(this);
        bipedBodySword.setRotationPoint(5.5F, 6.525F, -5.5F);
        bipedBody.addChild(bipedBodySword);
        setRotationAngle(bipedBodySword, 0.7898F, 0.0F, 0.0F);
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 112, 56, -10.25F, 5.25F, -0.25F, 1, 10, 1, -0.2F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 27, 28, -10.5F, 6.7174F, -0.778F, 2, 1, 2, -0.2F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 112, 56, -10.25F, 5.825F, 0.075F, 1, 10, 1, -0.35F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 112, 56, -10.25F, 5.25F, -0.6F, 1, 9, 1, -0.275F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.25F, 4.75F, -1.35F, 1, 1, 3, -0.175F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.75F, 5.0F, -1.35F, 2, 1, 3, -0.375F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.25F, 4.5F, 0.65F, 1, 1, 2, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.25F, 4.5F, -2.35F, 1, 1, 2, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.25F, 2.425F, -0.35F, 1, 3, 1, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 44, 22, -10.25F, 2.175F, -0.35F, 1, 1, 1, -0.15F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 117, 53, -10.45F, 2.175F, -0.35F, 1, 1, 1, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 117, 53, -10.2F, 1.925F, -0.35F, 1, 1, 1, -0.25F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 89, 60, -11.2F, 3.675F, -1.35F, 3, 3, 3, -1.1F, false));
        bipedBodySword.cubeList.add(new ModelBox(bipedBodySword, 117, 53, -10.05F, 2.175F, -0.35F, 1, 1, 1, -0.25F, false));


        bipedLeftArmJerry = new ModelRenderer(this);
        bipedLeftArmJerry.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmJerry);
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 104, 48, 3.0F, -28.5F, -3.0F, 6, 6, 6, -1.3F, false));
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 93, 1, 4.525F, -26.375F, -2.0F, 1, 1, 1, -0.1F, false));
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 93, 1, 5.525F, -25.375F, -2.075F, 1, 1, 1, -0.2F, false));
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 30, 25, 6.125F, -26.2F, -2.375F, 1, 1, 1, -0.3F, false));
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 43, 22, 4.625F, -26.225F, -2.325F, 1, 1, 1, -0.3F, false));
        bipedLeftArmJerry.cubeList.add(new ModelBox(bipedLeftArmJerry, 93, 1, 6.275F, -26.375F, -1.975F, 1, 1, 1, -0.05F, false));


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