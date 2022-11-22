package com.kamieniasty.romamod.objects.items.tools;

import com.kamieniasty.romamod.RomaMod;
import com.kamieniasty.romamod.init.ItemInit;
import com.kamieniasty.romamod.tabs.RomaTab;
import com.kamieniasty.romamod.util.interfaces.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
		super(material);
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
