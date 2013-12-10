package MoFoliage2.Core;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import MoFoliage2.Blocks.BlockLiquidGold;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Items.ItemBucketGold;
import MoFoliage2.Items.ModItems;
import MoFoliage2.Refrences.BlockIds;
import MoFoliage2.Refrences.ItemIds;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Textures;

public class LiquidHandler
{
    public static Fluid MoFoLiquidGold;
    
    public static void registerLiquid()
    {
        MoFoLiquidGold = new Fluid(Names.LIQUID_GOLD).setDensity(99999).setViscosity(5000).setTemperature(1300).setLuminosity(15);
        FluidRegistry.registerFluid(MoFoLiquidGold);
        ModBlocks.LiquidGold = new BlockLiquidGold(BlockIds.LIQUID_GOLD_ID, LiquidHandler.MoFoLiquidGold);
        GameRegistry.registerBlock(ModBlocks.LiquidGold);
        LanguageRegistry.addName(ModBlocks.LiquidGold, "Liquid Gold");
        MoFoLiquidGold.setBlockID(ModBlocks.LiquidGold);
        ModItems.LiquidGoldBucket = new ItemBucketGold(ItemIds.LIQUID_GOLD_BUCKET_ID, ModBlocks.LiquidGold.blockID);
        LanguageRegistry.addName(ModItems.LiquidGoldBucket, "Liquid Gold Bucket");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(MoFoLiquidGold.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ModItems.LiquidGoldBucket, 1), new ItemStack(Item.bucketEmpty));
    }
}
