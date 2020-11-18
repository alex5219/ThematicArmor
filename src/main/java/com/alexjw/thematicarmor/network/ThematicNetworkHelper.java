package com.alexjw.thematicarmor.network;

import com.alexjw.thematicarmor.ThematicArmor;
import com.google.common.collect.Maps;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Map;

public class ThematicNetworkHelper {
    private static final Map<String, SimpleNetworkWrapper> wrappers = Maps.newHashMap();
    private static final Map<String, Integer> ids = Maps.newHashMap();

    public ThematicNetworkHelper() {
    }

    public static <REQ extends IMessage & IMessageHandler<REQ, IMessage>> void registerMessage(Class<REQ> msg) {
        registerMessage(msg, Side.CLIENT);
        registerMessage(msg, Side.SERVER);
    }

    public static <REQ extends IMessage & IMessageHandler<REQ, IMessage>> void registerMessage(Class<REQ> msg, Side side) {
        String modid = ThematicArmor.MODID;
        getWrapper(modid).registerMessage(msg, msg, getNextId(modid), side);
    }

    public static SimpleNetworkWrapper getWrapper(String modid) {
        SimpleNetworkWrapper wrapper = wrappers.get(modid);
        if (wrapper == null) {
            wrappers.put(modid, wrapper = new SimpleNetworkWrapper(modid));
        }

        return wrapper;
    }

    protected static int getNextId(String modid) {
        Integer id = ids.get(modid) != null ? ids.get(modid) : 0;
        ids.put(modid, id + 1);
        return id;
    }
}
