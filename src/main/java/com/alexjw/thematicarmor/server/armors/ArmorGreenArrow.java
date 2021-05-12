package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorGreenArrow extends Armor {
    public ArmorGreenArrow() {
        super(SpecialistManager.specialistBuff, SpecialistManager.specialistDisarm, SpecialistManager.specialistAbsoluteDefense, SpecialistManager.specialistLightfooted, SpecialistManager.specialistSpider);
    }
}
