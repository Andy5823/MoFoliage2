package Andy.MoFoliage.BaseClasses;

import Andy.MoFoliage.Refrences.BlockIds;
import Andy.MoFoliage.Refrences.ItemIds;
import net.minecraftforge.common.Configuration;

public class ConfigurationFile
{
    public static void HandleConfig(Configuration config)
    {
        config.load();
        
        //Blocks
        BlockIds.POD_SEEDS_BLOCK_ID = config.getBlock("Pod Seeds Block ID", 2000).getInt();
        
        //Items
        ItemIds.POD_SEEDS_ID = config.getItem("Pod Seeds ID", 10001).getInt();
        
        config.save();
    }
}
