package MoFoliage2.BaseClasses;

import MoFoliage2.Client.Gui.GuiPlantMixer;
import MoFoliage2.Containers.ContainerPlantMixer;
import MoFoliage2.Refrences.GuiIds;
import MoFoliage2.Refrences.Names;
import MoFoliage2.TileEntities.TileEntityPlantMixer;
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
        if(ID == GuiIds.PLANT_MIXER)
        {
            TileEntityPlantMixer tilePlantMixer = (TileEntityPlantMixer)world.getBlockTileEntity(x, y, z);
            return new ContainerPlantMixer(player.inventory, tilePlantMixer);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == GuiIds.PLANT_MIXER)
        {
            TileEntityPlantMixer tilePlantMixer = (TileEntityPlantMixer)world.getBlockTileEntity(x, y, z);
            return new GuiPlantMixer(player.inventory, tilePlantMixer);
        }
        return null;
    }
}
