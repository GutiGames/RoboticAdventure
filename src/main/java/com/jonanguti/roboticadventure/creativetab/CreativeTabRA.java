package com.jonanguti.roboticadventure.creativetab;

import com.jonanguti.roboticadventure.init.ModItems;
import com.jonanguti.roboticadventure.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRA {

    public static final CreativeTabs RA_TAB = new CreativeTabs(Reference.MOD_ID){

        @Override
        public Item getTabIconItem(){

            return ModItems.cloneCard;
        }

    };
}
