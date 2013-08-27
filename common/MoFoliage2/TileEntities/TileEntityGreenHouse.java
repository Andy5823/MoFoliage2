package MoFoliage2.TileEntities;

import MoFoliage2.Blocks.BlockGreenHouse;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGreenHouse extends TileEntity// implements IInventory
{
    public boolean canConnectLeft()
    {
        return BlockGreenHouse.canConnect(this.worldObj, xCoord - 1, yCoord, zCoord);
    }
    
    public boolean canConnectRight()
    {
        return BlockGreenHouse.canConnect(this.worldObj, xCoord + 1, yCoord, zCoord);
    }
    
    public boolean canConnectForward()
    {
        return BlockGreenHouse.canConnect(this.worldObj, xCoord, yCoord, zCoord - 1);
    }
    
    public boolean canConnectBackward()
    {
        return BlockGreenHouse.canConnect(this.worldObj, xCoord, yCoord, zCoord + 1);
    }
}
