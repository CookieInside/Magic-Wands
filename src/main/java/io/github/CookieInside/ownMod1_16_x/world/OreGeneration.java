package io.github.CookieInside.ownMod1_16_x.world;


import io.github.CookieInside.ownMod1_16_x.core.init.Blockinit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
public class OreGeneration {
	
	static int normMaxY = 40;
	static int normMinY = 20;
	static int normSize = 3;
	static int normAmou = 10;

	public static void generateOres(final BiomeLoadingEvent event) {
		if(event.getCategory().equals(Biome.Category.DESERT)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blockinit.DESERT_ORE.get().getDefaultState(), normSize, normMinY, normMaxY, normAmou);
		}
		
		if(event.getCategory().equals(Biome.Category.NETHER)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, Blockinit.FIRE_ORE.get().getDefaultState(), normSize, 1, 100, normAmou);
		}
		
		if(event.getCategory().equals(Biome.Category.ICY)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blockinit.ICE_ORE.get().getDefaultState(), normSize, normMinY, normMaxY, normAmou);
		}
		
		if(event.getCategory().equals(Biome.Category.JUNGLE)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blockinit.JUNGLE_ORE.get().getDefaultState(), normSize, normMinY, normMaxY, normAmou);
		}
		
		if(event.getCategory().equals(Biome.Category.OCEAN)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blockinit.AQUA_ORE.get().getDefaultState(), normSize, normMinY, normMaxY, normAmou);
		}
	
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure((new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().func_242731_b(amount)));
	}
}
