package com.simo.ilores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IloItem extends Item{

	public IloItem(int id, String name) {
		super(id);
		this.setUnlocalizedName(name);
		this.setTextureName("ilores:" + name.toLowerCase());
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
}
