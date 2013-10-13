package MoFoliage2.Client.Gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import MoFoliage2.Containers.ContainerGreenHouse;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Textures;
import MoFoliage2.TileEntities.TileEntityGreenHouse;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiGreenHouse extends GuiContainer
{

    public GuiGreenHouse(InventoryPlayer inventoryPlayer, TileEntityGreenHouse tileGreenHouse)
    {
        super(new ContainerGreenHouse(inventoryPlayer, tileGreenHouse));
    }
    
    protected void drawGuiContainerForegroundLayer(int x, int y) 
    {
        fontRenderer.drawString(Names.CONTAINER_GREEN_HOUSE, 53, ySize - 162, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        //this.mc.func_110434_K().func_110577_a(Textures.GUI_GLASS_HOUSE);
        this.mc.getTextureManager().bindTexture(Textures.GUI_GLASS_HOUSE);
        
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
}