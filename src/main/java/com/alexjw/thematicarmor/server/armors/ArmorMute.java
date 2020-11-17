package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorMute extends Armor {
    public ArmorMute() {
        super(SpecialistManager.specialistDisarm, SpecialistManager.specialistPartingShot);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
