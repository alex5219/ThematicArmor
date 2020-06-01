package com.alexjw.core.server.proxy;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class ServerProxy {
    public void preInit() {
    }

    public void init() {
    }

    public void postInit() {
    }

    public void spawnParticle(EnumParticleTypes type, boolean ignoreRange, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
    }

    public void showMuzzleFlash() {
    }

    public void playClientSound(SoundEvent sound) {
    }

    public void playClientSound(double posX, double posY, double posZ, SoundEvent event, SoundCategory category, float volume, float pitch) {
    }

    public void createExplosionStunGrenade(double x, double y, double z) {
    }

    public boolean canShoot() {
        return false;
    }

    public boolean isZooming() {
        return false;
    }

    public void startReloadAnimation() {
    }
}
