package com.alexjw.siegecraft.client.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.settings.SiegeKeys;
import com.alexjw.siegecraft.network.MessageAttemptRappel;
import com.alexjw.siegecraft.network.MessageSwitchCamera;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class KeyBindHandler {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onPress(InputEvent.KeyInputEvent event) {
        KeyBinding[] keyBindings = SiegeKeys.keyBindings;
        KeyBinding[] defaultKeys = Minecraft.getMinecraft().gameSettings.keyBindings;

        if (keyBindings[0].isPressed()) {
            SiegeNetworkHandler.wrapper.sendToServer(new MessageAttemptRappel());
        }
        if (keyBindings[1].isKeyDown() && defaultKeys[42].isKeyDown()) {
            ClientEventHandler.isLeaningLeft = !ClientEventHandler.isLeaningLeft;
            SiegeNetworkHandler.wrapper.sendToServer(new MessageSwitchCamera(0));
        }
        if (keyBindings[2].isKeyDown() && defaultKeys[42].isKeyDown()) {
            ClientEventHandler.isLeaningRight = !ClientEventHandler.isLeaningRight;
            SiegeNetworkHandler.wrapper.sendToServer(new MessageSwitchCamera(1));
        }
    }
}
