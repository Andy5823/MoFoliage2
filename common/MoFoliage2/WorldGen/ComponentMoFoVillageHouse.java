package MoFoliage2.WorldGen;

import java.util.List;
import java.util.Random;

import MoFoliage2.Blocks.ModBlocks;
import MoFoliage2.Refrences.VillagerId;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.ComponentVillage;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;

public class ComponentMoFoVillageHouse extends ComponentVillage
{
    private int averageGroundLevel = -1;
    
    /*private static final int HEIGHT = 10;
    private final int SOUTH = 3;
    private final int WEST  = 0;
    private final int NORTH = 2;
    private final int EAST  = 1;*/
    
    protected ComponentMoFoVillageHouse(ComponentVillageStartPiece startPiece, int type, Random random, StructureBoundingBox _boundingBox, int direction){
        super(startPiece, type);
        coordBaseMode = direction;
        boundingBox = _boundingBox;
    }
    
    public static Object buildComponent(ComponentVillageStartPiece startPiece, List pieces, Random random, int x, int y, int z, int direction, int type) 
    {
        StructureBoundingBox _boundingBox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 14, 10, 8, direction);
        
        if(canVillageGoDeeper(_boundingBox))
        { 
            if(StructureComponent.findIntersecting(pieces, _boundingBox) == null)
            {
                return new ComponentMoFoVillageHouse(startPiece, type, random, _boundingBox, direction);
            }
        }
        return null;
    }

    @Override
    public boolean addComponentParts(World world, Random random, StructureBoundingBox structureboundingbox)
    {
        System.out.println("GENERATING");
        if (this.averageGroundLevel < 0)
        {
            this.averageGroundLevel = this.getAverageGroundLevel(world, structureboundingbox);

            if (this.averageGroundLevel < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 9 - 1, 0);
        }

        this.fillWithBlocks(world, structureboundingbox, 1, 1, 1, 7, 5, 4, 0, 0, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 0, 0, 8, 0, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 5, 0, 8, 5, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 6, 1, 8, 6, 4, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 7, 2, 8, 7, 3, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        int i = this.getMetadataWithOffset(Block.stairsWoodOak.blockID, 3);
        int j = this.getMetadataWithOffset(Block.stairsWoodOak.blockID, 2);
        int k;
        int l;

        for (k = -1; k <= 2; ++k)
        {
            for (l = 0; l <= 8; ++l)
            {
                this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, i, l, 6 + k, k, structureboundingbox);
                this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, j, l, 6 + k, 5 - k, structureboundingbox);
            }
        }

        this.fillWithBlocks(world, structureboundingbox, 0, 1, 0, 0, 1, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 1, 1, 5, 8, 1, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 8, 1, 0, 8, 1, 4, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 2, 1, 0, 7, 1, 0, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 2, 0, 0, 4, 0, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 2, 5, 0, 4, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 8, 2, 5, 8, 4, 5, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 8, 2, 0, 8, 4, 0, Block.cobblestone.blockID, Block.cobblestone.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 0, 2, 1, 0, 4, 4, Block.planks.blockID, Block.planks.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 1, 2, 5, 7, 4, 5, Block.planks.blockID, Block.planks.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 8, 2, 1, 8, 4, 4, Block.planks.blockID, Block.planks.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 1, 2, 0, 7, 4, 0, Block.planks.blockID, Block.planks.blockID, false);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 4, 2, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 5, 2, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 6, 2, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 4, 3, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 5, 3, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 6, 3, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 0, 2, 2, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 0, 2, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 0, 3, 2, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 0, 3, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 8, 2, 2, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 8, 2, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 8, 3, 2, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 8, 3, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 2, 2, 5, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 3, 2, 5, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 5, 2, 5, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, ModBlocks.StainedGlass.blockID, 0, 6, 2, 5, structureboundingbox);
        this.fillWithBlocks(world, structureboundingbox, 1, 4, 1, 7, 4, 1, Block.planks.blockID, Block.planks.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 1, 4, 4, 7, 4, 4, Block.planks.blockID, Block.planks.blockID, false);
        this.fillWithBlocks(world, structureboundingbox, 1, 3, 4, 7, 3, 4, Block.bookShelf.blockID, Block.bookShelf.blockID, false);
        this.placeBlockAtCurrentPosition(world, Block.planks.blockID, 0, 7, 1, 4, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, this.getMetadataWithOffset(Block.stairsWoodOak.blockID, 0), 7, 1, 3, structureboundingbox);
        k = this.getMetadataWithOffset(Block.stairsWoodOak.blockID, 3);
        this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, k, 6, 1, 4, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, k, 5, 1, 4, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, k, 4, 1, 4, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.stairsWoodOak.blockID, k, 3, 1, 4, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.fence.blockID, 0, 6, 1, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.pressurePlatePlanks.blockID, 0, 6, 2, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.fence.blockID, 0, 4, 1, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.pressurePlatePlanks.blockID, 0, 4, 2, 3, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, Block.workbench.blockID, 0, 7, 1, 1, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, 0, 0, 1, 1, 0, structureboundingbox);
        this.placeBlockAtCurrentPosition(world, 0, 0, 1, 2, 0, structureboundingbox);
        this.placeDoorAtCurrentPosition(world, structureboundingbox, random, 1, 1, 0, this.getMetadataWithOffset(Block.doorWood.blockID, 1));

        if (this.getBlockIdAtCurrentPosition(world, 1, 0, -1, structureboundingbox) == 0 && this.getBlockIdAtCurrentPosition(world, 1, -1, -1, structureboundingbox) != 0)
        {
            this.placeBlockAtCurrentPosition(world, Block.stairsCobblestone.blockID, this.getMetadataWithOffset(Block.stairsCobblestone.blockID, 3), 1, 0, -1, structureboundingbox);
        }

        for (l = 0; l < 6; ++l)
        {
            for (int i1 = 0; i1 < 9; ++i1)
            {
                this.clearCurrentPositionBlocksUpwards(world, i1, 9, l, structureboundingbox);
                this.fillCurrentPositionBlocksDownwards(world, Block.cobblestone.blockID, 0, i1, -1, l, structureboundingbox);
            }
        }

        this.spawnVillagers(world, structureboundingbox, 2, 1, 2, 1);
        return true;
    }
    
    protected int getVillagerType(int par1)
    {
        return VillagerId.MOFO_VILLAGER_ID;
    }

}
