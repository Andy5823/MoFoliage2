package MoFoliage2.Blocks;

import java.util.Random;

import MoFoliage2.MoFoliage;
import MoFoliage2.Core.ClientProxy;
import MoFoliage2.Refrences.GuiIds;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.RenderIds;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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
    
    public void breakBlock(World world, int x, int y, int z, int id, int meta) {

        dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, id, meta);
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) 
    {
        if (player.isSneaking())
        {
            return false;
        }
        else 
        {
            if (!world.isRemote) 
            {
                TileEntityGreenHouse tileGreenHouse = (TileEntityGreenHouse) world.getBlockTileEntity(x, y, z);

                if (tileGreenHouse != null) {
                    player.openGui(MoFoliage.instance, GuiIds.GREEN_HOUSE, world, x, y, z);
                }
            }

            return true;
        }
    }
    
    private Random rand = new Random();
    
    private void dropInventory(World world, int x, int y, int z) 
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

        if (!(tileEntity instanceof IInventory))
        {
            return;
        }

        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++) {

            ItemStack itemStack = inventory.getStackInSlot(i);

            if (itemStack != null && itemStack.stackSize > 0) {
                float dX = rand.nextFloat() * 0.8F + 0.1F;
                float dY = rand.nextFloat() * 0.8F + 0.1F;
                float dZ = rand.nextFloat() * 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, new ItemStack(itemStack.itemID, itemStack.stackSize, itemStack.getItemDamage()));

                if (itemStack.hasTagCompound()) {
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
                }

                float factor = 0.05F;
                entityItem.motionX = rand.nextGaussian() * factor;
                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * factor;
                world.spawnEntityInWorld(entityItem);
                itemStack.stackSize = 0;
            }
        }
    }
}
