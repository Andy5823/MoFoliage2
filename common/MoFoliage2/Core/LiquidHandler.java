package MoFoliage2.Core;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Refrences.Names;

public class LiquidHandler
{
    public static Fluid MoFoLiquidGold;
    
    public static void registerLiquid()
    {
        MoFoLiquidGold = new Fluid(Names.LIQUID_GOLD).setDensity(99999).setViscosity(5000);
        FluidRegistry.registerFluid(MoFoLiquidGold);
    }
}
