package com.alexjw.thematicarmor.server.utils;

import net.minecraft.util.DamageSource;

public class ThematicServerUtils {
    public static boolean isMeleeDamage(DamageSource source)
    {
        return source.getImmediateSource() != null && !source.isMagicDamage() && !source.isExplosion() && !source.isProjectile() && !source.isFireDamage();
    }
}
