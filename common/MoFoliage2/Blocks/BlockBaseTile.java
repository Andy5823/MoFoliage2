package MoFoliage2.Blocks;

import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public abstract class BlockBaseTile extends BlockContainer
{
    public BlockBaseTile(int id, Material material)
    {
        super(id, material);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
