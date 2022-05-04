
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.undogo.world.inventory.SpamtonShopMenu;
import net.mcreator.undogo.world.inventory.DrinkMixerMenu;
import net.mcreator.undogo.world.inventory.AdMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<AdMenu> AD = register("ad", (id, inv, extraData) -> new AdMenu(id, inv, extraData));
	public static final MenuType<SpamtonShopMenu> SPAMTON_SHOP = register("spamton_shop",
			(id, inv, extraData) -> new SpamtonShopMenu(id, inv, extraData));
	public static final MenuType<DrinkMixerMenu> DRINK_MIXER = register("drink_mixer",
			(id, inv, extraData) -> new DrinkMixerMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
