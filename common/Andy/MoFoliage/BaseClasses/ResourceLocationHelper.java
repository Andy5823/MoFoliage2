package Andy.MoFoliage.BaseClasses;

import net.minecraft.util.ResourceLocation;
import Andy.MoFoliage.Refrences.Refrence;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String path)
    {
        return new ResourceLocation(Refrence.MOD_ID.toLowerCase(), path);
    }
}
