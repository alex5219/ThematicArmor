package com.alexjw.siegecraft.common.blocks;

import com.alexjw.siegecraft.Siege;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(Siege.MODID)
public class ModBlocks {
    public static List<Block> BLOCKS = new ArrayList<>();
    public static BlockCamera blockCamera = new BlockCamera();
}
