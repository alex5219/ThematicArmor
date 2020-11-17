package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorDeadpool extends Armor {
    public ArmorDeadpool() {
        super(SpecialistManager.specialistLightfooted, SpecialistManager.specialistDisarm, SpecialistManager.specialistTenacity, SpecialistManager.specialistHealingFactor, SpecialistManager.specialistLifesteal, SpecialistManager.specialistExecution, SpecialistManager.specialistVitality, SpecialistManager.specialistBuff);
    }
}
