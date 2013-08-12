package MoFoliage2.Items;

import MoFoliage2.Refrences.Names;

public class ItemCrystalizedIron extends ItemBase
{

    public ItemCrystalizedIron(int Id)
    {
        super(Id);
        this.setUnlocalizedName(Names.CRYSTALIZED_IRON_INGOT_NAME);
        this.setMaxStackSize(64);
    }
}
