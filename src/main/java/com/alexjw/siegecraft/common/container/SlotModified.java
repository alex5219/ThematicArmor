package com.alexjw.siegecraft.common.container;

import com.alexjw.siegecraft.common.helper.SiegeHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotModified extends Slot {
    public SlotModified(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public boolean canTakeStack(EntityPlayer playerIn) {
        return SiegeHelper.getOperator(playerIn) == null;
    }
}
