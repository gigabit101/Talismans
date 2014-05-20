package Talismans;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import Talismans.creativeTab.CreativeTabTalismans;
import Talismans.event.EventCloakRender;
import Talismans.init.DungeonLoot;
import Talismans.init.ModItems;
import Talismans.lib.Modinfo;
import Talismans.proxies.ClientProxy;
import Talismans.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

/**
 * @author Gigabit101
 */
@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version, dependencies = "required-after:Baubles@")
public class Talismans {
	
	@Instance(Modinfo.ID)
	public static Talismans instance;
	
	@SidedProxy(clientSide = Modinfo.CLIENT_PROXY_CLASS, serverSide = Modinfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	//Adds Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){		
		//Loads Talismans Items 	 
		ModItems.init();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){		    
		     // Loads Capes on the Client Side		     
		        if (event.getSide() == Side.CLIENT)
		        {
		            MinecraftForge.EVENT_BUS.register(new EventCloakRender());
		            EventCloakRender.addDevCapes();
		            EventCloakRender.addCapes();
		            EventCloakRender.addIcyCapes();

		        }
	    //Loads Talismans Recipes
		ModItems.initItemRecipes();
		//Adds Talismans To DungeonLoot
		DungeonLoot.initDungeonLoot();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){}

}
