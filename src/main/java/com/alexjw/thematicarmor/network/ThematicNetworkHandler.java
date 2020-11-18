package com.alexjw.thematicarmor.network;

import com.alexjw.thematicarmor.ThematicArmor;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class ThematicNetworkHandler extends ThematicNetworkHelper {
    public static SimpleNetworkWrapper wrapper;

    public ThematicNetworkHandler() {
    }

    public static void registerPackets() {
        wrapper = ThematicNetworkHelper.getWrapper(ThematicArmor.MODID);
        registerMessage(MessageScrambleInventory.class);
    }
}
