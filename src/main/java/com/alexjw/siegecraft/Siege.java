package com.alexjw.siegecraft;

import com.alexjw.siegecraft.client.helper.ClientHelper;
import com.alexjw.siegecraft.client.proxy.ClientProxy;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import com.alexjw.siegecraft.server.proxy.ServerProxy;
import com.google.common.collect.Lists;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

import java.io.File;
import java.nio.file.Paths;

@Mod(modid = Siege.MODID, name = Siege.NAME, version = Siege.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Siege extends DummyModContainer {
    public static final Logger LOGGER = LogManager.getLogger("Siege-Craft");
    public static final String MODID = "siegecraft";
    public static final String NAME = "Siege-Craft";
    public static final String VERSION = "1.0.2";
    public static final String CATEGORY_CLIENT = "Client";
    public static final String CATEGORY_GENERAL = "General";
    public static boolean isStandalone;
    @Mod.Instance(MODID)
    public static Siege instance;
    @SidedProxy(clientSide = "com.alexjw.siegecraft.client.proxy.ClientProxy", serverSide = "com.alexjw.siegecraft.server.proxy.ServerProxy")
    public static ServerProxy proxy;
    public Configuration configFile;

    public Siege() {
        super(new ModMetadata());
        ModMetadata meta = this.getMetadata();
        meta.modId = MODID;
        meta.name = NAME;
        meta.description = "A Rainbow Six Siege Inspired Minecraft mod.";
        meta.version = VERSION;
        meta.authorList = Lists.newArrayList("AlexJW", "BBovard", "RaptorHunter303", "LucaC", "Qrow");
        meta.credits = "Thank you to everyone who donated on Patreon.";
        meta.url = "https://discord.gg/gxNVW7z";
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        SiegeNetworkHandler.registerPackets();
        configFile = new Configuration(event.getSuggestedConfigurationFile());
        configFile.load();

        if (FMLCommonHandler.instance().getSide().isClient()) {
            File di = Paths.get(event.getModConfigurationDirectory().getAbsolutePath(), Siege.MODID).toFile();
            if (di.exists()) {
                File icon = Paths.get(di.getAbsolutePath(), "icon.png").toFile();
                if (icon.exists() && !icon.isDirectory()) {
                    Display.setIcon(ClientHelper.load(icon));
                }
            } else {
                di.mkdir();
            }
        }
        isStandalone = configFile.getBoolean("Is Standalone", "General", true, "If enabled, the custom menu will load, the icon will load, and the title will load.");
        configFile.save();
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
            cp.setWindowTitle(NAME + " (1.12.2)");
        }
    }
}
