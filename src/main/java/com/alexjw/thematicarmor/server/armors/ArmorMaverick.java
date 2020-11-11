package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorMaverick extends Armor {
    public ArmorMaverick() {
        super(true, SpecialistManager.specialistFireStarter, SpecialistManager.specialistLightfooted);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
