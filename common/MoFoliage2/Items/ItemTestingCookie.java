package MoFoliage2.Items;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import MoFoliage2.MoFoliage;
import MoFoliage2.Blocks.BlockPodSeeds;
import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Core.WorldChecker;

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
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("Light Level: "+ par3World.getBlockLightValue(par4, par5+2, par6));
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("POD TRAIT 1: "+ handlePodTraits(par3World, 1, par4, par5, par6));
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("POD TRAIT 2: "+ handlePodTraits(par3World, 2, par4, par5, par6));
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("POD TRAIT 3: "+ handlePodTraits(par3World, 3, par4, par5, par6));
            String trait1 = handlePodTraits(par3World, 1, par4, par5, par6);
            String trait2 = handlePodTraits(par3World, 2, par4, par5, par6);
            String trait3 = handlePodTraits(par3World, 3, par4, par5, par6);
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("CLOSEST POD: "+ PodTraits.GetClosestPodTrait(trait1, trait2, trait3));
        }
        else
        {
            repeat = 0;
        }
        return true;
    }
    
    public String handlePodTraits(World par1World, int meta, int x, int y, int z)
    {
        switch(meta)
        {
            case 1:
                if(par1World.getBlockLightValue(x, y+2, z) < 8)
                {
                    return "Dark";
                }
                else
                {
                    return "Light";
                }
		case 2:
                if(WorldChecker.checkForWater(par1World, x, y, z) <= 2 && WorldChecker.checkForWater(par1World, x, y, z) != 0)
                {
                    return "Damp";
                }
                else if(WorldChecker.checkForWater(par1World, x, y, z) <= 4 && WorldChecker.checkForWater(par1World, x, y, z) != 0)
                {
                    return "Normal";
                }
                else
                {
                    return "Arid";
                }
		case 3:
                if(WorldChecker.checkForLava(par1World, x, y, z) <= 2 && WorldChecker.checkForLava(par1World, x, y, z) != 0)
                {
                    return "Hot";
                }
                else if(WorldChecker.checkForLava(par1World, x, y, z) <= 4 && WorldChecker.checkForLava(par1World, x, y, z) != 0)
                {
                    return "Warm";
                }
                else
                {
                    return "Cold";
                }
        }
		return "";
    }
}
