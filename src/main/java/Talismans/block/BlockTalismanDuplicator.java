package Talismans.block;

import Talismans.Talismans;
import Talismans.creativeTab.CreativeTabTalismans;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTalismanDuplicator extends Block {

	public BlockTalismanDuplicator() {
		super(Material.iron);
		this.setCreativeTab(Talismans.tabsTalismans);
		this.setHardness(2F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Blocktalismans TalismansDupe");
	}


}
