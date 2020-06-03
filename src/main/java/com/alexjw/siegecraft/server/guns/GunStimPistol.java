package com.alexjw.siegecraft.server.guns;

import com.alexjw.core.server.guns.Bullet;
import com.alexjw.core.server.guns.Gun;
import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.bullets.SiegeBullets;

import java.util.ArrayList;

public class GunStimPistol extends Gun {
    public GunStimPistol() {
        super(Siege.MODID, "stim_pistol", 0.2f, 0.2f, -2.0f, 0.1f);
    }

    public ArrayList<Bullet> getGunBullets() {
        ArrayList<Bullet> bullets = new ArrayList<>();
        bullets.add(SiegeBullets.stim);
        return bullets;
    }

    public ArrayList<FireMode> getGunFireMode() {
        ArrayList<FireMode> fireModes = new ArrayList<>();
        fireModes.add(FireMode.SEMI);
        return fireModes;
    }
}
