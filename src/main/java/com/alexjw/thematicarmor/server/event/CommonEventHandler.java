package com.alexjw.thematicarmor.server.event;

import com.alexjw.thematicarmor.ThematicArmor;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class CommonEventHandler {
    private static Random random = new Random();

}
