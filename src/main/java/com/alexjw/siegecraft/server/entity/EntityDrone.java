package com.alexjw.siegecraft.server.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDrone extends EntityLiving {
    protected ItemStack[] droneInventory;
    private EntityPlayer entityPlayer;

    public EntityDrone(World worldIn) {
        super(worldIn);
    }

    public EntityDrone(World worldIn, ItemStack[] containerPlayer) {
        super(worldIn);
        this.droneInventory = containerPlayer;
    }

    public ItemStack[] getDroneInventory() {
        return droneInventory;
    }

    public void setDroneInventory(ItemStack[] droneInventory) {
        this.droneInventory = droneInventory;
    }

    public void setPlayer(EntityPlayer entityPlayer) {
        this.entityPlayer = entityPlayer;
    }
}