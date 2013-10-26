package MoFoliage2.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import MoFoliage2.MoFoliage;
import MoFoliage2.Refrences.Names;

public class ItemPodSeeds extends ItemBase
{
    public int blockType;
    
    public ItemPodSeeds(int Id, int BlockId)
    {
        super(Id);
        blockType = BlockId;
        this.setUnlocalizedName(Names.POD_SEEDS_NAME);
        this.setMaxStackSize(64);
    }
    
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            int i1 = par3World.getBlockId(par4, par5, par6);
            Block soil = Block.blocksList[i1];

            if (soil != null && par3World.isAirBlock(par4, par5 + 1, par6))
            {
                if(soil == Block.grass || soil == Block.dirt)
                {
                    par3World.setBlock(par4, par5 + 1, par6, this.blockType);
                    --par1ItemStack.stackSize;
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
