package Talismans.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item Talisman;
	
	
	public static void init(){
		Talisman = new ItemTalisman();
		GameRegistry.registerItem(Talisman, "Talisman");
		
		
		
	}


}
