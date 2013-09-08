package MoFoliage2.Containers.Slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotBowl extends Slot
{
    public SlotBowl(IInventory par1iInventory, int x, int y, int z)
    {
        super(par1iInventory, x, y, z);
    }
    
    public boolean isItemValid(ItemStack par1ItemStack) 
    {
        if(par1ItemStack.itemID == Item.bowlEmpty.itemID)
        {
            return true;
        }
        return false;
    }
}
