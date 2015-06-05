package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.Blocks.BlockDuplicator;
import com.jonanguti.roboticadventure.Blocks.BlockRA;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockRA duplicatorIdle = new BlockDuplicator(false);
    public static final BlockRA duplicatorActive = new BlockDuplicator(true);


    public static void init(){

        GameRegistry.registerBlock(duplicatorIdle, "DuplicatorIdle");
        GameRegistry.registerBlock(duplicatorActive, "DuplicatorActive");

    }
}
