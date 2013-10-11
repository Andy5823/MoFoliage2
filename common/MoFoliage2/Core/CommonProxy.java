package MoFoliage2.Core;

import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Client.Gui.GuiGreenHouse;
import MoFoliage2.Client.Gui.GuiPlantMixer;
import MoFoliage2.Containers.ContainerGreenHouse;
import MoFoliage2.Containers.ContainerPlantMixer;
import MoFoliage2.Refrences.GuiIds;
import MoFoliage2.Refrences.Names;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import MoFoliage2.TileEntities.TileEntityPlantMixer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
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
        GameRegistry.registerTileEntity(TileEntityGreenHouse.class, Names.GREEN_HOUSE_NAME);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == GuiIds.PLANT_MIXER)
        {
            TileEntityPlantMixer tilePlantMixer = (TileEntityPlantMixer)world.getBlockTileEntity(x, y, z);
            return new ContainerPlantMixer(player.inventory, tilePlantMixer);
        }
        
        if(ID == GuiIds.GREEN_HOUSE)
        {
            TileEntityGreenHouse tileGreenHouse = (TileEntityGreenHouse)world.getBlockTileEntity(x, y, z);
            return new ContainerGreenHouse(player.inventory, tileGreenHouse);
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
        
        if(ID == GuiIds.GREEN_HOUSE)
        {
            TileEntityGreenHouse tileGreenHouse = (TileEntityGreenHouse)world.getBlockTileEntity(x, y, z);
            return new GuiGreenHouse(player.inventory, tileGreenHouse);
        }
        return null;
    }
}
