package com.jonanguti.roboticadventure.gui;

import com.jonanguti.roboticadventure.reference.Reference;
import com.jonanguti.roboticadventure.tileEntity.TileEntityDuplicator;
import com.jonanguti.roboticadventure.container.ContainerDuplicator;
import jdk.nashorn.internal.objects.Global;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiDuplicator extends GuiContainer {

    public static final ResourceLocation bgound = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/GuiDuplicator.png" );

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
    protected void drawGuiContainerBackgroundLayer(float vae1, int var2, int var3) {
        GL11.glColor4f(1F, 1F, 1F, 1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(bgound);
        drawTexturedModalRect(guiLeft ,guiTop ,0,0, xSize, ySize);

    }

}
