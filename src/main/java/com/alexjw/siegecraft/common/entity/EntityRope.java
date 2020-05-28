package com.alexjw.siegecraft.common.entity;

import com.alexjw.siegecraft.common.data.SiegePlayer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityRope extends EntityLiving {
    private SiegePlayer entityPlayer;

    public EntityRope(World worldIn) {
        super(worldIn);
    }

    public boolean canBePushed() {
        return false;
    }

    public float getBrightness() {
        return 1.0f;
    }

    public SiegePlayer getEntityPlayer() {
        return entityPlayer;
    }

    public void setEntityPlayer(SiegePlayer entityPlayer) {
        this.entityPlayer = entityPlayer;
    }

    public void onUpdate() {
        super.onUpdate();
        if (entityPlayer != null) {
            this.setPosition(entityPlayer.getEntityPlayer().posX, entityPlayer.getEntityPlayer().posY, entityPlayer.getEntityPlayer().posZ);
        }
    }
}