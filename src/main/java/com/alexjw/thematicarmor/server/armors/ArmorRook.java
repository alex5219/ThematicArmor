package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorRook extends Armor {
    public ArmorRook() {
        super(SpecialistManager.specialistTank, SpecialistManager.specialistOutlast, SpecialistManager.specialistAbsoluteDefense);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
