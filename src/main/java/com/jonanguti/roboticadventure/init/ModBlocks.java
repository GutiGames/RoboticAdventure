package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.Blocks.BlockDuplicator;
import com.jonanguti.roboticadventure.Blocks.BlockRA;
import com.jonanguti.roboticadventure.creativetab.CreativeTabRA;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks extends Blocks{

    public static BlockRA duplicatorIdle = new BlockDuplicator(false);
    public static BlockRA duplicatorActive = new BlockDuplicator(true);


    public static void init(){

        GameRegistry.registerBlock(duplicatorIdle, "DuplicatorIdle");
        GameRegistry.registerBlock(duplicatorActive, "DuplicatorActive");

    }
}
