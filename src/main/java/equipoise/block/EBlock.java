package equipoise.block;

import equipoise.EquiPoise;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EBlock extends Block{

	public EBlock(Material material) {
		super(material);
		this.setCreativeTab(EquiPoise.tabEP);
	}
}
