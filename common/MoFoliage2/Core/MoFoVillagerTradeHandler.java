package MoFoliage2.Core;

import java.util.List;
import java.util.Random;

import MoFoliage2.Items.ModItems;
import MoFoliage2.WorldGen.ComponentMoFoVillageHouse;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class MoFoVillagerTradeHandler implements IVillageTradeHandler
{

    @Override
    public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
        recipeList.add(new MerchantRecipe(new ItemStack(ModItems.Pod, 1, 2), new ItemStack(Item.emerald, 1))); //Testing Recipe this will change
    }
}
