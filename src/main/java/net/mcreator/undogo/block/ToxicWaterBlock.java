
package net.mcreator.undogo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.undogo.procedures.ToxicWaterUpdateTickProcedure;
import net.mcreator.undogo.procedures.ToxicWaterMobplayerCollidesBlockProcedure;
import net.mcreator.undogo.init.UndogoModFluids;

import java.util.Random;

public class ToxicWaterBlock extends LiquidBlock {
	public ToxicWaterBlock() {
		super(UndogoModFluids.TOXIC_WATER, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("toxic_water");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.getBlockTicks().scheduleTick(pos, this, 10);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		ToxicWaterUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		world.getBlockTicks().scheduleTick(pos, this, 10);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		ToxicWaterMobplayerCollidesBlockProcedure.execute(entity);
	}
}
