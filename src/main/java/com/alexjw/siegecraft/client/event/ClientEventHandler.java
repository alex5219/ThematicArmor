package com.alexjw.siegecraft.client.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.client.gui.GuiCustomMenu;
import com.alexjw.siegecraft.server.data.SiegeData;
import com.alexjw.siegecraft.server.data.SiegePlayer;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import net.minecraft.block.BlockAir;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.*;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.alexjw.core.client.util.GuiUtil.drawTexturedQuadFit;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class ClientEventHandler {
    public static boolean isLeaningLeft = false;
    public static boolean isLeaningRight = false;
    private static final ResourceLocation droneHudTexture = new ResourceLocation(Siege.MODID, "textures/gui/camera_hud.png");
    private static final ResourceLocation hudTexture = new ResourceLocation(Siege.MODID, "textures/gui/rainbow_hud.png");
    private static final ResourceLocation none = new ResourceLocation(Siege.MODID, "textures/gui/icon/none.png");
    private static Framebuffer framebuffer = null;

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onMainMenuLoad(GuiOpenEvent event) {
        if (event.getGui() instanceof GuiMainMenu && Siege.isStandalone) {
            event.setGui(new GuiCustomMenu());
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void fallEvent(LivingFallEvent event) {
        //event.setCanceled(true);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderPlayer(EntityViewRenderEvent.CameraSetup entityViewRenderEvent) {
        if (entityViewRenderEvent.getEntity() instanceof EntityPlayer) {
            if (SiegeHelper.getOperator((EntityPlayer) entityViewRenderEvent.getEntity()) != null && !SiegeHelper.isDroning((EntityPlayer) entityViewRenderEvent.getEntity())) {
                if (isLeaningLeft) {
                    entityViewRenderEvent.setRoll(-20);
                } else if (isLeaningRight) {
                    entityViewRenderEvent.setRoll(20);
                } else {
                    entityViewRenderEvent.setRoll(0);
                }
            } else {
                entityViewRenderEvent.setRoll(0);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void rappelShow(RenderGameOverlayEvent.Pre event) {
        EntityPlayer entityPlayer = Minecraft.getMinecraft().player;
        if (entityPlayer != null) {
            SiegePlayer siegePlayer = SiegeHelper.getSiegePlayerByEntity(entityPlayer);
            if (siegePlayer != null) {
                BlockPos blockPosInfront;
                EnumFacing enumFacing = entityPlayer.getHorizontalFacing();
                switch (enumFacing) {
                    case EAST:
                        blockPosInfront = new BlockPos(entityPlayer.getPosition().getX() + 0.75, entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ());
                        break;
                    case WEST:
                        blockPosInfront = new BlockPos(entityPlayer.getPosition().getX() - 0.75, entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ());
                        break;
                    case NORTH:
                        blockPosInfront = new BlockPos(entityPlayer.getPosition().getX(), entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ() - 0.75);
                        break;
                    case SOUTH:
                        blockPosInfront = new BlockPos(entityPlayer.getPosition().getX(), entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ() + 0.75);
                        break;
                    default:
                        blockPosInfront = entityPlayer.getPosition();
                        break;
                }
                if (!(entityPlayer.world.getBlockState(blockPosInfront).getBlock() instanceof BlockAir)) {
                    if (entityPlayer.world.canSeeSky(entityPlayer.getPosition()) && !siegePlayer.isRapelling()){
                        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
                        int xPos = scaledResolution.getScaledWidth();
                        int yPos = scaledResolution.getScaledHeight();
                        Minecraft.getMinecraft().ingameGUI.drawCenteredString(Minecraft.getMinecraft().fontRenderer, "Press 'F' to begin rappelling.", xPos / 2, (yPos / 2) + 90, -1);
                    }
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void rappelRenderEvent(RenderLivingEvent.Pre event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntity();
            SiegePlayer siegePlayer = SiegeHelper.getSiegePlayerByEntity(entityPlayer);
            if (siegePlayer != null) {
                if (siegePlayer.isRapelling()) {
                    GlStateManager.pushMatrix();
                    GlStateManager.enableRescaleNormal();
                    EnumFacing enumFacing = siegePlayer.getEnumFacing();
                    switch (enumFacing) {
                        case EAST:
                            GlStateManager.rotate(90, 0, 0, 1);
                            break;
                        case WEST:
                            GlStateManager.rotate(-90, 0, 0, 1);
                            break;
                        case NORTH:
                            GlStateManager.rotate(90, 1, 0, 0);
                            break;
                        case SOUTH:
                            GlStateManager.rotate(-90, 1, 0, 0);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onRenderPost(RenderLivingEvent.Post event) {
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderHand(RenderHandEvent event) {
        if (SiegeHelper.isDroning(Minecraft.getMinecraft().player)) event.setCanceled(true);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderDroneHud(RenderGameOverlayEvent.Pre event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (SiegeHelper.isDroning(mc.player)) {
            if ((event.getType().equals(RenderGameOverlayEvent.ElementType.HOTBAR))) {
                ScaledResolution scaledResolution = new ScaledResolution(mc);
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.2F);
                Minecraft.getMinecraft().getTextureManager().bindTexture(droneHudTexture);
                drawTexturedQuadFit(0.0D, 0.0D, scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight(), -100.0D);
                GlStateManager.popMatrix();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderHud(RenderGameOverlayEvent.Pre event) {
        Minecraft mc = Minecraft.getMinecraft();
        if ((event.getType().equals(RenderGameOverlayEvent.ElementType.HOTBAR))) {
            ScaledResolution scaledResolution = new ScaledResolution(mc);

            if (SiegeData.teamA != null || SiegeData.teamB != null) {
                GlStateManager.pushMatrix();
                int xPos = scaledResolution.getScaledWidth();
                int yPos = 4;
                int i = scaledResolution.getScaledWidth() / 2;
                mc.ingameGUI.drawCenteredString(mc.fontRenderer, "" + SiegeData.teamA.getScore(), i - 33, yPos + 4, -1);
                mc.ingameGUI.drawCenteredString(mc.fontRenderer, "" + SiegeData.teamB.getScore(), i + 31, yPos + 4, -1);
                mc.ingameGUI.drawCenteredString(mc.fontRenderer, "0:00", (xPos / 2) - 1, yPos + 2, -1);
                mc.ingameGUI.drawCenteredString(mc.fontRenderer, "ROUND " + SiegeData.roundNumber, (xPos / 2) - 1, yPos + 12, -1);
                int start = 150;
                for (SiegePlayer siegePlayer : SiegeData.teamA.getPlayers()) {
                    ResourceLocation loc = none;
                    if (siegePlayer.getOperator() != null) {
                        loc = siegePlayer.getOperator().getIcon();
                    }
                    if (siegePlayer.isAlive()) {
                        GlStateManager.color(1F, 1F, 1F, 0.9f);
                    } else {
                        GlStateManager.color(0.5F, 0.5F, 0.5F, 0.9f);
                    }
                    Minecraft.getMinecraft().getTextureManager().bindTexture(loc);
                    drawIcon((i - start), yPos + 1);
                    start = (start - 15);
                }
                int start2 = -130;

                for (SiegePlayer siegePlayer : SiegeData.teamB.getPlayers()) {
                    ResourceLocation loc = none;
                    if (siegePlayer.getOperator() != null)
                        loc = siegePlayer.getOperator().getIcon();
                    Minecraft.getMinecraft().getTextureManager().bindTexture(loc);
                    if (siegePlayer.isAlive()) {
                        GlStateManager.color(1F, 1F, 1F, 0.9F);
                    } else {
                        GlStateManager.color(0.5F, 0.5F, 0.5F, 0.9F);
                    }
                    drawIcon((i - start2), yPos + 1);
                    start2 = (start2 + 15);
                }
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.95F);
                mc.getTextureManager().bindTexture(hudTexture);
                mc.ingameGUI.drawTexturedModalRect((float) ((i) - 130), yPos, 0, 0, 256, 16);
                GlStateManager.popMatrix();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public static void drawIcon(int x, int y) {
        final float uScale = 16f / 0x100;
        final float vScale = 16f / 0x100;
        int height = 16, width = 16, zLevel = 0;
        int u = 0, v = 0;

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder wr = tessellator.getBuffer();
        wr.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        wr.pos(x, y + height, zLevel).tex(u * uScale, ((v + height) * vScale)).endVertex();
        wr.pos(x + width, y + height, zLevel).tex((u + width) * uScale, ((v + height) * vScale)).endVertex();
        wr.pos(x + width, y, zLevel).tex((u + width) * uScale, (v * vScale)).endVertex();
        wr.pos(x, y, zLevel).tex(u * uScale, (v * vScale)).endVertex();
        tessellator.draw();
    }
}
