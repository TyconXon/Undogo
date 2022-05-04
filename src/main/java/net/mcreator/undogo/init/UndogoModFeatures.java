
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.undogo.world.features.plants.XenPlantLightFeature;
import net.mcreator.undogo.world.features.plants.XenHairFeature;
import net.mcreator.undogo.world.features.ores.XeniumFeature;
import net.mcreator.undogo.world.features.ores.XeniumBlockFeature;
import net.mcreator.undogo.world.features.lakes.ToxicWaterFeature;
import net.mcreator.undogo.world.features.lakes.SpaceFluidFeature;
import net.mcreator.undogo.world.features.lakes.OilFeature;
import net.mcreator.undogo.world.features.lakes.HealFeature;
import net.mcreator.undogo.world.features.XenSpireStructFeature;
import net.mcreator.undogo.world.features.XenSpireStruct2Feature;
import net.mcreator.undogo.world.features.XenPitFeature;
import net.mcreator.undogo.world.features.XenPit9Feature;
import net.mcreator.undogo.world.features.XenPit8Feature;
import net.mcreator.undogo.world.features.XenPit7Feature;
import net.mcreator.undogo.world.features.XenPit6Feature;
import net.mcreator.undogo.world.features.XenPit5Feature;
import net.mcreator.undogo.world.features.XenPit4Feature;
import net.mcreator.undogo.world.features.XenPit3Feature;
import net.mcreator.undogo.world.features.XenPit2Feature;
import net.mcreator.undogo.world.features.XenPit11Feature;
import net.mcreator.undogo.world.features.XenPit10Feature;
import net.mcreator.undogo.world.features.XenFloatingIslandFeature;
import net.mcreator.undogo.world.features.XenFloatingIsland2Feature;
import net.mcreator.undogo.world.features.XenCrytalFormationFeature;
import net.mcreator.undogo.world.features.XenCrystalFormation2Feature;
import net.mcreator.undogo.world.features.XenBigIslandFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(SpaceFluidFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, SpaceFluidFeature.GENERATE_BIOMES, SpaceFluidFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OilFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, OilFeature.GENERATE_BIOMES, OilFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicWaterFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, ToxicWaterFeature.GENERATE_BIOMES, ToxicWaterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HealFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, HealFeature.GENERATE_BIOMES, HealFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XeniumFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, XeniumFeature.GENERATE_BIOMES, XeniumFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XeniumBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				XeniumBlockFeature.GENERATE_BIOMES, XeniumBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenHairFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, XenHairFeature.GENERATE_BIOMES,
				XenHairFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPlantLightFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				XenPlantLightFeature.GENERATE_BIOMES, XenPlantLightFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenCrytalFormationFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				XenCrytalFormationFeature.GENERATE_BIOMES, XenCrytalFormationFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenCrystalFormation2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				XenCrystalFormation2Feature.GENERATE_BIOMES, XenCrystalFormation2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenSpireStructFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				XenSpireStructFeature.GENERATE_BIOMES, XenSpireStructFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenSpireStruct2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				XenSpireStruct2Feature.GENERATE_BIOMES, XenSpireStruct2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenFloatingIslandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION,
				XenFloatingIslandFeature.GENERATE_BIOMES, XenFloatingIslandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenFloatingIsland2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION,
				XenFloatingIsland2Feature.GENERATE_BIOMES, XenFloatingIsland2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPitFeature.GENERATE_BIOMES,
				XenPitFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit2Feature.GENERATE_BIOMES,
				XenPit2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit3Feature.GENERATE_BIOMES,
				XenPit3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit4Feature.GENERATE_BIOMES,
				XenPit4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit5Feature.GENERATE_BIOMES,
				XenPit5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit6Feature.GENERATE_BIOMES,
				XenPit6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit7Feature.GENERATE_BIOMES,
				XenPit7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit8Feature.GENERATE_BIOMES,
				XenPit8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit9Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, XenPit9Feature.GENERATE_BIOMES,
				XenPit9Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit10Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				XenPit10Feature.GENERATE_BIOMES, XenPit10Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenPit11Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				XenPit11Feature.GENERATE_BIOMES, XenPit11Feature.CONFIGURED_FEATURE));
		REGISTRY.put(XenBigIslandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION,
				XenBigIslandFeature.GENERATE_BIOMES, XenBigIslandFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
