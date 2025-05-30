package com.simo.ilores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSword;
import net.minecraft.item.EnumToolMaterial;

public class UraniumSword extends ItemSword {
	public UraniumSword(int id, EnumToolMaterial material) {
		super(id, material);
		this.setUnlocalizedName("uraniumsword");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg) {
		itemIcon = reg.registerIcon("ilores:uraniumingot");
	}
}
