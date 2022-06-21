package io.github.CookieInside.ownMod1_16_x.core.init;

import io.github.CookieInside.ownMod1_16_x.OwnMod1_16_x;
import io.github.CookieInside.ownMod1_16_x.common.items.DefenseWand;
import io.github.CookieInside.ownMod1_16_x.common.items.LightningWand;
import io.github.CookieInside.ownMod1_16_x.common.items.PotionWand;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Iteminit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OwnMod1_16_x.MOD_ID);
	
	
	public static final RegistryObject<Item> DESERT_GEM = ITEMS.register("desert_gem", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> FIRE_GEM = ITEMS.register("fire_gem", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> ICE_GEM = ITEMS.register("ice_gem", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> MAGIC_ORB = ITEMS.register("magic_orb", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> JUNGLE_GEM = ITEMS.register("jungle_gem", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> AQUA_GEM = ITEMS.register("aqua_gem", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<LightningWand> LIGHTNING_WAND = ITEMS.register("lightning_wand", () -> new LightningWand(new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<PotionWand> POTION_WAND = ITEMS.register("potion_wand", () -> new PotionWand(new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<DefenseWand> DEFENSE_WAND = ITEMS.register("defense_wand", () -> new DefenseWand(new Item.Properties().group(ItemGroup.COMBAT)));
	
	
	public static final RegistryObject<BlockItem> DESERT_ORE = ITEMS.register("desert_ore", () -> new BlockItem(Blockinit.DESERT_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> FIRE_ORE = ITEMS.register("fire_ore", () -> new BlockItem(Blockinit.FIRE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ICE_ORE = ITEMS.register("ice_ore", () -> new BlockItem(Blockinit.ICE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> JUNGLE_ORE = ITEMS.register("jungle_ore", () -> new BlockItem(Blockinit.JUNGLE_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> AQUA_ORE = ITEMS.register("aqua_ore", () -> new BlockItem(Blockinit.AQUA_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
