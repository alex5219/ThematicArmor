package com.alexjw.siegecraft.client.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.Language;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class GuiOperatorsSelect extends GuiScreen {
    /**
     * The parent Gui screen
     */
    protected GuiScreen parentScreen;

    /**
     * The button to confirm the current settings.
     */
    private GuiOptionButton confirmSettingsBtn;

    public GuiOperatorsSelect(GuiScreen screen) {
        this.parentScreen = screen;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question. Called when the GUI is displayed and when the
     * window resizes, the buttonList is cleared beforehand.
     */
    public void initGui() {

    }

    /**
     * Handles mouse input.
     */
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
    }

    /**
     * Called by the controls from the buttonList when activated. (Mouse pressed for buttons)
     */
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.enabled) {
            switch (button.id) {
                case 5:
                    break;
                case 6:
                    this.mc.displayGuiScreen(this.parentScreen);
                    break;
            }
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(this.fontRenderer, I18n.format("options.language"), this.width / 2, 16, 16777215);
        this.drawCenteredString(this.fontRenderer, "(" + I18n.format("options.languageWarning") + ")", this.width / 2, this.height - 56, 8421504);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @SideOnly(Side.CLIENT)
    class List extends GuiSlot {
        /**
         * A list containing the many different locale language codes.
         */
        private final java.util.List<String> langCodeList = Lists.newArrayList();
        /**
         * The map containing the Locale-Language pairs.
         */
        private final Map<String, Language> languageMap = Maps.newHashMap();

        public List(Minecraft mcIn) {
            super(mcIn, GuiOperatorsSelect.this.width, GuiOperatorsSelect.this.height, 32, GuiOperatorsSelect.this.height - 65 + 4, 18);

        }

        protected int getSize() {
            return this.langCodeList.size();
        }

        /**
         * The element in the slot that was clicked, boolean for whether it was double clicked or not
         */
        protected void elementClicked(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY) {
            Language language = this.languageMap.get(this.langCodeList.get(slotIndex));
            net.minecraftforge.fml.client.FMLClientHandler.instance().refreshResources(net.minecraftforge.client.resource.VanillaResourceType.LANGUAGES);
            GuiOperatorsSelect.this.confirmSettingsBtn.displayString = I18n.format("gui.done");
        }

        @Override
        protected boolean isSelected(int slotIndex) {
            return false;
        }

        /**
         * Return the height of the content being scrolled
         */
        protected int getContentHeight() {
            return this.getSize() * 18;
        }

        protected void drawBackground() {
            GuiOperatorsSelect.this.drawDefaultBackground();
        }

        protected void drawSlot(int slotIndex, int xPos, int yPos, int heightIn, int mouseXIn, int mouseYIn, float partialTicks) {
            GuiOperatorsSelect.this.fontRenderer.setBidiFlag(true);
            GuiOperatorsSelect.this.drawCenteredString(GuiOperatorsSelect.this.fontRenderer, this.languageMap.get(this.langCodeList.get(slotIndex)).toString(), this.width / 2, yPos + 1, 16777215);
        }
    }
}
