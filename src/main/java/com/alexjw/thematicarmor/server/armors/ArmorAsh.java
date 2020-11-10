package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorAsh extends Armor {
    public ArmorAsh() {
        super(true, SpecialistManager.specialistVitality);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
