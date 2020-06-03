package com.alexjw.core.server.guns;

import java.util.ArrayList;

public class Guns {
    public static ArrayList<Gun> guns = new ArrayList<>();

    public static Gun getGunByName(String gunName) {
        Gun bullet = null;
        for (Gun bulletCheck : Guns.guns) {
            if (bulletCheck.getGunName().equalsIgnoreCase(gunName)) {
                bullet = bulletCheck;
            }
        }
        return bullet;
    }
}
