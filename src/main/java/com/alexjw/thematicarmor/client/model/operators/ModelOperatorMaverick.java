package com.alexjw.thematicarmor.client.model.operators;// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOperatorMaverick extends ModelBiped {

    public ModelOperatorMaverick() {
        super(0.1f, 0.0f, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
        this.bipedLeftArm.mirror = false;
        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        this.bipedLeftArm.mirror = false;

        ModelRenderer bipedHeadHat = new ModelRenderer(this);
        bipedHeadHat.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(bipedHeadHat);
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 87, 60, -4.5456F, -8.0F, -4.4F, 9, 2, 9, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 87, 62, -5.0F, -9.0F, -5.0F, 10, 1, 10, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 23, 103, 3.5F, -5.0F, -1.0F, 1, 2, 2, 0.0F, false));
        bipedHeadHat.cubeList.add(new ModelBox(bipedHeadHat, 24, 12, -1.0F, -0.4416F, -3.9856F, 2, 1, 1, 0.0F, false));

        ModelRenderer bipedHeadHatEarpiece = new ModelRenderer(this);
        bipedHeadHatEarpiece.setRotationPoint(-2.0F, 20.0F, 14.0F);
        bipedHeadHat.addChild(bipedHeadHatEarpiece);
        setRotationAngle(bipedHeadHatEarpiece, 0.5236F, 0.0F, 0.0873F);
        bipedHeadHatEarpiece.cubeList.add(new ModelBox(bipedHeadHatEarpiece, 24, 104, 3.6F, -28.0F, -4.0F, 1, 1, 4, 0.0F, false));

        ModelRenderer bipedBodyScarf = new ModelRenderer(this);
        bipedBodyScarf.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(bipedBodyScarf);
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 102, 58, -4.0F, 0.0F, -2.4816F, 2, 7, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 105, 55, -3.0F, 1.0F, -2.7905F, 2, 7, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 105, 61, -1.0F, 1.98F, -3.0F, 2, 5, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 101, 65, 3.0F, 0.0F, -2.46F, 1, 5, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 101, 65, 2.0F, 0.62F, -2.76F, 1, 5, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 102, 65, 1.0F, 1.28F, -3.0F, 1, 5, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 107, 66, -3.8F, -0.5008F, -2.0F, 2, 1, 4, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 106, 65, 2.68F, -0.52F, -2.0F, 1, 1, 4, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 99, 66, -4.0F, 0.0F, 1.4F, 2, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 107, 65, 3.0F, 0.0F, 1.4F, 1, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 88, 64, -3.0F, 1.0F, 1.6F, 6, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 108, 5, -3.0F, 1.72F, 2.04F, 6, 8, 2, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 101, 5, -2.0F, 4.0F, 1.64F, 4, 5, 3, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 24, 106, -3.7F, 3.0F, 2.0F, 1, 2, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 19, 109, -3.34F, 2.0F, 1.2168F, 1, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 74, 100, 1.24F, 8.0F, -2.256F, 2, 3, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 74, 100, -3.24F, 8.0F, -2.2579F, 2, 3, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 112, 72, -1.8F, 3.0F, 3.36F, 1, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 105, 66, 0.72F, 3.0F, 3.44F, 1, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 33, 23, -2.0F, 0.0F, -2.4252F, 1, 1, 1, 0.0F, false));
        bipedBodyScarf.cubeList.add(new ModelBox(bipedBodyScarf, 31, 23, 1.0F, 0.0F, -2.46F, 1, 1, 1, 0.0F, false));

        ModelRenderer bipedRightArmPouch = new ModelRenderer(this);
        bipedRightArmPouch.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightArm.addChild(bipedRightArmPouch);
        bipedRightArmPouch.cubeList.add(new ModelBox(bipedRightArmPouch, 70, 95, -3.2F, -1.0F, -1.0F, 1, 3, 2, 0.0F, false));

        ModelRenderer bipedLeftArmSleeve = new ModelRenderer(this);
        bipedLeftArmSleeve.setRotationPoint(2.8169F, 4.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArmSleeve);
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 64, 93, -3.5402F, -1.0F, -2.4804F, 4, 2, 5, 0.0F, false));
        bipedLeftArmSleeve.cubeList.add(new ModelBox(bipedLeftArmSleeve, 28, 97, -0.8676F, -4.0F, -1.0F, 1, 2, 2, 0.0F, false));

        ModelRenderer bipedRightLegHolster = new ModelRenderer(this);
        bipedRightLegHolster.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedRightLeg.addChild(bipedRightLegHolster);
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 98, 63, -4.1899F, -9.0F, -2.3232F, 4, 1, 4, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 104, 65, -4.0F, -9.0F, 1.28F, 4, 1, 1, 0.0F, false));
        bipedRightLegHolster.cubeList.add(new ModelBox(bipedRightLegHolster, 25, 99, -4.6841F, -9.24F, -1.0F, 1, 3, 2, 0.0F, false));

        ModelRenderer bipedRightLedHolsterStrap = new ModelRenderer(this);
        bipedRightLedHolsterStrap.setRotationPoint(-3.6841F, -8.0F, 0.0F);
        bipedRightLegHolster.addChild(bipedRightLedHolsterStrap);
        setRotationAngle(bipedRightLedHolsterStrap, 0.4363F, 0.0F, 0.0F);
        bipedRightLedHolsterStrap.cubeList.add(new ModelBox(bipedRightLedHolsterStrap, 98, 64, -0.5579F, -4.48F, 0.0F, 1, 4, 1, 0.0F, false));

        ModelRenderer bipedLeftLegPouch = new ModelRenderer(this);
        bipedLeftLegPouch.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(bipedLeftLegPouch);
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 97, 69, 0.2F, -8.0F, -2.22F, 4, 1, 4, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 104, 74, 0.16F, -8.0F, 1.2F, 4, 1, 1, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 19, 108, 3.4F, -11.0F, -1.7F, 1, 4, 3, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 24, 102, 3.6F, -11.0F, -1.76F, 1, 1, 3, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 98, 62, 3.3F, -12.0F, -2.16F, 1, 1, 4, 0.0F, false));
        bipedLeftLegPouch.cubeList.add(new ModelBox(bipedLeftLegPouch, 26, 100, 3.592F, -10.0F, -1.2175F, 1, 1, 2, 0.0F, false));
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