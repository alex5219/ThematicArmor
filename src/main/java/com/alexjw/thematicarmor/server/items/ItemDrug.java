package com.alexjw.thematicarmor.server.items;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.ThematicTabs;
import com.alexjw.thematicarmor.server.drugs.Drug;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDrug extends ItemFood {
    private Drug drug;

    public ItemDrug(Drug drug, int amount, float saturation) {
        super(amount, saturation, false);
        this.drug = drug;
        this.setUnlocalizedName(drug.getUnlocalizedName());
        this.setRegistryName(ThematicArmor.MODID, drug.getUnlocalizedName());
        this.setCreativeTab(ThematicTabs.tabArmors);
        this.setAlwaysEdible();
        ModItems.ITEMS.add(this);
    }

    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        drug.onConsume(entityPlayer);
    }
}
