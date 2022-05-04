
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(48, 48).setRegistryName("spamton_paint"));
		event.getRegistry().register(new Motive(33, 48).setRegistryName("spamton_painting"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("spamton_painted"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("hl_3"));
		event.getRegistry().register(new Motive(48, 32).setRegistryName("bms"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("jake"));
		event.getRegistry().register(new Motive(128, 128).setRegistryName("sign"));
	}
}
