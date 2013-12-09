package MoFoliage2.Recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockItemRecipes 
{
	public static void HandleRecipes()
	{
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.LiquidGoldBucket, 1), new Object[]{"G", "B", 'B', Item.bucketLava, 'G', Block.blockGold});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CrystalizedIron, 1), new Object[]{"IB", 'B', ModItems.LiquidGoldBucket, 'I', Block.blockIron});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ModItems.CrystalizedIron, 9), new Object[]{"C", 'C', ModBlocks.CrystalizedIron});
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CrystalizedIron, 1), new Object[]{"CCC", "CCC", "CCC", 'C', ModItems.CrystalizedIron});
    	
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TestingCookie, 1), Item.cookie, ModBlocks.Pod);
        
        GameRegistry.addRecipe(new ItemStack(ModBlocks.StainedGlass, 8), new Object[]{ "GGG", "GDG", "GGG", 'G', Block.glass, 'D', new ItemStack(Item.dyePowder, 1, 2) });
        
        GameRegistry.addRecipe(new ItemStack(ModBlocks.PlantMixer, 1), new Object[]{ "WWW", "WBW", "WWW", 'W', Block.planks, 'B', Item.bucketEmpty });
	}
}
