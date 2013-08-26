package MoFoliage2.Items;

import MoFoliage2.MoFoliage;
import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemBaseFood extends ItemFood
{

    public ItemBaseFood(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        maxStackSize = 1;
        this.setCreativeTab(MoFoliage.tab);
        setNoRepair();
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
