package MoFoliage2.BaseClasses;

import net.minecraft.util.ResourceLocation;
import MoFoliage2.Refrences.Refrence;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String path)
    {
        return new ResourceLocation(Refrence.MOD_ID.toLowerCase(), path);
    }
}
