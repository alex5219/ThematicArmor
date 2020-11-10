package com.alexjw.thematicarmor.server.data;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ThematicData {
    public static HashMap<EntityPlayer, ThematicData> DATA = new HashMap<>();
    public static List<ThematicData> thematicData = new ArrayList<>();
    private ResourceLocation value;
    private boolean canTick = false;

    public static ThematicData LAST_HEAL = new ThematicData(new ResourceLocation("last_heal", "0"), true);
    public static ThematicData TIME_DEAD = new ThematicData(new ResourceLocation("time_dead", "0"), true);
    public static ThematicData TENACITY = new ThematicData(new ResourceLocation("tenacity", "false"), false);
    // THIS MAY BE BETTER AS A HASHMAP IM TIRED

    public ThematicData(ResourceLocation value) {
        this.value = value;
        thematicData.add(this);
    }

    public ThematicData(ResourceLocation value, boolean canTick) {
        this.value = value;
        this.canTick = canTick;
        thematicData.add(this);
    }

    public void onUpdate(EntityPlayer entityPlayer) {
        for(EntityPlayer entityPlayer1:DATA.keySet()) {
            if(entityPlayer.equals(entityPlayer1)) {
                for(ThematicData thematicData:DATA.values()){
                    if(thematicData.canTick && getInteger(entityPlayer, thematicData.value.getResourceDomain()) < 120) {
                        thematicData.incr(entityPlayer, thematicData.value.getResourceDomain());
                    }
                }
            }
        }
    }

    public boolean getBoolean(EntityPlayer entityPlayer, String key) {
        return Boolean.getBoolean(getData(entityPlayer, key).getResourcePath());
    }

    public double getDouble(EntityPlayer entityPlayer, String key) {
        if(getData(entityPlayer, key) != null) {
            return Double.parseDouble(getData(entityPlayer, key).getResourcePath());
        } else {
            return 0;
        }
    }

    public float getFloat(EntityPlayer entityPlayer, String key) {
        if(getData(entityPlayer, key) != null) {
            return Float.parseFloat(getData(entityPlayer, key).getResourcePath());
        } else {
            return 0;
        }
    }

    public int getInteger(EntityPlayer entityPlayer, String key) {
        if(getData(entityPlayer, key) != null) {
            return Integer.parseInt(getData(entityPlayer, key).getResourcePath());
        } else {
            return 0;
        }
    }

    public ItemStack getItemStack(EntityPlayer entityPlayer, String key) {
        return new ItemStack(Objects.requireNonNull(Item.getByNameOrId(getData(entityPlayer, key).toString())));
    }

    public void incr(EntityPlayer entityPlayer, String key) {
        if (hasData(entityPlayer, key)) {
            if(hasData(entityPlayer, key)) {
                int increase = getInteger(entityPlayer, key) + 1;
                DATA.replace(entityPlayer, new ThematicData(new ResourceLocation(key, Integer.toString(increase))));
            } else {
                DATA.put(entityPlayer, new ThematicData(new ResourceLocation(key, "0")));
            }
        }
    }

    public void set(EntityPlayer entityPlayer, String key, Object object) {
        if(hasData(entityPlayer, key)) {
            DATA.replace(entityPlayer, new ThematicData(new ResourceLocation(key, object.toString())));
        } else {
            DATA.put(entityPlayer, new ThematicData(new ResourceLocation(key, object.toString())));
        }
    }

    public void put(EntityPlayer entityPlayer, String key, Object object) {
        DATA.put(entityPlayer, new ThematicData(new ResourceLocation(key, object.toString())));
    }

    public boolean hasData(EntityPlayer entityPlayer, String key) {
        return getData(entityPlayer, key) != null;
    }

    public ResourceLocation getData(EntityPlayer entityPlayer, String key) {
        ResourceLocation data = null;

        if (DATA.containsKey(entityPlayer)) {
            for (ThematicData thematicData : DATA.values()) {
                if (thematicData.getValue().getResourceDomain().equals(key)) {
                    data = thematicData.value;
                    break;
                }
            }
        }
        return data;
    }

    public ResourceLocation getValue() {
        return value;
    }

    public boolean canTick() {
        return canTick;
    }
}
