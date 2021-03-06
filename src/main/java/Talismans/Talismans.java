package Talismans;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import Talismans.config.TalismanConfig;
import Talismans.crafting.CraftingManager;
import Talismans.creativeTab.CreativeTabTalismans;
import Talismans.gui.GuiHandler;
import Talismans.init.DungeonLoot;
import Talismans.init.ModItems;
import Talismans.lib.Modinfo;
import Talismans.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version, dependencies = "required-after:Baubles@:")
public class Talismans {
	public static TalismanConfig properties;

	@Instance(Modinfo.ID)
	public static Talismans instance;

	@SidedProxy(clientSide = Modinfo.CLIENT_PROXY_CLASS, serverSide = Modinfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	// Adds Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		instance = this;
		// This should be the FIRST thing that gets done.
		String path = event.getSuggestedConfigurationFile().getAbsolutePath()
				.replace(Modinfo.ID, "Talismans");

		properties = TalismanConfig.initialize(new File(path));
		// Loads Talismans Items
		ModItems.init();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// Allows Talismans To Be Copyed
		CraftingManager.registerRecipes(properties);
		// Adds Talisman Belts
		ModItems.CraftingBelts();
		// Adds Talismans To DungeonLoot
		DungeonLoot.registerDungeonLoot(properties);
		// // Adds Modblocks
		// ModBlocks.init();
		// // Adds TileEntitys
		// ModBlocks.registerTileEntitys();
		// Registers Gui Handler
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
