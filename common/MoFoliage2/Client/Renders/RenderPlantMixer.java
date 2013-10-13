package MoFoliage2.Client.Renders;

import org.lwjgl.opengl.GL11;

import MoFoliage2.Models.ModelPlantMixer;
import MoFoliage2.Refrences.Textures;
import MoFoliage2.TileEntities.TileEntityPlantMixer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderPlantMixer extends TileEntitySpecialRenderer
{
    private ModelPlantMixer aModel;
    
    public RenderPlantMixer()
    {
        aModel = new ModelPlantMixer();
    }
    
    public void renderAModelAt(TileEntityPlantMixer tileentity, double d, double d1, double d2, float f)
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
        //FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Textures.MODEL_PLANT_MIXER);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_PLANT_MIXER);
        GL11.glPushMatrix();
        aModel.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        
    }
    
    
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) 
    {
        renderAModelAt((TileEntityPlantMixer)tileentity, d, d1, d2, f);
    }
}
