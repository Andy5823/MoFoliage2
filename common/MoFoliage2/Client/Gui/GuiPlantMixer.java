package MoFoliage2.Client.Gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import MoFoliage2.Containers.ContainerPlantMixer;
import MoFoliage2.Refrences.Names;
import MoFoliage2.Refrences.Textures;
import MoFoliage2.TileEntities.TileEntityPlantMixer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

@SideOnly(Side.CLIENT)
public class GuiPlantMixer extends GuiContainer
{

    public GuiPlantMixer(InventoryPlayer inventoryPlayer, TileEntityPlantMixer tilePlantMixer)
    {
        super(new ContainerPlantMixer(inventoryPlayer, tilePlantMixer));
    }
    
    protected void drawGuiContainerForegroundLayer(int x, int y) 
    {
        fontRenderer.drawString(Names.CONTAINER_PLANT_MIXER, 8, ySize - 160, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        //this.mc.getTextureManager().bindTexture(...)
        this.mc.func_110434_K().func_110577_a(Textures.GUI_PLANT_MIXER);
        
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
}
