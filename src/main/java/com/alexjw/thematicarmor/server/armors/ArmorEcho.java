package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorEcho extends Armor {
    public ArmorEcho() {
        super(true, SpecialistManager.specialistConfuse, SpecialistManager.specialistSpider, SpecialistManager.specialistDisarm);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
