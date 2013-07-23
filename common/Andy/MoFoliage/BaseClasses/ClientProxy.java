package Andy.MoFoliage.BaseClasses;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import Andy.MoFoliage.Refrences.BlockIds;
import Andy.MoFoliage.Refrences.Refrence;
import Andy.MoFoliage.Refrences.RenderIds;
import Andy.MoFoliage.Renders.RenderPlantMixer;
import Andy.MoFoliage.Renders.Blocks.BlockRenderPlantMixer;
import Andy.MoFoliage.TileEntities.TileEntityPlantMixer;

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
