package com.alexjw.thematicarmor.server.armors;

public class ArmorRook extends Armor {
    public ArmorRook() {
        super(true);
    }
    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
