
package net.mcreator.undogo.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.undogo.procedures.SpaceFluidMobplayerCollidesBlockProcedure;
import net.mcreator.undogo.init.UndogoModFluids;

public class SpaceFluidBlock extends LiquidBlock {
	public SpaceFluidBlock() {
		super(UndogoModFluids.SPACE_FLUID, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.TERRACOTTA_PURPLE).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5));
		setRegistryName("space_fluid");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SpaceFluidMobplayerCollidesBlockProcedure.execute(entity);
	}
}
