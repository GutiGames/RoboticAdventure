package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.item.ItemCloneCard;
import com.jonanguti.roboticadventure.item.ItemRA;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemRA cloneCard = new ItemCloneCard();

    public static void init(){

        GameRegistry.registerItem(cloneCard, "CloneCard");

    }
}
