package com.alexjw.thematicarmor.client.model.supes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGreenArrow extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedHeadDetail2;
    private final ModelRenderer bipedHeadDetail3;
    private final ModelRenderer bipedHeadDetail4;
    private final ModelRenderer bipedBodyQuiver;
    private final ModelRenderer bipedBodyArrow1;
    private final ModelRenderer bipedBodyArrow2;
    private final ModelRenderer bipedBodyArrow4;
    private final ModelRenderer bipedBodyArrow3;
    private final ModelRenderer bipedBodyArrow5;
    private final ModelRenderer bipedBodyArrowSign1;
    private final ModelRenderer bipedBodyArrowSign2;
    private final ModelRenderer bipedBodyArrowSign3;
    private final ModelRenderer bipedBodyDetail;
    private final ModelRenderer BipedRightLegArmor;
    private final ModelRenderer BipedLeftLegArmor;


    public ModelGreenArrow() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;


        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(9.775F, 21.75F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        setRotationAngle(bipedHeadDetail, 0.0F, 0.0F, -0.3927F);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 11, 8, -1.9538F, -26.2309F, -4.3F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 108, 64, -2.311F, -31.5035F, -4.55F, 4, 1, 1, 0.0F, false));

        bipedHeadDetail2 = new ModelRenderer(this);
        bipedHeadDetail2.setRotationPoint(13.25F, -24.3F, 0.0F);
        bipedHead.addChild(bipedHeadDetail2);
        setRotationAngle(bipedHeadDetail2, 0.0F, 0.0F, -2.7794F);
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 11, 8, 2.587F, -26.0485F, -4.325F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 109, 63, 2.068F, -20.7281F, -4.575F, 4, 1, 1, 0.0F, false));
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 11, 8, 2.7319F, -21.2912F, -4.325F, 2, 1, 1, 0.025F, false));
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 11, 8, 3.9234F, -21.9565F, -4.325F, 2, 1, 1, 0.025F, false));
        bipedHeadDetail2.cubeList.add(new ModelBox(bipedHeadDetail2, 11, 8, 6.3056F, -22.7254F, -4.325F, 2, 1, 1, 0.025F, false));

        bipedHeadDetail3 = new ModelRenderer(this);
        bipedHeadDetail3.setRotationPoint(13.25F, -24.3F, 0.0F);
        bipedHead.addChild(bipedHeadDetail3);
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 9, 4, -13.7219F, 23.6721F, -4.175F, 1, 1, 1, 0.1F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 9, 4, -12.5969F, 22.8971F, -4.45F, 1, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 9, 4, -14.8969F, 22.8971F, -4.475F, 1, 1, 1, -0.3F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 72, 41, -17.25F, 16.3F, -4.0F, 8, 8, 8, 0.35F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 18, 4, -14.1969F, 18.7721F, -4.125F, 2, 1, 1, 0.0F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 121, 42, -17.85F, 15.825F, -4.75F, 1, 9, 1, -0.175F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 105, 64, -17.2F, 15.775F, -4.7F, 8, 1, 1, -0.1F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 105, 64, -17.2F, 16.35F, -4.7F, 8, 1, 1, -0.1F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 105, 64, -17.45F, 16.525F, -4.325F, 3, 1, 1, 0.025F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 105, 64, -11.925F, 16.525F, -4.325F, 3, 1, 1, 0.025F, false));
        bipedHeadDetail3.cubeList.add(new ModelBox(bipedHeadDetail3, 121, 42, -9.625F, 15.825F, -4.75F, 1, 9, 1, -0.175F, false));

        bipedHeadDetail4 = new ModelRenderer(this);
        bipedHeadDetail4.setRotationPoint(22.175F, -12.7F, 0.0F);
        bipedHead.addChild(bipedHeadDetail4);
        setRotationAngle(bipedHeadDetail4, 0.0F, 0.0F, -2.0769F);
        bipedHeadDetail4.cubeList.add(new ModelBox(bipedHeadDetail4, 11, 8, 3.8685F, -23.1219F, -4.325F, 2, 1, 1, 0.0F, false));


        bipedBodyQuiver = new ModelRenderer(this);
        bipedBodyQuiver.setRotationPoint(2.1F, 7.85F, -5.175F);
        bipedBody.addChild(bipedBodyQuiver);
        setRotationAngle(bipedBodyQuiver, 0.0F, 0.0F, -0.829F);
        bipedBodyQuiver.cubeList.add(new ModelBox(bipedBodyQuiver, 83, 14, -1.0F, -9.0F, 6.25F, 3, 10, 3, 0.0F, false));
        bipedBodyQuiver.cubeList.add(new ModelBox(bipedBodyQuiver, 111, 63, -1.0597F, -2.0643F, 6.15F, 3, 0, 3, 0.4F, false));
        bipedBodyQuiver.cubeList.add(new ModelBox(bipedBodyQuiver, 111, 63, -1.0157F, -7.53F, 6.1F, 3, 0, 3, 0.225F, false));

        bipedBodyArrow1 = new ModelRenderer(this);
        bipedBodyArrow1.setRotationPoint(2.55F, 8.85F, -5.175F);
        bipedBody.addChild(bipedBodyArrow1);
        setRotationAngle(bipedBodyArrow1, 0.0F, 0.0F, -0.829F);
        bipedBodyArrow1.cubeList.add(new ModelBox(bipedBodyArrow1, 115, 73, -0.6826F, -12.2054F, 7.5F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow1.cubeList.add(new ModelBox(bipedBodyArrow1, 115, 73, -0.5689F, -12.3774F, 7.75F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow1.cubeList.add(new ModelBox(bipedBodyArrow1, 115, 73, -0.5351F, -12.3405F, 7.275F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow1.cubeList.add(new ModelBox(bipedBodyArrow1, 115, 73, -0.294F, -12.1884F, 7.525F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow1.cubeList.add(new ModelBox(bipedBodyArrow1, 121, 46, -0.5567F, -11.846F, 7.525F, 1, 10, 1, -0.3F, false));

        bipedBodyArrow2 = new ModelRenderer(this);
        bipedBodyArrow2.setRotationPoint(3.7F, 7.85F, -5.175F);
        bipedBody.addChild(bipedBodyArrow2);
        setRotationAngle(bipedBodyArrow2, 0.0F, 0.0F, -0.829F);
        bipedBodyArrow2.cubeList.add(new ModelBox(bipedBodyArrow2, 115, 73, -0.6826F, -12.2054F, 7.5F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow2.cubeList.add(new ModelBox(bipedBodyArrow2, 115, 73, -0.5689F, -12.3774F, 7.75F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow2.cubeList.add(new ModelBox(bipedBodyArrow2, 115, 73, -0.5351F, -12.3405F, 7.275F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow2.cubeList.add(new ModelBox(bipedBodyArrow2, 115, 73, -0.294F, -12.1884F, 7.525F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow2.cubeList.add(new ModelBox(bipedBodyArrow2, 121, 46, -0.5567F, -11.846F, 7.525F, 1, 10, 1, -0.3F, false));

        bipedBodyArrow4 = new ModelRenderer(this);
        bipedBodyArrow4.setRotationPoint(2.925F, 8.5F, -4.375F);
        bipedBody.addChild(bipedBodyArrow4);
        setRotationAngle(bipedBodyArrow4, 0.0F, 0.0F, -0.829F);
        bipedBodyArrow4.cubeList.add(new ModelBox(bipedBodyArrow4, 115, 73, -0.6826F, -12.2054F, 7.5F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow4.cubeList.add(new ModelBox(bipedBodyArrow4, 115, 73, -0.5689F, -12.3774F, 7.75F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow4.cubeList.add(new ModelBox(bipedBodyArrow4, 115, 73, -0.5351F, -12.3405F, 7.275F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow4.cubeList.add(new ModelBox(bipedBodyArrow4, 115, 73, -0.294F, -12.1884F, 7.525F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow4.cubeList.add(new ModelBox(bipedBodyArrow4, 121, 46, -0.5567F, -11.846F, 7.525F, 1, 10, 1, -0.3F, false));

        bipedBodyArrow3 = new ModelRenderer(this);
        bipedBodyArrow3.setRotationPoint(2.75F, 7.85F, -5.575F);
        bipedBody.addChild(bipedBodyArrow3);
        setRotationAngle(bipedBodyArrow3, 0.0F, 0.0F, -0.829F);
        bipedBodyArrow3.cubeList.add(new ModelBox(bipedBodyArrow3, 115, 73, -0.6826F, -12.2054F, 7.5F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow3.cubeList.add(new ModelBox(bipedBodyArrow3, 115, 73, -0.5689F, -12.3774F, 7.75F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow3.cubeList.add(new ModelBox(bipedBodyArrow3, 115, 73, -0.5351F, -12.3405F, 7.275F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow3.cubeList.add(new ModelBox(bipedBodyArrow3, 115, 73, -0.294F, -12.1884F, 7.525F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow3.cubeList.add(new ModelBox(bipedBodyArrow3, 121, 46, -0.5567F, -11.846F, 7.525F, 1, 10, 1, -0.3F, false));

        bipedBodyArrow5 = new ModelRenderer(this);
        bipedBodyArrow5.setRotationPoint(3.5F, 7.6F, -4.325F);
        bipedBody.addChild(bipedBodyArrow5);
        setRotationAngle(bipedBodyArrow5, 0.0F, 0.0F, -0.829F);
        bipedBodyArrow5.cubeList.add(new ModelBox(bipedBodyArrow5, 115, 73, -0.6826F, -12.2054F, 7.5F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow5.cubeList.add(new ModelBox(bipedBodyArrow5, 115, 73, -0.5689F, -12.3774F, 7.75F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow5.cubeList.add(new ModelBox(bipedBodyArrow5, 115, 73, -0.5351F, -12.3405F, 7.275F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow5.cubeList.add(new ModelBox(bipedBodyArrow5, 115, 73, -0.294F, -12.1884F, 7.525F, 1, 2, 1, -0.35F, false));
        bipedBodyArrow5.cubeList.add(new ModelBox(bipedBodyArrow5, 121, 46, -0.5567F, -11.846F, 7.525F, 1, 10, 1, -0.3F, false));

        bipedBodyArrowSign1 = new ModelRenderer(this);
        bipedBodyArrowSign1.setRotationPoint(0.225F, 11.425F, 0.425F);
        bipedBody.addChild(bipedBodyArrowSign1);
        setRotationAngle(bipedBodyArrowSign1, 0.0F, 0.0F, 0.4102F);
        bipedBodyArrowSign1.cubeList.add(new ModelBox(bipedBodyArrowSign1, 117, 78, -0.8555F, -0.9811F, -3.425F, 1, 2, 1, -0.6F, false));
        bipedBodyArrowSign1.cubeList.add(new ModelBox(bipedBodyArrowSign1, 117, 78, -0.7857F, -0.8206F, -3.425F, 1, 2, 1, -0.6F, false));

        bipedBodyArrowSign2 = new ModelRenderer(this);
        bipedBodyArrowSign2.setRotationPoint(1.125F, 10.95F, 0.4F);
        bipedBody.addChild(bipedBodyArrowSign2);
        setRotationAngle(bipedBodyArrowSign2, 0.0F, 0.0F, -0.4363F);
        bipedBodyArrowSign2.cubeList.add(new ModelBox(bipedBodyArrowSign2, 117, 78, -1.5107F, -1.0798F, -3.375F, 1, 2, 1, -0.6F, false));
        bipedBodyArrowSign2.cubeList.add(new ModelBox(bipedBodyArrowSign2, 117, 78, -1.5741F, -0.9438F, -3.375F, 1, 2, 1, -0.6F, false));

        bipedBodyArrowSign3 = new ModelRenderer(this);
        bipedBodyArrowSign3.setRotationPoint(1.2F, 10.7F, 0.425F);
        bipedBody.addChild(bipedBodyArrowSign3);
        setRotationAngle(bipedBodyArrowSign3, 0.0F, 0.0F, -0.7025F);
        bipedBodyArrowSign3.cubeList.add(new ModelBox(bipedBodyArrowSign3, 117, 78, -1.533F, -1.0941F, -3.45F, 1, 1, 1, -0.55F, false));

        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(0.65F, 5.35F, -2.1F);
        bipedBody.addChild(bipedBodyDetail);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -0.45F, 2.475F, -0.1F, 2, 1, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 88, 8, -4.625F, 5.6F, 0.075F, 8, 1, 4, 0.25F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -0.45F, 3.675F, -0.2F, 2, 1, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 119, 64, -1.125F, 5.55F, -0.25F, 1, 1, 1, 0.15F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 26, 1.125F, 5.55F, -0.2F, 0, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 100, 27, -2.375F, 5.55F, -0.2F, 0, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 91, 28, -3.875F, 5.55F, -0.2F, 0, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 92, 27, 2.625F, 5.55F, -0.2F, 0, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 91, 17, 0.625F, 5.55F, 3.05F, 2, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 101, 28, -3.875F, 5.55F, 3.05F, 2, 1, 1, 0.45F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -2.675F, 3.675F, -0.2F, 2, 1, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -2.75F, 2.475F, -0.15F, 2, 1, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -0.475F, 1.225F, -0.15F, 2, 1, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 83, 13, -3.975F, -2.325F, -0.15F, 3, 2, 1, 0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 114, 62, -3.975F, -2.325F, -0.575F, 3, 2, 1, -0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 116, 62, -0.25F, -2.325F, -0.575F, 3, 2, 1, -0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 114, 62, 0.675F, -2.85F, -0.475F, 2, 2, 1, -0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 114, 63, -3.9F, -2.85F, -0.475F, 2, 2, 1, -0.025F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 83, 13, -0.25F, -2.325F, -0.15F, 3, 2, 1, 0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 83, 13, 0.625F, -2.95F, 0.0F, 2, 1, 1, 0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 83, 13, -3.875F, -2.95F, 0.0F, 2, 1, 1, 0.175F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 79, 14, -2.775F, 1.225F, -0.1F, 2, 1, 1, 0.0F, false));


        BipedRightLegArmor = new ModelRenderer(this);
        BipedRightLegArmor.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(BipedRightLegArmor);
        BipedRightLegArmor.cubeList.add(new ModelBox(BipedRightLegArmor, 116, 67, -2.9F, -6.5F, -2.325F, 2, 1, 1, 0.0F, false));
        BipedRightLegArmor.cubeList.add(new ModelBox(BipedRightLegArmor, 116, 67, -2.9F, -3.975F, -2.475F, 2, 1, 1, -0.25F, false));
        BipedRightLegArmor.cubeList.add(new ModelBox(BipedRightLegArmor, 116, 67, -2.9F, -2.0F, -2.475F, 2, 1, 1, -0.25F, false));


        BipedLeftLegArmor = new ModelRenderer(this);
        BipedLeftLegArmor.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(BipedLeftLegArmor);
        BipedLeftLegArmor.cubeList.add(new ModelBox(BipedLeftLegArmor, 116, 67, 0.9F, -6.5F, -2.325F, 2, 1, 1, 0.0F, false));
        BipedLeftLegArmor.cubeList.add(new ModelBox(BipedLeftLegArmor, 116, 67, 0.9F, -3.95F, -2.475F, 2, 1, 1, -0.25F, false));
        BipedLeftLegArmor.cubeList.add(new ModelBox(BipedLeftLegArmor, 116, 67, 0.9F, -2.025F, -2.425F, 2, 1, 1, -0.25F, false));
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