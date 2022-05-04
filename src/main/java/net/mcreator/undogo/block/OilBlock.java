
package net.mcreator.undogo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.undogo.init.UndogoModFluids;

public class OilBlock extends LiquidBlock {
	public OilBlock() {
		super(UndogoModFluids.OIL, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("oil");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
