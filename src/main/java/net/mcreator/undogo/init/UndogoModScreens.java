
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.undogo.client.gui.SpamtonShopScreen;
import net.mcreator.undogo.client.gui.ExtractorGUIScreen;
import net.mcreator.undogo.client.gui.DrinkMixerScreen;
import net.mcreator.undogo.client.gui.AdScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UndogoModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UndogoModMenus.AD, AdScreen::new);
			MenuScreens.register(UndogoModMenus.SPAMTON_SHOP, SpamtonShopScreen::new);
			MenuScreens.register(UndogoModMenus.DRINK_MIXER, DrinkMixerScreen::new);
			MenuScreens.register(UndogoModMenus.EXTRACTOR_GUI, ExtractorGUIScreen::new);
		});
	}
}
