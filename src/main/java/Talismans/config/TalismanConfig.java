package Talismans.config;

import java.io.File;
/**
 * @author Gigabit101
 */
import net.minecraftforge.common.config.Configuration;

public class TalismanConfig {
	private static TalismanConfig instance = null;
	private final String CATEGORY_CRAFTING = "crafting";
	private final String CATEGORY_LOOT = "loot";
	public final boolean CopyingTalismansAllowed;
	public final boolean DungeonLootAllowed;

	private TalismanConfig(File configFile){
		Configuration config = new Configuration(configFile);
		config.load();
		CopyingTalismansAllowed = config.get(CATEGORY_CRAFTING, "Allow Copying Talismans", true).getBoolean(true);
		DungeonLootAllowed = config.get(CATEGORY_LOOT, "Makes Talismans Dungeon Loot", true).getBoolean(true);
		config.save();
		
		
	}
	public static TalismanConfig initialize(File configFile){
		
		if (instance == null)
			instance = new TalismanConfig(configFile);
		else
			throw new IllegalStateException("Cannot initialize TalismanConfig twice");

		return instance;
	}

	public static TalismanConfig instance(){
		if (instance == null){
			
			throw new IllegalStateException("Instance of TalismanConfig requested before initialization");
		}
		return instance;
	}

}
