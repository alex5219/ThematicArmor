package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorThermite extends Armor {
    public ArmorThermite() {
        super(SpecialistManager.specialistFireStarter, SpecialistManager.specialistGuardian, SpecialistManager.specialistDisarm);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
