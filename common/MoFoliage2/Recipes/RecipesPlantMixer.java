/*package MoFoliage2.Recipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MoFoliage2.Blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class RecipesPlantMixer
{
    private static final RecipesPlantMixer mixingBase = new RecipesPlantMixer();
    
    private List mixingList = new ArrayList();//HashMap<List<Integer>, List<Integer>, ItemStack>();
    
    public static final RecipesPlantMixer mixing()
    {
        return mixingBase;
    }
    
    private RecipesPlantMixer()
    {
        //Format: Item Metadata, Second Item Metadata, Output (as ItemStack)
        this.addMixing(0, 1, new ItemStack(Item.ingotIron)); //Testing Recipe 
    }
    
    public void addMixing(int itemMeta, int itemMeta2, ItemStack itemstack)
    {
        this.mixingList.put(Integer.valueOf(itemMeta), Integer.valueOf(itemMeta2));
    }
    
    public ItemStack getMixingResult(ItemStack item, ItemStack item2) 
    {
        if (item == null)
        {
            return null;
        }
        
        ItemStack ret = (ItemStack)mixingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        
        return ret;
    }
}*/  //TO BE DONE LATER
