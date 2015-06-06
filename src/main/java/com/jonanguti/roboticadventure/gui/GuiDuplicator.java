package com.jonanguti.roboticadventure.gui;

import com.jonanguti.roboticadventure.reference.Reference;
import com.jonanguti.roboticadventure.tileEntity.TileEntityDuplicator;
import com.jonanguti.roboticadventure.container.ContainerDuplicator;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiDuplicator extends GuiContainer {

    public static final ResourceLocation bgound = new ResourceLocation(Reference.MOD_ID, "textures/gui/GuiDuplicator.png" );

    public TileEntityDuplicator duplicator;

    public GuiDuplicator(InventoryPlayer inventoryPlayer, TileEntityDuplicator entity) {
        super(new ContainerDuplicator(inventoryPlayer, entity));

        this.duplicator = entity;
        this.xSize = 176;
        this.ySize = 166;
    }




    public void drawGuiContainerForegroundLayer(int par1, int par2) {

        String name = this.duplicator.hasCustomInventoryName() ? this.duplicator.getInventoryName() : I18n.format(this.duplicator.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }

}
