package com.alexjw.siegecraft.server.entity.operator;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityFrost extends EntityDummy {
    protected ItemStack[] dummyInventory;

    public EntityFrost(World worldIn) {
        super(worldIn);
    }

    public EntityFrost(World worldIn, ItemStack[] containerPlayer) {
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
