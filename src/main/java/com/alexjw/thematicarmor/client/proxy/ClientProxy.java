package com.alexjw.thematicarmor.client.proxy;

import com.alexjw.thematicarmor.client.event.RenderHandler;
import com.alexjw.thematicarmor.client.renderer.SiegeRendererManager;
import com.alexjw.thematicarmor.server.proxy.ServerProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.lwjgl.opengl.Display;

public class ClientProxy extends ServerProxy {
    private Minecraft mc = Minecraft.getMinecraft();


    public ClientProxy() {
    }

    public void preInit() {
        super.preInit();
        SiegeRendererManager.register();
        this.registerEventHandler(new RenderHandler());
    }

    public void init() {
        super.init();
    }

    public void postInit() {
        super.postInit();
    }

    public void setWindowTitle(String displayTitle) {
        Display.setTitle(displayTitle);
    }

    public void registerEventHandler(Object obj) {
        MinecraftForge.EVENT_BUS.register(obj);
        FMLCommonHandler.instance().bus().register(obj);
    }
}
