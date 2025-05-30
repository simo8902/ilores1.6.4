package com.simo.ilores.recipes;

import com.simo.ilores.blocks.*;
import com.simo.ilores.items.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe {
	public static void initRecipes() {
		registerToolRecipe(IloItems.uraniumpickaxe, IloItems.uraniumaxe, IloItems.uraniumshovel, IloItems.uraniumsword, IloItems.uraniumingot);
		System.out.println("Registered Crafting Recipes!");
	}

	public static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(IloBlocks.uraniumore.blockID, new ItemStack(IloItems.uraniumingot), 0.9f);
	}

	public static void registerToolRecipe(Item pickaxe, Item axe, Item shovel, Item sword, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] { "III", " S ", " S ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { " II", " SI", " S ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II ", "IS ", " S ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { " I ", " S ", " S ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { "I  ", "S  ", "S  ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { "  I", "  S", "  S", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { " I ", " I ", " S ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "I  ", "I  ", "S  ", 'I', ingot, 'S', Item.blazeRod });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "  I", "  I", "  S", 'I', ingot, 'S', Item.blazeRod });
	}
}
