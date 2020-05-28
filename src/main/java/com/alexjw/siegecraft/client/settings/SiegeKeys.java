package com.alexjw.siegecraft.client.settings;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class SiegeKeys {
    public static KeyBinding[] keyBindings = new KeyBinding[3];

    public static void init() {
        keyBindings[0] = new KeyBinding("key.interact.desc", Keyboard.KEY_F, "key.siegemod.category");
        keyBindings[1] = new KeyBinding("key.left.desc", Keyboard.KEY_Q, "key.siegemod.category");
        keyBindings[2] = new KeyBinding("key.right.desc", Keyboard.KEY_E, "key.siegemod.category");

        for (KeyBinding keyBinding : keyBindings) {
            ClientRegistry.registerKeyBinding(keyBinding);
        }
    }
}
