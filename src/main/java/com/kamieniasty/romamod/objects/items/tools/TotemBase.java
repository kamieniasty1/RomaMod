/**package com.kamieniasty.romamod.objects.items.tools;

import com.kamieniasty.romamod.RomaMod;
import com.kamieniasty.romamod.init.ItemInit;

import net.minecraft.entity.EntityLivingBase;

public class TotemBase extends EntityLivingBase {
	public TotemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RomaMod.ROMAMODTAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		RomaMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}*/