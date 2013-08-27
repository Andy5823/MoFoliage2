package MoFoliage2.Client.Renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import MoFoliage2.Models.ModelGreenHouse;
import MoFoliage2.Refrences.Textures;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderGreenHouse extends TileEntitySpecialRenderer
{
    private ModelGreenHouse aModel;
    
    public RenderGreenHouse()
    {
        aModel = new ModelGreenHouse();
    }
    
    public void renderAModelAt(TileEntityGreenHouse tileentity, double d, double d1, double d2, float f)
    {
        int i;
        if (tileentity.worldObj == null)
        {
                i = 0;
        } 
        else 
        {
                Block block = tileentity.getBlockType();
                i = tileentity.getBlockMetadata();
                if (block != null && i == 0)
                {
                        i = tileentity.getBlockMetadata();
                }
        }
        
        GL11.glPushMatrix();
        GL11.glTranslatef((float) d + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        int j = 0;
        if(i == 3)
        {
                j = 270;
        }
        if(i == 2)
        {
                j = 180;
        }
        if(i == 1)
        {
                j = 90;
        }
        GL11.glRotatef(j, 0.0F, 1.0F, 0F);
        FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Textures.MODEL_GREEN_HOUSE);
        GL11.glPushMatrix();
        
        boolean isLeft = tileentity.canConnectLeft();
        boolean isRight = tileentity.canConnectRight();
        boolean isForward = tileentity.canConnectForward();
        boolean isBackward = tileentity.canConnectBackward();
        
        aModel.renderModel(0.0625F, isLeft, isRight, isForward, isBackward);
        
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        
    }
    
    
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) 
    {
        renderAModelAt((TileEntityGreenHouse)tileentity, d, d1, d2, f);
    }
}