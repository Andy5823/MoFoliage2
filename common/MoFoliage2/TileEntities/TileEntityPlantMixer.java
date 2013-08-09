package MoFoliage2.TileEntities;

import MoFoliage2.Refrences.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPlantMixer extends TileEntity implements IInventory
{
    private ItemStack[] inventory;
    
    public static final int INVENTORY_SIZE = 5;
    
    public static final int POD_ONE_ID = 0;
    public static final int POD_TWO_ID = 1;
    public static final int BOWL_ID = 2;
    public static final int FUEL_ID = 3;
    public static final int OUTPUT_ID = 4;
    
    public TileEntityPlantMixer()
    {
        inventory = new ItemStack[INVENTORY_SIZE];
    }
    
    public int getSizeInventory() 
    {
        return inventory.length;
    }

    public ItemStack getStackInSlot(int slot) 
    {
        return inventory[slot];
    }

    public ItemStack decrStackSize(int slot, int amount) 
    {
        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            if (itemStack.stackSize <= amount) {
                setInventorySlotContents(slot, null);
            }
            else {
                itemStack = itemStack.splitStack(amount);
                if (itemStack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }

        return itemStack;
    }
    
    public ItemStack getStackInSlotOnClosing(int slot) {

        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            setInventorySlotContents(slot, null);
        }
        return itemStack;
    }
    
    public void setInventorySlotContents(int slot, ItemStack itemStack) {

        inventory[slot] = itemStack;
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }
    
    public String getInvName()
    {
        return Names.CONTAINER_PLANT_MIXER;
    }
    
    public boolean isInvNameLocalized()
    {
        return false;
    }
    
    public int getInventoryStackLimit()
    {
        return 64;
    }
    
    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        return true;
    }

    public void openChest(){}

    public void closeChest(){}

    
    public boolean isItemValidForSlot(int i, ItemStack itemstack)
    {
        return true;
    }
    
    public void readFromNBT(NBTTagCompound nbtTagCompound) {

        super.readFromNBT(nbtTagCompound);

        // Read in the ItemStacks in the inventory from NBT
        NBTTagList tagList = nbtTagCompound.getTagList("Items");
        inventory = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tagCompound = (NBTTagCompound) tagList.tagAt(i);
            byte slot = tagCompound.getByte("Slot");
            if (slot >= 0 && slot < inventory.length) {
                inventory[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {

        super.writeToNBT(nbtTagCompound);

        // Write the ItemStacks in the inventory to NBT
        NBTTagList tagList = new NBTTagList();
        for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
            if (inventory[currentIndex] != null) {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", (byte) currentIndex);
                inventory[currentIndex].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }
        nbtTagCompound.setTag("Items", tagList);
    }

}
