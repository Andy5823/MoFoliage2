package MoFoliage2.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Core.MetadataNameHandler;
import MoFoliage2.Refrences.FoodStats;
import MoFoliage2.Refrences.ItemIds;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModItems
{
    public static Item PodSeeds;
    public static Item CrystalizedIron;
    public static Item Pod;
    public static Item LiquidGoldBucket;
    public static Item PodPendant;
    
    public static Item TestingCookie; //Testing Item (not for public release)
    
    public static void InitializeItems()
    {
        PodSeeds = new ItemSeeds(ItemIds.POD_SEEDS_ID, ModBlocks.PodSeeds.blockID);
        CrystalizedIron = new ItemCrystalizedIron(ItemIds.CRYSTALIZED_IRON_ID);
        Pod = new ItemPodFood(ItemIds.POD_ID, FoodStats.DEFAULT_HEAL_AMOUNT, FoodStats.DEFAULT_SATURATION_AMOUNT, FoodStats.DEFAULT_WOLVES_STATUS);
        PodPendant = new ItemPendant(ItemIds.POD_PENDANT_ID);
        
        TestingCookie = new ItemTestingCookie(ItemIds.TESTING_COOKIE_ID);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        MetadataNameHandler.HandleItemMetadataNames();
        
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        LanguageRegistry.addName(CrystalizedIron, "Crystalized Iron Ingot");
        LanguageRegistry.addName(PodPendant, "Pod Pendant");
        
        LanguageRegistry.addName(TestingCookie, "Testing Cookie");
    }
    
    public static void InitializeRecipes()
    {
    	GameRegistry.addShapedRecipe(new ItemStack(ModItems.LiquidGoldBucket, 1), new Object[]{"G", "B", 'B', Item.bucketLava, 'G', Block.blockGold});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CrystalizedIron, 1), new Object[]{"GB", 'B', LiquidGoldBucket, 'G', Block.blockIron});
    	
        GameRegistry.addShapelessRecipe(new ItemStack(TestingCookie, 1), Item.cookie, ModBlocks.Pod);
    }
    
    public static void InitializeHooks()
    {
        MinecraftForge.addGrassSeed(new ItemStack(PodSeeds), 15);
    }
}
