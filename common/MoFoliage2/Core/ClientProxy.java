package MoFoliage2.Core;

import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Client.Renders.RenderGreenHouse;
import MoFoliage2.Client.Renders.RenderPlantMixer;
import MoFoliage2.Client.Renders.Blocks.BlockRenderGreenHouse;
import MoFoliage2.Client.Renders.Blocks.BlockRenderPlantMixer;
import MoFoliage2.Refrences.BlockIds;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Refrence;
import MoFoliage2.Refrences.RenderIds;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import MoFoliage2.TileEntities.TileEntityPlantMixer;

public class ClientProxy extends CommonProxy
{
    public void initRenderingAndTextures()
    {
        System.out.println("["+Refrence.MOD_NAME+"]: Rendering and Textures");
        RenderIds.PLANT_MIXER_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.GREEN_HOUSE_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
        
        MinecraftForgeClient.registerItemRenderer(BlockIds.PLANT_MIXER_ID, new BlockRenderPlantMixer());
        MinecraftForgeClient.registerItemRenderer(ModBlocks.GreenHouse.blockID, new BlockRenderGreenHouse());
    }
    
    public void registerTileEnities()
    {
        super.registerTileEnities();
        
        System.out.println("["+Refrence.MOD_NAME+"]: Registering Tile Entities");
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlantMixer.class, new RenderPlantMixer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGreenHouse.class, new RenderGreenHouse());
    }
}
