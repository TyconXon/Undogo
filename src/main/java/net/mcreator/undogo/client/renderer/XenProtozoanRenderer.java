package net.mcreator.undogo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.undogo.entity.XenProtozoanEntity;
import net.mcreator.undogo.client.model.ModelProtozoan;

public class XenProtozoanRenderer extends MobRenderer<XenProtozoanEntity, ModelProtozoan<XenProtozoanEntity>> {
	public XenProtozoanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelProtozoan(context.bakeLayer(ModelProtozoan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XenProtozoanEntity entity) {
		return new ResourceLocation("undogo:textures/ref.png");
	}
}
