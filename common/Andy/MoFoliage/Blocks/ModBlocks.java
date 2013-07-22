package Andy.MoFoliage.Blocks;

import Andy.MoFoliage.Refrences.BlockIds;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks
{
    public static Block PodSeeds;
    
    public static void InitializeBlocks()
    {
        PodSeeds = new BlockPodSeeds(BlockIds.POD_SEEDS_BLOCK_ID);
        
        RegisterBlocks();
    }
    
    public static void RegisterBlocks()
    {
        GameRegistry.registerBlock(PodSeeds);
        
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
