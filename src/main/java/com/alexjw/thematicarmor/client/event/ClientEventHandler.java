package com.alexjw.thematicarmor.client.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.items.armor.ItemThemeArmor;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class ClientEventHandler {

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent event) {
        if (event.getItemStack().getItem() instanceof ItemThemeArmor) {
            ItemThemeArmor.hideSpecialists = (!GuiScreen.isShiftKeyDown());
            ItemThemeArmor.hideStats = (!GuiScreen.isCtrlKeyDown());
        }
    }
}
