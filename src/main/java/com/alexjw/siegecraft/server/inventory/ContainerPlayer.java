package com.alexjw.siegecraft.server.inventory;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerPlayer extends InventoryBasic {
    public ContainerPlayer(String inventoryTitle, int slotCount) {
        super(inventoryTitle, false, slotCount);
    }

    @SideOnly(Side.CLIENT)
    public ContainerPlayer(ITextComponent inventoryTitle, int slotCount) {
        super(inventoryTitle, slotCount);
    }
}
