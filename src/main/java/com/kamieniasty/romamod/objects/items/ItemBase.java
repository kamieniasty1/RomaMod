package com.kamieniasty.romamod.objects.items;

import com.kamieniasty.romamod.RomaMod;
import com.kamieniasty.romamod.init.ItemInit;
import com.kamieniasty.romamod.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RomaMod.ROMAMODTAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		RomaMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
