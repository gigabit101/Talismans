package Talismans.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import Talismans.block.TileTalismanDuplicator;
import Talismans.container.ContainerTalismanDuplicator;

public class GuiTalismanDupe extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation(
			"talismans", "textures/gui/talismanDupe.png");
	public TileTalismanDuplicator tile;

	public GuiTalismanDupe(InventoryPlayer inventoryPlayer,
			TileTalismanDuplicator entity) {
		super(new ContainerTalismanDuplicator(inventoryPlayer, entity));
		this.tile = entity;
		xSize = 176;
		ySize = 187;
	}

	@Override
	public void drawGuiContainerForegroundLayer(int x, int y) {
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		double w = 48;
	}

	{

	}
}