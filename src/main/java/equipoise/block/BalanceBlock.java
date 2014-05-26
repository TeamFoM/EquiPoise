package equipoise.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BalanceBlock extends EBlock{

	int btype;
	
	public BalanceBlock(Material material, int type) {
		super(material);
		btype = type;
	}
	
	public int getBalanceSide(){
		return this.btype;
	}
	
	public String getBalanceSideName(){
		switch(this.btype){
		default: return null;
		case 1: return "Light"; //Tentative names
		case 2: return "Dark";
		}
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
		System.out.println("yolo");
		System.out.println(block.getUnlocalizedName());
		Block thisBlock = world.getBlock(x, y, z);
		world.setBlock(x, y, z, Blocks.air);
		world.setBlock(x, y, z, thisBlock);
		if(this.getUnlocalizedName().toLowerCase().contains("light".toLowerCase())){
			if(block.getUnlocalizedName().toLowerCase().contains("dark".toLowerCase())){
				world.createExplosion(null, x, y, z, 2F, true);
			}
		}else if(this.getUnlocalizedName().toLowerCase().contains("dark".toLowerCase())){
			if(block.getUnlocalizedName().toLowerCase().contains("light".toLowerCase())){
				world.createExplosion(null, x, y, z, 2F, true);
			}
		}
	}
	
	public int onBlockPlaced(World world, int x, int y, int z, int side, float xpos, float ypos, float zpos, int metadata)
    {
        return metadata;
    }

}
