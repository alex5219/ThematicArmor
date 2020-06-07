package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.model.ModelFootprint;
import com.alexjw.siegecraft.server.entity.EntityFootprint;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.OperatorManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

public class RenderFootprint extends RenderLiving<EntityFootprint> {
    public RenderFootprint(RenderManager manager) {
        super(manager, new ModelFootprint(), 0.1f);
        this.shadowSize = 0.0f;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFootprint entityFootprint) {
        NBTTagCompound nbtTagCompound = entityFootprint.getEntityData();
        if (nbtTagCompound.getInteger("timeAlive") < 100) {
            return new ResourceLocation(Siege.MODID, "textures/models/gadget_jackal_red.png");
        } else if (nbtTagCompound.getInteger("timeAlive") < 200) {
            return new ResourceLocation(Siege.MODID, "textures/models/gadget_jackal_yellow.png");
        } else if (nbtTagCompound.getInteger("timeAlive") < 300) {
            return new ResourceLocation(Siege.MODID, "textures/models/gadget_jackal_green.png");
        } else if (nbtTagCompound.getInteger("timeAlive") < 400) {
            return new ResourceLocation(Siege.MODID, "textures/models/gadget_jackal_blue.png");
        } else {
            return new ResourceLocation(Siege.MODID, "textures/models/gadget_jackal_gray.png");
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean isVisible(EntityPlayer entityPlayer) {
        if (SiegeHelper.getOperator(entityPlayer) != null) {
            return SiegeHelper.getOperator(entityPlayer) == OperatorManager.operatorJackal;
        } else {
            return false;
        }
    }

    public void doRender(EntityFootprint p_doRender_1_, double p_doRender_2_, double p_doRender_4_, double p_doRender_6_, float p_doRender_8_, float p_doRender_9_) {
        if (isVisible(Minecraft.getMinecraft().player)) {
            super.doRender(p_doRender_1_, p_doRender_2_, p_doRender_4_, p_doRender_6_, p_doRender_8_, p_doRender_9_);
            this.bindTexture(Objects.requireNonNull(getEntityTexture(p_doRender_1_)));
        }
    }
}
