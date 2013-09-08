package MoFoliage2.Containers.Slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotNull extends Slot
{

    public SlotNull(IInventory par1iInventory, int x, int y, int z)
    {
        super(par1iInventory, x, y, z);
    }
    
    public boolean isItemValid(ItemStack par1ItemStack) 
    {
        return false;
    }
}
