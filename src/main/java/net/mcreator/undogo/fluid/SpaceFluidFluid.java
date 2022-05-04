
package net.mcreator.undogo.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.undogo.init.UndogoModItems;
import net.mcreator.undogo.init.UndogoModFluids;
import net.mcreator.undogo.init.UndogoModBlocks;

public abstract class SpaceFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UndogoModFluids.SPACE_FLUID,
			() -> UndogoModFluids.FLOWING_SPACE_FLUID,
			FluidAttributes.builder(new ResourceLocation("undogo:blocks/spacefluid"), new ResourceLocation("undogo:blocks/spacefluid"))

					.density(500).viscosity(500)

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse"))))
							.explosionResistance(100f).canMultiply()

							.bucket(() -> UndogoModItems.SPACE_FLUID_BUCKET).block(() -> (LiquidBlock) UndogoModBlocks.SPACE_FLUID);

	private SpaceFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRAGON_BREATH;
	}

	public static class Source extends SpaceFluidFluid {
		public Source() {
			super();
			setRegistryName("space_fluid");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SpaceFluidFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_space_fluid");
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
