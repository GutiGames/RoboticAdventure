package com.jonanguti.roboticadventure.container;

import com.jonanguti.roboticadventure.tileEntity.TileEntityDuplicator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;

public class ContainerDuplicator extends Container {

    private TileEntityDuplicator duplicator;

    public int lastBurntime;
    public int lastCurrentItemBurntime;
    public int lastCooktime;


    public ContainerDuplicator(InventoryPlayer inventory, TileEntityDuplicator tileentity) {

        this.duplicator = tileentity;

        this.addSlotToContainer(new Slot(tileentity, 0, 56, 35));
        this.addSlotToContainer(new Slot(tileentity, 1, 8, 62));
        this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 116, 35));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 94 + i * 18));
            }

        }
        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
        }

    }

    public void addCraftingToCrafters (ICrafting icrafting) {
        super.addCraftingToCrafters(icrafting);
        icrafting.sendProgressBarUpdate(this, 0, this.duplicator.cooktime);
        icrafting.sendProgressBarUpdate(this, 1, this.duplicator.burntime);
        icrafting.sendProgressBarUpdate(this, 2, this.duplicator.currentItemBurntime);
    }

    public void detectAndSendChanges(){
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); i++){
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCooktime != this.duplicator.cooktime){
                icrafting.sendProgressBarUpdate(this, 0, this.duplicator.cooktime);
            }

            if (this.lastBurntime != this.duplicator.burntime){
                icrafting.sendProgressBarUpdate(this, 1, this.duplicator.burntime);
            }

            if (this.lastCurrentItemBurntime != this.duplicator.currentItemBurntime){
                icrafting.sendProgressBarUpdate(this, 2, this.duplicator.currentItemBurntime);
            }
        }
        this.lastCooktime = this.duplicator.cooktime;
        this.lastBurntime = this.duplicator.burntime;
        this.lastCurrentItemBurntime = this.duplicator.currentItemBurntime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {

    }




    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return true;
    }
}
