package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorMario extends Armor {
    public ArmorMario() {
        super(false, SpecialistManager.specialistLightfooted, SpecialistManager.specialistBuff );
    }
}
