package com.jonanguti.roboticadventure.Blocks;

import com.jonanguti.roboticadventure.creativetab.CreativeTabRA;
import com.jonanguti.roboticadventure.init.ModBlocks;
import com.jonanguti.roboticadventure.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockDuplicator extends ContainerRA {

    private final boolean isActive;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;


    public BlockDuplicator(boolean isActive) {

        super();
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeMetal);
        this.isActive = isActive;

        if (isActive){
            this.setBlockName("duplicatorActive");
            this.setLightLevel(15F);
        }
        else {
            this.setBlockName("duplicatorIdle");
            this.setCreativeTab(CreativeTabRA.RA_TAB);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + "duplicatorSide");
        this.iconFront = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isActive ? "duplicatorFrontOn" : "duplicatorFrontOff"));
        this.iconTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + "duplicatorTop");

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int metadata){

        return side == 3 ? this.iconFront : side == 1 ?  this.iconTop : (side == 0 ? this.iconTop : side != metadata ? this.blockIcon : this.iconFront);
    }

    public Item getItemDropped(World world, int x, int y, int z ){

        return Item.getItemFromBlock(ModBlocks.duplicatorIdle);

    }

    public void onBlockAdded(World world, int x, int y, int z){

        super.onBlockAdded(world,x,y,z);
        this.setDefaultDirection(world,x,y,z);
    }

    private void setDefaultDirection (World world, int x, int y, int z){

        if (!world.isRemote) {
            Block b1 = world.getBlock(x, y, z - 1);
            Block b2 = world.getBlock(x,  y,  z + 1);
            Block b3 = world.getBlock(x - 1, y, z);
            Block b4  = world.getBlock(x + 1, y, z);

            byte b0 = 3;

            if(b1.func_149730_j() && !b2.func_149730_j()) {
                b0 = 3;
            }

            if(b2.func_149730_j() && !b1.func_149730_j()) {
                b0 = 2;
            }

            if(b3.func_149730_j() && !b4.func_149730_j()) {
                b0 = 5;
            }

            if(b4.func_149730_j() && !b3.func_149730_j()) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, x, b0, 2);
        }


    }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityPlayer, ItemStack itemStack){

       int l = MathHelper.floor_double((double)(entityPlayer.rotationYaw * 4.0F / 360.F) + 0.5D ) & 3;

       if(l == 0) {
           world.setBlockMetadataWithNotify(x, y, z, 2, 2);
       }

       if(l == 1) {
           world.setBlockMetadataWithNotify(x, y, z, 5, 2);
       }

       if(l == 2) {
           world.setBlockMetadataWithNotify(x, y, z, 3, 2);
       }

       if(l == 3) {
           world.setBlockMetadataWithNotify(x, y, z, 4, 2);
       }

       if(itemStack.hasDisplayName()) {
           //((TileEntityDuplicator)world.getTileEntity(x, y, z)).setGuiDisplayName(itemStack.getDisplayName());
       }
   }
}




