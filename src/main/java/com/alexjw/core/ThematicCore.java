package com.alexjw.core;

import com.alexjw.core.server.proxy.ServerProxy;
import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ThematicCore.MODID, name = ThematicCore.NAME, version = ThematicCore.VERSION, acceptedMinecraftVersions = "1.12.2")
public class ThematicCore extends DummyModContainer {
    public static final Logger LOGGER = LogManager.getLogger("Thematic-Core");
    public static final String MODID = "thematiccore";
    public static final String NAME = "Thematic-Core";
    public static final String VERSION = "1.0.2";

    @Mod.Instance(MODID)
    public static ThematicCore instance;

    @SidedProxy(clientSide = "com.alexjw.core.client.proxy.ClientProxy", serverSide = "com.alexjw.core.server.proxy.ServerProxy")
    public static ServerProxy proxy;

    public ThematicCore() {
        super(new ModMetadata());
        ModMetadata meta = this.getMetadata();
        meta.modId = MODID;
        meta.name = NAME;
        meta.description = "CoreMod for the RainbowSix Siege Mod and other mods.";
        meta.version = VERSION;
        meta.authorList = Lists.newArrayList("AlexJW");
        meta.url = "https://discord.gg/gxNVW7z";
    }

    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @Mod.EventHandler
    public void onServerStart(FMLServerStartedEvent event) {
    }
}
