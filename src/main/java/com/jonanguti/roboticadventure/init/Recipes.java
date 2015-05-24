package com.jonanguti.roboticadventure.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {

    public  static void init(){

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(ModItems.cloneCard,1,OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.cobblestone));
    }
}
