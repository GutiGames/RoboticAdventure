package com.jonanguti.roboticadventure.CloneCardRecipes;

import com.jonanguti.roboticadventure.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class CCRecipes{

    public static void init() {


        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new ItemStack(ModItems.cloneCard, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.diamond));

    }


}
