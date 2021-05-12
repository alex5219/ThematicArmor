package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorScorpion extends Armor {
    public ArmorScorpion() {
        super(SpecialistManager.specialistFireStarter, SpecialistManager.specialistLightfooted);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
