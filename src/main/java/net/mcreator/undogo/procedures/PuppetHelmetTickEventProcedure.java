package net.mcreator.undogo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class PuppetHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 2, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.REGENERATION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HEALTH_BOOST);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HEAL);
	}
}
