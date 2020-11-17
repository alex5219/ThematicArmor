package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorJackal extends Armor {
    public ArmorJackal() {
        super(SpecialistManager.specialistNeutralize, SpecialistManager.specialistDisarm, SpecialistManager.specialistPayback);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
