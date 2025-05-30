package com.simo.ilores.blocks;

import java.util.Random;

import com.simo.ilores.items.IloItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IloBlock extends Block {
	public IloBlock(int id, String name, Material mat, float hard, float res) {
        super(id, mat);
        setUnlocalizedName(name);
        setTextureName("ilores:" + name);
        setHardness(hard);
        setResistance(res);
        setCreativeTab(CreativeTabs.tabBlock);
        setStepSound(soundStoneFootstep);
    }
	
	@Override
	public int idDropped(int meta, Random rand, int fortune) {
		return IloItems.uraniumingot.itemID;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(2);
	}
}
