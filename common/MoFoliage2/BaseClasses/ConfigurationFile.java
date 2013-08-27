package MoFoliage2.BaseClasses;

import MoFoliage2.Refrences.BlockIds;
import MoFoliage2.Refrences.ItemIds;
import net.minecraftforge.common.Configuration;

public class ConfigurationFile
{
    public static void HandleConfig(Configuration config)
    {
        config.load();
        
        //Blocks
        BlockIds.POD_SEEDS_BLOCK_ID = config.getBlock("Pod Seeds Block ID", 2000).getInt();
        BlockIds.POD_BLOCK_ID = config.getBlock("Pod Block ID", 2001).getInt();
        BlockIds.PLANT_MIXER_ID = config.getBlock("Plant Mixer ID", 2002).getInt();
        BlockIds.CRYSTALIZED_IRON_ID = config.getBlock("Crystalized Iron Id", 2003).getInt();
        BlockIds.STAINED_GLASS_ID = config.getBlock("Stained Glass Id", 2004).getInt();
        BlockIds.GREEN_HOUSE_ID = config.getBlock("Green House Id", 2005).getInt();
        
        //Items
        ItemIds.POD_SEEDS_ID = config.getItem("Pod Seeds Id", 10001).getInt();
        ItemIds.CRYSTALIZED_IRON_ID = config.getItem("Crystalized Iron Id", 10002).getInt();
        ItemIds.POD_ID = config.getItem("Pod Item Id", 10003).getInt();
        
        config.save();
    }
}
