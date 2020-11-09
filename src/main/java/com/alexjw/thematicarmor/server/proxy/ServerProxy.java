package com.alexjw.thematicarmor.server.proxy;

import com.alexjw.thematicarmor.server.event.CommonEventHandler;
import com.alexjw.thematicarmor.server.armors.ArmorManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ServerProxy {

    public ServerProxy() {
    }

    public void preInit() {
        ArmorManager.init();
        this.registerEventHandler(new CommonEventHandler());
    }

    public void init() {
    }

    public void postInit() {

    }

    public void registerEventHandler(Object obj) {
        MinecraftForge.EVENT_BUS.register(obj);
        FMLCommonHandler.instance().bus().register(obj);
    }

    public void playSound(EntityLivingBase entity, String sound, float volume, float pitch, int... args) {

    }
}
