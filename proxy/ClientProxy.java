package com.simo.ilores.proxy;

import com.simo.ilores.blocks.IloBlocks;
import com.simo.ilores.items.IloItems;
import com.simo.ilores.recipes.Recipe;
import com.simo.ilores.render.IloBlockRenderer;
import com.simo.ilores.render.IloItemRenderer;
import com.simo.ilores.worldgen.WorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
    	IloBlocks.initBlocks();
    	IloItems.initItems();
    	
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
        Recipe.initRecipes();
        Recipe.registerFurnaceRecipes();
        registerWorldGenerators();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
    public void registerWorldGenerators() {
    	GameRegistry.registerWorldGenerator(new WorldGen());
    }
}
