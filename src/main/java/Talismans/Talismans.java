package Talismans;

import net.minecraft.creativetab.CreativeTabs;
import Talismans.creativeTab.CreativeTabTalismans;
import Talismans.items.ModItems;
import Talismans.lib.Modinfo;
import Talismans.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid =Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version )

public class Talismans {
	
	@Instance(Modinfo.ID)
	public static Talismans instance;
	
	@SidedProxy(clientSide = Modinfo.CLIENT_PROXY_CLASS, serverSide = Modinfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
		ModItems.init();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	
	

}
