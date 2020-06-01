package com.alexjw.core.server.guns;

public abstract class Bullet {
    private String bulletName = "";
    private int bulletMag = 0;
    private float bulletSpeed = 0.0f;
    private String modID = "";
    //TODO: add the attachments

    public Bullet() {
        Bullets.bullets.add(this);
    }

    public Bullet(String bulletName) {
        Bullets.bullets.add(this);
        this.modID = "thematic";
        this.bulletName = bulletName;
    }

    public Bullet(String modID, String bulletName, int bulletMag, float bulletSpeed) {
        Bullets.bullets.add(this);
        this.modID = modID;
        this.bulletName = bulletName;
        this.bulletMag = bulletMag;
        this.bulletSpeed = bulletSpeed;
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
