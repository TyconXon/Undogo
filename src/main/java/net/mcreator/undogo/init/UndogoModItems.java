
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.undogo.item.XenOrangeItem;
import net.mcreator.undogo.item.XenItem;
import net.mcreator.undogo.item.ToxicWaterItem;
import net.mcreator.undogo.item.SpaceFluidItem;
import net.mcreator.undogo.item.SodaItem;
import net.mcreator.undogo.item.PuppetItem;
import net.mcreator.undogo.item.PlasticItem;
import net.mcreator.undogo.item.OilItem;
import net.mcreator.undogo.item.MetalScrapItem;
import net.mcreator.undogo.item.LongFallItem;
import net.mcreator.undogo.item.HealItem;
import net.mcreator.undogo.item.HazmatArmorItem;
import net.mcreator.undogo.item.GenericAttackItem;
import net.mcreator.undogo.item.FriedXairItem;
import net.mcreator.undogo.item.DirtyWaterItem;
import net.mcreator.undogo.item.DealmakerItem;
import net.mcreator.undogo.item.DealItem;
import net.mcreator.undogo.item.BigShotItem;
import net.mcreator.undogo.item.BabaRecordItem;
import net.mcreator.undogo.item.AntiRadItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SPACE_FLUID_BUCKET = register(new SpaceFluidItem());
	public static final Item OIL_BUCKET = register(new OilItem());
	public static final Item TOXIC_WATER_BUCKET = register(new ToxicWaterItem());
	public static final Item HEAL_BUCKET = register(new HealItem());
	public static final Item SPAMTON_G_SPAMTON = register(
			new SpawnEggItem(UndogoModEntities.SPAMTON_G_SPAMTON, -39169, -205, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("spamton_g_spamton_spawn_egg"));
	public static final Item XEN_PROTOZOAN = register(
			new SpawnEggItem(UndogoModEntities.XEN_PROTOZOAN, -16763956, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("xen_protozoan_spawn_egg"));
	public static final Item BIG_SHOT = register(new BigShotItem());
	public static final Item BABA_RECORD = register(new BabaRecordItem());
	public static final Item DEAL = register(new DealItem());
	public static final Item Q_REFLECTOR = register(UndogoModBlocks.Q_REFLECTOR, CreativeModeTab.TAB_REDSTONE);
	public static final Item FORCEFEILD = register(UndogoModBlocks.FORCEFEILD, CreativeModeTab.TAB_REDSTONE);
	public static final Item FALLING_MINE = register(UndogoModBlocks.FALLING_MINE, CreativeModeTab.TAB_REDSTONE);
	public static final Item ARROW_REPELENT = register(UndogoModBlocks.ARROW_REPELENT, CreativeModeTab.TAB_REDSTONE);
	public static final Item XEN = register(new XenItem());
	public static final Item XEN_SPIRE = register(UndogoModBlocks.XEN_SPIRE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item XENIUM = register(UndogoModBlocks.XENIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item XENSTONE = register(UndogoModBlocks.XENSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item XENIUM_BLOCK = register(UndogoModBlocks.XENIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item XEN_LAUNCHER = register(UndogoModBlocks.XEN_LAUNCHER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SODA = register(new SodaItem());
	public static final Item XEN_ORANGE = register(new XenOrangeItem());
	public static final Item FRIED_XAIR = register(new FriedXairItem());
	public static final Item DIRTY_WATER = register(new DirtyWaterItem());
	public static final Item ANTI_RAD = register(new AntiRadItem());
	public static final Item XEN_HAIR = register(UndogoModBlocks.XEN_HAIR, CreativeModeTab.TAB_DECORATIONS);
	public static final Item XEN_PLANT_LIGHT = register(UndogoModBlocks.XEN_PLANT_LIGHT, CreativeModeTab.TAB_DECORATIONS);
	public static final Item TANGLED_HAIR = register(UndogoModBlocks.TANGLED_HAIR, CreativeModeTab.TAB_DECORATIONS);
	public static final Item EXPLOSIVE_BARREL = register(UndogoModBlocks.EXPLOSIVE_BARREL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item LONG_FALL_BOOTS = register(new LongFallItem.Boots());
	public static final Item GENERIC_ATTACK = register(new GenericAttackItem());
	public static final Item PUPPET_HELMET = register(new PuppetItem.Helmet());
	public static final Item DEALMAKER_HELMET = register(new DealmakerItem.Helmet());
	public static final Item HAZMAT_ARMOR_HELMET = register(new HazmatArmorItem.Helmet());
	public static final Item HAZMAT_ARMOR_CHESTPLATE = register(new HazmatArmorItem.Chestplate());
	public static final Item HAZMAT_ARMOR_LEGGINGS = register(new HazmatArmorItem.Leggings());
	public static final Item HAZMAT_ARMOR_BOOTS = register(new HazmatArmorItem.Boots());
	public static final Item METAL_SCRAP = register(new MetalScrapItem());
	public static final Item PLASTIC = register(new PlasticItem());
	public static final Item WOODEN_CRATE = register(UndogoModBlocks.WOODEN_CRATE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item EXTRACTOR = register(UndogoModBlocks.EXTRACTOR, CreativeModeTab.TAB_DECORATIONS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
