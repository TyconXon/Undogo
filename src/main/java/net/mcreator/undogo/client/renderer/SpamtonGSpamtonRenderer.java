package net.mcreator.undogo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.undogo.entity.SpamtonGSpamtonEntity;

public class SpamtonGSpamtonRenderer extends MobRenderer<SpamtonGSpamtonEntity, VillagerModel<SpamtonGSpamtonEntity>> {
	public SpamtonGSpamtonRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpamtonGSpamtonEntity entity) {
		return new ResourceLocation("undogo:textures/villager.png");
	}
}
