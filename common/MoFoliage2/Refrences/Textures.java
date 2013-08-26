package MoFoliage2.Refrences;

import MoFoliage2.BaseClasses.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    //Base File Locations
    public static String MODEL_TEXTURE_LOCATION = "textures/models/";
    public static String GUI_TEXTURE_LOCATION = "textures/gui/";
    
    //Metadata Texture Array
    public static String[] POD_FOOD_ARRAY = {"Bowl'O'Air", "PowahPowder", "DemonicBeanSoup", "GaseousJelly", "HighFlyerSoup", "MinersMush", "NauseatingBlend", "LovingBlend", "PlantCustard"};
    
    //Model Textures
    public static ResourceLocation MODEL_PLANT_MIXER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "PlantMixer.png");
    
    //Gui Textures
    public static ResourceLocation GUI_PLANT_MIXER = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "MixerGui.png");
    public static ResourceLocation GUI_GLASS_HOUSE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "GlassHouseGui.png");
}
