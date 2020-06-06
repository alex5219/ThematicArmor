package com.alexjw.siegecraft.server.blocks;

import com.alexjw.siegecraft.Siege;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(Siege.MODID)
public class ModBlocks {
    public static List<Block> BLOCKS = new ArrayList<>();
    public static final BlockCamera blockCamera = new BlockCamera();
    public static BlockRookArmor blockRookArmor = new BlockRookArmor();
}
