package com.alexjw.thematicarmor.server.entity;

import com.alexjw.thematicarmor.server.armors.Armor;
import com.google.common.collect.ImmutableList;
import net.minecraft.entity.ai.attributes.BaseAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ArmorAttribute extends BaseAttribute
{
    private final Map<UUID, Map<AttributePair, UUID>> globalUUIDs = new HashMap<>();
    private final boolean isAdditive;

    public ArmorAttribute(String unlocalizedName, double defaultValue, boolean additive)
    {
        super(null, "armor." + unlocalizedName, defaultValue);
        isAdditive = additive;
    }

    public ArmorAttribute(String unlocalizedName, boolean additive)
    {
        this(unlocalizedName, 0, additive);
    }

    public void clean(EntityPlayer player, IAttributeInstance instance, List<UUID> validated)
    {
        Map<AttributePair, UUID> map = getGlobalUUIDs(player);
        Map<AttributePair, UUID> map1 = new HashMap<>(map);

        ImmutableList<Map.Entry<AttributePair, UUID>> list = ImmutableList.copyOf(map.entrySet());

        for (Map.Entry<AttributePair, UUID> e : list)
        {
            UUID uuid = e.getValue();

            if (!validated.contains(uuid) && instance.getModifier(uuid) != null)
            {
                reset(player, instance, uuid);
                map1.remove(e.getKey());
            }
        }

        if (map1.size() < map.size())
        {
            map.clear();
            map.putAll(map1);
        }
    }

    public void reset(EntityPlayer player, IAttributeInstance instance, UUID uuid)
    {
        ThematicAttributes.removeModifier(instance, uuid);
    }

    public UUID createUUID(EntityPlayer player, AttributePair pair)
    {
        Map<AttributePair, UUID> map = getGlobalUUIDs(player);

        if (map.containsKey(pair))
        {
            return map.get(pair);
        }

        UUID uuid = UUID.randomUUID();
        map.put(pair, uuid);

        return uuid;
    }

    public UUID createUUID(EntityPlayer player, double amount, int operation)
    {
        return createUUID(player, new AttributePair(amount, operation));
    }

    private Map<AttributePair, UUID> getGlobalUUIDs(EntityPlayer player)
    {
        UUID uuid = player.getUniqueID();

        if (globalUUIDs.containsKey(uuid))
        {
            return globalUUIDs.get(uuid);
        }

        Map<AttributePair, UUID> map = new HashMap<>();
        globalUUIDs.put(uuid, map);

        return map;
    }

    public boolean isAdditive()
    {
        return isAdditive;
    }

    public double get(EntityPlayer entity, double baseValue)
    {
        return ThematicAttributes.getModifier(entity, this, baseValue);
    }

    public float get(EntityPlayer entity, float baseValue)
    {
        return ThematicAttributes.getModifier(entity, this, baseValue);
    }

    public double get(EntityPlayer entity, Armor armor, double baseValue)
    {
        return ThematicAttributes.getModifier(entity, armor, this, baseValue);
    }

    public float get(EntityPlayer entity, Armor armor, float baseValue)
    {
        return ThematicAttributes.getModifier(entity, armor, this, baseValue);
    }

    @Override
    public double clampValue(double value)
    {
        return value;
    }
}
