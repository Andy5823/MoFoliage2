package Andy.MoFoliage.Blocks;

import Andy.MoFoliage.MoFoliage;
import Andy.MoFoliage.Refrences.Names;
import Andy.MoFoliage.Refrences.RenderIds;
import Andy.MoFoliage.TileEntities.TileEntityPlantMixer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPlantMixer extends BlockBase
{
    public BlockPlantMixer(int Id)
    {
        super(Id, Material.wood);
        this.setCreativeTab(MoFoliage.tab);
        this.setUnlocalizedName(Names.PLANT_MIXER_NAME);
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
        return RenderIds.PLANT_MIXER_RENDER_ID;
    }
    
    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityPlantMixer();
    }
}
