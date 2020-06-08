package ru.uncledrema.additionalitems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Bandage extends HealItem {
	
	public Bandage()
	{
		super(3);
	}

	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
	{
		//player.addPotionEffect(new PotionEffect(10,40,0));
		player.heal(2F);
		super.onEaten(stack, world, player);
		return stack;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		// TODO Auto-generated method stub
		return 30;
	}

}