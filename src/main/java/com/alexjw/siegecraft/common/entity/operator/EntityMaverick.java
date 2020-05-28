package com.alexjw.siegecraft.common.entity.operator;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMaverick extends EntityDummy {
    protected ItemStack[] dummyInventory;

    public EntityMaverick(World worldIn) {
        super(worldIn);
    }

    public EntityMaverick(World worldIn, ItemStack[] containerPlayer) {
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
