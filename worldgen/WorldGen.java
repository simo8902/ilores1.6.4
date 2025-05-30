package com.simo.ilores.worldgen;

import java.util.Random;

import com.simo.ilores.blocks.IloBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

    private WorldGenerator uraniumGenerator;

    public WorldGen() {
    	uraniumGenerator = new WorldGenMinable(IloBlocks.uraniumore.blockID, 8);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId) {
            case 0: // Overworld
                runGenerator(uraniumGenerator, world, random, chunkX, chunkZ, 10, 0, 10);
                break;
            case -1: // Nether
                break;
            case 1: // End
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand,
                              int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal height range");

        int heightDiff = maxHeight - minHeight;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            generator.generate(world, rand, x, y, z);
        }
    }
}
