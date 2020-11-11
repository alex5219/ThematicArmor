package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorTachanka extends Armor {
    public ArmorTachanka() {
        super(true, SpecialistManager.specialistTank, SpecialistManager.specialistOverheal, SpecialistManager.specialistTenacity, SpecialistManager.specialistPartingShot);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
