package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorCapitao extends Armor {
    public ArmorCapitao() {
        super(true, SpecialistManager.specialistFireStarter, SpecialistManager.specialistLightfooted);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
