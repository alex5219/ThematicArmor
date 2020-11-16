package com.alexjw.thematicarmor.server.proxy;

import com.alexjw.thematicarmor.server.armors.ArmorManager;
import com.alexjw.thematicarmor.server.event.SpecialistHandler;
import com.alexjw.thematicarmor.server.event.SoulboundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ServerProxy {

    public ServerProxy() {
    }

    public void preInit() {
        ArmorManager.init();
        this.registerEventHandler(new SpecialistHandler());
        this.registerEventHandler(new SoulboundHandler());
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
