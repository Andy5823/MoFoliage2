package MoFoliage2.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import MoFoliage2.Refrences.ItemIds;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item PodSeeds;
    public static Item CrystalizedIron;
    
    public static Item TestingCookie; //Testing Item (not for public release)
    
    public static void InitializeItems()
    {
        PodSeeds = new ItemSeeds(ItemIds.POD_SEEDS_ID);
        CrystalizedIron = new ItemCrystalizedIron(ItemIds.CRYSTALIZED_IRON_ID);
        
        TestingCookie = new ItemTestingCookie(9001);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        LanguageRegistry.addName(CrystalizedIron, "Crystalized Iron Ingot");
        
        LanguageRegistry.addName(TestingCookie, "Testing Cookie");
        
        InitializeRecipes();
    }
    
    public static void InitializeRecipes()
    {
        
    }
}
