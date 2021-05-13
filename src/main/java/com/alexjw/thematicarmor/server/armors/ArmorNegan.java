package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorNegan extends Armor {
    public ArmorNegan() {
        super(SpecialistManager.specialistTenacity, SpecialistManager.specialistPartingShot, SpecialistManager.specialistVitality);
    }

}
