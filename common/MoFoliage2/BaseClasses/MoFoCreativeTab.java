package MoFoliage2.BaseClasses;

import MoFoliage2.Items.ModItems;
import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MoFoCreativeTab extends CreativeTabs
{
    public MoFoCreativeTab(String par1String)
    {
        super(par1String);
    }
    
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return Refrence.MOD_NAME;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ModItems.PodSeeds;
    }
}
