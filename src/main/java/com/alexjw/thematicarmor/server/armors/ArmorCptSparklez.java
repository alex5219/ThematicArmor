package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorCptSparklez extends Armor {
    public ArmorCptSparklez() {
        super(SpecialistManager.specialistOverheal, SpecialistManager.specialistAbsoluteDefense, SpecialistManager.specialistPayback);
    }

}
