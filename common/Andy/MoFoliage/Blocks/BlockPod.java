package Andy.MoFoliage.Blocks;

import java.util.List;

import Andy.MoFoliage.MoFoliage;
import Andy.MoFoliage.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockPod extends Block
{
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public BlockPod(int id)
    {
        super(id, Material.plants);
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
        this.setCreativeTab(MoFoliage.tab);
        this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[PodTraits.POD_TRAIT_ARRAY.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            //System.out.println(PodTraits.POD_TRAIT_ARRAY[i]);
            this.iconArray[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + PodTraits.POD_TRAIT_ARRAY[i]);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return iconArray[par2];
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return 1;
    }
    
    public int damageDropped(int par1)
    {
        return par1;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 5));
        par3List.add(new ItemStack(par1, 1, 6));
        par3List.add(new ItemStack(par1, 1, 7));
        par3List.add(new ItemStack(par1, 1, 8));
        par3List.add(new ItemStack(par1, 1, 9));
        par3List.add(new ItemStack(par1, 1, 10));
        par3List.add(new ItemStack(par1, 1, 11));
    }
}
