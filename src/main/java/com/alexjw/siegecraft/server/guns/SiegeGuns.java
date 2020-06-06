package com.alexjw.siegecraft.server.guns;

import com.alexjw.core.server.guns.Gun;
import com.alexjw.siegecraft.server.operators.Operator;

import java.lang.reflect.Field;

public class SiegeGuns {
    public static final GunStimPistol stimPistol = new GunStimPistol();

    public static void init() {
        for (Field field : SiegeGuns.class.getFields()) {
            if(field.getType() == Gun.class){
                try {
                    Gun gun = (Gun)field.get((Object) null);
                    gun.init();
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        }
    }
}
