package MoFoliage2.Items;

import java.util.List;

import MoFoliage2.Blocks.PodTraits;
import MoFoliage2.Refrences.Refrence;
import MoFoliage2.Refrences.Textures;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPodFood extends ItemBaseFood
{
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    @SideOnly(Side.CLIENT)
    public Icon[] iconArrayFood;
    
    public ItemPodFood(int Id, int Heal, float Saturation, boolean Wolves)
    {
        super(Id, Heal, Saturation, Wolves);
        this.setHasSubtypes(true);
        this.setMaxStackSize(64);
        this.setAlwaysEdible();
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        if(par1 >= 200)
        {
            return this.iconArray[par1 - 200];
        }
        if(par1 >= 100)
        {
            return this.iconArrayFood[par1 - 100];
        }
        return this.iconArray[par1];
    }
    
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        if(par1ItemStack.getItemDamage() >= 200)
        {
            return PodTraits.POD_TRAIT_ARRAY[par1ItemStack.getItemDamage()-200];
        }
        if(par1ItemStack.getItemDamage() >= 100)
        {
            return Textures.POD_FOOD_ARRAY[par1ItemStack.getItemDamage()-100];
        }
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return PodTraits.POD_TRAIT_ARRAY[i];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < PodTraits.POD_TRAIT_ARRAY.length-1; j++)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
        
        for(int j = 0; j < Textures.POD_FOOD_ARRAY.length; j++)
        {
            par3List.add(new ItemStack(par1, 1, 100+j));
        }
        
        for (int j = 0; j < PodTraits.POD_TRAIT_ARRAY.length-1; j++)
        {
            par3List.add(new ItemStack(par1, 1, 200+j));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        if(par1ItemStack.getItemDamage() >= 200)
        {
            return true;
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        if(par1ItemStack.getItemDamage() >= 200)
        {
            return EnumRarity.epic;
        }
        else if(par1ItemStack.getItemDamage() >= 100)
        {
            return EnumRarity.rare;
        }
        return EnumRarity.common;
    }
    
    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        switch(par1ItemStack.getItemDamage())
        {
            case 100:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 3));
                par3EntityPlayer.heal(2);
                break;
                
            case 101:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 102:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 103:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 0));  //Subject To Change
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 104:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 0)); //Subject To Change
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 200, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 105:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 300, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 106:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 0));
                par3EntityPlayer.heal(2);
                break;
                
            case 107:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 2));
                par3EntityPlayer.heal(2);
                break;
                
            default:
                par3EntityPlayer.heal(2);
                super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
                break;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[PodTraits.POD_TRAIT_ARRAY.length-1];
        this.iconArrayFood = new Icon[Textures.POD_FOOD_ARRAY.length];

        for (int i = 0; i < PodTraits.POD_TRAIT_ARRAY.length-1; i++)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + PodTraits.POD_TRAIT_ARRAY[i]);
        }
        
        for(int i = 0; i < Textures.POD_FOOD_ARRAY.length; i++)
        {
            this.iconArrayFood[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + Textures.POD_FOOD_ARRAY[i]);
        }
    }
}
