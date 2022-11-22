package com.kamieniasty.romamod.tabs;

import com.kamieniasty.romamod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RomaTab extends CreativeTabs
{

	public RomaTab(String label) 
	{
		super("romamodtab");
		this.setBackgroundImageName("romamod.png");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.FINE_GLADIUS);
	}
}
