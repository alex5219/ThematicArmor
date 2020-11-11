package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorMozzie extends Armor {
    public ArmorMozzie() {
        super(true, SpecialistManager.specialistBuff, SpecialistManager.specialistNeutralize);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
