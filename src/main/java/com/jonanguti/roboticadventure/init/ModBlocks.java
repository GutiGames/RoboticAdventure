package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.Blocks.BlockCloner;
import com.jonanguti.roboticadventure.Blocks.BlockRA;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockRA cloner = new BlockCloner();

    public static void init(){

        GameRegistry.registerBlock(cloner, "Cloner");
    }
}
