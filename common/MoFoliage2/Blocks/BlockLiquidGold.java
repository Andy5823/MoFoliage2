package MoFoliage2.Blocks;

import MoFoliage2.MoFoliage;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;

public class BlockLiquidGold extends BlockFluidClassic
{
    @SideOnly(Side.CLIENT)
    protected Icon[] blockIcon;
    
    public BlockLiquidGold(int id, Fluid fluid)
    {
        super(id, fluid, Material.lava);
        this.setUnlocalizedName(Names.LIQUID_GOLD);
        this.setCreativeTab(MoFoliage.tab);
    }
    
    public Icon getIcon(int side, int meta)
    {
        return side != 0 && side != 1 ? this.blockIcon[1] : this.blockIcon[0];
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) 
    {
        blockIcon = new Icon[]{iconRegister.registerIcon(Refrence.MOD_ID + ":" + "liquidGold" + "_still"), iconRegister.registerIcon(Refrence.MOD_ID + ":" + "liquidGold" + "_flow")};
    }
    
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) 
    {
        if (world.getBlockMaterial(x,  y,  z).isLiquid())
        {
            return false;
        }
        
        return super.canDisplace(world, x, y, z);
    }
    
    public boolean displaceIfPossible(World world, int x, int y, int z) 
    {
        if (world.getBlockMaterial(x,  y,  z).isLiquid())
        {
            return false;
        }
        
        return super.displaceIfPossible(world, x, y, z);
    }
}
