package com.alexjw.siegecraft.common.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.common.data.SiegePlayer;
import com.alexjw.siegecraft.common.entity.operator.EntityVigil;
import com.alexjw.siegecraft.common.helper.SiegeHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.util.vector.Quaternion;

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
