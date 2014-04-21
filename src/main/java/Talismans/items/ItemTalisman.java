package Talismans.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import Talismans.Talismans;
import baubles.api.BaubleType;
import baubles.api.IBauble;

public class ItemTalisman extends Item implements IBauble {
	
	public static final String[] types = new String[] {"Dragon", "Rabbit", "Bull", "Horse"};
	private IIcon[] textures;

	public ItemTalisman(){
		super();
		setHasSubtypes(true);
		this.setCreativeTab(Talismans.tabsTalismans);
		this.setUnlocalizedName("Itemtalisman Talisman");
		maxStackSize = 1;	
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[types.length];

		for (int i = 0; i < types.length; ++i) {
			textures[i] = iconRegister.registerIcon("talismans:"+types[i]);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if (meta < 0 || meta >= textures.length) {
			meta = 0;
		}

		return textures[meta];
	}
		
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}
	
	   public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
		{
			for (int meta = 0; meta < types.length; ++meta) 
			{
				list.add(new ItemStack(item, 1, meta));
			}
		}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0 && !player.isPotionActive(Potion.fireResistance)){
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,40,0));
		}
		if (itemstack.getItemDamage()==1 && !player.isPotionActive(Potion.jump)){
			player.addPotionEffect(new PotionEffect(Potion.jump.id,40,0));
		}
		if (itemstack.getItemDamage()==2 && !player.isPotionActive(Potion.digSpeed)){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,40,0));
		}
		if (itemstack.getItemDamage()==3 && !player.isPotionActive(Potion.moveSpeed)){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,40,0));
		}
    }

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

}
