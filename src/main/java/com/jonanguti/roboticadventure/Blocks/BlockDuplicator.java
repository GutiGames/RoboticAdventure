package com.jonanguti.roboticadventure.Blocks;

public class BlockDuplicator extends ContainerRA {

    private final boolean isActive;


    public BlockDuplicator(boolean isActive){

        super();
        this.setBlockName("duplicator");
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeMetal);
        this.isActive = isActive;
    }



}
