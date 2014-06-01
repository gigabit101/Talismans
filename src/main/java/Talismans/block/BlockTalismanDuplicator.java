package Talismans.block;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import Talismans.Talismans;
import Talismans.creativeTab.CreativeTabTalismans;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTalismanDuplicator extends BlockContainer {

	public BlockTalismanDuplicator() {
		super(Material.iron);
		this.setCreativeTab(Talismans.tabsTalismans);
		this.setHardness(2F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Blocktalismans TalismansDupe");
	}

	@Override
	// Registers Texture For TalismanDuplicator
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("talismans:talismanDupe");
	}

	@Override
	// Creates TileEntity For TalismanDuplicator
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileTalismanDuplicator();
	}

	// Loads GUI On Right Click
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer entity, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(entity, Talismans.instance, 0, world, x,
					y, z);

		}

		return true;
	}

}
