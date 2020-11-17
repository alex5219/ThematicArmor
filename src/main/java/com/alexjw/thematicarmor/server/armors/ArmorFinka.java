package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorFinka extends Armor {
    public ArmorFinka() {
        super(SpecialistManager.specialistOverheal, SpecialistManager.specialistVitality);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
