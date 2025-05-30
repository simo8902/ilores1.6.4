package com.simo.ilores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.Configuration;

public class IloBlocks {
	public static Block uraniumore;

    public static void initBlocks() {
    	uraniumore = new BlockUraniumOre(3000);
    	GameRegistry.registerBlock(uraniumore, "uraniumore");
   }

    private static int findFreeBlockID(int startFrom) {
        for (int i = startFrom; i < Block.blocksList.length; i++) {
            if (Block.blocksList[i] == null) return i;
        }
        throw new RuntimeException("No free Block IDs");
    }
}
