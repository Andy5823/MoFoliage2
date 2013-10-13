package MoFoliage2.Core;

import java.util.Random;

import MoFoliage2.Refrences.Textures;
import MoFoliage2.Refrences.VillagerId;
import MoFoliage2.WorldGen.VillageCreationHandler;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class VillagerRegistring
{
    public static void registerVillagers()
    {
        //Random random = new Random();
        //ArrayList<StructureVillagePieceWeight> arraylist = new ArrayList();
        //arraylist.add(new StructureVillagePieceWeight(ComponentMoFoVillageHouse.class, 3, 1000));
        
        //VillagerRegistry.instance().addExtraVillageComponents(arraylist, random, 3);
        
        VillagerRegistry.instance().registerVillagerId(VillagerId.MOFO_VILLAGER_ID);
        
        VillagerRegistry.instance().registerVillagerSkin(VillagerId.MOFO_VILLAGER_ID, Textures.MO_FO_VILLAGER);
        
        
        MoFoVillagerTradeHandler tradeHandler = new MoFoVillagerTradeHandler();
        
        VillagerRegistry.instance().registerVillageTradeHandler(VillagerId.MOFO_VILLAGER_ID, tradeHandler);
        
        if(ConfigurationFile.villagersSpawn)
        {
            VillageCreationHandler villageCreationHandler = new VillageCreationHandler();
            
            VillagerRegistry.instance().registerVillageCreationHandler(villageCreationHandler);
        }
    }
}
