package com.jonanguti.roboticadventure.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile){

        //Create a config file
        configuration = new Configuration(configFile);

        try{
            //Load
            configuration.load();

            //Read
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Config Value").getBoolean(true);
        }

        catch (Exception e){

            //Log
        }

        finally {

            //Save
            configuration.save();
        }
    }
}
