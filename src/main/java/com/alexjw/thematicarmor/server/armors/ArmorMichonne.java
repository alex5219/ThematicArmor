package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorMichonne extends Armor {
    public ArmorMichonne() {
        super(SpecialistManager.specialistOutlast, SpecialistManager.specialistNeutralize, SpecialistManager.specialistDisarm);
    }
}
