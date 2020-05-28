package com.alexjw.siegecraft.common.entity.operator;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class EntityDummy extends EntityLiving {
    protected ItemStack[] dummyInventory;

    public EntityDummy(World worldIn) {
        super(worldIn);
    }

    public EntityDummy(World worldIn, ItemStack[] containerPlayer) {
        super(worldIn);
        this.dummyInventory = containerPlayer;
    }

    public ItemStack[] getDummyInventory() {
        return dummyInventory;
    }

    public void setDummyInventory(ItemStack[] dummyInventory) {
        this.dummyInventory = dummyInventory;
    }
}
