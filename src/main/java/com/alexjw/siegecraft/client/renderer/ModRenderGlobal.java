package com.alexjw.siegecraft.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IWorldEventListener;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.util.vector.Vector3f;

import javax.annotation.Nullable;
import java.util.Collection;

@SideOnly(Side.CLIENT)
public class ModRenderGlobal extends RenderGlobal implements IWorldEventListener, IResourceManagerReloadListener {

    public ModRenderGlobal(Minecraft mcIn) {
        super(mcIn);
    }

    public static void drawSelectionBoundingBox(AxisAlignedBB box, float red, float green, float blue, float alpha) {
        drawBoundingBox(box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ, red, green, blue, alpha);
    }

    public static void drawBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        drawBoundingBox(bufferbuilder, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha);
        tessellator.draw();
    }

    public static void drawBoundingBox(BufferBuilder buffer, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
        RenderGlobal.drawBoundingBox(buffer, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha);
    }

    public static void renderFilledBox(AxisAlignedBB aabb, float red, float green, float blue, float alpha) {
        renderFilledBox(aabb.minX, aabb.minY, aabb.minZ, aabb.maxX, aabb.maxY, aabb.maxZ, red, green, blue, alpha);
    }

    public static void renderFilledBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, float red, float green, float blue, float alpha) {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(5, DefaultVertexFormats.POSITION_COLOR);
        addChainedFilledBoxVertices(bufferbuilder, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha);
        tessellator.draw();
    }

    public static void addChainedFilledBoxVertices(BufferBuilder builder, double p_189693_1_, double p_189693_3_, double p_189693_5_, double p_189693_7_, double p_189693_9_, double p_189693_11_, float red, float green, float blue, float alpha) {
        RenderGlobal.addChainedFilledBoxVertices(builder, p_189693_1_, p_189693_3_, p_189693_5_, p_189693_7_, p_189693_9_, p_189693_11_, red, green, blue, alpha);
    }

    /**
     * Creates the entity outline shader to be stored in RenderGlobal.entityOutlineShader
     */
    public void makeEntityOutlineShader() {
        super.makeEntityOutlineShader();
    }

    public void renderEntityOutlineFramebuffer() {
        super.renderEntityOutlineFramebuffer();
    }

    protected boolean isRenderEntityOutlines() {
        return super.isRenderEntityOutlines();
    }

    /**
     * set null to clear
     */
    public void setWorldAndLoadRenderers(@Nullable WorldClient worldClientIn) {
        super.setWorldAndLoadRenderers(worldClientIn);
    }

    /**
     * Loads all the renderers and sets up the basic settings usage
     */
    public void loadRenderers() {
        super.loadRenderers();
    }

    protected void stopChunkUpdates() {
        super.stopChunkUpdates();
    }

    public void createBindEntityOutlineFbs(int width, int height) {
        super.createBindEntityOutlineFbs(width, height);
    }

    public void renderEntities(Entity renderViewEntity, ICamera camera, float partialTicks) {
        super.renderEntities(renderViewEntity, camera, partialTicks);
    }

    /**
     * Checks if the given entity should have an outline rendered.
     */
    private boolean isOutlineActive(Entity entityIn, Entity viewer, ICamera camera) {
        return this.isOutlineActive(entityIn, viewer, camera);
    }

    /**
     * Gets the render info for use on the Debug screen
     */
    public String getDebugInfoRenders() {
        return super.getDebugInfoEntities();
    }

    protected int getRenderedChunks() {
        return super.getRenderedChunks();
    }

    /**
     * Gets the entities info for use on the Debug screen
     */
    public String getDebugInfoEntities() {
        return super.getDebugInfoRenders();
    }

    public void setupTerrain(Entity viewEntity, double partialTicks, ICamera camera, int frameCount, boolean playerSpectator) {
        super.setupTerrain(viewEntity, partialTicks, camera, frameCount, playerSpectator);
    }


    protected Vector3f getViewVector(Entity entityIn, double partialTicks) {
        return super.getViewVector(entityIn, partialTicks);
    }

    public int renderBlockLayer(BlockRenderLayer blockLayerIn, double partialTicks, int pass, Entity entityIn) {
        return super.renderBlockLayer(blockLayerIn, partialTicks, pass, entityIn);
    }

    public void updateClouds() {
        super.updateClouds();
    }

    public void renderSky(float partialTicks, int pass) {
        super.renderSky(partialTicks, pass);
    }

    public void renderClouds(float partialTicks, int pass, double p_180447_3_, double p_180447_5_, double p_180447_7_) {
        super.renderClouds(partialTicks, pass, p_180447_3_, p_180447_5_, p_180447_7_);
    }

    /**
     * Checks if the given position is to be rendered with cloud fog
     */
    public boolean hasCloudFog(double x, double y, double z, float partialTicks) {
        return super.hasCloudFog(x, y, z, partialTicks);
    }

    public void renderWorldBorder(Entity entityIn, float partialTicks) {
        super.renderWorldBorder(entityIn, partialTicks);
    }

    public void drawBlockDamageTexture(Tessellator tessellatorIn, BufferBuilder bufferBuilderIn, Entity entityIn, float partialTicks) {
        super.drawBlockDamageTexture(tessellatorIn, bufferBuilderIn, entityIn, partialTicks);
    }

    /**
     * Draws the selection box for the player.
     */
    public void drawSelectionBox(EntityPlayer player, RayTraceResult movingObjectPositionIn, int execute, float partialTicks) {
        super.drawSelectionBox(player, movingObjectPositionIn, execute, partialTicks);
    }

    public void notifyLightSet(BlockPos pos) {
        super.notifyLightSet(pos);
    }


    public void playRecord(@Nullable SoundEvent soundIn, BlockPos pos) {
        super.playRecord(soundIn, pos);
    }

    public void playSoundToAllNearExcept(@Nullable EntityPlayer player, SoundEvent soundIn, SoundCategory category, double x, double y, double z, float volume, float pitch) {
    }

    public void spawnParticle(int particleID, boolean ignoreRange, double xCoord, double yCoord, double zCoord, double xSpeed, double ySpeed, double zSpeed, int... parameters) {
        super.spawnParticle(particleID, ignoreRange, false, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, parameters);
    }

    public void spawnParticle(int id, boolean ignoreRange, boolean p_190570_3_, final double x, final double y, final double z, double xSpeed, double ySpeed, double zSpeed, int... parameters) {
        super.spawnParticle(id, ignoreRange, p_190570_3_, x, y, z, xSpeed, ySpeed, zSpeed, parameters);
    }

    /**
     * Called on all IWorldAccesses when an entity is created or loaded. On client worlds, starts downloading any
     * necessary textures. On server worlds, adds the entity to the entity tracker.
     */
    public void onEntityAdded(Entity entityIn) {
    }

    /**
     * Called on all IWorldAccesses when an entity is unloaded or destroyed. On client worlds, releases any downloaded
     * textures. On server worlds, removes the entity from the entity tracker.
     */
    public void onEntityRemoved(Entity entityIn) {
    }

    /**
     * Deletes all display lists
     */
    public void deleteAllDisplayLists() {
    }

    public void broadcastSound(int soundID, BlockPos pos, int data) {
        super.broadcastSound(soundID, pos, data);
    }

    public void playEvent(EntityPlayer player, int type, BlockPos blockPosIn, int data) {
        super.playEvent(player, type, blockPosIn, data);
    }

    public void sendBlockBreakProgress(int breakerId, BlockPos pos, int progress) {
        super.sendBlockBreakProgress(breakerId, pos, progress);
    }

    public boolean hasNoChunkUpdates() {
        return super.hasNoChunkUpdates();
    }

    public void setDisplayListEntitiesDirty() {
        super.setDisplayListEntitiesDirty();
    }

    public void updateTileEntities(Collection<TileEntity> tileEntitiesToRemove, Collection<TileEntity> tileEntitiesToAdd) {
        super.updateTileEntities(tileEntitiesToRemove, tileEntitiesToAdd);
    }

    @SideOnly(Side.CLIENT)
    class ContainerLocalRenderInformation {
        final RenderChunk renderChunk;
        final EnumFacing facing;
        final int counter;
        byte setFacing;

        private ContainerLocalRenderInformation(RenderChunk renderChunkIn, EnumFacing facingIn, @Nullable int counterIn) {
            this.renderChunk = renderChunkIn;
            this.facing = facingIn;
            this.counter = counterIn;
        }

        public void setDirection(byte p_189561_1_, EnumFacing p_189561_2_) {
            this.setFacing = (byte) (this.setFacing | p_189561_1_ | 1 << p_189561_2_.ordinal());
        }

        public boolean hasDirection(EnumFacing p_189560_1_) {
            return (this.setFacing & 1 << p_189560_1_.ordinal()) > 0;
        }
    }
}