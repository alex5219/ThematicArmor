package com.alexjw.siegecraft.client.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.renderer.entity.player.SiegeRenderPlayer;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.OperatorManager;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class RenderHandler {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderPlayer(RenderPlayerEvent.Pre event){
        if(SiegeHelper.getOperator(event.getEntityPlayer()) == OperatorManager.operatorVigilInvis){
            event.setCanceled(true);
            SiegeRenderPlayer siegeRenderPlayer = new SiegeRenderPlayer(event.getRenderer().getRenderManager(), 0.045f);
            siegeRenderPlayer.doRender((AbstractClientPlayer) event.getEntityPlayer(), event.getX(), event.getY(), event.getZ(), 0, event.getPartialRenderTick());
        }
    }
}
