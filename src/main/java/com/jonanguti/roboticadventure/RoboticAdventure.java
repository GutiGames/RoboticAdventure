package com.jonanguti.roboticadventure;

import com.jonanguti.roboticadventure.configuration.ConfigurationHandler;
import com.jonanguti.roboticadventure.handler.CraftingHandler;
import com.jonanguti.roboticadventure.init.ModItems;
import com.jonanguti.roboticadventure.init.Recipes;
import com.jonanguti.roboticadventure.proxy.IProxy;
import com.jonanguti.roboticadventure.reference.Reference;
import com.jonanguti.roboticadventure.utitlity.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RoboticAdventure {

    @Mod.Instance (Reference.MOD_ID)
    public static RoboticAdventure instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS ,serverSide = Reference.SERVER_PROXY_CLASS)
    public  static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();

        LogHelper.info("Items Inizialised");
        LogHelper.info("PreInitialization Complete");

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        FMLCommonHandler.instance().bus().register(new CraftingHandler());

        Recipes.init();
        LogHelper.info("Recipes loaded");

        LogHelper.info("Inizialization Complete");

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Inizialization Complete");

    }
}
