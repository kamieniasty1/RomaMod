package com.kamieniasty.romamod.init;

import java.util.ArrayList;
import java.util.List;

import com.kamieniasty.romamod.objects.items.ItemBase;
import com.kamieniasty.romamod.objects.items.armor.ArmorBase;
import com.kamieniasty.romamod.objects.items.tools.ToolSword;
//import com.kamieniasty.romamod.objects.items.tools.TotemBase;
import com.kamieniasty.romamod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item IRON_STICK = new ItemBase("iron_stick");
	
	//Materials
	public static final ArmorMaterial ROMA_DIAMOND = EnumHelper.addArmorMaterial("diamond", Reference.MOD_ID + ":roma_diamond" , 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial ROMA_GOLD = EnumHelper.addArmorMaterial("gold", Reference.MOD_ID + ":roma_gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ROMA_IRON = EnumHelper.addArmorMaterial("iron", Reference.MOD_ID + ":roma_iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ROMA_CHAINMAIL = EnumHelper.addArmorMaterial("chainmail", Reference.MOD_ID + ":roma_chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ROMA_CLOTH = EnumHelper.addArmorMaterial("leather", Reference.MOD_ID + ":roma_cloth", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static final ToolMaterial TOOL_ROMA_DIAMOND = EnumHelper.addToolMaterial("tool_roma_diamond", 4, 1500, 5.0f, 3.5f, 19);
	public static final ToolMaterial TOOL_ROMA_GOLD = EnumHelper.addToolMaterial("tool_roma_gold", 0, 32, 12.0F, 0.0F, 22);
	public static final ToolMaterial TOOL_ROMA_IRON = EnumHelper.addToolMaterial("tool_roma_iron", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_ROMA_CHAIN = EnumHelper.addToolMaterial("tool_roma_chain", 1, 131, 4.0F, 1.0F, 5);
	public static final ToolMaterial TOOL_ROMA_CHAINMAIL = EnumHelper.addToolMaterial("tool_roma_chainmail", 1, 131, 4.0F, 1.0F, 5);
	public static final ToolMaterial TOOL_ROMA_WOOD = EnumHelper.addToolMaterial("tool_roma_wood", 0, 59, 2.0F, 0.0F, 15);
	
	//Armor
	public static final Item ROMA_DIAMOND_HELMET = new ArmorBase("roma_diamond_helmet", ROMA_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROMA_DIAMOND_CHESTPLATE = new ArmorBase("roma_diamond_chestplate", ROMA_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROMA_DIAMOND_LEGGINGS = new ArmorBase("roma_diamond_leggings", ROMA_DIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static final Item ROMA_DIAMOND_BOOTS = new ArmorBase("roma_diamond_boots", ROMA_DIAMOND, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ROMA_GOLD_HELMET = new ArmorBase("roma_gold_helmet", ROMA_GOLD, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROMA_GOLD_CHESTPLATE = new ArmorBase("roma_gold_chestplate", ROMA_GOLD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROMA_GOLD_LEGGINGS = new ArmorBase("roma_gold_leggings", ROMA_GOLD, 1, EntityEquipmentSlot.LEGS);
	public static final Item ROMA_GOLD_BOOTS = new ArmorBase("roma_gold_boots", ROMA_GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ROMA_IRON_HELMET = new ArmorBase("roma_iron_helmet", ROMA_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROMA_IRON_CHESTPLATE = new ArmorBase("roma_iron_chestplate", ROMA_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROMA_IRON_LEGGINGS = new ArmorBase("roma_iron_leggings", ROMA_IRON, 1, EntityEquipmentSlot.LEGS);
	public static final Item ROMA_IRON_BOOTS = new ArmorBase("roma_iron_boots", ROMA_IRON, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ROMA_CHAINMAIL_HELMET = new ArmorBase("roma_chainmail_helmet", ROMA_CHAINMAIL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROMA_CHAINMAIL_CHESTPLATE = new ArmorBase("roma_chainmail_chestplate", ROMA_CHAINMAIL, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROMA_CHAINMAIL_LEGGINGS = new ArmorBase("roma_chainmail_leggings", ROMA_CHAINMAIL, 1, EntityEquipmentSlot.LEGS);
	public static final Item ROMA_CHAINMAIL_BOOTS = new ArmorBase("roma_chainmail_boots", ROMA_CHAINMAIL, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ROMA_CLOTH_HELMET = new ArmorBase("roma_cloth_helmet", ROMA_CLOTH, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROMA_CLOTH_CHESTPLATE = new ArmorBase("roma_cloth_chestplate", ROMA_CLOTH, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROMA_CLOTH_LEGGINGS = new ArmorBase("roma_cloth_leggings", ROMA_CLOTH, 1, EntityEquipmentSlot.LEGS);
	
	//Tools
	public static final Item FINE_GLADIUS = new ToolSword("fine_gladius", TOOL_ROMA_DIAMOND);
	public static final Item WAR_AXE = new ToolSword("war_axe", TOOL_ROMA_DIAMOND);
	public static final Item LATENE_GOLD = new ToolSword("latene_gold", TOOL_ROMA_DIAMOND);
	public static final Item FALX = new ToolSword("falx", TOOL_ROMA_DIAMOND);
	public static final Item CAV_SPEAR = new ToolSword("cav_spear", TOOL_ROMA_DIAMOND);
	
	public static final Item AQUILA = new ToolSword("aquila", TOOL_ROMA_GOLD);
	public static final Item BOAR_STANDARD = new ToolSword("boar_standard", TOOL_ROMA_GOLD);
	public static final Item CELT_KNIFE = new ToolSword("celt_knife", TOOL_ROMA_GOLD);
	public static final Item DRACO = new ToolSword("draco", TOOL_ROMA_GOLD);
	public static final Item PUGIO = new ToolSword("pugio", TOOL_ROMA_GOLD);
	public static final Item SCEPTRE = new ToolSword("sceptre", TOOL_ROMA_GOLD);
	public static final Item SIGNUM = new ToolSword("signum", TOOL_ROMA_GOLD);
	public static final Item VEXILLUM = new ToolSword("vexillum", TOOL_ROMA_GOLD);
	
	public static final Item GERM_SWORD = new ToolSword("germ_sword", TOOL_ROMA_IRON);
	public static final Item IRON_HASTA = new ToolSword("iron_hasta", TOOL_ROMA_IRON);
	public static final Item IRON_LANCE = new ToolSword("iron_lance", TOOL_ROMA_IRON);
	public static final Item IRON_SPATHA = new ToolSword("iron_spatha", TOOL_ROMA_IRON);
	public static final Item LATENE_WOOD = new ToolSword("latene_wood", TOOL_ROMA_IRON);
	
	public static final Item CANE = new ToolSword("cane", TOOL_ROMA_WOOD);
	public static final Item WOOD_RUDIS = new ToolSword("wood_rudis", TOOL_ROMA_WOOD);
	
	
}
