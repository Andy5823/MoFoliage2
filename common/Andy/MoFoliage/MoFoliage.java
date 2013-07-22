package Andy.MoFoliage;

import Andy.MoFoliage.BaseClasses.ConfigurationFile;
import Andy.MoFoliage.BaseClasses.ClientProxy;
import Andy.MoFoliage.BaseClasses.CommonProxy;
import Andy.MoFoliage.BaseClasses.MoFoCreativeTab;
import Andy.MoFoliage.Blocks.ModBlocks;
import Andy.MoFoliage.Blocks.PodTraits;
import Andy.MoFoliage.Items.ModItems;
import Andy.MoFoliage.Refrences.Refrence;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class MoFoliage
{
    @Instance(Refrence.MOD_ID)
    public static MoFoliage instance;
    
    //@SidedProxy(clientSide = "Andy.MoFoliage.BaseClasses.ClientProxy", serverSide = "Andy.MoFoliage.BaseClasses.CommonProxy")
    //public static CommonProxy proxy;
    
    public static MoFoCreativeTab tab = new MoFoCreativeTab(Refrence.MOD_NAME);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Pre-Initialization");
        
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        ConfigurationFile.HandleConfig(config);
        
        ModBlocks.InitializeBlocks();
        
        ModItems.InitializeItems();
    }
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Load");
        
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Post-Initialization");
        
        
    }
}
