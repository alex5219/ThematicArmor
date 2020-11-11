package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorDoc extends Armor {
    public ArmorDoc() {
        super(true, SpecialistManager.specialistTank, SpecialistManager.specialistOverheal, SpecialistManager.specialistHealingFactor);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
