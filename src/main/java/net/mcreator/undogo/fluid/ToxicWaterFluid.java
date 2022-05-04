
package net.mcreator.undogo.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.undogo.init.UndogoModItems;
import net.mcreator.undogo.init.UndogoModFluids;
import net.mcreator.undogo.init.UndogoModBlocks;

public abstract class ToxicWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UndogoModFluids.TOXIC_WATER,
			() -> UndogoModFluids.FLOWING_TOXIC_WATER,
			FluidAttributes.builder(new ResourceLocation("undogo:blocks/toxicwater"), new ResourceLocation("undogo:blocks/toxicwater"))

	).explosionResistance(100f).canMultiply()

			.bucket(() -> UndogoModItems.TOXIC_WATER_BUCKET).block(() -> (LiquidBlock) UndogoModBlocks.TOXIC_WATER);

	private ToxicWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SPORE_BLOSSOM_AIR;
	}

	public static class Source extends ToxicWaterFluid {
		public Source() {
			super();
			setRegistryName("toxic_water");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxicWaterFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_toxic_water");
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
