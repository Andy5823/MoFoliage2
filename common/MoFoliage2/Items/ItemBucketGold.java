package MoFoliage2.Items;

import MoFoliage2.MoFoliage;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Refrence;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBucketGold extends ItemBucket {

    private String iconName;

    public ItemBucketGold(int i, int blockId) 
    {
        super(i, blockId);
        this.setCreativeTab(MoFoliage.tab);
        this.setContainerItem(Item.bucketEmpty);
        this.setUnlocalizedName(Names.LIQUID_GOLD_BUCKET);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
