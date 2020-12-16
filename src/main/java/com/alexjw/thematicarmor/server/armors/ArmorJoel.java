package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorJoel extends Armor {
    public ArmorJoel() {
        super(SpecialistManager.specialistTenacity, SpecialistManager.specialistDisarm, SpecialistManager.specialistPayback);
    }

}
