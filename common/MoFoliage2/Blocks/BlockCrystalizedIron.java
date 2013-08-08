package MoFoliage2.Blocks;

import MoFoliage2.Refrences.Names;
import net.minecraft.block.material.Material;

public class BlockCrystalizedIron extends BlockBase
{

    public BlockCrystalizedIron(int id)
    {
        super(id, Material.iron);
        this.setUnlocalizedName(Names.CRYSTALIZED_IRON_NAME);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        PickaxeLevelHandler.handlePickaxeLevel(this, 1);
    }
}
