package MoFoliage2.Items;

import MoFoliage2.MoFoliage;
import MoFoliage2.Refrences.Names;

public class ItemSeeds extends ItemBase
{

    public ItemSeeds(int Id)
    {
        super(Id);
        this.setUnlocalizedName(Names.POD_SEEDS_NAME);
        this.setMaxStackSize(64);
    }
}
