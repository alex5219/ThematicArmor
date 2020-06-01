package com.alexjw.siegecraft.server.sounds;

import com.alexjw.siegecraft.Siege;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.HashSet;
import java.util.Set;

import static com.alexjw.siegecraft.Siege.MODID;

@Mod.EventBusSubscriber(modid = MODID)
public class SiegeSounds {
    public static Set<SoundEvent> registeredEvents = new HashSet<>();
    public static SoundEvent breach_charge = registerSound("breach_charge");
    public static SoundEvent thermite = registerSound("thermite");
    public static SoundEvent menu_music = registerSound("menu_music");

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Siege.MODID, name);
        SoundEvent event = new SoundEvent(location);
        registeredEvents.add(event.setRegistryName(location));
        return event;
    }

    public static void init() {
        for (SoundEvent event : registeredEvents)
            ForgeRegistries.SOUND_EVENTS.register(event);
    }

    public static void PlaySoundForPlayer(Entity player, SoundEvent sound, float volume, float pitch) {
        if (player instanceof EntityPlayerMP)
            ((EntityPlayerMP) player).connection.sendPacket(new SPacketSoundEffect(sound, player.getSoundCategory(), player.posX, player.posY, player.posZ, volume, pitch));
    }
}
