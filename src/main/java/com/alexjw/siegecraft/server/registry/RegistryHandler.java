package com.alexjw.siegecraft.server.registry;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.server.blocks.ModBlocks;
import com.alexjw.siegecraft.server.entity.*;
import com.alexjw.siegecraft.server.entity.operator.*;
import com.alexjw.siegecraft.server.items.ModItems;
import com.alexjw.siegecraft.server.tileentity.TileEntityCamera;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        GameRegistry.registerTileEntity(TileEntityCamera.class, new ResourceLocation(Siege.MODID, "tileEntityCamera"));
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "firstperson_lefthand"));
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "thirdperson_righthand"));
        }
    }

    @SubscribeEvent
    public static void entityRegistration(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityStim.class)
                .id(new ResourceLocation(Siege.MODID, "stim"), 16)
                .name("Stim")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityFootprint.class)
                .id(new ResourceLocation(Siege.MODID, "footprint"), 15)
                .name("Footprint")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityAsh.class)
                .id(new ResourceLocation(Siege.MODID, "ash"), 14)
                .name("Ash")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityBandit.class)
                .id(new ResourceLocation(Siege.MODID, "bandit"), 13)
                .name("Bandit")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityDoc.class)
                .id(new ResourceLocation(Siege.MODID, "doc"), 12)
                .name("Doc")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityCapitao.class)
                .id(new ResourceLocation(Siege.MODID, "capitao"), 11)
                .name("Capitao")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityFinka.class)
                .id(new ResourceLocation(Siege.MODID, "finka"), 10)
                .name("Finka")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityJackal.class)
                .id(new ResourceLocation(Siege.MODID, "jackal"), 9)
                .name("Jackal")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityMaverick.class)
                .id(new ResourceLocation(Siege.MODID, "maverick"), 8)
                .name("Maverick")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityRook.class)
                .id(new ResourceLocation(Siege.MODID, "rook"), 7)
                .name("Rook")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntitySledge.class)
                .id(new ResourceLocation(Siege.MODID, "sledge"), 6)
                .name("Sledge")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntitySmoke.class)
                .id(new ResourceLocation(Siege.MODID, "smoke"), 5)
                .name("Smoke")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityVigil.class)
                .id(new ResourceLocation(Siege.MODID, "vigil"), 4)
                .tracker(160, 2, false)
                .name("Vigil")
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityDrone.class)
                .id(new ResourceLocation(Siege.MODID, "drone"), 3)
                .name("Drone")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityCamera.class)
                .id(new ResourceLocation(Siege.MODID, "camera"), 2)
                .name("Camera")
                .tracker(160, 2, false)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create().entity(EntityRope.class)
                .id(new ResourceLocation(Siege.MODID, "rope"), 1)
                .name("Rope")
                .tracker(160, 2, false)
                .build());
    }
}
