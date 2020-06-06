package com.alexjw.siegecraft.server.bullets;

import com.alexjw.core.server.guns.Bullet;
import com.alexjw.core.server.guns.Gun;
import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.guns.GunStimPistol;
import com.alexjw.siegecraft.server.guns.SiegeGuns;

import java.lang.reflect.Field;

public class SiegeBullets {
    public static final Bullet stim = new Bullet(Siege.MODID, "stim", 1, 1.0f);

    public static void init() {
        for (Field field : SiegeBullets.class.getFields()) {
            if(field.getType() == Bullet.class){
                try {
                    Bullet bullet = (Bullet)field.get((Object) null);
                    bullet.init();
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        }
    }
}
