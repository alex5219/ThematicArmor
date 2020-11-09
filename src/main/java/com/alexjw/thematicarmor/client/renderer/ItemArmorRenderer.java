package com.alexjw.thematicarmor.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class ItemArmorRenderer extends ItemRenderer {
    public static Entity fakePlayer;

    public ItemArmorRenderer(Minecraft mcIn) {
        super(mcIn);
    }
}
