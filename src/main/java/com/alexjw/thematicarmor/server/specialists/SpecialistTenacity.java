package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TAData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

public class SpecialistTenacity extends SpecialistSkill {
    public SpecialistTenacity() {
        super("Tenacity", "If this character takes damage that would kill them, \ntheir health will healed back to 15% of their max health.");
    }

    @Override
    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TAData.TENACITY.putIfAbsent(entityPlayer, false);
    }
}
