package Talismans.init;

import Talismans.items.ItemTalisman;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
/**
 * @author Gigabit101
 */
public class ModItems {
	
	public static Item Talisman;
	
	
	public static void init(){
		//Registers Talisman As A Item
		Talisman = new ItemTalisman();
		GameRegistry.registerItem(Talisman, "Talisman");
	
	}
	public static void initItemRecipes(){
		//Adds Recipes To Talismans
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 1), new Object[] {new ItemStack(ModItems.Talisman,1,1), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 2), new Object[] {new ItemStack(ModItems.Talisman,1,2), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 3), new Object[] {new ItemStack(ModItems.Talisman,1,3), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 4), new Object[] {new ItemStack(ModItems.Talisman,1,4), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 5), new Object[] {new ItemStack(ModItems.Talisman,1,5), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 6), new Object[] {new ItemStack(ModItems.Talisman,1,6), ModItems.Talisman});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 7), new Object[] {new ItemStack(ModItems.Talisman,1,7), ModItems.Talisman});

		
      }
	
}