package MoFoliage2.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Refrence;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemPod extends ItemBlock
{
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public ItemPod(int par1)
    {
        super(par1);
        this.setHasSubtypes(true);
    }
    
    public int getMetadata(int par1)
    {
        return par1;
    }
    
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return Names.POD_NAME_ARRAY[itemstack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[PodTraits.POD_TRAIT_ARRAY.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            //System.out.println(PodTraits.POD_TRAIT_ARRAY[i]);
            this.iconArray[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + PodTraits.POD_TRAIT_ARRAY[i]);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return iconArray[par2];
    }
}
