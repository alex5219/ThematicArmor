package com.alexjw.core.server.guns;

import com.alexjw.core.server.items.ItemGun;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Gun {
    protected Item itemGun;
    private float reloadTime = 0.0f;
    private int shootCooldown = 0;
    private float gunDamage = 0.0f;
    private float gunRecoil = 0.0f;
    private String modID = "";
    private String gunName = "";
    private ArrayList<Bullet> gunBullets = new ArrayList<>();
    private ArrayList<FireMode> gunFireMode = new ArrayList<>();
    //TODO: add the attachments

    public Gun(String modID, String gunName, int shootCooldown, float reloadTime, float gunDamage, float gunRecoil) {
        this.modID = modID;
        this.gunName = gunName;
        this.shootCooldown = shootCooldown;
        this.reloadTime = reloadTime;
        this.gunDamage = gunDamage;
        this.gunRecoil = gunRecoil;
        Guns.guns.add(this);
        this.itemGun = new ItemGun(this);
    }

    public void init(){}

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

    public Item getItemGun() {
        return itemGun;
    }

    public int getShootCooldown() {
        return shootCooldown;
    }

    public void setShootCooldown(int shootCooldown) {
        this.shootCooldown = shootCooldown;
    }

    public String getModID() {
        return modID;
    }

    public String getGunName() {
        return gunName;
    }

    public ArrayList<FireMode> getGunFireMode() {
        return gunFireMode;
    }

    public void setGunFireMode(ArrayList<FireMode> gunFireMode) {
        this.gunFireMode = gunFireMode;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public ArrayList<Bullet> getGunBullets() {
        return this.gunBullets;
    }

    public void setGunBullets(ArrayList<Bullet> gunBullets) {
        this.gunBullets.addAll(gunBullets);
    }

    public void addFireMode(FireMode fireMode) {
        this.gunFireMode.add(fireMode);
    }

    public void addBullet(Bullet bullet) {
        this.gunBullets.add(bullet);
    }

    public enum FireMode {
        SEMI, AUTO, BURST, SPECIAL
    }
}
