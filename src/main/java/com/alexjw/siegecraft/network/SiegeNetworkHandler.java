package com.alexjw.siegecraft.network;

import com.alexjw.core.network.ThematicNetworkHelper;
import com.alexjw.siegecraft.Siege;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class SiegeNetworkHandler extends ThematicNetworkHelper {
    public static SimpleNetworkWrapper wrapper;

    public SiegeNetworkHandler() {
    }

    public static void registerPackets() {
        wrapper = ThematicNetworkHelper.getWrapper(Siege.MODID);
        registerMessage(MessageShootPistol.class);
        registerMessage(MessageReloadPistol.class);
        registerMessage(MessageBlowtorch.class);
        registerMessage(MessagePlayerUpdate.class);
        registerMessage(MessageSwapDevice.class);
        registerMessage(MessageAttemptRappel.class);
        registerMessage(MessageSwitchCamera.class);
    }
}
