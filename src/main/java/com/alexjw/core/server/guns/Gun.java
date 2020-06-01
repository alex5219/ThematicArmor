package com.alexjw.core.server.guns;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Gun {
    private float reloadTime = 0.0f;
    private float shootCooldown = 0.0f;
    private float gunDamage = 0.0f;
    private float gunRecoil = 0.0f;
    private String modID = "";
    private String gunName = "";
    private ArrayList<Bullet> bullets = new ArrayList<>();
    //TODO: add the attachments

    public Gun() {
    }

    public Gun(String name) {
        this.modID = "thematic";
        this.gunName = name;
    }

    public Gun(String modID, String gunName, float shootCooldown, float reloadTime, float gunDamage, float gunRecoil, Bullet... bullets) {
        this.modID = modID;
        this.gunName = gunName;
        this.shootCooldown = shootCooldown;
        this.reloadTime = reloadTime;
        this.gunDamage = gunDamage;
        this.gunRecoil = gunRecoil;
        this.bullets.addAll(Arrays.asList(bullets));
    }

    public float getGunDamage() {
        return gunDamage;
    }

    public void setGunDamage(float gunDamage) {
        this.gunDamage = gunDamage;
    }

    public float getGunRecoil() {
        return gunRecoil;
    }

    public void setGunRecoil(float gunRecoil) {
        this.gunRecoil = gunRecoil;
    }

    public float getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(float reloadTime) {
        this.reloadTime = reloadTime;
    }

    public float getShootCooldown() {
        return shootCooldown;
    }

    public void setShootCooldown(float shootCooldown) {
        this.shootCooldown = shootCooldown;
    }

    public String getModID() {
        return modID;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public ArrayList<Bullet> getBullets() {
        return this.bullets;
    }

    private void setBullets(ArrayList<Bullet> bullets) {
        this.bullets.addAll(bullets);
    }

    private void addBullet(Bullet bullet) {
        this.bullets.add(bullet);
    }
}
