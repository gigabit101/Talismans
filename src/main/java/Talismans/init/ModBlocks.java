package Talismans.init;

import net.minecraft.block.Block;
import Talismans.block.BlockTalismanDuplicator;
import Talismans.block.TileTalismanDuplicator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block TalismanDuplicator;
	public static String TileTalismanDuplicator;

	public static void init() {
		TalismanDuplicator = new BlockTalismanDuplicator();
		GameRegistry.registerBlock(TalismanDuplicator, "talismanDupe");
	}

	public static void registerTileEntitys() {
		GameRegistry.registerTileEntity(TileTalismanDuplicator.class,
				TileTalismanDuplicator);

	}

}
