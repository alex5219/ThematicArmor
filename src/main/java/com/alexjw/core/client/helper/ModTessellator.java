package com.alexjw.core.client.helper;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class ModTessellator {
    private static final Tessellator tessellator = Tessellator.getInstance();
    private static final ModTessellator modTessellator = new ModTessellator();
    private boolean hasColor;
    private boolean hasLightMap;
    private float red;
    private float green;
    private float blue;
    private float alpha;
    private int i;
    private int j;

    public ModTessellator() {
    }

    public static ModTessellator getInstance() {
        return modTessellator;
    }

    public void startDrawingQuads() {
        BufferBuilder vertextBuffer = tessellator.getBuffer();
        vertextBuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
        this.hasColor = false;
        this.hasLightMap = false;
    }

    public void addVertexWithUV(double d, double e, double zLevel, double u, double v) {
        BufferBuilder vertextBuffer = tessellator.getBuffer();
        vertextBuffer.pos(d, e, zLevel);
        vertextBuffer.tex(u, v);
        if (this.hasColor) {
            vertextBuffer.color(this.red, this.green, this.blue, this.alpha);
        }

        if (this.hasLightMap) {
            vertextBuffer.lightmap(this.i, this.j);
        }

        vertextBuffer.endVertex();
    }

    public void draw() {
        tessellator.draw();
    }

    public void setLightMap(int i, int j) {
        this.hasLightMap = true;
        this.i = i;
        this.j = j;
    }

    public void disableLightMap() {
        this.hasLightMap = false;
    }

    public void setColorRgba(float red, float green, float blue, float alpha) {
        this.hasColor = true;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public void addVertex(float x, float y, float z) {
        tessellator.getBuffer().pos(x, y, z);
    }

    public void endVertex() {
        tessellator.getBuffer().endVertex();
    }

    public BufferBuilder getBuffer() {
        return tessellator.getBuffer();
    }
}
