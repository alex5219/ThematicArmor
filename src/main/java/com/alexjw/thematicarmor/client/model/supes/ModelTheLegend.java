package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTheLegend extends ModelBiped {
    private final ModelRenderer bipedHeadDetailing;
    private final ModelRenderer BipedBodyShield;
    private final ModelRenderer BipedBodyMjlnir;
    private final ModelRenderer bipedBodyDetailing1;
    private final ModelRenderer bipedRightArmClaws;
    private final ModelRenderer bipedLeftArmGauntlet;


    public ModelTheLegend() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHeadDetailing = new ModelRenderer(this);
        bipedHeadDetailing.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetailing);
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 22, 9, -3.0F, -29.45F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 22, 9, -1.0F, -26.525F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 102, 8, -1.0F, -25.0F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 102, 8, -1.525F, -25.35F, -4.5F, 3, 1, 1, -0.275F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 22, 8, -1.525F, -25.45F, -4.65F, 3, 1, 1, -0.325F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 22, 9, -2.0F, -26.2F, -4.5F, 4, 1, 1, -0.175F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 85, 33, -4.0F, -32.3F, -3.3F, 8, 1, 7, 0.15F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 88, 32, -4.5F, -31.3F, -2.8F, 9, 2, 7, -0.075F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 86, 32, -4.5F, -32.8F, -0.8F, 9, 2, 5, -0.1F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 85, 32, -3.5F, -27.95F, 0.7F, 7, 2, 4, -0.425F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 85, 32, -4.5F, -29.45F, 0.2F, 9, 2, 4, -0.075F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 22, 9, 1.0F, -29.55F, -4.5F, 2, 1, 1, -0.2F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -4.45F, -28.925F, -4.775F, 9, 1, 1, -0.175F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, 3.45F, -28.925F, -4.275F, 1, 1, 5, -0.175F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -4.375F, -28.925F, -4.275F, 1, 1, 5, -0.175F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -1.025F, -28.425F, -4.775F, 1, 2, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -3.9F, -27.175F, -4.675F, 3, 1, 1, -0.3F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -1.5F, -27.2F, -4.675F, 1, 1, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, 0.35F, -27.2F, -4.675F, 1, 1, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, 0.75F, -27.175F, -4.675F, 3, 1, 1, -0.3F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, 0.05F, -28.425F, -4.775F, 1, 2, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, -3.95F, -28.425F, -4.775F, 1, 2, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 99, 6, 2.8F, -28.425F, -4.775F, 1, 2, 1, -0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 78, 6, 1.0F, -28.0F, -4.125F, 2, 1, 1, 0.225F, false));
        bipedHeadDetailing.cubeList.add(new ModelBox(bipedHeadDetailing, 78, 6, -3.0F, -28.0F, -4.125F, 2, 1, 1, 0.225F, false));



        BipedBodyShield = new ModelRenderer(this);
        BipedBodyShield.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(BipedBodyShield);
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 97, 53, -3.6F, -23.125F, 1.475F, 7, 7, 1, 0.175F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 97, 53, -3.6F, -22.625F, 1.475F, 7, 6, 1, 0.3F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 97, 53, -3.1F, -23.125F, 1.475F, 6, 7, 1, 0.3F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 79, 65, -3.6F, -23.125F, 2.125F, 7, 7, 1, -0.175F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 98, 48, -3.6F, -23.125F, 1.925F, 7, 7, 2, -0.7F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 98, 65, -3.6F, -23.125F, 2.15F, 7, 7, 2, -1.325F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.0F, -20.5F, 2.75F, 2, 2, 1, 0.0F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -0.5F, -21.0F, 2.75F, 1, 1, 1, 0.0F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.625F, -21.0F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -0.5F, -21.5F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.625F, -19.0F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.375F, -19.5F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.125F, -19.15F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.125F, -19.15F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.375F, -19.5F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.375F, -20.5F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.375F, -20.5F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, -1.375F, -20.75F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.125F, -20.75F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.625F, -19.0F, 2.825F, 1, 1, 1, -0.125F, false));
        BipedBodyShield.cubeList.add(new ModelBox(BipedBodyShield, 88, 66, 0.625F, -21.0F, 2.825F, 1, 1, 1, -0.125F, false));

        BipedBodyMjlnir = new ModelRenderer(this);
        BipedBodyMjlnir.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(BipedBodyMjlnir);
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 78, 45, -4.525F, -10.35F, 0.0F, 1, 1, 1, -0.075F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -9.725F, 0.0F, 1, 1, 1, 0.025F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -5.725F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -4.975F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -6.475F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -7.225F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -7.975F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 114, 20, -4.6F, -8.725F, 0.0F, 1, 0, 1, 0.1F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 88, 55, -4.6F, -8.725F, 0.0F, 1, 4, 1, -0.025F, false));
        BipedBodyMjlnir.cubeList.add(new ModelBox(BipedBodyMjlnir, 107, 20, -5.6F, -5.225F, -2.0F, 3, 3, 5, -0.25F, false));

        bipedBodyDetailing1 = new ModelRenderer(this);
        bipedBodyDetailing1.setRotationPoint(-5.25F, 22.2F, 0.0F);
        bipedBody.addChild(bipedBodyDetailing1);
        setRotationAngle(bipedBodyDetailing1, 0.0F, 0.0F, 0.5236F);
        bipedBodyDetailing1.cubeList.add(new ModelBox(bipedBodyDetailing1, 76, 42, -3.75F, -24.0F, -2.5F, 1, 16, 1, 0.0F, false));
        bipedBodyDetailing1.cubeList.add(new ModelBox(bipedBodyDetailing1, 76, 42, -3.75F, -24.0F, 1.5F, 1, 16, 1, 0.0F, false));
        bipedBodyDetailing1.cubeList.add(new ModelBox(bipedBodyDetailing1, 70, 55, -3.8816F, -8.7279F, -2.0F, 1, 1, 4, 0.05F, false));
        bipedBodyDetailing1.cubeList.add(new ModelBox(bipedBodyDetailing1, 70, 55, -3.4659F, -24.0079F, -2.0F, 1, 1, 4, 0.225F, false));



        bipedRightArmClaws = new ModelRenderer(this);
        bipedRightArmClaws.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmClaws);
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 108, 26, -8.25F, -12.5F, -0.475F, 1, 3, 1, -0.05F, false));
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 110, 25, -8.25F, -12.5F, -1.725F, 1, 3, 1, -0.05F, false));
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 111, 21, -8.0F, -11.25F, -1.725F, 1, 3, 1, -0.1F, false));
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 114, 22, -8.0F, -11.25F, -0.475F, 1, 3, 1, -0.1F, false));
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 114, 20, -8.0F, -11.25F, 0.775F, 1, 3, 1, -0.1F, false));
        bipedRightArmClaws.cubeList.add(new ModelBox(bipedRightArmClaws, 109, 24, -8.25F, -12.5F, 0.775F, 1, 3, 1, -0.05F, false));


        bipedLeftArmGauntlet = new ModelRenderer(this);
        bipedLeftArmGauntlet.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmGauntlet);
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 91, 24, 4.0F, -14.675F, -2.0F, 4, 3, 4, 0.225F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 98, 25, 4.35F, -14.8F, -1.0F, 4, 3, 2, 0.225F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 98, 28, 3.8F, -13.1F, -2.575F, 2, 1, 2, 0.025F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 92, 24, 4.5F, -12.85F, -2.0F, 4, 1, 4, 0.125F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 97, 25, 4.65F, -17.75F, -1.0F, 4, 3, 2, 0.225F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 91, 24, 4.0F, -17.375F, -2.0F, 4, 3, 4, 0.45F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 71, 26, 7.75F, -14.175F, -0.5F, 1, 1, 1, 0.075F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 71, 36, 7.9F, -12.8F, -2.025F, 1, 1, 1, -0.15F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 80, 37, 4.35F, -13.05F, -3.025F, 1, 1, 1, -0.15F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 80, 32, 7.9F, -12.8F, -1.025F, 1, 1, 1, -0.15F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 70, 32, 7.9F, -12.8F, 0.025F, 1, 1, 1, -0.15F, false));
        bipedLeftArmGauntlet.cubeList.add(new ModelBox(bipedLeftArmGauntlet, 78, 27, 7.9F, -12.8F, 1.05F, 1, 1, 1, -0.15F, false));


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