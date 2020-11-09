package com.alexjw.thematicarmor.server.armors;

public class ArmorBandit extends Armor {
    public ArmorBandit() {
        super(true);
    }

    public int getSpeed() {
        return 3;
    }

    public int getArmor() {
        return 1;
    }
}
