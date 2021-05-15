package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorBlackCanary extends Armor {
    public ArmorBlackCanary() {
        super(SpecialistManager.specialistLightfooted, SpecialistManager.specialistDisarm, SpecialistManager.specialistConfuse);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
