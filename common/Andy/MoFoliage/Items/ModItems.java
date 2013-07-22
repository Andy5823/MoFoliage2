package Andy.MoFoliage.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import Andy.MoFoliage.Refrences.ItemIds;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item PodSeeds;
    
    public static void InitializeItems()
    {
        PodSeeds = new ItemSeeds(ItemIds.POD_SEEDS_ID);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        
        InitializeRecipes();
    }
    
    public static void InitializeRecipes()
    {
        
    }
}
