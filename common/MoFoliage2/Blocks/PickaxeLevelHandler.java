package MoFoliage2.Blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

public class PickaxeLevelHandler
{
    public static void handlePickaxeLevel(Block block, int miningLevel)
    {
        MinecraftForge.setBlockHarvestLevel(block, "pickaxe", miningLevel);
    }
}
