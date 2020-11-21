package com.alexjw.thematicarmor.client.model.walkingdead;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMichonne extends ModelBiped {
    private final ModelRenderer bipedHeadDetail;
    private final ModelRenderer bipedBodySkirt;
    private final ModelRenderer bipedBodySkirt2;
    private final ModelRenderer bipedBodyDetailKatana1;
    private final ModelRenderer bipedBodyDetailKatana2;
    private final ModelRenderer bipedBodyDetail4;
    private final ModelRenderer bipedBodyDetail5;
    private final ModelRenderer bipedBodyDetail6;
    private final ModelRenderer bipedBodyDetail7;
    private final ModelRenderer bipedBodyDetail8;
    private final ModelRenderer bipedBodyDetail;
    private final ModelRenderer bipedBodyDetail2;
    private final ModelRenderer bipedBodyDetail3;

    public ModelMichonne() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;

        bipedHeadDetail = new ModelRenderer(this);
        bipedHeadDetail.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedHead.addChild(bipedHeadDetail);
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.0F, -31.5F, -4.5F, 1, 9, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 60, 6, -3.5F, -32.625F, -4.5F, 8, 2, 6, -0.075F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 60, 6, -3.5F, -32.625F, 1.25F, 8, 2, 3, -0.075F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.5F, -31.5F, -3.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.75F, -31.75F, -3.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.5F, -31.75F, -2.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.5F, -31.75F, -0.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.75F, -31.75F, 0.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 4.0F, -32.25F, 1.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.75F, -32.0F, 2.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.5F, -32.0F, 3.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 3.0F, -31.75F, 3.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 2.25F, -31.5F, 3.25F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 1.25F, -31.75F, 3.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 0.5F, -31.5F, 3.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -0.5F, -31.25F, 4.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -2.25F, -31.75F, 3.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -3.25F, -31.5F, 3.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.0F, -32.0F, 3.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.25F, -32.0F, 3.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -32.0F, 2.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -32.2F, 1.175F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -31.75F, 0.125F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -31.5F, -0.75F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -1.25F, -31.25F, 3.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 67, 5, 3.75F, -31.75F, -1.25F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.25F, -31.5F, -4.5F, 1, 9, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -31.25F, -4.0F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.75F, -31.5F, -3.25F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.5F, -31.25F, -2.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -4.75F, -31.25F, -1.5F, 1, 10, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 2.5F, -32.5F, -4.75F, 1, 5, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 0.5F, -31.5F, -4.75F, 1, 2, 1, -0.1F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 0.5F, -32.25F, -4.75F, 1, 2, 1, 0.075F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 0.5F, -28.25F, -4.75F, 3, 1, 1, -0.4F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 0.5F, -29.0F, -4.75F, 3, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -3.75F, -29.0F, -4.75F, 3, 1, 1, -0.3F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 46, 22, 0.5F, -28.575F, -4.5F, 3, 1, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 46, 22, -3.5F, -28.575F, -4.5F, 3, 1, 1, -0.225F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -3.5F, -28.25F, -4.75F, 3, 1, 1, -0.4F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -0.5F, -32.5F, -4.75F, 1, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 98, 4, -1.0F, -25.75F, -4.25F, 2, 1, 1, -0.025F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -1.25F, -32.425F, -4.75F, 1, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -2.0F, -32.425F, -4.75F, 1, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -2.75F, -32.175F, -4.75F, 1, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, -3.25F, -31.925F, -4.75F, 1, 2, 1, 0.0F, false));
        bipedHeadDetail.cubeList.add(new ModelBox(bipedHeadDetail, 69, 5, 1.5F, -32.25F, -5.0F, 1, 2, 1, 0.0F, false));


        bipedBodySkirt = new ModelRenderer(this);
        bipedBodySkirt.setRotationPoint(0.0F, 24.0F, -2.5F);
        bipedBody.addChild(bipedBodySkirt);
        setRotationAngle(bipedBodySkirt, -0.2225F, 0.0F, 0.0F);
        bipedBodySkirt.cubeList.add(new ModelBox(bipedBodySkirt, 60, 52, -4.0F, -13.4815F, -1.9155F, 8, 5, 3, 0.3F, false));

        bipedBodySkirt2 = new ModelRenderer(this);
        bipedBodySkirt2.setRotationPoint(0.0F, 25.2F, -0.15F);
        bipedBody.addChild(bipedBodySkirt2);
        setRotationAngle(bipedBodySkirt2, 0.2007F, 0.0F, 0.0F);
        bipedBodySkirt2.cubeList.add(new ModelBox(bipedBodySkirt2, 70, 52, -4.0F, -13.0325F, 1.564F, 8, 4, 3, 0.325F, false));

        bipedBodyDetailKatana1 = new ModelRenderer(this);
        bipedBodyDetailKatana1.setRotationPoint(-0.875F, 2.325F, -2.5F);
        bipedBody.addChild(bipedBodyDetailKatana1);
        setRotationAngle(bipedBodyDetailKatana1, 0.0F, 0.0F, 0.6676F);
        bipedBodyDetailKatana1.cubeList.add(new ModelBox(bipedBodyDetailKatana1, 61, 28, 1.75F, -5.0F, 0.0F, 1, 13, 5, 0.0F, false));
        bipedBodyDetailKatana1.cubeList.add(new ModelBox(bipedBodyDetailKatana1, 61, 31, 1.9048F, -2.8037F, -0.5F, 1, 4, 1, 0.0F, false));

        bipedBodyDetailKatana2 = new ModelRenderer(this);
        bipedBodyDetailKatana2.setRotationPoint(-1.6F, 5.575F, -16.25F);
        bipedBody.addChild(bipedBodyDetailKatana2);
        setRotationAngle(bipedBodyDetailKatana2, 0.0F, 0.0F, -0.781F);
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 61, 28, 0.7807F, -6.0608F, 17.525F, 2, 13, 2, -0.3F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 61, 28, 0.7807F, -6.0608F, 18.275F, 2, 13, 2, -0.625F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 105, 42, 0.753F, -2.4247F, 19.025F, 2, 1, 1, -0.2F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 105, 42, 0.7607F, -0.657F, 19.025F, 2, 1, 1, -0.2F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 105, 42, 0.7437F, -4.546F, 19.025F, 2, 1, 1, -0.2F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 105, 42, 0.7684F, 1.1108F, 19.025F, 2, 1, 1, -0.2F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 105, 42, 0.753F, -4.4247F, 17.525F, 2, 7, 2, -0.15F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 98, 58, 0.2625F, -6.1999F, 17.2F, 3, 1, 3, -0.375F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 83, 8, 0.7936F, -10.0255F, 17.7F, 2, 5, 2, -0.575F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 104, 39, 0.9347F, -10.0968F, 17.7F, 1, 5, 2, -0.625F, false));
        bipedBodyDetailKatana2.cubeList.add(new ModelBox(bipedBodyDetailKatana2, 99, 56, 0.8206F, -10.9348F, 17.7F, 2, 2, 2, -0.55F, false));

        bipedBodyDetail4 = new ModelRenderer(this);
        bipedBodyDetail4.setRotationPoint(0.2F, 7.675F, -3.75F);
        bipedBody.addChild(bipedBodyDetail4);
        setRotationAngle(bipedBodyDetail4, -0.2705F, 0.0F, 0.0F);
        bipedBodyDetail4.cubeList.add(new ModelBox(bipedBodyDetail4, 20, 21, -3.2126F, -5.7767F, 0.0F, 6, 2, 1, 0.0F, false));

        bipedBodyDetail5 = new ModelRenderer(this);
        bipedBodyDetail5.setRotationPoint(3.175F, -3.9F, -3.75F);
        bipedBody.addChild(bipedBodyDetail5);
        setRotationAngle(bipedBodyDetail5, 0.0F, 0.0F, -1.4966F);
        bipedBodyDetail5.cubeList.add(new ModelBox(bipedBodyDetail5, 106, 36, -4.7126F, -8.7315F, 5.2F, 1, 2, 2, -0.3F, false));

        bipedBodyDetail6 = new ModelRenderer(this);
        bipedBodyDetail6.setRotationPoint(2.675F, -4.65F, -3.75F);
        bipedBody.addChild(bipedBodyDetail6);
        setRotationAngle(bipedBodyDetail6, 0.0F, 0.0F, -1.4966F);
        bipedBodyDetail6.cubeList.add(new ModelBox(bipedBodyDetail6, 106, 36, -4.7126F, -8.7315F, 5.2F, 1, 2, 2, -0.3F, false));

        bipedBodyDetail7 = new ModelRenderer(this);
        bipedBodyDetail7.setRotationPoint(1.925F, -5.35F, -3.75F);
        bipedBody.addChild(bipedBodyDetail7);
        setRotationAngle(bipedBodyDetail7, 0.0F, 0.0F, -1.4966F);
        bipedBodyDetail7.cubeList.add(new ModelBox(bipedBodyDetail7, 106, 36, -4.7126F, -8.7315F, 5.2F, 1, 2, 2, -0.3F, false));

        bipedBodyDetail8 = new ModelRenderer(this);
        bipedBodyDetail8.setRotationPoint(1.2F, -6.0F, -3.75F);
        bipedBody.addChild(bipedBodyDetail8);
        setRotationAngle(bipedBodyDetail8, 0.0F, 0.0F, -1.4966F);
        bipedBodyDetail8.cubeList.add(new ModelBox(bipedBodyDetail8, 106, 36, -4.7126F, -8.7315F, 5.2F, 1, 2, 2, -0.3F, false));

        bipedBodyDetail = new ModelRenderer(this);
        bipedBodyDetail.setRotationPoint(-6.25F, 18.0F, 0.0F);
        bipedBody.addChild(bipedBodyDetail);
        setRotationAngle(bipedBodyDetail, 0.0F, 0.0F, 0.5018F);
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 20, -1.0F, -20.5F, -2.25F, 1, 7, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 20, -1.1202F, -20.7192F, -2.0F, 1, 1, 4, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 20, -0.9498F, -18.3565F, -2.75F, 1, 3, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 20, 0.8403F, -10.3887F, -2.25F, 1, 3, 1, 0.0F, false));
        bipedBodyDetail.cubeList.add(new ModelBox(bipedBodyDetail, 99, 20, 3.0671F, -10.6064F, -2.25F, 1, 2, 1, 0.0F, false));

        bipedBodyDetail2 = new ModelRenderer(this);
        bipedBodyDetail2.setRotationPoint(6.75F, 17.75F, 0.0F);
        bipedBody.addChild(bipedBodyDetail2);
        setRotationAngle(bipedBodyDetail2, 0.0F, 0.0F, -0.4887F);
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 99, 20, -1.0F, -20.5F, -2.25F, 1, 7, 1, 0.0F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 99, 20, -0.8826F, -20.7207F, -2.0F, 1, 1, 4, 0.0F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 99, 20, -1.0883F, -18.5469F, -2.75F, 1, 3, 1, 0.0F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 99, 20, -5.3146F, -10.4504F, -2.25F, 1, 2, 1, 0.0F, false));
        bipedBodyDetail2.cubeList.add(new ModelBox(bipedBodyDetail2, 99, 20, -2.7078F, -10.3655F, -2.25F, 1, 3, 1, 0.0F, false));

        bipedBodyDetail3 = new ModelRenderer(this);
        bipedBodyDetail3.setRotationPoint(2.75F, 16.25F, 0.0F);
        bipedBody.addChild(bipedBodyDetail3);
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -3.2626F, -11.5267F, -2.25F, 1, 6, 1, -0.15F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -1.2626F, -6.1017F, -2.25F, 2, 1, 1, -0.025F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -0.5126F, -6.1267F, -2.25F, 2, 1, 1, -0.025F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -1.0126F, -8.3517F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -6.5126F, -8.3517F, -2.5F, 2, 1, 1, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 22, -6.3376F, -16.3517F, 1.5F, 7, 1, 1, -0.025F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -7.0126F, -5.8517F, -2.25F, 2, 1, 1, -0.025F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 37, -7.9626F, -17.4767F, 1.475F, 1, 2, 2, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 37, -8.6626F, -18.0517F, 1.475F, 1, 2, 2, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 37, -9.4376F, -18.8517F, 1.475F, 1, 2, 2, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 37, -10.0876F, -19.3767F, 1.475F, 1, 2, 2, -0.3F, false));
        bipedBodyDetail3.cubeList.add(new ModelBox(bipedBodyDetail3, 99, 20, -6.6626F, -5.8517F, -2.25F, 2, 1, 1, -0.025F, false));

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