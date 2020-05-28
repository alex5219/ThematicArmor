package com.alexjw.siegecraft;

import com.alexjw.siegecraft.client.helper.ClientHelper;
import com.alexjw.siegecraft.common.network.SiegeNetworkHandler;
import com.alexjw.siegecraft.common.proxy.ClientProxy;
import com.alexjw.siegecraft.common.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

import java.io.File;
import java.nio.file.Paths;

@Mod(modid = Siege.MODID, name = Siege.NAME, version = Siege.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Siege {
    public static final String MODID = "siegecraft";
    public static final String NAME = "Siege-Craft";
    public static final String VERSION = "1.0.2";
    public static final String CATEGORY_CLIENT = "Client";
    public static final String CATEGORY_GENERAL = "General";
    public static boolean isStandalone;
    public static Logger logger;
    @Mod.Instance(MODID)
    public static Siege instance;
    @SidedProxy(clientSide = "com.alexjw.siegecraft.common.proxy.ClientProxy", serverSide = "com.alexjw.siegecraft.common.proxy.CommonProxy")
    public static CommonProxy proxy;
    public Configuration configFile;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        SiegeNetworkHandler.registerPackets();
        configFile = new Configuration(event.getSuggestedConfigurationFile());
        configFile.load();

        if (FMLCommonHandler.instance().getSide().isClient()) {
            logger = event.getModLog();

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
