package com.alexjw.core.client.event;

import com.alexjw.core.server.items.ItemGun;
import com.alexjw.siegecraft.Siege;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class ClientEventHandler {
    public static boolean isZooming = false;


    @SubscribeEvent
    public void onFovUpdate(FOVUpdateEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.player != null && !mc.player.getHeldItemMainhand().isEmpty() && mc.gameSettings.thirdPersonView == 0) {
            ItemStack heldItem = mc.player.getHeldItemMainhand();
            if(heldItem.getItem() instanceof ItemGun) {
                ItemGun gunItem = (ItemGun) heldItem.getItem();

                /*
                if(this.isZooming(Minecraft.getInstance().player) && !SyncedPlayerData.instance().get(mc.player, ModSyncedDataKeys.RELOADING))
                {
                    Gun modifiedGun = gunItem.getModifiedGun(heldItem);
                    if(modifiedGun.modules.zoom != null)
                    {
                        float newFov = modifiedGun.modules.zoom.fovModifier;
                        Scope scope = Gun.getScope(heldItem);
                        event.setNewfov(newFov + (1.0F - newFov) * (1.0F - (zoomProgress / (float) ZOOM_TICKS)));
                    }
                }*/
            }
        }
    }
}
