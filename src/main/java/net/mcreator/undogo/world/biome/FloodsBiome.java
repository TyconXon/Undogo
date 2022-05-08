
package net.mcreator.undogo.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.undogo.init.UndogoModBiomes;
import net.mcreator.undogo.UndogoMod;

public class FloodsBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderBaseConfiguration(
			Blocks.SAND.defaultBlockState(), Blocks.GRAVEL.defaultBlockState(), Blocks.GRAVEL.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("entity.tropical_fish.ambient")), 0.0111D))
				.build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addStructureStart(StructureFeatures.STRONGHOLD);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT);
		biomeGenerationSettings.addStructureStart(StructureFeatures.MINESHAFT_MESA);
		biomeGenerationSettings.addStructureStart(StructureFeatures.OCEAN_RUIN_WARM);
		biomeGenerationSettings.addStructureStart(StructureFeatures.RUINED_PORTAL_OCEAN);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addOceanCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultSeagrass(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.TROPICAL_FISH, 20, 4, 4));
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COD, 20, 4, 4));
		mobSpawnInfo.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 20, 4, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.OCEAN).depth(-1.2000000000000002f)
				.scale(0.2f).temperature(0.5f).downfall(0.9f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(UndogoMod.MODID, "floods"), SURFACE_BUILDER);
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(UndogoModBiomes.FLOODS)),
				BiomeDictionary.Type.WATER);
	}
}
