package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorWoods extends Armor {
    public ArmorWoods() {
        super(SpecialistManager.specialistTenacity, SpecialistManager.specialistAbsoluteDefense, SpecialistManager.specialistPayback);
    }

}
