package com.jonanguti.roboticadventure;

import com.jonanguti.roboticadventure.proxy.IProxy;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RoboticAdventure {

    @Mod.Instance (Reference.MOD_ID)
    public static RoboticAdventure instance;

    @SidedProxy(clientSide = "com.jonanguti.roboticadventure.proxy.ClientProxy" ,serverSide = "com.jonanguti.roboticadventure.proxy.ServerProxy")
    public  static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
