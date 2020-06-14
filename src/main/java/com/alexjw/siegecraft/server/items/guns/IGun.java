package com.alexjw.siegecraft.server.items.guns;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public interface IGun {
    boolean onLeftClick(ItemStack itemStack, EntityPlayer entityPlayer);
}
