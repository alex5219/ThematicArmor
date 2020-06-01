package com.alexjw.core.client.proxy;

import com.alexjw.core.server.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.particle.*;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class ClientProxy extends ServerProxy {
    public static boolean controllableLoaded = false;

    public static boolean isLookingAtInteract() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.objectMouseOver != null) {
            if (mc.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
                IBlockState state = mc.world.getBlockState(mc.objectMouseOver.getBlockPos());
                Block block = state.getBlock();
                return block instanceof BlockContainer || block.hasTileEntity(state) || block == Blocks.CRAFTING_TABLE;
            } else if (mc.objectMouseOver.typeOfHit == RayTraceResult.Type.ENTITY) {
                Entity entity = mc.objectMouseOver.entityHit;
                if (entity != null) {
                    return entity.processInitialInteract(Minecraft.getMinecraft().player, EnumHand.MAIN_HAND);
                }
            }
        }
        return false;
    }

    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    @SuppressWarnings({"ConstantConditions"})
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    @Override
    public void playClientSound(SoundEvent sound) {
        Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(sound, 1.0F));
    }

    @Override
    public void playClientSound(double posX, double posY, double posZ, SoundEvent event, SoundCategory category, float volume, float pitch) {
        ISound sound = new PositionedSoundRecord(event.getSoundName(), category, volume, pitch, false, 0, ISound.AttenuationType.NONE, 0, 0, 0);
        Minecraft.getMinecraft().getSoundHandler().playSound(sound);
    }

    @Override
    public void createExplosionStunGrenade(double x, double y, double z) {
        ParticleManager particleManager = Minecraft.getMinecraft().effectRenderer;
        World world = Minecraft.getMinecraft().world;
        Random rand = world.rand;

        // Spawn lingering smoke particles
        for (int i = 0; i < 30; i++)
            particleManager.addEffect(createParticle(x, y, z, world, rand, new ParticleCloud.Factory(), 0.2));

        // Spawn fast moving smoke/spark particles
        for (int i = 0; i < 30; i++) {
            Particle smoke = createParticle(x, y, z, world, rand, new ParticleCloud.Factory(), 4);
            smoke.setMaxAge((int) ((8 / (Math.random() * 0.1 + 0.4)) * 0.5));
            particleManager.addEffect(smoke);
            particleManager.addEffect(createParticle(x, y, z, world, rand, new ParticleCrit.Factory(), 4));
        }
    }

    private Particle createParticle(double x, double y, double z, World world, Random rand, IParticleFactory factory, double velocityMultiplier) {
        return factory.createParticle(0, world, x + (rand.nextDouble() - 0.5) * 0.6, y + (rand.nextDouble() - 0.5) * 0.6, z + (rand.nextDouble() - 0.5) * 0.6,
                (rand.nextDouble() - 0.5) * velocityMultiplier, (rand.nextDouble() - 0.5) * velocityMultiplier, (rand.nextDouble() - 0.5) * velocityMultiplier);
    }
}
