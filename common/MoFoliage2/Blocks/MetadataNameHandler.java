package MoFoliage2.Blocks;

import MoFoliage2.Refrences.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class MetadataNameHandler
{
    public static void HandleMetaDataNames()
    {
        for(int meta = 0; meta < 10; meta++)
        {
            ItemStack cloth = new ItemStack(Block.cloth, 1, meta); //temp for testing metadata
            ItemStack Pod = new ItemStack(ModBlocks.Pod, 1, meta);
            
            GameRegistry.addShapelessRecipe(Pod, cloth, cloth);
            
            LanguageRegistry.addName(Pod, Names.POD_NAME_ARRAY[meta]);
        }
    }
}
