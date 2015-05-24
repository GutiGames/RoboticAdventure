package com.jonanguti.roboticadventure.item;

import com.jonanguti.roboticadventure.creativetab.CreativeTabRA;

public class ItemCloneCard extends ItemRA{

    public ItemCloneCard(){

        super();
        this.setUnlocalizedName("cloneCard");
        this.setCreativeTab(CreativeTabRA.RA_TAB);
        this.setMaxStackSize(1);
        this.setMaxDamage(32);
        this.setNoRepair();

    }

}
