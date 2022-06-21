package io.github.CookieInside.ownMod1_16_x.core.init;

import io.github.CookieInside.ownMod1_16_x.OwnMod1_16_x;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blockinit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OwnMod1_16_x.MOD_ID);
	
	public static final RegistryObject<Block> DESERT_ORE = BLOCKS.register("desert_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.EMERALD_ORE)));
	public static final RegistryObject<Block> FIRE_ORE = BLOCKS.register("fire_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.NETHER_QUARTZ_ORE)));
	public static final RegistryObject<Block> ICE_ORE = BLOCKS.register("ice_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.EMERALD_ORE)));
	public static final RegistryObject<Block> JUNGLE_ORE = BLOCKS.register("jungle_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.EMERALD_ORE)));
	public static final RegistryObject<Block> AQUA_ORE = BLOCKS.register("aqua_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.EMERALD_ORE)));
	
}
