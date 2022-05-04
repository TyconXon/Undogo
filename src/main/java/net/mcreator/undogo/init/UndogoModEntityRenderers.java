
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.undogo.client.renderer.XenProtozoanRenderer;
import net.mcreator.undogo.client.renderer.SpamtonGSpamtonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UndogoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UndogoModEntities.SPAMTON_G_SPAMTON, SpamtonGSpamtonRenderer::new);
		event.registerEntityRenderer(UndogoModEntities.XEN_PROTOZOAN, XenProtozoanRenderer::new);
		event.registerEntityRenderer(UndogoModEntities.GENERIC_ATTACK, ThrownItemRenderer::new);
	}
}
