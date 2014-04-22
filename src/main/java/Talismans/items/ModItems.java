package Talismans.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	
	public static Item Talisman;
	
	
	public static void init(){
		Talisman = new ItemTalisman();
		GameRegistry.registerItem(Talisman, "Talisman");
		
		
		
	}
	public static void initItemRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.Talisman, 1,2), new Object[]{
			"ZZZ", "ZQZ", "ZZZ", 'Z', Blocks.diamond_block, 'Q', Blocks.emerald_block
		});


}
}