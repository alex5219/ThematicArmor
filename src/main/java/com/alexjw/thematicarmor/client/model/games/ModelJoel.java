package com.alexjw.thematicarmor.client.model.games;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJoel extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedHeadHair;
    private final ModelRenderer bipedBodyCanister;
    private final ModelRenderer bipedBodyGasMask;
    private final ModelRenderer bipedBodyBackPack;
    private final ModelRenderer bipedBodyDetail1;
    private final ModelRenderer bipedBodyDetail2;
    private final ModelRenderer bipedRightArmDetail;
    private final ModelRenderer bipedLeftArmDetail;


    public ModelJoel() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;



        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 42, 28, -1.15F, -25.5F, -4.275F, 1, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 42, 28, 0.15F, -25.5F, -4.275F, 1, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 42, 28, 1.55F, -27.175F, -4.275F, 1, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 42, 28, -2.45F, -27.175F, -4.275F, 1, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 65, 2, -1.025F, -26.0F, -4.35F, 2, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 24, 11, 0.725F, -29.0F, -4.35F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 23, 10, -2.775F, -29.0F, -4.35F, 2, 1, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 23, 10, 1.225F, -29.05F, -4.35F, 2, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 23, 10, -3.275F, -29.05F, -4.35F, 2, 1, 1, -0.15F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 9, 7, -1.025F, -24.675F, -4.35F, 2, 1, 1, -0.15F, false));

        bipedHeadHair = new ModelRenderer(this);
        bipedHeadHair.setRotationPoint(25.625F, 13.375F, 0.575F);
        bipedHead.addChild(bipedHeadHair);
        setRotationAngle(bipedHeadHair, 0.0F, 0.0F, -0.8508F);
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -0.9737F, -31.0908F, -5.0F, 1, 2, 1, 0.0F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -1.8473F, -32.087F, -5.0F, 1, 2, 1, 0.0F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -2.5067F, -32.8388F, -5.0F, 1, 2, 1, -0.05F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -2.8132F, -33.5676F, -5.0F, 1, 2, 1, -0.05F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -4.666F, -35.3011F, -5.0F, 1, 2, 1, -0.15F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -3.1825F, -33.6095F, -5.0F, 1, 2, 1, -0.2F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 9, 2, -3.5122F, -33.9854F, -5.0F, 1, 2, 1, -0.15F, false));


        bipedBodyCanister = new ModelRenderer(this);
        bipedBodyCanister.setRotationPoint(-0.75F, 24.25F, 0.75F);
        bipedBody.addChild(bipedBodyCanister);
        setRotationAngle(bipedBodyCanister, 0.0F, 0.2705F, 0.0F);
        bipedBodyCanister.cubeList.add(new ModelBox(bipedBodyCanister, 66, 57, 2.843F, -13.4042F, 2.65F, 2, 2, 2, -0.5F, false));
        bipedBodyCanister.cubeList.add(new ModelBox(bipedBodyCanister, 105, 48, 2.7802F, -13.4042F, 2.9699F, 2, 2, 2, -0.65F, false));

        bipedBodyGasMask = new ModelRenderer(this);
        bipedBodyGasMask.setRotationPoint(-6.0F, 35.75F, 8.25F);
        bipedBody.addChild(bipedBodyGasMask);
        setRotationAngle(bipedBodyGasMask, 0.0F, 0.0F, 0.336F);
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, -2.25F, -27.0F, -6.5F, 4, 2, 2, -0.425F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, -2.75F, -27.5F, -6.5F, 5, 2, 2, -0.425F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, -2.25F, -29.75F, -6.5F, 4, 2, 2, -0.375F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, -0.6782F, -28.9715F, -5.7F, 1, 3, 1, -0.075F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, -2.55F, -29.0F, -6.5F, 1, 3, 2, -0.25F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 99, 48, 1.0F, -29.0F, -6.575F, 1, 3, 2, -0.2F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 78, 58, -2.25F, -28.6F, -6.0F, 2, 2, 2, -0.475F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 92, 26, -2.25F, -28.6F, -6.35F, 2, 2, 2, -0.35F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 92, 26, -1.2792F, -27.2497F, -6.35F, 2, 2, 2, -0.4F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 92, 26, -0.7767F, -26.7645F, -5.1F, 1, 1, 1, -0.375F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 110, 53, -1.2792F, -27.2497F, -6.075F, 2, 2, 2, -0.5F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 92, 26, -0.757F, -28.6412F, -6.35F, 1, 3, 2, -0.4F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 92, 26, -0.2475F, -28.6352F, -6.35F, 2, 2, 2, -0.35F, false));
        bipedBodyGasMask.cubeList.add(new ModelBox(bipedBodyGasMask, 78, 58, -0.2393F, -28.6116F, -6.0F, 2, 2, 2, -0.475F, false));

        bipedBodyBackPack = new ModelRenderer(this);
        bipedBodyBackPack.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyBackPack);
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 98, 9, 2.75F, -24.25F, -2.5F, 1, 6, 5, 0.125F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 98, 9, 3.275F, -19.625F, -2.5F, 1, 4, 5, -0.025F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 98, 9, -4.225F, -19.625F, -2.5F, 1, 4, 5, -0.025F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 98, 9, -3.75F, -24.25F, -2.5F, 1, 6, 5, 0.125F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 40, -3.75F, -22.0F, -3.25F, 1, 2, 1, -0.125F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 40, -3.75F, -22.2F, -3.25F, 1, 1, 1, -0.025F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 93, 28, -3.75F, -22.2F, -3.525F, 1, 1, 1, -0.15F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 62, 44, -2.5F, -23.15F, 1.0F, 5, 7, 2, 0.275F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -4.175F, -19.4F, 2.0F, 1, 4, 1, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -3.675F, -16.65F, 3.7F, 0, 1, 0, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -3.675F, -16.9F, 3.425F, 0, 0, 0, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -3.675F, -15.2F, 3.425F, 0, 0, 0, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -3.675F, -15.85F, 3.175F, 0, 0, 0, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 91, 42, -4.175F, -15.15F, 1.975F, 1, 3, 1, 0.2F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 91, 42, -4.175F, -14.075F, 2.25F, 1, 3, 1, 0.225F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 91, 42, -4.175F, -13.5F, 2.55F, 1, 3, 1, 0.125F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 91, 42, -4.175F, -23.875F, 2.075F, 1, 3, 1, 0.075F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -4.175F, -25.65F, 1.75F, 1, 7, 1, -0.025F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -4.175F, -27.4F, 1.75F, 1, 7, 1, -0.1F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 106, 50, -4.175F, -25.4F, 2.25F, 1, 7, 1, -0.2F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 70, 46, -2.5F, -19.65F, 1.0F, 5, 3, 2, 0.55F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 70, 46, -2.0F, -23.075F, 1.0F, 4, 2, 2, 0.55F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 26, 49, 1.25F, -21.325F, 3.5F, 0, 2, 0, 0.45F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 26, 49, -1.3F, -21.325F, 3.5F, 0, 2, 0, 0.45F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 94, 28, -1.8F, -21.075F, 3.0F, 1, 0, 1, 0.175F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 89, 41, -1.05F, -18.65F, 2.675F, 2, 2, 1, 0.175F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 94, 28, 0.7F, -21.075F, 3.0F, 1, 0, 1, 0.175F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 66, 40, -1.55F, -18.325F, 2.425F, 3, 0, 1, 0.3F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 72, 40, -1.55F, -17.45F, 2.425F, 3, 0, 1, 0.3F, false));
        bipedBodyBackPack.cubeList.add(new ModelBox(bipedBodyBackPack, 70, 46, -1.55F, -16.575F, 2.45F, 3, 0, 1, 0.3F, false));

        bipedBodyDetail1 = new ModelRenderer(this);
        bipedBodyDetail1.setRotationPoint(3.75F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyDetail1);
        setRotationAngle(bipedBodyDetail1, 0.0F, 0.0F, -0.2051F);
        bipedBodyDetail1.cubeList.add(new ModelBox(bipedBodyDetail1, 69, 12, -0.5614F, -24.4034F, -2.5F, 1, 3, 1, 0.0F, false));
        bipedBodyDetail1.cubeList.add(new ModelBox(bipedBodyDetail1, 69, 12, -1.4844F, -24.8763F, -2.5F, 1, 2, 1, -0.05F, false));
        bipedBodyDetail1.cubeList.add(new ModelBox(bipedBodyDetail1, 29, 28, -1.1645F, -12.9104F, -2.275F, 4, 2, 1, -0.05F, false));
        bipedBodyDetail1.cubeList.add(new ModelBox(bipedBodyDetail1, 69, 12, -0.326F, -21.852F, -2.5F, 1, 1, 1, 0.0F, false));

        bipedBodyDetail2 = new ModelRenderer(this);
        bipedBodyDetail2.setRotationPoint(-2.25F, 24.25F, 0.0F);
        bipedBody.addChild(bipedBodyDetail2);
        setRotationAngle(bipedBodyDetail2, 0.0F, 0.0F, 0.1789F);
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 69, 12, -1.3737F, -24.4284F, -2.5F, 1, 3, 1, 0.0F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 69, 12, -0.7247F, -25.0538F, -2.5F, 1, 2, 1, -0.075F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 16, 28, -4.0672F, -12.8989F, -2.325F, 4, 2, 1, -0.075F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 29, 20, 0.3609F, -13.6996F, -1.825F, 4, 2, 4, -0.075F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 69, 12, -1.618F, -21.5642F, -2.5F, 1, 1, 1, 0.0F, false));


        bipedRightArmDetail = new ModelRenderer(this);
        bipedRightArmDetail.setRotationPoint(5.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmDetail);
        bipedRightArmDetail.cubeList.add(new ModelBox(bipedRightArmDetail, 64, 10, -8.5F, -17.875F, -2.425F, 5, 2, 5, -0.2F, false));


        bipedLeftArmDetail = new ModelRenderer(this);
        bipedLeftArmDetail.setRotationPoint(-5.0F, 22.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmDetail);
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 63, 10, 3.5F, -17.875F, -2.425F, 5, 2, 5, -0.2F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 65, 28, 4.0F, -15.525F, -2.0F, 4, 1, 4, 0.15F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 65, 28, 7.55F, -16.0F, -0.85F, 1, 2, 2, -0.2F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 94, 26, 7.8F, -16.0F, -0.85F, 1, 2, 2, -0.325F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 71, 25, 7.95F, -15.95F, -0.35F, 1, 1, 1, -0.35F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 71, 25, 7.95F, -15.5F, 0.1F, 1, 1, 1, -0.35F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 7, 26, 8.025F, -15.25F, -0.35F, 1, 0, 1, -0.4F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 7, 26, 8.55F, -14.975F, 0.375F, 0, 0, 0, 0.125F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 7, 26, 8.575F, -14.975F, 0.525F, 0, 0, 0, 0.1F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 71, 25, 7.95F, -15.5F, -0.8F, 1, 1, 1, -0.35F, false));
        bipedLeftArmDetail.cubeList.add(new ModelBox(bipedLeftArmDetail, 71, 25, 7.95F, -15.05F, -0.35F, 1, 1, 1, -0.35F, false));


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