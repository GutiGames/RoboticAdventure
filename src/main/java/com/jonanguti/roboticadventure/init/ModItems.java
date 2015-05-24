package com.jonanguti.roboticadventure.init;

import com.jonanguti.roboticadventure.item.ItemCloneCard;
import com.jonanguti.roboticadventure.item.ItemRA;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemRA cloneCard = new ItemCloneCard();

    public static void init(){

        GameRegistry.registerItem(cloneCard, "CloneCard");

    }
}
