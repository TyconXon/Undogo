
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.undogo.block.XenstoneBlock;
import net.mcreator.undogo.block.XeniumBlockBlock;
import net.mcreator.undogo.block.XeniumBlock;
import net.mcreator.undogo.block.XenSpireBlock;
import net.mcreator.undogo.block.XenPortalBlock;
import net.mcreator.undogo.block.XenPlantLightBlock;
import net.mcreator.undogo.block.XenLauncherBlock;
import net.mcreator.undogo.block.XenHairBlock;
import net.mcreator.undogo.block.WoodenCrateBlock;
import net.mcreator.undogo.block.ToxicWaterBlock;
import net.mcreator.undogo.block.TangledHairBlock;
import net.mcreator.undogo.block.SpaceFluidBlock;
import net.mcreator.undogo.block.QReflectorBlock;
import net.mcreator.undogo.block.OilBlock;
import net.mcreator.undogo.block.HealBlock;
import net.mcreator.undogo.block.ForcefeildBlock;
import net.mcreator.undogo.block.FallingMineBlock;
import net.mcreator.undogo.block.ExtractorBlock;
import net.mcreator.undogo.block.ExplosiveBarrelBlock;
import net.mcreator.undogo.block.CausticOpticsPortalBlock;
import net.mcreator.undogo.block.ArrowRepelentBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block SPACE_FLUID = register(new SpaceFluidBlock());
	public static final Block OIL = register(new OilBlock());
	public static final Block TOXIC_WATER = register(new ToxicWaterBlock());
	public static final Block HEAL = register(new HealBlock());
	public static final Block Q_REFLECTOR = register(new QReflectorBlock());
	public static final Block FORCEFEILD = register(new ForcefeildBlock());
	public static final Block FALLING_MINE = register(new FallingMineBlock());
	public static final Block ARROW_REPELENT = register(new ArrowRepelentBlock());
	public static final Block XEN_PORTAL = register(new XenPortalBlock());
	public static final Block XEN_SPIRE = register(new XenSpireBlock());
	public static final Block XENIUM = register(new XeniumBlock());
	public static final Block XENSTONE = register(new XenstoneBlock());
	public static final Block XENIUM_BLOCK = register(new XeniumBlockBlock());
	public static final Block XEN_LAUNCHER = register(new XenLauncherBlock());
	public static final Block XEN_HAIR = register(new XenHairBlock());
	public static final Block XEN_PLANT_LIGHT = register(new XenPlantLightBlock());
	public static final Block TANGLED_HAIR = register(new TangledHairBlock());
	public static final Block EXPLOSIVE_BARREL = register(new ExplosiveBarrelBlock());
	public static final Block WOODEN_CRATE = register(new WoodenCrateBlock());
	public static final Block EXTRACTOR = register(new ExtractorBlock());
	public static final Block CAUSTIC_OPTICS_PORTAL = register(new CausticOpticsPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ForcefeildBlock.registerRenderLayer();
			XenHairBlock.registerRenderLayer();
			XenPlantLightBlock.registerRenderLayer();
			TangledHairBlock.registerRenderLayer();
		}
	}
}
