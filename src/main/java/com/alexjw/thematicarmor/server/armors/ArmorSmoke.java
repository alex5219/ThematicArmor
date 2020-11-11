package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorSmoke extends Armor {
    public ArmorSmoke() {
        super(true, SpecialistManager.specialistInfection, SpecialistManager.specialistBuff);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
