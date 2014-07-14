package Talismans.items;

import java.util.List;

import cpw.mods.fml.common.eventhandler.Event;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import Talismans.Talismans;

import baubles.api.BaubleType;
import baubles.api.IBauble;

/**
 * @author Gigabit101
 */
public class ItemTalisman extends Item implements IBauble {
	// Names For Talismans Depending on Meta Data
	public static final String[] types = new String[] { "Blank", "Dragon",
			"Rabbit", "Bull", "Horse", "Fish", "Bat", "Chameleon", "Cow", "Icy","Cat" };
	
	private static final int par7 = 0;
	private IIcon[] textures;

	public ItemTalisman() {
		super();
		setHasSubtypes(true);
		this.setCreativeTab(Talismans.tabsTalismans);
		this.setUnlocalizedName("Itemtalisman Talisman");
		maxStackSize = 1;
	}

	@Override
	// Tells Baubles What slot Talismans Can Be Equiped To
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

	@Override
	// Registers Textures For All Talismans
	public void registerIcons(IIconRegister iconRegister) {
		textures = new IIcon[types.length];

		for (int i = 0; i < types.length; ++i) {
			textures[i] = iconRegister.registerIcon("talismans:" + types[i]);
		}
	}

	@Override
	// Adds Texture what match's meta data
	public IIcon getIconFromDamage(int meta) {
		if (meta < 0 || meta >= textures.length) {
			meta = 0;
		}

		return textures[meta];
	}

	@Override
	// gets Unlocalized Name depending on meta data
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}

	// Adds Talismans SubItems To Creative Tab
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
		for (int meta = 0; meta < types.length; ++meta) {
			list.add(new ItemStack(item, 1, meta));
		}
	}

	// Makes Items Name Blue
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	// Adds Tooltips to Items
	@Override
	public void addInformation(ItemStack iS, EntityPlayer par2EntityPlayer,
			List par3List, boolean par4) {
		if (iS.getItemDamage() == 0) {
			par3List.add("Can Be Used To Copy Talismans");
		}
		if (iS.getItemDamage() == 1) {
			par3List.add("When equiped grants the ability ");
			par3List.add("Of Fire Imunity");
		}
		if (iS.getItemDamage() == 2) {
			par3List.add("When equiped grants the ability");
			par3List.add("To Jump Higher");
		}
		if (iS.getItemDamage() == 3) {
			par3List.add("When equiped grants the ability");
			par3List.add("To Dig Faster");
		}
		if (iS.getItemDamage() == 4) {
			par3List.add("When equiped grants the ability");
			par3List.add("To Run Faster");
		}
		if (iS.getItemDamage() == 5) {
			par3List.add("When equiped grants the ability");
			par3List.add("To breath under water");

		}
		if (iS.getItemDamage() == 6) {
			par3List.add("When equiped grants the ability");
			par3List.add("To See In The Dark");

		}
		if (iS.getItemDamage() == 7) {
			par3List.add("When equiped grants the ability");
			par3List.add("To Become Invisable");

		}
		if (iS.getItemDamage() == 8) {
			par3List.add("When equiped grants the ability");
			par3List.add("Of Not Being affected by the withering effect");
		}
		if (iS.getItemDamage() == 9) {
			par3List.add("When equiped grants the ability");
			par3List.add("Of Having A beard like Icys");
		}
		if (iS.getItemDamage() == 10) {
			par3List.add("When equiped grants the ability");
			par3List.add("Of Taking No Fall Damage");
		}

	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage() == 8
				& !player.isPotionActive(Potion.wither)) {
			player.removePotionEffect(Potion.wither.id);
		}
	}

	@Override
	// Tells What Potion Effect to return
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (itemstack.getItemDamage() == 1
				&& !player.isPotionActive(Potion.fireResistance)) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
					Integer.MAX_VALUE, 1, true));
		    }
			if (itemstack.getItemDamage() == 2
					&& !player.isPotionActive(Potion.jump)) {
				player.addPotionEffect(new PotionEffect(Potion.jump.id, Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 3
					&& !player.isPotionActive(Potion.digSpeed)) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 4
					&& !player.isPotionActive(Potion.moveSpeed)) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 5
					&& !player.isPotionActive(Potion.waterBreathing)) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,
						Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 6
					&& !player.isPotionActive(Potion.nightVision)) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 7
					&& !player.isPotionActive(Potion.invisibility)) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, Integer.MAX_VALUE, 1, true));
			}
			if (itemstack.getItemDamage() == 8
					& !player.isPotionActive(Potion.wither)) {
				player.removePotionEffect(Potion.wither.id);
			}
			if (itemstack.getItemDamage() == 9
					&& !player.isPotionActive(Potion.waterBreathing)) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, Integer.MAX_VALUE, 1, true));
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, Integer.MAX_VALUE, 1, true));
			}
		}
	

	@Override
	// Removes Potion effect on Unequip 
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage() == 1)
		 player.removePotionEffect(Potion.fireResistance.id);
		if (itemstack.getItemDamage() == 2)
        player.removePotionEffect(Potion.jump.id);
		if (itemstack.getItemDamage() == 3)
     	player.removePotionEffect(Potion.digSpeed.id);
		if (itemstack.getItemDamage() == 4)
		player.removePotionEffect(Potion.moveSpeed.id);
		if (itemstack.getItemDamage() == 5)
		player.removePotionEffect(Potion.waterBreathing.id);
		if (itemstack.getItemDamage() == 6)
		player.removePotionEffect(Potion.nightVision.id);
		if (itemstack.getItemDamage() == 7)
		player.removePotionEffect(Potion.invisibility.id);
		if (itemstack.getItemDamage() == 9)
			player.removePotionEffect(Potion.waterBreathing.id);
		    player.removePotionEffect(Potion.nightVision.id);
	}

	@Override
	// Player can Equip Talismans
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	// Player can UnEquip Talismans
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

}
