package com.alexjw.core.server.event;

import com.alexjw.core.server.guns.Gun;
import com.alexjw.core.server.items.ItemBullet;
import com.alexjw.core.server.items.ItemGun;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.CooldownTracker;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CommonEvents {
    public static final DataParameter<Boolean> AIMING = EntityDataManager.createKey(EntityPlayer.class, DataSerializers.BOOLEAN);
    public static final DataParameter<Boolean> RELOADING = EntityDataManager.createKey(EntityPlayer.class, DataSerializers.BOOLEAN);
    private static final Map<UUID, CooldownTracker> COOLDOWN_TRACKER_MAP = new HashMap<>();
    private Map<UUID, ReloadTracker> reloadTrackerMap = new HashMap<>();

    public static CooldownTracker getCooldownTracker(UUID uuid) {
        if (!COOLDOWN_TRACKER_MAP.containsKey(uuid)) {
            COOLDOWN_TRACKER_MAP.put(uuid, new CooldownTracker());
        }
        return COOLDOWN_TRACKER_MAP.get(uuid);
    }

    @SubscribeEvent
    public void onPlayerInit(EntityEvent.EntityConstructing event) {
        if (event.getEntity() instanceof EntityPlayer) {
            event.getEntity().getDataManager().register(AIMING, false);
            event.getEntity().getDataManager().register(RELOADING, false);
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START && !event.player.world.isRemote) {
            EntityPlayer player = event.player;
            if (player.getDataManager().get(RELOADING)) {
                if (!reloadTrackerMap.containsKey(player.getUniqueID())) {
                    if (!(player.inventory.getCurrentItem().getItem() instanceof ItemGun)) {
                        player.getDataManager().set(RELOADING, false);
                        return;
                    }
                    reloadTrackerMap.put(player.getUniqueID(), new ReloadTracker(player));
                }
                ReloadTracker tracker = reloadTrackerMap.get(player.getUniqueID());
                if (!tracker.isSameWeapon(player) || !tracker.hasAmmo(player)) {
                    reloadTrackerMap.remove(player.getUniqueID());
                    player.getDataManager().set(RELOADING, false);
                    return;
                }
                if (tracker.canReload(player)) {
                    tracker.increaseAmmo(player);
                    if (!tracker.hasAmmo(player)) {
                        reloadTrackerMap.remove(player.getUniqueID());
                        player.getDataManager().set(RELOADING, false);
                    }
                }
            }
            getCooldownTracker(player.getUniqueID()).tick();
        }
    }

    private static class ReloadTracker {
        private int startTick;
        private int slot;
        private ItemStack stack;
        private Gun gun;

        private ReloadTracker(EntityPlayer player) {
            this.startTick = player.ticksExisted;
            this.slot = player.inventory.currentItem;
            this.stack = player.inventory.getCurrentItem();
            this.gun = ((ItemGun) stack.getItem()).getGun();
        }

        public boolean isSameWeapon(EntityPlayer player) {
            return !stack.isEmpty() && player.inventory.currentItem == slot && player.inventory.getCurrentItem() == stack;
        }

        public boolean hasAmmo(EntityPlayer player) {
            return ItemGun.hasAmmo(player) != null;
        }

        public boolean canReload(EntityPlayer player) {
            int deltaTicks = player.ticksExisted - startTick;
            return deltaTicks > 0 && deltaTicks % 10 == 0;
        }

        public void increaseAmmo(EntityPlayer player) {
            ItemBullet ammo = ItemGun.hasAmmo(player);
            ItemStack itemStack = new ItemStack(ammo);
            if (!itemStack.isEmpty()) {
                int amount = Math.min(itemStack.getCount(), ItemGun.hasAmmo(player).getAmmo(ItemGun.hasAmmo(player)));
                NBTTagCompound tag = stack.getTagCompound();
                if (tag != null) {
                    amount = Math.min(amount, ItemGun.hasAmmo(player).getMaxAmmo() - tag.getInteger("AmmoCount"));
                    tag.setInteger("AmmoCount", tag.getInteger("AmmoCount") + amount);
                }
                itemStack.shrink(amount);
            }
        }
    }
}
