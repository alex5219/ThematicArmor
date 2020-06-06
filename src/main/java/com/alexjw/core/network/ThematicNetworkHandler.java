package com.alexjw.core.network;

import com.alexjw.core.ThematicCore;
import com.alexjw.siegecraft.Siege;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class ThematicNetworkHandler extends ThematicNetworkHelper {
    public static SimpleNetworkWrapper wrapper;

    public ThematicNetworkHandler() {
    }

    public static void registerPackets() {
        wrapper = ThematicNetworkHelper.getWrapper(ThematicCore.MODID);
        registerMessage(MessageShoot.class);
        registerMessage(MessageReload.class);
    }
}
