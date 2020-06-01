package com.alexjw.siegecraft.server.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.data.SiegePlayer;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class RappelEvent {

    @SubscribeEvent
    public static void onPlayerCollide(TickEvent.PlayerTickEvent event) {
        SiegePlayer siegePlayer = SiegeHelper.getSiegePlayerByEntity(event.player);
        if(siegePlayer != null) {
            if(siegePlayer.isRapelling()) {
                if (event.player.collidedHorizontally) {
                    event.player.fallDistance = 0.0F;
                    if (event.player.isSneaking()) {
                        event.player.motionY = 0.0D;
                    } else {
                        event.player.motionY = 0.1176D; //(0.2D - 0.08D) * 0.98D
                    }
                }
                if (!event.player.world.isRemote) {
                    double motionX = event.player.posX - event.player.lastTickPosX;
                    double motionZ = event.player.posZ - event.player.lastTickPosZ;
                    double motionY = event.player.posY - event.player.lastTickPosY - 0.765D;
                    if (motionY > 0.0D && (motionX == 0D || motionZ == 0D)) {
                        event.player.fallDistance = 0.0F;
                    }
                }
            }
        }
    }
}
