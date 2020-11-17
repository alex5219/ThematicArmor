package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorFrost extends Armor {
    public ArmorFrost() {
        super(SpecialistManager.specialistExecution, SpecialistManager.specialistLifesteal);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
