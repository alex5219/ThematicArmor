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


            }
        }
    }
}
