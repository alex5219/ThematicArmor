package com.alexjw.core.client.util;

import com.alexjw.core.client.helper.ModTessellator;

public class GuiUtil {
    public static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
        ModTessellator tessellator = ModTessellator.getInstance();
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + 0.0D, y + height, zLevel, 0.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, 1.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y + 0.0D, zLevel, 1.0D, 0.0D);
        tessellator.addVertexWithUV(x + 0.0D, y + 0.0D, zLevel, 0.0D, 0.0D);
        tessellator.draw();
    }
}
