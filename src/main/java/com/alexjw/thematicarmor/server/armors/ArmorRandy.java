package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorRandy extends Armor {
    public ArmorRandy() {
        super(false, SpecialistManager.specialistConfuse, SpecialistManager.specialistInfection, SpecialistManager.specialistBuff);
    }

}
