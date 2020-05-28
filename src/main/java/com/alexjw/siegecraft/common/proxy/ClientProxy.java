package com.alexjw.siegecraft.common.proxy;

import com.alexjw.siegecraft.client.event.ClientEventHandler;
import com.alexjw.siegecraft.client.event.KeyBindHandler;
import com.alexjw.siegecraft.client.renderer.entity.RenderCamera;
import com.alexjw.siegecraft.client.renderer.entity.RenderDrone;
import com.alexjw.siegecraft.client.renderer.entity.RenderRope;
import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.client.renderer.entity.operators.*;
import com.alexjw.siegecraft.client.settings.SiegeKeys;
import com.alexjw.siegecraft.common.entity.EntityCamera;
import com.alexjw.siegecraft.common.entity.EntityDrone;
import com.alexjw.siegecraft.common.entity.EntityRope;
import com.alexjw.siegecraft.common.entity.operator.*;
import com.alexjw.siegecraft.common.sounds.SiegeSounds;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import org.lwjgl.opengl.Display;

public class ClientProxy extends CommonProxy {
    private Minecraft mc = Minecraft.getMinecraft();


    public ClientProxy() {
    }

    public void preInit() {
        super.preInit();
        SiegeRendererManager.register();
        RenderingRegistry.registerEntityRenderingHandler(EntityAsh.class, RenderAsh::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBandit.class, RenderBandit::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDoc.class, RenderDoc::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityFinka.class, RenderFinka::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityJackal.class, RenderJackal::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityMaverick.class, RenderMaverick::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRook.class, RenderRook::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySledge.class, RenderSledge::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySmoke.class, RenderSmoke::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityVigil.class, RenderVigil::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDrone.class, RenderDrone::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCamera.class, RenderCamera::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRope.class, RenderRope::new);

        this.registerEventHandler(new ClientEventHandler());
        this.registerEventHandler(new KeyBindHandler());
    }

    public void init() {
        super.init();
        SiegeKeys.init();
        SiegeSounds.init();
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
