package MoFoliage2;

import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Core.BucketHandler;
import MoFoliage2.Core.ClientProxy;
import MoFoliage2.Core.CommonProxy;
import MoFoliage2.Core.ConfigurationFile;
import MoFoliage2.Core.LiquidHandler;
import MoFoliage2.Core.MoFoCreativeTab;
import MoFoliage2.Core.VillagerRegistring;
import MoFoliage2.Items.ModItems;
import MoFoliage2.Refrences.Refrence;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
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
    
    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static MoFoCreativeTab tab = new MoFoCreativeTab(Refrence.MOD_NAME);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Pre-Initialization");
        
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        ConfigurationFile.HandleConfig(config);
        
        LiquidHandler.registerLiquid();
        
        VillagerRegistring.registerVillagers();
        
        ModBlocks.InitializeBlocks();
        
        ModItems.InitializeItems();
        
        BucketHandler.INSTANCE.buckets.put(ModBlocks.LiquidGold, ModItems.LiquidGoldBucket);
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Load");
        
        NetworkRegistry.instance().registerGuiHandler(instance, proxy);
        
        proxy.initRenderingAndTextures();
        
        proxy.registerTileEnities();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("[Mo' Foliage 2]: Post-Initialization");
        
        
    }
}
