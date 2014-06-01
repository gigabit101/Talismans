package Talismans.creativeTab;

import Talismans.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author Gigabit101
 */
public class CreativeTabTalismans extends CreativeTabs {

	public CreativeTabTalismans(int tabId, String tabLabel) {
		super(tabId, tabLabel);
	}

	@Override
	public Item getTabIconItem() {
		// Gets Texture For Talisman For Creative Tab Icon
		return ModItems.Talisman;
	}
}
