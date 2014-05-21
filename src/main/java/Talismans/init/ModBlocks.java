package Talismans.init;

import Talismans.block.BlockTalismanDuplicator;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block TalismanDuplicator; 
	
	public static void init(){
		TalismanDuplicator = new BlockTalismanDuplicator();
        GameRegistry.registerBlock(TalismanDuplicator, "talismanDupe");		
	}

}
