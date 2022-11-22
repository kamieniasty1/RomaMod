package com.kamieniasty.romamod.objects.items.armor;

import com.kamieniasty.romamod.RomaMod;
import com.kamieniasty.romamod.init.ItemInit;
import com.kamieniasty.romamod.util.interfaces.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
	
	
	public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
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
