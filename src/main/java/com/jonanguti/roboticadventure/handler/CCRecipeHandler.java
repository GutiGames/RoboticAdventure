package com.jonanguti.roboticadventure.handler;

import com.jonanguti.roboticadventure.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CCRecipeHandler {

    @SubscribeEvent
    public void onCrafting(ItemCraftedEvent event) {

        final IInventory craftMatrix = null;
        for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {

            ItemStack item0 = event.craftMatrix.getStackInSlot(i);

            if (item0 != null && item0.getItem() == ModItems.cloneCard) {


                ItemStack k = new ItemStack(ModItems.cloneCard, 2, (item0.getItemDamage()) + 32);

                if (k.getItemDamage() >= k.getMaxDamage()) {
                    k.stackSize--;
                }

                event.craftMatrix.setInventorySlotContents(i, k);
            }

        }
    }
}

