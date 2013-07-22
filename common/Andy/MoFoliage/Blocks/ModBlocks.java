package Andy.MoFoliage.Blocks;

import Andy.MoFoliage.Refrences.BlockIds;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks
{
    public static Block PodSeeds;
    public static Block Pod;
    public static Block PlantMixer;
    
    public static void InitializeBlocks()
    {
        PodSeeds = new BlockPodSeeds(BlockIds.POD_SEEDS_BLOCK_ID);
        Pod = new BlockPod(BlockIds.POD_BLOCK_ID);
        PlantMixer = new BlockPlantMixer(BlockIds.PLANT_MIXER_ID);
        
        RegisterBlocks();
    }
    
    public static void RegisterBlocks()
    {
        GameRegistry.registerBlock(PodSeeds);
        GameRegistry.registerBlock(Pod);
        GameRegistry.registerBlock(PlantMixer);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        LanguageRegistry.addName(Pod, "Pod");
        LanguageRegistry.addName(PlantMixer, "Plant Mixer");
        
        InitializeRecipes();
    }
    
    public static void InitializeRecipes()
    {
        
    }
}
