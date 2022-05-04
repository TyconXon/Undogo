package net.mcreator.undogo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.undogo.init.UndogoModMobEffects;

public class ToxicWaterMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!WearingFullHazmatProcedure.execute(entity)) {
			entity.hurt(DamageSource.DRAGON_BREATH, 1);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(UndogoModMobEffects.RADIATION, 999, 1, (false), (false)));
		}
	}
}
