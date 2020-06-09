package com.alexjw.core.client.event;

import com.alexjw.core.client.data.AimTracker;
import com.alexjw.core.client.proxy.ClientProxy;
import com.alexjw.core.server.event.CommonEvents;
import com.alexjw.core.server.guns.Gun;
import com.alexjw.core.server.items.ItemGun;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CooldownTracker;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GunHandler {
    private static final Map<UUID, AimTracker> AIMING_MAP = new HashMap<>();
    public static boolean aiming = false;

    public static void fire(EntityPlayer player, ItemStack heldItem) {
        if (!(heldItem.getItem() instanceof ItemGun))
            return;

        if (!ItemGun.hasAmmo(heldItem) && !player.capabilities.isCreativeMode)
            return;

        if (player.isSpectator())
            return;

        CooldownTracker tracker = player.getCooldownTracker();
        if (!tracker.hasCooldown(heldItem.getItem())) {
            ItemGun itemGun = (ItemGun) heldItem.getItem();
            Gun modifiedGun = ItemGun.getGun();
            tracker.setCooldown(heldItem.getItem(), modifiedGun.getReloadTime());
            //RenderEvents.getCooldownTracker(player.getUniqueID()).setCooldown(heldItem.getItem(), modifiedGun.general.rate);
            //PacketHandler.INSTANCE.sendToServer(new MessageShoot());
        }
    }

    @Nullable
    private static AimTracker getAimTracker(EntityPlayer player) {
        if (player.getDataManager().get(CommonEvents.AIMING) && !AIMING_MAP.containsKey(player.getUniqueID())) {
            AIMING_MAP.put(player.getUniqueID(), new AimTracker());
        }
        return AIMING_MAP.get(player.getUniqueID());
    }

    public static float getAimProgress(EntityPlayer player, float partialTicks) {
        AimTracker tracker = getAimTracker(player);
        if (tracker != null) {
            return tracker.getNormalProgress(partialTicks);
        }
        return 0F;
    }

    @SubscribeEvent
    public void onKeyPressed(MouseEvent event) {
        if (!Minecraft.getMinecraft().inGameHasFocus)
            return;

        if (!event.isButtonstate())
            return;

        if (event.getButton() == 1 && ClientProxy.isLookingAtInteract())
            return;

        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.player;
        if (player != null) {
            ItemStack heldItem = player.getHeldItemMainhand();
            if (heldItem.getItem() instanceof ItemGun) {
                int button = event.getButton();
                if (button == 0 || button == 1) {
                    event.setCanceled(true);
                }
                if (event.isButtonstate() && button == 0) {
                    fire(player, heldItem);
                } else if (event.isButtonstate() && button == 1) {
                    event.setCanceled(true);
                    fire(player, heldItem);
                }
            }
        }
    }

    @SubscribeEvent
    public void onPostClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END)
            return;

        if (!Minecraft.getMinecraft().inGameHasFocus)
            return;

        EntityPlayer player = Minecraft.getMinecraft().player;
        if (player != null) {
            ItemStack heldItem = player.getHeldItemMainhand();
            if (heldItem.getItem() instanceof ItemGun) {
                Gun gun = ((ItemGun) heldItem.getItem()).getGun();
                if (gun.getGunFireMode().get(1).equals(Gun.FireMode.AUTO)) {
                    /**
                     if(Mouse.isButtonDown(GunConfig.CLIENT.controls.oldControls ? 1 : 0))
                     {
                     fire(player, heldItem);
                     }*/
                }
            }
        }
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.START)
            return;

        if (Minecraft.getMinecraft().player == null)
            return;
        /**
         if(MrCrayfishGunMod.proxy.isZooming())
         {
         if(!aiming)
         {
         Minecraft.getMinecraft().player.getDataManager().set(CommonEvents.AIMING, true);
         PacketHandler.INSTANCE.sendToServer(new MessageAim(true));
         aiming = true;
         }
         }
         else if(aiming)
         {
         Minecraft.getMinecraft().player.getDataManager().set(CommonEvents.AIMING, false);
         PacketHandler.INSTANCE.sendToServer(new MessageAim(false));
         aiming = false;
         }
         */
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.START)
            return;

        EntityPlayer player = event.player;
        AimTracker tracker = getAimTracker(player);
        if (tracker != null) {
            tracker.handleAiming(player);
            if (!tracker.isAiming()) {
                AIMING_MAP.remove(player.getUniqueID());
            }
        }
    }
}