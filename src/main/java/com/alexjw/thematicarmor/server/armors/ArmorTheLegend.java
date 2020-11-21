package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.entity.IAttributeContainer;
import com.alexjw.thematicarmor.server.entity.ThematicAttributes;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import net.minecraft.entity.player.EntityPlayer;

public class ArmorTheLegend extends Armor {
    public ArmorTheLegend() {
        super(SpecialistManager.specialistDisarm, SpecialistManager.specialistTenacity, SpecialistManager.specialistHealingFactor, SpecialistManager.specialistLifesteal, SpecialistManager.specialistExecution, SpecialistManager.specialistVitality);
    }

        public void getAttributeModifiers(EntityPlayer entity, IAttributeContainer attributes) {
            attributes.add(ThematicAttributes.ATTACK_DAMAGE, 0.1f, 1);
            attributes.add(ThematicAttributes.JUMP_HEIGHT, 1.0f, 1);
            attributes.add(ThematicAttributes.KNOCKBACK, 0.1f, 1);
            attributes.add(ThematicAttributes.MAX_HEALTH, 20.0f, 0);
            attributes.add(ThematicAttributes.PUNCH_DAMAGE, 1.0f, 0);
            attributes.add(ThematicAttributes.SPRINT_SPEED, 0.25f, 1);
            attributes.add(ThematicAttributes.SWORD_DAMAGE, 1.00f, 0);
            attributes.add(ThematicAttributes.BULLET_DAMAGE, -0.25f, 0);
            attributes.add(ThematicAttributes.BULLET_PENETRATION, 0.05f, 0);

    }
}
