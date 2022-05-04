
package net.mcreator.undogo.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.undogo.init.UndogoModItems;
import net.mcreator.undogo.init.UndogoModFluids;
import net.mcreator.undogo.init.UndogoModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UndogoModFluids.OIL,
			() -> UndogoModFluids.FLOWING_OIL,
			FluidAttributes.builder(new ResourceLocation("undogo:blocks/oil"), new ResourceLocation("undogo:blocks/oilmove"))

					.viscosity(1500)

	).explosionResistance(100f)

			.bucket(() -> UndogoModItems.OIL_BUCKET).block(() -> (LiquidBlock) UndogoModBlocks.OIL);

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public Source() {
			super();
			setRegistryName("oil");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_oil");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
