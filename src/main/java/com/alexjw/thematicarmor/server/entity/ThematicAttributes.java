package com.alexjw.thematicarmor.server.entity;

import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;

import java.lang.reflect.Field;
import java.util.*;

public class ThematicAttributes {
    private static final Map<String, ArmorAttribute> REGISTRY = new HashMap<>();
    private static final UUID UUID_HEALTH_MOD = UUID.fromString("8c1729f2-e903-4fc7-94d5-7691c4196643");
    public static final ArmorAttribute ATTACK_DAMAGE = new ArmorAttribute("attackDamage", true);
    public static final ArmorAttribute JUMP_HEIGHT = new ArmorAttribute("jumpHeight", true);
    public static final ArmorAttribute KNOCKBACK = new ArmorAttribute("knockback", true);
    public static final ArmorAttribute MAX_HEALTH = new ArmorAttribute("maxHealth", true);
    public static final ArmorAttribute PUNCH_DAMAGE = new ArmorAttribute("punchDamage", true);
    public static final ArmorAttribute SPRINT_SPEED = new ArmorAttribute("sprintSpeed", true);
    public static final ArmorAttribute SWORD_DAMAGE = new ArmorAttribute("swordDamage", true);
    public static final ArmorAttribute BULLET_DAMAGE = new ArmorAttribute("bulletDamage", true);
    public static final ArmorAttribute BULLET_PENETRATION = new ArmorAttribute("bulletPenetration", true);

    public static AttributeWrapper getAttribute(EntityPlayer entity, ArmorAttribute attribute) {
        return getAttribute(entity, ThematicHelper.getTheme(entity), attribute);
    }

    public static AttributeWrapper getAttribute(EntityPlayer entity, Armor armor, ArmorAttribute attribute) {
        if (armor != null) {
            AttributeWrapper wrapper = new AttributeWrapper(attribute);
            armor.getAttributeModifiers(entity, (attr, amount, operation) ->
            {
                if (attr == attribute) {
                    wrapper.apply(amount, operation);
                }
            });

            return wrapper.isEmpty() ? null : wrapper;
        }

        return null;
    }

    public static double getModifier(EntityPlayer entity, ArmorAttribute attribute, double baseValue) {
        return getModifier(entity, ThematicHelper.getTheme(entity), attribute, baseValue);
    }

    public static double getModifier(EntityPlayer entity, Armor armor, ArmorAttribute attribute, double baseValue) {
        AttributeWrapper wrapper = getAttribute(entity, armor, attribute);

        if (wrapper != null) {
            double result = wrapper.getValue(baseValue);

            return attribute.isAdditive() ? result : baseValue * 2 - result;
        }

        return baseValue;
    }

    public static float getModifier(EntityPlayer entity, ArmorAttribute attribute, float baseValue) {
        return getModifier(entity, ThematicHelper.getTheme(entity), attribute, baseValue);
    }

    public static float getModifier(EntityPlayer entity, Armor armor, ArmorAttribute attribute, float baseValue) {
        return (float) getModifier(entity, armor, attribute, (double) baseValue);
    }

    public static void applyModifiers(EntityPlayer player) {
        IAttributeInstance speedAttribute = player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        IAttributeInstance healthAttribute = player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
        IAttributeInstance[] instances = {speedAttribute, healthAttribute};
        ArmorAttribute[] attributes = {SPRINT_SPEED, MAX_HEALTH};

        for (int i = 0; i < attributes.length; ++i) {
            ArmorAttribute attribute = attributes[i];
            List<UUID> list = new ArrayList<>();

            if (attribute != SPRINT_SPEED || player.isSprinting()) {
                AttributeWrapper wrapper = getAttribute(player, attribute);

                if (wrapper != null) {
                    List<AttributePair> modifiers = wrapper.getModifiers();

                    for (AttributePair mod : modifiers) {
                        UUID uuid = attribute.createUUID(player, mod);
                        applyModifier(instances[i], uuid, mod.amount, mod.operation);
                        list.add(uuid);
                    }
                }
            }

            attribute.clean(player, instances[i], list);
        }
    }

    public static boolean applyModifier(IAttributeInstance instance, UUID uuid, double amount, int operation) {
        AttributeModifier modifier = instance.getModifier(uuid);

        if (modifier == null) {
            instance.applyModifier(new AttributeModifier(uuid, uuid.toString(), amount, operation).setSaved(false));
            return true;
        } else if ((modifier.getAmount() != amount || modifier.getOperation() != operation) && removeModifier(instance, uuid)) {
            return applyModifier(instance, uuid, amount, operation);
        }

        return false;
    }

    public static boolean removeModifier(IAttributeInstance instance, UUID uuid) {
        AttributeModifier modifier = instance.getModifier(uuid);

        if (modifier != null) {
            instance.removeModifier(modifier);
            return true;
        }

        return false;
    }

    public static ArmorAttribute getAttribute(String key) {
        return REGISTRY.get(key);
    }

    static {
        for (Field field : ThematicAttributes.class.getFields()) {
            if (field.getType() == ArmorAttribute.class) {
                try {
                    REGISTRY.put(field.getName(), (ArmorAttribute) field.get(null));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
