package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.Blocks.BlockDuplicator;
import com.jonanguti.roboticadventure.Blocks.BlockRA;
import com.jonanguti.roboticadventure.creativetab.CreativeTabRA;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

public class ModBlocks extends Blocks{

    public static BlockDuplicator duplicatorIdle = new BlockDuplicator(false);
    public static BlockDuplicator duplicatorActive = new BlockDuplicator(true);
    public static final int guiIDDuplicator = 0;


    public static void init(){

        GameRegistry.registerBlock(duplicatorIdle, "DuplicatorIdle");
        GameRegistry.registerBlock(duplicatorActive, "DuplicatorActive");

    }
}
