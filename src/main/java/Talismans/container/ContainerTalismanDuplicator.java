package Talismans.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import Talismans.block.TileTalismanDuplicator;

public class ContainerTalismanDuplicator extends Container {

	private TileTalismanDuplicator TileTalismanDuplicator;
	private final int PLAYER_INVENTORY_ROWS = 3;
	private final int PLAYER_INVENTORY_COLUMNS = 9;

	public ContainerTalismanDuplicator(InventoryPlayer inventoryPlayer,
			TileTalismanDuplicator tileTalismanDuplicator) {

		this.TileTalismanDuplicator = tileTalismanDuplicator;

		TileTalismanDuplicator.openChest();
		// todo fix
		this.addSlotToContainer(new Slot(tileTalismanDuplicator,
				TileTalismanDuplicator.INPUT_INVENTORY_INDEX, 30, 39));
		this.addSlotToContainer(new Slot(tileTalismanDuplicator,
				TileTalismanDuplicator.DUST_INVENTORY_INDEX, 48, 39));
		// this.addSlotToContainer(new
		// SlotTalismanDupeOutput(tileTalismanDuplicator,
		// TileTalismanDuplicator.OUTPUT_INVENTORY_INDEX, 120, 39));

		// Add the player's inventory slots to the container
		for (int inventoryRowIndex = 0; inventoryRowIndex < PLAYER_INVENTORY_ROWS; ++inventoryRowIndex) {
			for (int inventoryColumnIndex = 0; inventoryColumnIndex < PLAYER_INVENTORY_COLUMNS; ++inventoryColumnIndex) {
				this.addSlotToContainer(new Slot(inventoryPlayer,
						inventoryColumnIndex + inventoryRowIndex * 9 + 9,
						8 + inventoryColumnIndex * 18,
						106 + inventoryRowIndex * 18));
			}
		}

		// Add the player's action bar slots to the container
		for (int actionBarSlotIndex = 0; actionBarSlotIndex < PLAYER_INVENTORY_COLUMNS; ++actionBarSlotIndex) {
			this.addSlotToContainer(new Slot(inventoryPlayer,
					actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 164));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {

		return true;
	}

	@Override
	public void onContainerClosed(EntityPlayer entityPlayer) {

		super.onContainerClosed(entityPlayer);
		TileTalismanDuplicator.closeChest();
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer entityPlayer,
			int slotIndex) {

		ItemStack newItemStack = null;
		Slot slot = (Slot) inventorySlots.get(slotIndex);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemStack = slot.getStack();
			newItemStack = itemStack.copy();

			if (itemStack.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
		}

		return newItemStack;
	}

}
