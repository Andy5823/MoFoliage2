package MoFoliage2.Blocks;

import MoFoliage2.BaseClasses.ClientProxy;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.RenderIds;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGreenHouse extends BlockBaseTile
{
    public BlockGreenHouse(int Id)
    {
        super(Id, Material.glass);
        this.setUnlocalizedName(Names.GREEN_HOUSE_NAME);
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return RenderIds.GREEN_HOUSE_RENDER_ID;
    }
    
    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityGreenHouse();
    }
    
    public static boolean canConnect(IBlockAccess par1IBlockAccess, int x, int y, int z)
    {
        int worldBlockId = par1IBlockAccess.getBlockId(x, y, z);
        
        if(worldBlockId == ModBlocks.GreenHouse.blockID || worldBlockId == ModBlocks.CrystalizedIron.blockID)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean canRenderInPass(int pass)
    {
        ClientProxy.renderPass = pass;
        return true;
    }
}
