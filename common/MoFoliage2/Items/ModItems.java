package MoFoliage2.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import MoFoliage2.Core.MetadataNameHandler;
import MoFoliage2.Refrences.FoodStats;
import MoFoliage2.Refrences.ItemIds;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item PodSeeds;
    public static Item CrystalizedIron;
    public static Item Pod;
    
    public static Item TestingCookie; //Testing Item (not for public release)
    
    public static void InitializeItems()
    {
        PodSeeds = new ItemSeeds(ItemIds.POD_SEEDS_ID);
        CrystalizedIron = new ItemCrystalizedIron(ItemIds.CRYSTALIZED_IRON_ID);
        Pod = new ItemPodFood(ItemIds.POD_ID, FoodStats.DEFAULT_HEAL_AMOUNT, FoodStats.DEFAULT_SATURATION_AMOUNT, FoodStats.DEFAULT_WOLVES_STATUS);
        
        TestingCookie = new ItemTestingCookie(9001);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        MetadataNameHandler.HandleItemMetadataNames();
        
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        LanguageRegistry.addName(CrystalizedIron, "Crystalized Iron Ingot");
        
        LanguageRegistry.addName(TestingCookie, "Testing Cookie");
        
        InitializeRecipes();
    }
    
    public static void InitializeRecipes()
    {
        
    }
}
