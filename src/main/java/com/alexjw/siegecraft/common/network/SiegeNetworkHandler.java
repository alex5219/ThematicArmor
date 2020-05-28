package com.alexjw.siegecraft.common.network;

import com.alexjw.siegecraft.Siege;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class SiegeNetworkHandler extends SiegeNetworkHelper {
    public static SimpleNetworkWrapper wrapper;

    public SiegeNetworkHandler() {
    }

    public static void registerPackets() {
        wrapper = SiegeNetworkHelper.getWrapper(Siege.MODID);
        registerMessage(MessagePlayerUpdate.class);
        registerMessage(MessageSwapDevice.class);
        registerMessage(MessageAttemptRappel.class);
        registerMessage(MessageSwitchCamera.class);
    }
}
