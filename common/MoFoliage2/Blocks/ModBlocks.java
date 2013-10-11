package MoFoliage2.Blocks;

import MoFoliage2.MoFoliage;
import MoFoliage2.Core.LiquidHandler;
import MoFoliage2.Core.MetadataNameHandler;
import MoFoliage2.Items.ItemPod;
import MoFoliage2.Refrences.BlockIds;
import MoFoliage2.Refrences.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks
{
    public static Block PodSeeds;
    public static Block Pod;
    public static Block PlantMixer;
    public static Block CrystalizedIron;
    public static Block StainedGlass;
    public static Block GreenHouse;
    public static Block LiquidGold;
    
    public static void InitializeBlocks()
    {
        PodSeeds = new BlockPodSeeds(BlockIds.POD_SEEDS_BLOCK_ID);
        Pod = new BlockPod(BlockIds.POD_BLOCK_ID);
        PlantMixer = new BlockPlantMixer(BlockIds.PLANT_MIXER_ID);
        CrystalizedIron = new BlockCrystalizedIron(BlockIds.CRYSTALIZED_IRON_ID);
        StainedGlass = new BlockStainedGlass(BlockIds.STAINED_GLASS_ID);
        GreenHouse = new BlockGreenHouse(BlockIds.GREEN_HOUSE_ID);
        LiquidGold = new BlockLiquidGold(BlockIds.LIQUID_GOLD_ID, LiquidHandler.MoFoLiquidGold);
        
        RegisterBlocks();
    }
    
    public static void RegisterBlocks()
    {
        GameRegistry.registerBlock(PodSeeds);
        GameRegistry.registerBlock(Pod, ItemPod.class);
        GameRegistry.registerBlock(PlantMixer);
        GameRegistry.registerBlock(CrystalizedIron);
        GameRegistry.registerBlock(StainedGlass);
        GameRegistry.registerBlock(GreenHouse);
        GameRegistry.registerBlock(LiquidGold);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
        MetadataNameHandler.HandleMetadataNames();
        
        LanguageRegistry.addName(PodSeeds, "Pod Seeds");
        LanguageRegistry.addName(PlantMixer, "Plant Mixer");
        LanguageRegistry.addName(CrystalizedIron, "Crystalized Iron");
        LanguageRegistry.addName(StainedGlass, "Stained Glass");
        LanguageRegistry.addName(GreenHouse, "Miniture Green House");
        LanguageRegistry.addName(LiquidGold, "Liquid Gold");
        
        InitializeRecipes();
    }
    
    public static void InitializeRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(StainedGlass, 8), new Object[]{
            "GGG", "GDG", "GGG", 'G', Block.glass, 'D', new ItemStack(Item.dyePowder, 1, 2)
        });
    }
}
