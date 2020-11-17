package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorSmokeElite extends Armor {
    public ArmorSmokeElite() {
        super(SpecialistManager.specialistInfection, SpecialistManager.specialistBuff, SpecialistManager.specialistPayback, SpecialistManager.specialistLifesteal);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
