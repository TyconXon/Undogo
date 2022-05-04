
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("undogo", "gman_12"), new SoundEvent(new ResourceLocation("undogo", "gman_12")));
		REGISTRY.put(new ResourceLocation("undogo", "snd_spamton_laugh"), new SoundEvent(new ResourceLocation("undogo", "snd_spamton_laugh")));
		REGISTRY.put(new ResourceLocation("undogo", "snd_chargeshot_fire"), new SoundEvent(new ResourceLocation("undogo", "snd_chargeshot_fire")));
		REGISTRY.put(new ResourceLocation("undogo", "nowsyourchance"), new SoundEvent(new ResourceLocation("undogo", "nowsyourchance")));
		REGISTRY.put(new ResourceLocation("undogo", "spamton"), new SoundEvent(new ResourceLocation("undogo", "spamton")));
		REGISTRY.put(new ResourceLocation("undogo", "bigshot"), new SoundEvent(new ResourceLocation("undogo", "bigshot")));
		REGISTRY.put(new ResourceLocation("undogo", "castletown"), new SoundEvent(new ResourceLocation("undogo", "castletown")));
		REGISTRY.put(new ResourceLocation("undogo", "withyouinthedark_ch2"), new SoundEvent(new ResourceLocation("undogo", "withyouinthedark_ch2")));
		REGISTRY.put(new ResourceLocation("undogo", "legend"), new SoundEvent(new ResourceLocation("undogo", "legend")));
		REGISTRY.put(new ResourceLocation("undogo", "baba"), new SoundEvent(new ResourceLocation("undogo", "baba")));
		REGISTRY.put(new ResourceLocation("undogo", "babatheme"), new SoundEvent(new ResourceLocation("undogo", "babatheme")));
		REGISTRY.put(new ResourceLocation("undogo", "a"), new SoundEvent(new ResourceLocation("undogo", "a")));
		REGISTRY.put(new ResourceLocation("undogo", "snd_ominous"), new SoundEvent(new ResourceLocation("undogo", "snd_ominous")));
		REGISTRY.put(new ResourceLocation("undogo", "nil_thetruth"), new SoundEvent(new ResourceLocation("undogo", "nil_thetruth")));
		REGISTRY.put(new ResourceLocation("undogo", "nill_deceive"), new SoundEvent(new ResourceLocation("undogo", "nill_deceive")));
		REGISTRY.put(new ResourceLocation("undogo", "nil_thieves"), new SoundEvent(new ResourceLocation("undogo", "nil_thieves")));
		REGISTRY.put(new ResourceLocation("undogo", "nil_done"), new SoundEvent(new ResourceLocation("undogo", "nil_done")));
		REGISTRY.put(new ResourceLocation("undogo", "nil_die"), new SoundEvent(new ResourceLocation("undogo", "nil_die")));
		REGISTRY.put(new ResourceLocation("undogo", "nil_comes"), new SoundEvent(new ResourceLocation("undogo", "nil_comes")));
		REGISTRY.put(new ResourceLocation("undogo", "dimensionless_deepness"),
				new SoundEvent(new ResourceLocation("undogo", "dimensionless_deepness")));
		REGISTRY.put(new ResourceLocation("undogo", "boid_idle1"), new SoundEvent(new ResourceLocation("undogo", "boid_idle1")));
		REGISTRY.put(new ResourceLocation("undogo", "alien_zonerator"), new SoundEvent(new ResourceLocation("undogo", "alien_zonerator")));
		REGISTRY.put(new ResourceLocation("undogo", "alien_cycletone"), new SoundEvent(new ResourceLocation("undogo", "alien_cycletone")));
		REGISTRY.put(new ResourceLocation("undogo", "alien_wind2"), new SoundEvent(new ResourceLocation("undogo", "alien_wind2")));
		REGISTRY.put(new ResourceLocation("undogo", "alienvoices1"), new SoundEvent(new ResourceLocation("undogo", "alienvoices1")));
		REGISTRY.put(new ResourceLocation("undogo", "theme3"), new SoundEvent(new ResourceLocation("undogo", "theme3")));
		REGISTRY.put(new ResourceLocation("undogo", "ad_jingle"), new SoundEvent(new ResourceLocation("undogo", "ad_jingle")));
		REGISTRY.put(new ResourceLocation("undogo", "warning"), new SoundEvent(new ResourceLocation("undogo", "warning")));
		REGISTRY.put(new ResourceLocation("undogo", "barrel_impact_soft"), new SoundEvent(new ResourceLocation("undogo", "barrel_impact_soft")));
		REGISTRY.put(new ResourceLocation("undogo", "hard_barrel_impact"), new SoundEvent(new ResourceLocation("undogo", "hard_barrel_impact")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
