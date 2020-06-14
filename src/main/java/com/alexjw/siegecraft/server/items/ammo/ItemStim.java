package com.alexjw.siegecraft.server.items.ammo;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.entity.EntityStim;
import com.alexjw.siegecraft.server.items.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStim extends Item {
    public ItemStim() {
        this.setUnlocalizedName("stim");
        this.setRegistryName(Siege.MODID, "stim");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    public EntityStim createStim(World world, ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return new EntityStim(world, entityLivingBase);
    }
}

