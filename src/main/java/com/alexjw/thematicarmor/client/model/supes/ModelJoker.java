package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJoker extends ModelBiped {
    private final ModelRenderer bipedHeadNose;
    private final ModelRenderer bipedHeadHair;
    private final ModelRenderer bipedHeadEyebrow1;
    private final ModelRenderer bipedHeadEyebrow2;
    private final ModelRenderer bipedHeadFace;
    private final ModelRenderer bipedBodyJacket;
    private final ModelRenderer bipedBodyJacket2;
    private final ModelRenderer bipedBodyDetail;

    public ModelJoker() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadNose = new ModelRenderer(this);
        bipedHeadNose.setRotationPoint(0.0F, 23.5F, 3.25F);
        bipedHead.addChild(bipedHeadNose);
        setRotationAngle(bipedHeadNose, 0.1265F, 0.0F, 0.0F);
        bipedHeadNose.cubeList.add(new ModelBox(bipedHeadNose, 88, 33, -0.5F, -28.5F, -4.5F, 1, 2, 1, -0.05F, false));
        bipedHeadNose.cubeList.add(new ModelBox(bipedHeadNose, 87, 36, -0.5F, -27.5315F, -4.748F, 1, 1, 1, 0.025F, false));

        bipedHeadHair = new ModelRenderer(this);
        bipedHeadHair.setRotationPoint(-1.0F, 25.225F, 5.925F);
        bipedHead.addChild(bipedHeadHair);
        setRotationAngle(bipedHeadHair, 0.1963F, 0.0F, 0.0F);
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 17, 9, -0.575F, -34.0293F, -4.3729F, 6, 2, 2, -0.05F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 17, 9, 0.425F, -33.5389F, -4.4704F, 1, 2, 2, 0.0F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 17, 9, -1.825F, -34.1765F, -4.3436F, 1, 2, 2, 0.0F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 81, 20, -3.325F, -32.7572F, -1.822F, 9, 3, 5, 0.225F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 81, 20, -2.825F, -34.2333F, -1.5539F, 8, 3, 5, 0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 81, 20, 0.6F, -34.6256F, -1.4759F, 4, 3, 5, 0.1F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 81, 20, -2.4F, -34.7237F, -1.4564F, 2, 3, 5, -0.025F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 81, 20, -3.325F, -31.311F, -1.7274F, 9, 3, 5, -0.05F, false));
        bipedHeadHair.cubeList.add(new ModelBox(bipedHeadHair, 17, 9, 0.575F, -34.5302F, -3.687F, 4, 2, 2, 0.0F, false));

        bipedHeadEyebrow1 = new ModelRenderer(this);
        bipedHeadEyebrow1.setRotationPoint(-2.25F, -0.675F, -4.45F);
        bipedHead.addChild(bipedHeadEyebrow1);
        setRotationAngle(bipedHeadEyebrow1, 0.0F, 0.0F, 0.1571F);
        bipedHeadEyebrow1.cubeList.add(new ModelBox(bipedHeadEyebrow1, 22, 11, -1.9181F, -4.2123F, -0.15F, 3, 1, 1, -0.175F, false));
        bipedHeadEyebrow1.cubeList.add(new ModelBox(bipedHeadEyebrow1, 22, 11, -2.2325F, -3.9601F, -0.225F, 1, 1, 1, -0.25F, false));

        bipedHeadEyebrow2 = new ModelRenderer(this);
        bipedHeadEyebrow2.setRotationPoint(0.675F, -8.075F, -4.45F);
        bipedHead.addChild(bipedHeadEyebrow2);
        setRotationAngle(bipedHeadEyebrow2, 0.0F, 0.0F, 2.9409F);
        bipedHeadEyebrow2.cubeList.add(new ModelBox(bipedHeadEyebrow2, 22, 11, -1.99F, -4.299F, -0.125F, 3, 1, 1, -0.175F, false));
        bipedHeadEyebrow2.cubeList.add(new ModelBox(bipedHeadEyebrow2, 22, 11, -2.2196F, -4.5498F, -0.2F, 1, 1, 1, -0.25F, false));

        bipedHeadFace = new ModelRenderer(this);
        bipedHeadFace.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadFace);
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, -2.5F, -25.275F, -4.325F, 5, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, -1.5F, -24.925F, -4.325F, 3, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, -3.125F, -26.425F, -4.375F, 6, 1, 1, -0.2F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 65, 14, -2.025F, -25.975F, -4.35F, 4, 1, 1, -0.1F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 65, 14, -2.475F, -26.075F, -4.5F, 5, 1, 1, -0.2F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 65, 24, -2.475F, -25.325F, -4.55F, 5, 0, 1, -0.175F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 65, 14, -1.025F, -25.6F, -4.35F, 2, 1, 1, -0.1F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, 1.0F, -25.75F, -4.3F, 2, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, 1.4F, -26.25F, -4.325F, 2, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 83, 9, 1.0F, -28.0F, -4.3F, 2, 1, 1, -0.025F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 9, 13, -2.0F, -24.5F, -4.25F, 4, 1, 1, -0.1F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 9, 13, -1.0F, -24.25F, -4.25F, 2, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 9, 12, 0.75F, -28.8F, -4.6F, 3, 1, 1, -0.25F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 9, 12, -3.75F, -28.8F, -4.6F, 3, 1, 1, -0.25F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 73, 20, 1.125F, -27.95F, -4.075F, 2, 1, 1, 0.075F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 73, 20, -3.175F, -27.95F, -4.075F, 2, 1, 1, 0.075F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 83, 9, -3.0F, -28.0F, -4.3F, 2, 1, 1, -0.025F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 18, 2, -4.25F, -26.75F, -4.25F, 1, 2, 2, -0.025F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 18, 2, 3.25F, -26.75F, -4.25F, 1, 2, 2, -0.025F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 84, 14, -2.0F, -28.0F, -4.5F, 1, 1, 1, -0.125F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 84, 14, 0.975F, -28.0F, -4.5F, 1, 1, 1, -0.125F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, -3.55F, -26.25F, -4.325F, 2, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 92, 7, -3.25F, -25.75F, -4.3F, 2, 1, 1, -0.15F, false));
        bipedHeadFace.cubeList.add(new ModelBox(bipedHeadFace, 83, 20, -3.525F, -32.65F, 3.1F, 7, 8, 1, 0.225F, false));


        bipedBodyJacket = new ModelRenderer(this);
        bipedBodyJacket.setRotationPoint(-4.0F, 20.25F, 0.0F);
        bipedBody.addChild(bipedBodyJacket);
        setRotationAngle(bipedBodyJacket, 0.0F, 0.0F, 0.2269F);
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 70, 39, 2.163F, -21.5442F, -2.5F, 1, 4, 1, 0.0F, false));
        bipedBodyJacket.cubeList.add(new ModelBox(bipedBodyJacket, 66, 38, 2.9503F, -18.1339F, -2.5F, 1, 4, 1, 0.0F, false));

        bipedBodyJacket2 = new ModelRenderer(this);
        bipedBodyJacket2.setRotationPoint(-2.7F, 21.55F, 0.0F);
        bipedBody.addChild(bipedBodyJacket2);
        setRotationAngle(bipedBodyJacket2, 0.0F, 0.0F, -0.2269F);
        bipedBodyJacket2.cubeList.add(new ModelBox(bipedBodyJacket2, 71, 38, 3.722F, -21.1843F, -2.5F, 1, 4, 1, 0.0F, false));
        bipedBodyJacket2.cubeList.add(new ModelBox(bipedBodyJacket2, 68, 37, 2.9503F, -18.1339F, -2.5F, 1, 4, 1, 0.0F, false));

        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bipedBodyDetail);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 63, 3, 2.575F, -20.9F, -2.875F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 63, 3, 3.425F, -21.1F, -2.75F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 82, 3, 2.475F, -21.5F, -2.95F, 2, 2, 1, -0.725F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 63, 3, 2.9F, -21.425F, -2.75F, 1, 1, 1, -0.225F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 64, 32, 1.35F, -24.175F, -2.75F, 1, 11, 1, -0.225F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 72, 32, -2.35F, -24.175F, -2.75F, 1, 11, 1, -0.225F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 63, 3, 3.125F, -20.625F, -2.75F, 1, 1, 1, -0.225F, false));

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