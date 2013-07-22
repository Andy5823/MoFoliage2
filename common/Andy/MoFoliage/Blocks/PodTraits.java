package Andy.MoFoliage.Blocks;

import Andy.MoFoliage.Refrences.ItemIds;

public class PodTraits
{
    public static String[] BLINDNESS_POD_TRAITS = { "Darkness", "Cold", "Damp"};
    
    public static int GetClosestPodTrait(String trait1, String trait2, String trait3)
    {
        if(trait1 == BLINDNESS_POD_TRAITS[1] && trait2 == BLINDNESS_POD_TRAITS[2] && trait3 == BLINDNESS_POD_TRAITS[3])
        {
             //return ItemIds.BLINDNESS_POD_ID;
        }
        
        
        return ItemIds.POD_SEEDS_ID;
    }
}
