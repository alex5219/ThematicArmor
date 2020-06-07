package com.alexjw.siegecraft.server.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityFootprint extends EntityLiving {
    public EntityFootprint(World worldIn) {
        super(worldIn);
        this.setSize(0.1F, 0.1F);
    }

    public float getBrightness() {
        return 0.0f;
    }

    public void onUpdate() {
        NBTTagCompound nbtTagCompound = getEntityData();
        nbtTagCompound.setInteger("timeAlive", nbtTagCompound.getInteger("timeAlive") + 1);
        writeEntityToNBT(nbtTagCompound);
        if (nbtTagCompound.getInteger("timeAlive") > 600) {
            this.setDead();
        }
        super.onUpdate();
    }

    public boolean canBePushed() {
        return false;
    }

    protected void collideWithEntity(Entity p_collideWithEntity_1_) {
    }

    protected void collideWithNearbyEntities() {
    }

    public boolean attackEntityFrom(DamageSource p_attackEntityFrom_1_, float p_attackEntityFrom_2_) {
        return false;
    }
}