package Talismans.gui;

import Talismans.block.TileTalismanDuplicator;
import Talismans.container.ContainerTalismanDuplicator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if (entity instanceof TileTalismanDuplicator) {
			return new ContainerTalismanDuplicator(player.inventory, (TileTalismanDuplicator) entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if (entity instanceof TileTalismanDuplicator) {
			return new GuiTalismanDupe(player.inventory, (TileTalismanDuplicator) entity);
		}
		return null;
	}

}
