package MoFoliage2.Blocks;

import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockStainedGlass extends BlockBase
{
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public String[] texture = {"Connect", "ConnectBottom", "ConnectLeft", "ConnectLeftRight", "ConnectLeftBottom", "ConnectLeftRightBottom", "ConnectLeftRightTop", "ConnectLeftTop", "ConnectLeftTopBottom", "ConnectRight", "ConnectRightBottom", "ConnectRightTop", "ConnectRightTopBottom", "ConnectTop", "ConnectTopBottom","NoConnect"};
    
    public BlockStainedGlass(int id)
    {
        super(id, Material.glass);
        this.setUnlocalizedName(Names.STAINED_GLASS_NAME);
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    
     public boolean isOpaqueCube()
    {
       return false;
    }
     
     public boolean renderAsNormalBlock()
     {
         return false;
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.iconArray = new Icon[texture.length];

         for (int i = 0; i < this.iconArray.length; ++i)
         {
             this.iconArray[i] = par1IconRegister.registerIcon(Refrence.MOD_ID + ":MultiGlass" + texture[i]);
         }
     }
     
     @SideOnly(Side.CLIENT)
     public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
     {
         if(par5 == 0)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4+1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         
         if(par5 == 1)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4+1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         
         if(par5 == 2)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         
         if(par5 == 3)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2+1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2-1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         
         if(par5 == 4)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         
         if(par5 == 5)
         {
             String textureName = "Connect";
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID)
             {
                 textureName = textureName + "Left";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID)
             {
                 textureName = textureName + "Right";
             }
             if(par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID)
             {
                 textureName = textureName + "Top";
             }
             if(par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = textureName + "Bottom";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) == this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) == this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) == this.blockID)
             {
                 textureName = "NoConnect";
             }
             if(par1IBlockAccess.getBlockId(par2, par3, par4+1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3, par4-1) != this.blockID && par1IBlockAccess.getBlockId(par2, par3+1, par4) != this.blockID && par1IBlockAccess.getBlockId(par2, par3-1, par4) != this.blockID)
             {
                 textureName = "Connect";
             }
             int attempt = 0;
             while(attempt < 16)
             {
                 if(texture[attempt].equalsIgnoreCase(textureName))
                 {
                     return iconArray[attempt];
                 }
                 attempt++;
              }
         }
         return iconArray[0];
     }
     
     @SideOnly(Side.CLIENT)
     public Icon getIcon(int par1, int par2)
     {
         return iconArray[0];
     }
}
