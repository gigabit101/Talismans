package Talismans.crafting;

import net.minecraft.item.ItemStack;
import Talismans.config.TalismanConfig;
import Talismans.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */
public class CraftingManager {

	private CraftingManager() {
	}

	public static void registerRecipes(TalismanConfig properties) {
		if (properties.CopyingTalismansAllowed) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					1), new Object[] { new ItemStack(ModItems.Talisman, 1, 1),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					2), new Object[] { new ItemStack(ModItems.Talisman, 1, 2),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					3), new Object[] { new ItemStack(ModItems.Talisman, 1, 3),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					4), new Object[] { new ItemStack(ModItems.Talisman, 1, 4),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					5), new Object[] { new ItemStack(ModItems.Talisman, 1, 5),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					6), new Object[] { new ItemStack(ModItems.Talisman, 1, 6),
					ModItems.Talisman });
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Talisman, 2,
					7), new Object[] { new ItemStack(ModItems.Talisman, 1, 7),
					ModItems.Talisman });
			// DEBUG CODE System.out.print("loading CopyingTalismans");

		}

	}
}