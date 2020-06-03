package com.alexjw.core.server.helper;

import net.minecraft.item.ItemStack;

public class GunHelper {

    public static boolean areItemStacksEqualIgnoreCount(ItemStack source, ItemStack target)
    {
        if(source.getItem() != target.getItem())
        {
            return false;
        }
        else if(source.getItemDamage() != target.getItemDamage())
        {
            return false;
        }
        else if(source.getTagCompound() == null && target.getTagCompound() != null)
        {
            return false;
        }
        else
        {
            return (source.getTagCompound() == null || source.getTagCompound().equals(target.getTagCompound())) && source.areCapsCompatible(target);
        }
    }
}
