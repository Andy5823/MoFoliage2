package MoFoliage2.Items;

import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(int Id)
    {
        super(Id);
        maxStackSize = 1;
        setNoRepair();
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
