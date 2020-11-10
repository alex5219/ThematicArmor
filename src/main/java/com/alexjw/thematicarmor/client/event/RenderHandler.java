package com.alexjw.thematicarmor.client.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.client.renderer.ThematicRenderPlayer;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class RenderHandler {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
    public static void renderPlayer(RenderPlayerEvent.Pre event) {
        if (ThematicHelper.getTheme(event.getEntityPlayer()) != null) {
            event.setCanceled(true);
            ThematicRenderPlayer siegeRenderPlayer = new ThematicRenderPlayer(event.getRenderer().getRenderManager());
            siegeRenderPlayer.doRender((AbstractClientPlayer) event.getEntityPlayer(), event.getX(), event.getY(), event.getZ(), 0, event.getPartialRenderTick());
        }
    }
}
