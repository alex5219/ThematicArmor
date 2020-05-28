package com.alexjw.siegecraft.common.proxy;

import com.alexjw.siegecraft.common.event.CommonEventHandler;
import com.alexjw.siegecraft.common.operators.OperatorManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class CommonProxy {

    public CommonProxy() {
    }

    public void preInit() {
        OperatorManager.init();
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
