package MoFoliage2.Refrences;

import MoFoliage2.Core.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    //Base File Locations
    public static String MODEL_TEXTURE_LOCATION = "textures/models/";
    public static String GUI_TEXTURE_LOCATION = "textures/gui/";
    public static String VILLAGER_TEXTURE_LOCATION = "textures/villager/";
    
    //Metadata Texture Array
    public static String[] POD_FOOD_ARRAY = {"Bowl'O'Air", "PowahPowder", "DemonicBeanSoup", "GaseousJelly", "HighFlyerSoup", "MinersMush", "NauseatingBlend", "LovingBlend", "PlantCustard"};
    
    //Model Textures
    public static ResourceLocation MODEL_PLANT_MIXER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "PlantMixer.png");
    public static ResourceLocation MODEL_GREEN_HOUSE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "GlassHouse.png");
    
    //Gui Textures
    public static ResourceLocation GUI_PLANT_MIXER = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "MixerGui.png");
    public static ResourceLocation GUI_GLASS_HOUSE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "GlassHouseGui.png");
    
    //Villager Texture
    public static ResourceLocation MO_FO_VILLAGER = ResourceLocationHelper.getResourceLocation(VILLAGER_TEXTURE_LOCATION + "MoFoVillager.png");
}
