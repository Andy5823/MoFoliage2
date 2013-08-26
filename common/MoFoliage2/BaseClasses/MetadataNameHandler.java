package MoFoliage2.BaseClasses;

import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Items.ModItems;
import MoFoliage2.Refrences.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class MetadataNameHandler
{
    public static void HandleMetadataNames()
    {
        for(int meta = 0; meta < 10; meta++)
        {
            ItemStack Pod = new ItemStack(ModBlocks.Pod, 1, meta);
            
            LanguageRegistry.addName(Pod, Names.POD_NAME_ARRAY[meta]);
        }
    }
    
    public static void HandleItemMetadataNames()
    {
        for(int meta = 0; meta < 10; meta++)
        {
            ItemStack Pod = new ItemStack(ModItems.Pod, 1, meta);
            
            LanguageRegistry.addName(Pod, Names.POD_NAME_ARRAY[meta]);
        }
        
        for(int meta = 0; meta < 9; meta++)
        {
            ItemStack Pod = new ItemStack(ModItems.Pod, 1, meta+100);
            
            LanguageRegistry.addName(Pod, Names.POD_FOOD_NAME_ARRAY[meta]);
        }
        
        for(int meta = 0; meta < 10; meta++)
        {
            ItemStack Pod = new ItemStack(ModItems.Pod, 1, meta+200);
            
            LanguageRegistry.addName(Pod, "Shining " + Names.POD_NAME_ARRAY[meta]);
        }
    }
}
