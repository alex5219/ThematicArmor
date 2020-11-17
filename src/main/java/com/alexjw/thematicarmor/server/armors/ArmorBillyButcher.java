package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorBillyButcher extends Armor {
    public ArmorBillyButcher() {
        super(SpecialistManager.specialistOutlast, SpecialistManager.specialistNeutralize);
    }
}
