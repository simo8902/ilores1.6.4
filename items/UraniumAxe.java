package com.simo.ilores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.EnumToolMaterial;

public class UraniumAxe extends ItemAxe {
	public UraniumAxe(int id, EnumToolMaterial material) {
		super(id, material);
		setTextureName("ilores:uraniumaxe");
		this.setUnlocalizedName("uraniumaxe");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		itemIcon = reg.registerIcon("ilores:uraniumingot");
	}
}
