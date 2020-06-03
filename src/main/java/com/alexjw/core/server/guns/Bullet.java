package com.alexjw.core.server.guns;

import com.alexjw.core.server.items.ItemBullet;

public class Bullet {
    private String bulletName = "";
    private int bulletMag = 0;
    private float bulletSpeed = 0.0f;
    private String modID = "";
    protected ItemBullet itemBullet;
    //TODO: add the attachments

    public Bullet(String modID, String bulletName, int bulletMag, float bulletSpeed) {
        this.itemBullet = new ItemBullet(this);
        this.modID = modID;
        this.bulletName = bulletName;
        this.bulletMag = bulletMag;
        this.bulletSpeed = bulletSpeed;
        Bullets.bullets.add(this);
    }

    public ItemBullet getItemBullet() {
        return itemBullet;
    }

    public String getBulletName() {
        return bulletName;
    }

    public float getBulletSpeed() {
        return bulletSpeed;
    }

    public int getBulletMag() {
        return bulletMag;
    }

    public String getModID() {
        return modID;
    }
}
