package com.simo.ilores.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;

public class IloItems {
	public static Configuration config;

	public static EnumToolMaterial URANIUMAXE;
	public static EnumToolMaterial URANIUMPICKAXE;
	public static EnumToolMaterial URANIUMSHOVEL;
	public static EnumToolMaterial URANIUMSWORD;

    public static Item uraniumaxe;
    public static Item uraniumpickaxe;
    public static Item uraniumshovel;
    public static Item uraniumsword;
    public static Item uraniumingot;

	public static void initItems() {
		URANIUMAXE     = EnumHelper.addToolMaterial("URANIUMAXE",     5, 3000, 40.0F, 12, 35);
		URANIUMPICKAXE = EnumHelper.addToolMaterial("URANIUMPICKAXE", 5, 3000, 36.0F, 3, 35);
		URANIUMSHOVEL  = EnumHelper.addToolMaterial("URANIUMSHOVEL",  5, 3000, 32.0F, 3, 30);
		URANIUMSWORD   = EnumHelper.addToolMaterial("URANIUMSWORD",   5, 3000, 5.0F, 12, 40);

		uraniumaxe     = new UraniumAxe(5000, URANIUMAXE);
		uraniumpickaxe = new UraniumPickaxe(5001, URANIUMPICKAXE);
		uraniumsword   = new UraniumSword(5002, URANIUMSWORD);
		uraniumshovel  = new UraniumShovel(5003, URANIUMSHOVEL);
		uraniumingot   = new IloItem(5004, "uraniumingot");

        GameRegistry.registerItem(uraniumaxe,     "uraniumaxe");
        GameRegistry.registerItem(uraniumpickaxe, "uraniumpickaxe");
        GameRegistry.registerItem(uraniumsword,   "uraniumsword");
        GameRegistry.registerItem(uraniumshovel,  "uraniumshovel");
        GameRegistry.registerItem(uraniumingot,   "uraniumingot");
	}
}
