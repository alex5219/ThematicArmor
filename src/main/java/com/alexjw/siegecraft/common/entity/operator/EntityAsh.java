package com.alexjw.siegecraft.common.entity.operator;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityAsh extends EntityDummy {
    protected ItemStack[] dummyInventory;

    public EntityAsh(World worldIn) {
        super(worldIn);
    }

    public EntityAsh(World worldIn, ItemStack[] containerPlayer) {
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
