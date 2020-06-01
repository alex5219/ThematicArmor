package com.alexjw.siegecraft.client.gui;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.gui.buttons.GuiButtonBox;
import com.alexjw.siegecraft.client.gui.buttons.GuiButtonCustom;
import com.alexjw.siegecraft.client.gui.buttons.GuiButtonMultiplayer;
import com.alexjw.siegecraft.client.gui.buttons.GuiButtonText;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;

import static com.alexjw.core.client.util.GuiUtil.drawTexturedQuadFit;

@SideOnly(Side.CLIENT)
public class GuiCustomMenu extends GuiScreen {
    public GuiCustomMenu() {
    }

    public void initGui() {
        this.buttonList.add(new GuiButtonMultiplayer(0, 75, 137, 150, 30, 800, 160, GuiResources.MULTIPLAYER));
        this.buttonList.add(new GuiButtonCustom(1, 75, 169, 73, 30, 800, 320, GuiResources.SINGLEPLAYER));
        this.buttonList.add(new GuiButtonCustom(2, 151, 169, 73, 30, 800, 320, GuiResources.MODS));
        this.buttonList.add(new GuiButtonCustom(3, 75, 201, 73, 30, 400, 160, GuiResources.DISCORD));
        this.buttonList.add(new GuiButtonCustom(4, 151, 201, 73, 30, 800, 320, GuiResources.PATREON));
        this.buttonList.add(new GuiButtonBox(5, 75, 233, 150, 60, 800, 640, GuiResources.CONTENT_BOX));
        this.buttonList.add(new GuiButtonCustom(5, 75, 295, 150, 23, 1000, 156, GuiResources.NEWS));
        this.buttonList.add(new GuiButtonBox(6, 75, 25, 125, 38, 1239, 375, GuiResources.TITLE_LOGO_SELECTED));

        this.buttonList.add(new GuiButtonText(6, 75, 0, 80, 32, 400, 160, GuiResources.OPERATORS));
        this.buttonList.add(new GuiButtonMultiplayer(7, 0, 0, 24, 24, 800, 800, GuiResources.OPTIONS));
    }

    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.id == 0) {
            ServerData serverData = new ServerData("Official", "207.244.243.195:25565", false);
            this.mc.displayGuiScreen(new GuiConnecting(this, this.mc, serverData));
        } else if (button.id == 1) {
            this.mc.displayGuiScreen(new GuiWorldSelection(this));
        } else if (button.id == 6) {
            this.mc.displayGuiScreen(this);
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    public void drawBackground() {
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Siege.MODID, "textures/gui/menu_background.png"));
        drawTexturedQuadFit(0.0D, 0.0D, scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight(), -100.0D);
        GlStateManager.popMatrix();
    }
}