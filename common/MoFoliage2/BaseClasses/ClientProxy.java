package MoFoliage2.BaseClasses;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import MoFoliage2.Refrences.BlockIds;
import MoFoliage2.Refrences.Refrence;
import MoFoliage2.Refrences.RenderIds;
import MoFoliage2.Renders.RenderPlantMixer;
import MoFoliage2.Renders.Blocks.BlockRenderPlantMixer;
import MoFoliage2.TileEntities.TileEntityPlantMixer;

public class ClientProxy extends CommonProxy
{
    public void initRenderingAndTextures()
    {
        System.out.println("["+Refrence.MOD_NAME+"]: Rendering and Textures");
        RenderIds.PLANT_MIXER_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
        
        MinecraftForgeClient.registerItemRenderer(BlockIds.PLANT_MIXER_ID, new BlockRenderPlantMixer());
    }
    
    public void registerTileEnities()
    {
        super.registerTileEnities();
        
        System.out.println("["+Refrence.MOD_NAME+"]: Registering Tile Entities");
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlantMixer.class, new RenderPlantMixer());
    }
}
