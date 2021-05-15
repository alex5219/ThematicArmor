package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorRonny extends Armor {
    public ArmorRonny() {
        super(SpecialistManager.specialistConfuse, SpecialistManager.specialistLightfooted, SpecialistManager.specialistPartingShot);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
