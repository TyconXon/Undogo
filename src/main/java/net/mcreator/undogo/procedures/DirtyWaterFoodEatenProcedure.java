package net.mcreator.undogo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.undogo.init.UndogoModMobEffects;

public class DirtyWaterFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.DROWN, 3);
		if (Math.random() < 0.7) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(UndogoModMobEffects.RADIATION, 999, 1, (true), (true)));
		}
	}
}
