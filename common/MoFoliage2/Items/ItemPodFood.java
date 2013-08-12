package MoFoliage2.Items;

import java.util.List;

import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Refrences.Refrence;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPodFood extends ItemBase
{
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public ItemPodFood(int Id)
    {
        super(Id);
        this.setHasSubtypes(true);
        this.setMaxStackSize(64);
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return this.iconArray[par1];
    }
    
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return PodTraits.POD_TRAIT_ARRAY[i];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < PodTraits.POD_TRAIT_ARRAY.length-1; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[PodTraits.POD_TRAIT_ARRAY.length-1];

        for (int i = 0; i < PodTraits.POD_TRAIT_ARRAY.length-1; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + PodTraits.POD_TRAIT_ARRAY[i]);
        }
    }
}
