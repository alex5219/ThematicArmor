package com.alexjw.siegecraft.server.bullets;

import com.alexjw.core.server.guns.Bullet;

import java.lang.reflect.Field;

public class SiegeBullets {
    //public static final Bullet stim = new Bullet(Siege.MODID, "stim", 1, 1.0f);

    public static void init() {
        for (Field field : SiegeBullets.class.getFields()) {
            if(field.getType() == Bullet.class){
                try {
                    Bullet bullet = (Bullet) field.get(null);
                    bullet.init();
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        }
    }
}
