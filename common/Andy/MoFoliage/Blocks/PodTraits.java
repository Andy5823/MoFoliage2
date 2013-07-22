package Andy.MoFoliage.Blocks;

import Andy.MoFoliage.Refrences.Names;

public class PodTraits
{
    public static String[] POD_TRAIT_ARRAY = {Names.BLINDNESS_POD_BLOCK_NAME, Names.DARK_POD_BLOCK_NAME, Names.FIRE_POD_BLOCK_NAME, Names.HASTE_POD_BLOCK_NAME, Names.JUMP_POD_BLOCK_NAME, Names.LAVA_POD_BLOCK_NAME, Names.LOVE_POD_BLOCK_NAME, Names.SPEED_POD_BLOCK_NAME, Names.STRENGTH_POD_BLOCK_NAME, Names.WATER_POD_BLOCK_NAME, Names.FAILED_POD_BLOCK_NAME};
    
    public static String[] BLINDNESS_POD_TRAITS = { "Dark", "Damp", "Cold"};
    public static String[] DARK_POD_TRAITS = { "Dark", "Arid", "Hot"};
    public static String[] FIRE_POD_TRAITS = { "Light", "Arid", "Warm"};
    public static String[] HASTE_POD_TRAITS = { "Dark", "Normal", "Cold"};
    public static String[] JUMP_POD_TRAITS = { "Light", "Damp", "Warm"};
    public static String[] LAVA_POD_TRAITS = { "Light", "Arid", "Hot"};
    public static String[] LOVE_POD_TRAITS = { "Light", "Damp", "Hot"};
    public static String[] SPEED_POD_TRAITS = { "Light", "Normal", "Cold"};
    public static String[] STRENGTH_POD_TRAITS = { "Dark", "Normal", "Cold"};
    public static String[] WATER_POD_TRAITS = { "Light", "Damp", "Cold"};
    
    
    public static String GetClosestPodTrait(String trait1, String trait2, String trait3)
    {
        if(trait1 == BLINDNESS_POD_TRAITS[1] && trait2 == BLINDNESS_POD_TRAITS[2] && trait3 == BLINDNESS_POD_TRAITS[3])
        {
             return Names.BLINDNESS_POD_BLOCK_NAME;
        }
        if(trait1 == DARK_POD_TRAITS[1] && trait2 == DARK_POD_TRAITS[2] && trait3 == DARK_POD_TRAITS[3])
        {
             return Names.DARK_POD_BLOCK_NAME;
        }
        if(trait1 == FIRE_POD_TRAITS[1] && trait2 == FIRE_POD_TRAITS[2] && trait3 == FIRE_POD_TRAITS[3])
        {
             return Names.FIRE_POD_BLOCK_NAME;
        }
        if(trait1 == HASTE_POD_TRAITS[1] && trait2 == HASTE_POD_TRAITS[2] && trait3 == HASTE_POD_TRAITS[3])
        {
             return Names.HASTE_POD_BLOCK_NAME;
        }
        if(trait1 == JUMP_POD_TRAITS[1] && trait2 == JUMP_POD_TRAITS[2] && trait3 == JUMP_POD_TRAITS[3])
        {
             return Names.JUMP_POD_BLOCK_NAME;
        }
        if(trait1 == LAVA_POD_TRAITS[1] && trait2 == LAVA_POD_TRAITS[2] && trait3 == LAVA_POD_TRAITS[3])
        {
             return Names.LAVA_POD_BLOCK_NAME;
        }
        if(trait1 == LOVE_POD_TRAITS[1] && trait2 == LOVE_POD_TRAITS[2] && trait3 == LOVE_POD_TRAITS[3])
        {
             return Names.LOVE_POD_BLOCK_NAME;
        }
        if(trait1 == SPEED_POD_TRAITS[1] && trait2 == SPEED_POD_TRAITS[2] && trait3 == SPEED_POD_TRAITS[3])
        {
             return Names.SPEED_POD_BLOCK_NAME;
        }
        if(trait1 == STRENGTH_POD_TRAITS[1] && trait2 == STRENGTH_POD_TRAITS[2] && trait3 == STRENGTH_POD_TRAITS[3])
        {
             return Names.STRENGTH_POD_BLOCK_NAME;
        }
        if(trait1 == WATER_POD_TRAITS[1] && trait2 == WATER_POD_TRAITS[2] && trait3 == WATER_POD_TRAITS[3])
        {
             return Names.WATER_POD_BLOCK_NAME;
        }
        
        return Names.FAILED_POD_BLOCK_NAME;
    }
}
