package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBlackCanary extends ModelBiped {
    private final ModelRenderer bipedHeadHair;
    private final ModelRenderer bipedBodyDetail;
    private final ModelRenderer bipedBodyDetail2;
    private final ModelRenderer bipedBodyDetail3;
    private final ModelRenderer bipedRightArmSleeve;
    private final ModelRenderer bipedLeftArmSleeve;
    private final ModelRenderer bipedRightLegBoot;
    private final ModelRenderer bipedLeftLegBoot;

    public ModelBlackCanary() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadHair = new ModelRenderer(this);
        bipedHeadHair.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadHair);
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 0, 0, -4.0F, -32.75F, -4.0F, 8, 8, 8, -0.225F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 32, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.2F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 39, 22, 0.625F, -28.525F, -4.475F, 3, 1, 1, -0.3F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.625F, -29.1F, -4.425F, 3, 1, 1, -0.275F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 43, 22, -3.575F, -28.525F, -4.475F, 3, 1, 1, -0.3F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 0.625F, -29.1F, -4.425F, 3, 1, 1, -0.275F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 87, 3, -0.875F, -26.1F, -4.35F, 2, 1, 1, -0.125F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 69, 11, 3.5F, -32.0F, -4.8F, 1, 7, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 67, 14, 3.6F, -32.0F, -4.425F, 1, 8, 1, -0.025F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.6F, -32.0F, -3.55F, 9, 7, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.825F, -30.5F, -3.2F, 1, 7, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.75F, -25.5F, -3.175F, 1, 5, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 2.975F, -25.5F, -2.825F, 1, 5, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.275F, -32.0F, -2.3F, 9, 7, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.525F, -32.0F, -1.725F, 9, 8, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.2F, -32.0F, -0.975F, 9, 9, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.45F, -32.0F, 0.35F, 9, 9, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.4F, -32.0F, 1.1F, 9, 10, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.375F, -32.0F, 1.85F, 9, 10, 2, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.725F, -32.0F, 3.45F, 8, 11, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.55F, -27.475F, 2.85F, 7, 8, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 65, 8, -3.225F, -25.65F, 2.425F, 6, 8, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.2F, -32.0F, -0.225F, 9, 8, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.5F, -32.0F, -3.0F, 9, 6, 1, -0.075F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -4.2F, -32.0F, -4.525F, 1, 8, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.2F, -24.0F, -3.525F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 2.8F, -24.35F, -3.7F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 3.35F, -24.875F, -3.825F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 3.35F, -25.15F, -4.325F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, 2.5F, -24.35F, -3.05F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 63, 11, -3.95F, -21.0F, -2.775F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 70, 14, -3.5F, -21.75F, -2.55F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 70, 14, -3.4F, -18.85F, -2.55F, 1, 2, 1, -0.125F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 70, 14, -3.0F, -24.3F, -2.55F, 1, 2, 1, -0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 77, 21, -3.675F, -19.5F, -2.6F, 1, 2, 1, -0.125F, false));


        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.0F, 24.0F, -4.825F);
        bipedBody.addChild(bipedBodyDetail);
        setRotationAngle(bipedBodyDetail, -0.2051F, 0.0F, 0.0F);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 64, 28, -3.0F, -22.2195F, -2.2082F, 6, 3, 2, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 34, 21, -2.0F, -21.1171F, -2.8034F, 4, 1, 2, -0.35F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 34, 21, -2.0F, -21.7045F, -2.9256F, 4, 1, 2, -0.35F, false));

        bipedBodyDetail2 = new ModelRenderer(this);
        bipedBodyDetail2.setRotationPoint(2.5F, 21.7F, -0.575F);
        bipedBody.addChild(bipedBodyDetail2);
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 32, 21, -4.0F, -22.2114F, -2.0075F, 3, 1, 3, -0.2F, false));

        bipedBodyDetail3 = new ModelRenderer(this);
        bipedBodyDetail3.setRotationPoint(4.3F, 21.7F, -0.575F);
        bipedBody.addChild(bipedBodyDetail3);
        setRotationAngle(bipedBodyDetail3, 0.0F, 0.0F, -0.1178F);
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 86, 7, -6.937F, -12.1282F, -1.4075F, 8, 1, 4, 0.35F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -4.5692F, -13.1355F, -1.2325F, 3, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -2.1306F, -13.1666F, -1.2325F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -6.0127F, -13.1226F, -1.2325F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -7.4732F, -13.1193F, -1.2325F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -0.6204F, -13.1641F, -1.2325F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -0.6204F, -13.1641F, 2.5175F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -2.3877F, -13.1215F, 2.5175F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -4.9056F, -13.1175F, 2.5175F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 96, 1, -6.9737F, -13.0853F, 2.5175F, 2, 3, 0, -0.8F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 94, 11, -4.0873F, -12.65F, -1.5575F, 2, 2, 0, -0.6F, false));


        bipedRightArmSleeve = new ModelRenderer(this);
        bipedRightArmSleeve.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmSleeve);
        bipedRightArmSleeve.cubeList.add(new ModelBox(bipedRightArmSleeve, 92, 8, -8.425F, -18.4F, -2.575F, 4, 2, 5, -0.125F, false));


        bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(7.8F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 92, 8, -8.425F, -18.4F, -2.575F, 4, 2, 5, -0.125F, false));


        bipedRightLegBoot = new ModelRenderer(this);
        bipedRightLegBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegBoot);
        bipedRightLegBoot.cubeList.add(new ModelBox(bipedRightLegBoot, 22, 59, -3.0F, -5.75F, -2.35F, 2, 4, 1, -0.05F, false));


        bipedLeftLegBoot = new ModelRenderer(this);
        bipedLeftLegBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegBoot);
        bipedLeftLegBoot.cubeList.add(new ModelBox(bipedLeftLegBoot, 22, 59, 1.0F, -5.75F, -2.35F, 2, 4, 1, -0.05F, false));
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