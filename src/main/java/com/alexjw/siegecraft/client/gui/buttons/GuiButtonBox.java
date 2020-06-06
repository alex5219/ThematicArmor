package com.alexjw.siegecraft.client.gui.buttons;

import com.alexjw.core.client.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiButtonBox extends GuiButton {
    private final int textureWidth;
    private final int textureHeight;
    private final ResourceLocation texture;

    public GuiButtonBox(int buttonId, int x, int y, int width, int height, int widthIn, int heightIn, ResourceLocation resourceLocation) {
        super(buttonId, x, y, width, height, "");
        this.textureWidth = widthIn;
        this.textureHeight = heightIn;
        this.texture = resourceLocation;
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (this.visible) {
            FontRenderer fontrenderer = mc.fontRenderer;
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

            boolean newHovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;

            this.hovered = newHovered;
            int k = this.getHoverState(this.hovered);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            GlStateManager.blendFunc(770, 771);

            if (this.texture != null) {
                if (newHovered)
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 0.85F);
                else
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(texture);
                RenderUtil.drawPartialImage(this.x, this.y, 0, (k - 1) * this.textureHeight, this.width, this.height, this.textureWidth, this.textureHeight);
            } else {
                mc.getTextureManager().bindTexture(BUTTON_TEXTURES);
                this.drawTexturedModalRect(this.x, this.y, 0, 46 + k * 20, this.width / 2, this.height);
                this.drawTexturedModalRect(this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + k * 20, this.width / 2, this.height);
            }
            this.mouseDragged(mc, mouseX, mouseY);
        }
    }
}
