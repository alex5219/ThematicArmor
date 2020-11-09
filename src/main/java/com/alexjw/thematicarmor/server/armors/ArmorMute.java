package com.alexjw.thematicarmor.server.armors;

public class ArmorMute extends Armor {
    public ArmorMute() {
        super(true);
    }

    public int getSpeed() {
        return 2;
    }

    public int getArmor() {
        return 2;
    }
}
