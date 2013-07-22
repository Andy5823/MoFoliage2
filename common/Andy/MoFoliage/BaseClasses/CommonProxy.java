package Andy.MoFoliage.BaseClasses;

import Andy.MoFoliage.Refrences.Names;
import Andy.MoFoliage.TileEntities.TileEntityPlantMixer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler
{
    public void initRenderingAndTextures()
    {
        
    }
    
    public void registerTileEnities()
    {
        GameRegistry.registerTileEntity(TileEntityPlantMixer.class, Names.PLANT_MIXER_NAME);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}
