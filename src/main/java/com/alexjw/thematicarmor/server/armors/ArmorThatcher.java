package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorThatcher extends Armor {
    public ArmorThatcher() {
        super(SpecialistManager.specialistNeutralize, SpecialistManager.specialistOutlast);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
