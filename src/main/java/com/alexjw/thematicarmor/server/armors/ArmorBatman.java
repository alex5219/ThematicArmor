package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorBatman extends Armor {
    public ArmorBatman() {
        super(SpecialistManager.specialistBuff, SpecialistManager.specialistDisarm, SpecialistManager.specialistAbsoluteDefense, SpecialistManager.specialistLightfooted, SpecialistManager.specialistSpider);
    }
}
