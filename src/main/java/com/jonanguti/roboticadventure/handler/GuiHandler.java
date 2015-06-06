package com.jonanguti.roboticadventure.handler;

import com.jonanguti.roboticadventure.container.ContainerDuplicator;
import com.jonanguti.roboticadventure.gui.GuiDuplicator;
import com.jonanguti.roboticadventure.init.ModBlocks;
import com.jonanguti.roboticadventure.tileEntity.TileEntityDuplicator;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        TileEntity entity = world.getTileEntity(x, y, z);

        if (entity != null){
            switch (ID) {
                case (ModBlocks.guiIDDuplicator):
                    if (entity instanceof TileEntityDuplicator) {

                        return new ContainerDuplicator(player.inventory, (TileEntityDuplicator) entity);

                    }

                    return null;
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);

        if (entity != null){
                switch (ID) {
                    case (ModBlocks.guiIDDuplicator):
                        if (entity instanceof TileEntityDuplicator) {

                            return new GuiDuplicator(player.inventory, (TileEntityDuplicator) entity);

                        }

                        return null;
                }
        }
        return null;
    }
}
