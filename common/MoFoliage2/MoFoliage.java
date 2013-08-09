package MoFoliage2;

import MoFoliage2.BaseClasses.ClientProxy;
import MoFoliage2.BaseClasses.CommonProxy;
import MoFoliage2.BaseClasses.ConfigurationFile;
import MoFoliage2.BaseClasses.MoFoCreativeTab;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Items.ModItems;
import MoFoliage2.Refrences.Refrence;
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
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

@NetworkMod(clientSideRequired=true, serverSideRequired=false)
@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class MoFoliage
{
    @Instance(Refrence.MOD_ID)
    public static MoFoliage instance;
    
    @SidedProxy(clientSide = "MoFoliage2.BaseClasses.ClientProxy", serverSide = "MoFoliage2.BaseClasses.CommonProxy")
    public static CommonProxy proxy;
    
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
        
        NetworkRegistry.instance().registerGuiHandler(instance, proxy);
        
        proxy.initRenderingAndTextures();
        
        proxy.registerTileEnities();
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Post-Initialization");
        
        
    }
}
