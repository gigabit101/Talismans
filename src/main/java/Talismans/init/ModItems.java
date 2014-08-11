package Talismans.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Talismans.items.ItemTalisman;
import Talismans.items.ItemTalismanBelt;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */
public class ModItems {

	public static Item Talisman;
	public static Item TalismanBelt;

	public static void init() {
		// Registers Talisman As A Item
		Talisman = new ItemTalisman();
		GameRegistry.registerItem(Talisman, "Talisman");
		// Registers Belts
		TalismanBelt = new ItemTalismanBelt();
		GameRegistry.registerItem(TalismanBelt, "TalismanBelt");

	}

	public static void CopyingTalismans() {
		// Adds Recipes To Talismans

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 1),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 1),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 2),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 2),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 3),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 3),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 4),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 4),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 5),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 5),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 6),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 6),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 7),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 7),
						ModItems.Talisman });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2, 8),
				new Object[] { new ItemStack(ModItems.Talisman, 1, 8),
						ModItems.Talisman });
	}

	public static void CraftingBelts() {
		// Adds Recipes To Belts

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				1), new Object[] { new ItemStack(ModItems.Talisman, 1, 1),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				2), new Object[] { new ItemStack(ModItems.Talisman, 1, 2),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				3), new Object[] { new ItemStack(ModItems.Talisman, 1, 3),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				4), new Object[] { new ItemStack(ModItems.Talisman, 1, 4),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				5), new Object[] { new ItemStack(ModItems.Talisman, 1, 5),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				6), new Object[] { new ItemStack(ModItems.Talisman, 1, 6),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				7), new Object[] { new ItemStack(ModItems.Talisman, 1, 7),
				ModItems.TalismanBelt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TalismanBelt, 1,
				8), new Object[] { new ItemStack(ModItems.Talisman, 1, 8),
				ModItems.TalismanBelt });
	}

}