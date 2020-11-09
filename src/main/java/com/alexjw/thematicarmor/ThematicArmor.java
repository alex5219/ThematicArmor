package com.alexjw.thematicarmor;

import com.alexjw.thematicarmor.client.proxy.ClientProxy;
import com.alexjw.thematicarmor.server.proxy.ServerProxy;
import com.google.common.collect.Lists;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ThematicArmor.MODID, name = ThematicArmor.NAME, version = ThematicArmor.VERSION, acceptedMinecraftVersions = "1.12.2")
public class ThematicArmor extends DummyModContainer {
    public static final String MODID = "thematicarmor";
    public static final String NAME = "ThematicArmor";
    public static final String VERSION = "1.0.2";

    @Mod.Instance(MODID)
    public static ThematicArmor instance;
    @SidedProxy(clientSide = "com.alexjw.thematicarmor.client.proxy.ClientProxy", serverSide = "com.alexjw.thematicarmor.server.proxy.ServerProxy")
    public static ServerProxy proxy;
    public Configuration configFile;

    public ThematicArmor() {
        super(new ModMetadata());
        ModMetadata meta = this.getMetadata();
        meta.modId = MODID;
        meta.name = NAME;
        meta.version = VERSION;
        meta.authorList = Lists.newArrayList("AlexJW", "BBovard");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @EventHandler
    public void serverStart(FMLServerStartingEvent event) {

    }

    @EventHandler
    @SideOnly(Side.CLIENT)
    public void construction(FMLLoadCompleteEvent event) {
        if (proxy instanceof ClientProxy) {
            ClientProxy cp = (ClientProxy) proxy;
            cp.setWindowTitle("The Syndicate (1.12.2)");
        }
    }
}
