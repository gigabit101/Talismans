package Talismans.init;

import Talismans.config.TalismanConfig;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

/**
 * @author Gigabit101
 */
public class DungeonLoot {

	public static void registerDungeonLoot(TalismanConfig properties) {
		if (properties.DungeonLootAllowed) {
			// Adds Talismans To Village DungeonLoot
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman), 1, 1, 80));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 1), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 2), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 3), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 4), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 5), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 6), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 7), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 8), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.TalismanBelt), 1, 1, 80));


			// Adds Talismans To Pyramid DungeonLoot
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman), 1, 1, 80));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 1), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 2), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 3), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 4), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 5), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 6), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 7), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 8), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.TalismanBelt), 1, 1, 80));

			// Adds Talismans To Dungeon DungeonLoot
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman), 1, 1, 80));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 1), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 2), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 3), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 4), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 5), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 6), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 7), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 8), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.TalismanBelt), 1, 1, 80));

			// Adds Talismans To StrongHold DungeonLoot
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman), 1, 1, 80));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 1), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 2), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 3), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 4), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 5), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 6), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 7), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 8), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.TalismanBelt), 1, 1, 80));

			// Adds Talismans To Stronghold Library DungeonLoot
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman), 1, 1, 80));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 1), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 2), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 3), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 4), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 5), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 6), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 7), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.Talisman, 1, 8), 1, 1, 8));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
					new WeightedRandomChestContent(new ItemStack(
							ModItems.TalismanBelt), 1, 1, 80));

		}

	}

}
