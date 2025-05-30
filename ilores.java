package com.simo.ilores;

import java.io.File;

import com.simo.ilores.proxy.ClientProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

@Mod(modid = Global.MOD_ID, name = Global.MOD_NAME, version = Global.VERSION)
public class ilores {

    @SidedProxy(clientSide = Global.NG_CLIENT_PROXY, serverSide = Global.NG_COMMON_PROXY)
    public static ClientProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	this.proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
