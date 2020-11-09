package com.alexjw.thematicarmor.server.armors;

public class ArmorEcho extends Armor {
    public ArmorEcho() {
        super(true);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
