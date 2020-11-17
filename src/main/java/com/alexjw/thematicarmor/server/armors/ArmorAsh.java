package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.entity.IAttributeContainer;
import com.alexjw.thematicarmor.server.entity.ThematicAttributes;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import net.minecraft.entity.player.EntityPlayer;

public class ArmorAsh extends Armor {
    public ArmorAsh() {
        super(SpecialistManager.specialistLightfooted);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }

    /**
     * Format:
     * attributes.add(ATTRIBUTE HERE, AMOUNT, OPERATION)
     * Operator 1 = Percentage
     * Operator 0 = Raw Amount
     * e.g attributes.add(ThematicAttributes.JUMP_HEIGHT, 0.25, 1); = 25% higher jump height
     * e.g attributes.add(ThematicAttributes.JUMP_HEIGHT, 0.25, 2); = 0.25 block higher jump height
     */
    public void getAttributeModifiers(EntityPlayer entity, IAttributeContainer attributes) {
        attributes.add(ThematicAttributes.ATTACK_DAMAGE, -0.1f, 1);
        attributes.add(ThematicAttributes.JUMP_HEIGHT, 0.5f, 1);
        attributes.add(ThematicAttributes.KNOCKBACK, 0.1f, 1);
        attributes.add(ThematicAttributes.MAX_HEALTH, 0.9f, 1);
        attributes.add(ThematicAttributes.PUNCH_DAMAGE, 1.0f, 0);
        attributes.add(ThematicAttributes.SPRINT_SPEED, 0.25f, 1);
        attributes.add(ThematicAttributes.SWORD_DAMAGE, -1.00f, 0);
    }
}
