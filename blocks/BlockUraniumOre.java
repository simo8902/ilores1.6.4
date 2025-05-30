package com.simo.ilores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.simo.ilores.items.IloItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockUraniumOre extends Block {

    public BlockUraniumOre(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName("uraniumore");
        this.setTextureName("ilores:uraniumore");
        this.setHardness(60.0F);
        this.setResistance(5000.0F);
        this.setStepSound(soundStoneFootstep);
    	this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public int idDropped(int metadata, Random rand, int fortune) {
        return IloItems.uraniumingot.itemID;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1 + rand.nextInt(2);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon("ilores:uraniumore");
    }
}
