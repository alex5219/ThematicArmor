package com.alexjw.siegecraft.server.entity.operator;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityThermite extends EntityDummy {
    protected ItemStack[] dummyInventory;

    public EntityThermite(World worldIn) {
        super(worldIn);
    }

    public EntityThermite(World worldIn, ItemStack[] containerPlayer) {
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
