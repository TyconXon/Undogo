
package net.mcreator.undogo.world.features.lakes;

import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.undogo.init.UndogoModBlocks;

import java.util.Set;

public class SpaceFluidFeature extends LakeFeature {
	public static final SpaceFluidFeature FEATURE = (SpaceFluidFeature) new SpaceFluidFeature().setRegistryName("undogo:space_fluid");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new BlockStateConfiguration(UndogoModBlocks.SPACE_FLUID.defaultBlockState()))
			.rangeUniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0)).squared().rarity(5);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SpaceFluidFeature() {
		super(BlockStateConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("undogo:xen")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
