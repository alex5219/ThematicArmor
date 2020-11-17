package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorSledge extends Armor {
    public ArmorSledge() {
        super(SpecialistManager.specialistBuff, SpecialistManager.specialistTank);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
