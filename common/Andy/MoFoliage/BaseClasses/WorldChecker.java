package Andy.MoFoliage.BaseClasses;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class WorldChecker
{
    public static int checkForWater(World world, int x, int y, int z)
    {
        int WaterCount = 0;
        int x1 = x;
        int z1 = z;
        
        for(int a = 0; a < 21; a++)
        {
            int a1;
            if(a < 6)
            {
                x1 = x;
                z1 = z;
                a1 = a;
                x1 = x1 + a1;
                if(world.getBlockId(x1, y, z1) == Block.waterStill.blockID || world.getBlockId(x1, y, z1) == Block.waterMoving.blockID)
                {
                    if(WaterCount == 0 || a1 < WaterCount)
                    {
                        WaterCount = a1;
                    }
                    //WaterCount = WaterCount + a1;
                }
            }
            else if(a < 11)
            {
                x1 = x;
                z1 = z;
                a1 = a - 5;
                x1 = x1 - a1;
                if(world.getBlockId(x1, y, z1) == Block.waterStill.blockID || world.getBlockId(x1, y, z1) == Block.waterMoving.blockID)
                {
                    if(WaterCount == 0 || a1 < WaterCount)
                    {
                        WaterCount = a1;
                    }
                    //WaterCount = WaterCount + a1;
                }
            }
            else if(a < 16)
            {
                x1 = x;
                z1 = z;
                a1 = a - 10;
                z1 = z1 + a1;
                if(world.getBlockId(x1, y, z1) == Block.waterStill.blockID || world.getBlockId(x1, y, z1) == Block.waterMoving.blockID)
                {
                    if(WaterCount == 0 || a1 < WaterCount)
                    {
                        WaterCount = a1;
                    }
                    //WaterCount = WaterCount + a1;
                }
            }
            else if(a < 21)
            {
                x1 = x;
                z1 = z;
                a1 = a - 15;
                z1 = z1 - a1;
                if(world.getBlockId(x1, y, z1) == Block.waterStill.blockID || world.getBlockId(x1, y, z1) == Block.waterMoving.blockID)
                {
                    if(WaterCount == 0 || a1 < WaterCount)
                    {
                        WaterCount = a1;
                    }
                    //WaterCount = WaterCount + a1;
                }
            }
        }
        
        return WaterCount;
    }
    
    public static int checkForLava(World world, int x, int y, int z)
    {
        int LavaCount = 0;
        int x1 = x;
        int z1 = z;
        
        for(int a = 0; a < 21; a++)
        {
            int a1;
            if(a < 6)
            {
                x1 = x;
                z1 = z;
                a1 = a;
                x1 = x1 + a1;
                if(world.getBlockId(x1, y, z1) == Block.lavaStill.blockID || world.getBlockId(x1, y, z1) == Block.lavaMoving.blockID)
                {
                    if(LavaCount == 0 || a1 < LavaCount)
                    {
                        LavaCount = a1;
                    }
                    //LavaCount = LavaCount + a1;
                }
            }
            else if(a < 11)
            {
                x1 = x;
                z1 = z;
                a1 = a - 5;
                x1 = x1 - a1;
                if(world.getBlockId(x1, y, z1) == Block.lavaStill.blockID || world.getBlockId(x1, y, z1) == Block.lavaMoving.blockID)
                {
                    if(LavaCount == 0 || a1 < LavaCount)
                    {
                        LavaCount = a1;
                    }
                    //LavaCount = LavaCount + a1;
                }
            }
            else if(a < 16)
            {
                x1 = x;
                z1 = z;
                a1 = a - 10;
                z1 = z1 + a1;
                if(world.getBlockId(x1, y, z1) == Block.lavaStill.blockID || world.getBlockId(x1, y, z1) == Block.lavaMoving.blockID)
                {
                    if(LavaCount == 0 || a1 < LavaCount)
                    {
                        LavaCount = a1;
                    }
                    //LavaCount = LavaCount + a1;
                }
            }
            else if(a < 21)
            {
                x1 = x;
                z1 = z;
                a1 = a - 15;
                z1 = z1 - a1;
                if(world.getBlockId(x1, y, z1) == Block.lavaStill.blockID || world.getBlockId(x1, y, z1) == Block.lavaMoving.blockID)
                {
                    if(LavaCount == 0 || a1 < LavaCount)
                    {
                        LavaCount = a1;
                    }
                    //LavaCount = LavaCount + a1;
                }
            }
        }
        
        return LavaCount;
    }
}
