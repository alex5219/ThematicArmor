package com.alexjw.core.server.guns;

import java.util.ArrayList;

public class Bullets {
    public static ArrayList<Bullet> bullets = new ArrayList<>();

    public static Bullet getBulletByName(String bulletName) {
        Bullet bullet = null;
        for (Bullet bulletCheck : Bullets.bullets) {
            if (bulletCheck.getBulletName().equalsIgnoreCase(bulletName)) {
                bullet = bulletCheck;
            }
        }
        return bullet;
    }
}
