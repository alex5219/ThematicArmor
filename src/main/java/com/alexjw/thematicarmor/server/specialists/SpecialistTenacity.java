package com.alexjw.thematicarmor.server.specialists;

import com.alexjw.thematicarmor.server.data.TADataManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class SpecialistTenacity extends SpecialistSkill {
    public SpecialistTenacity() {
        super("Tenacity", "If this character takes damage that would kill them, \ntheir health will healed back to 15% of their max health.");
    }

    @Override
    public void onUpdate(EntityPlayer entityPlayer, ItemStack itemStack) {
        TADataManager.TENACITY.putIfAbsent(entityPlayer, false);
    }
}
