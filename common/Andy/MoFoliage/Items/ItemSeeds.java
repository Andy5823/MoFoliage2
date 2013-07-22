package Andy.MoFoliage.Items;

import Andy.MoFoliage.MoFoliage;
import Andy.MoFoliage.Refrences.Names;

public class ItemSeeds extends ItemBase
{

    public ItemSeeds(int Id)
    {
        super(Id);
        this.setUnlocalizedName(Names.POD_SEEDS_NAME);
        this.setCreativeTab(MoFoliage.tab);
        this.setMaxStackSize(64);
    }
}
