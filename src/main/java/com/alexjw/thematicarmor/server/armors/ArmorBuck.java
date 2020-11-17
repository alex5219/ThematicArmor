package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorBuck extends Armor {
    public ArmorBuck() {
        super(SpecialistManager.specialistExecution, SpecialistManager.specialistPartingShot);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
