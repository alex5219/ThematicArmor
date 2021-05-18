package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.entity.IAttributeContainer;
import com.alexjw.thematicarmor.server.entity.ThematicAttributes;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import net.minecraft.entity.player.EntityPlayer;

public class ArmorHerobrine extends Armor {
    public ArmorHerobrine() {
        super(SpecialistManager.specialistDisarm, SpecialistManager.specialistTenacity, SpecialistManager.specialistHealingFactor, SpecialistManager.specialistLifesteal, SpecialistManager.specialistExecution, SpecialistManager.specialistAbsoluteDefense,  SpecialistManager.specialistConfuse,  SpecialistManager.specialistFireStarter, SpecialistManager.specialistBuff, SpecialistManager.specialistPayback, SpecialistManager.specialistExecution, SpecialistManager.specialistNeutralize, SpecialistManager.specialistTank, SpecialistManager.specialistGuardian);
    }

        public void getAttributeModifiers(EntityPlayer entity, IAttributeContainer attributes) {
            attributes.add(ThematicAttributes.ATTACK_DAMAGE, 0.4f, 1);
            attributes.add(ThematicAttributes.JUMP_HEIGHT, 1.0f, 1);
            attributes.add(ThematicAttributes.KNOCKBACK, 5.0f, 1);
            attributes.add(ThematicAttributes.MAX_HEALTH, 20.0f, 0);
            attributes.add(ThematicAttributes.PUNCH_DAMAGE, 2.0f, 0);
            attributes.add(ThematicAttributes.SPRINT_SPEED, 0.4f, 1);
            attributes.add(ThematicAttributes.SWORD_DAMAGE, 10.00f, 0);
            attributes.add(ThematicAttributes.BULLET_DAMAGE, -0.25f, 0);
            attributes.add(ThematicAttributes.BULLET_PENETRATION, 0.05f, 0);

    }
}
