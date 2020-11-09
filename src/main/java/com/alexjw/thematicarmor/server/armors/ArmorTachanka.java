package com.alexjw.thematicarmor.server.armors;

public class ArmorTachanka extends Armor {
    public ArmorTachanka() {
        super(true);
    }

    public int getSpeed() {
        return 1;
    }

    public int getArmor() {
        return 3;
    }
}
