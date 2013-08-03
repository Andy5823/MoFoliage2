package Andy.MoFoliage.Items;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Andy.MoFoliage.MoFoliage;
import Andy.MoFoliage.BaseClasses.WorldChecker;

public class ItemTestingCookie extends ItemBase
{

    public ItemTestingCookie(int Id)
    {
        super(Id);
        this.setUnlocalizedName("TestingCookie");
        this.setCreativeTab(MoFoliage.tab);
    }
    
    int repeat = 0;
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if(repeat == 0)
        {
            repeat++; //Just so it doesn't run twice
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("Water Count: "+ WorldChecker.checkForWater(par3World, par4, par5, par6));
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("Lava Count: "+ WorldChecker.checkForLava(par3World, par4, par5, par6));
        }
        else
        {
            repeat = 0;
        }
        return true;
    }
}
