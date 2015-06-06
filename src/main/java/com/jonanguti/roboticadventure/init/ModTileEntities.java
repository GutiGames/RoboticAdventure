package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.reference.Reference;
import com.jonanguti.roboticadventure.tileEntity.TileEntityDuplicator;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTileEntities{

    public static void init(){

        GameRegistry.registerTileEntity(TileEntityDuplicator.class, "Duplicator");

    }

}
