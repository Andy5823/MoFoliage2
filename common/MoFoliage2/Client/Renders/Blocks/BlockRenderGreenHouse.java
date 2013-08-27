package MoFoliage2.Client.Renders.Blocks;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;


import MoFoliage2.Models.ModelGreenHouse;
import MoFoliage2.Refrences.Textures;
import cpw.mods.fml.client.FMLClientHandler;

public class BlockRenderGreenHouse implements IItemRenderer 
{
    private ModelGreenHouse BlockModel;
    
    public BlockRenderGreenHouse() 
    {
        BlockModel = new ModelGreenHouse();
    }
    
    private void renderItemBlock(float x, float y, float z, boolean needsRotating)
    {
        Tessellator tesselator = Tessellator.instance;
        FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Textures.MODEL_GREEN_HOUSE);
        GL11.glPushMatrix(); //start
        if(needsRotating)
        {
            GL11.glRotatef(180, 1, 0, 1);
            GL11.glTranslatef(x + 1F , y - 1.5F, z);
        }
        else
        {
            GL11.glTranslatef(x, y + 1.2F/*+ 1.1F*/, z);
            GL11.glRotatef(180, 1, 0, 0);
        }
        
        boolean isLeft = false;
        boolean isRight = false;
        boolean isForward = false;
        boolean isBackward = false;
        
        BlockModel.renderModel(0.0625F, isLeft, isRight, isForward, isBackward);
        GL11.glPopMatrix(); //end
     }
    
    public boolean handleRenderType(ItemStack item, ItemRenderType type) 
    {
        return true;
    }
    
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }
    
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
    {
        switch (type) 
        {
            case ENTITY:
            {
                renderItemBlock(-0.25f, -0.5f, 0.25f, true);
                return;
            } 
            case EQUIPPED:
            {
                renderItemBlock(-0.5f, -0.25f, 0.5f, true);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                renderItemBlock(-0.5f, -0.25f, 0.5f, true);
                return;
            }
           case INVENTORY:
           {
               renderItemBlock(-0.5f, -0.5f, -0.5f, false);
               return;
           }
           default:
           {
               return;
           }
         }
     }
}