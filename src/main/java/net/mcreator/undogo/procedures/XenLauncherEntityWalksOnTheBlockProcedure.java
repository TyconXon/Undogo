package net.mcreator.undogo.procedures;

import net.minecraft.world.entity.Entity;

public class XenLauncherEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(0, 2, 0);
	}
}
