
package net.mcreator.undogo.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.undogo.init.UndogoModItems;
import net.mcreator.undogo.init.UndogoModFluids;
import net.mcreator.undogo.init.UndogoModBlocks;

public abstract class HealFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UndogoModFluids.HEAL,
			() -> UndogoModFluids.FLOWING_HEAL,
			FluidAttributes.builder(new ResourceLocation("undogo:blocks/xenwater1"), new ResourceLocation("undogo:blocks/xenwater1")).luminosity(5)
					.density(996).viscosity(600)

	).explosionResistance(100f).canMultiply().tickRate(8)

			.slopeFindDistance(8).bucket(() -> UndogoModItems.HEAL_BUCKET).block(() -> (LiquidBlock) UndogoModBlocks.HEAL);

	private HealFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.HEART;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-1);
	}

	public static class Source extends HealFluid {
		public Source() {
			super();
			setRegistryName("heal");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HealFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_heal");
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
