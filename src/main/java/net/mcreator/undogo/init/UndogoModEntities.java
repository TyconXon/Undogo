
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undogo.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.undogo.entity.XenProtozoanEntity;
import net.mcreator.undogo.entity.SpamtonGSpamtonEntity;
import net.mcreator.undogo.entity.GenericAttackEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndogoModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SpamtonGSpamtonEntity> SPAMTON_G_SPAMTON = register("spamton_g_spamton",
			EntityType.Builder.<SpamtonGSpamtonEntity>of(SpamtonGSpamtonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpamtonGSpamtonEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final EntityType<XenProtozoanEntity> XEN_PROTOZOAN = register("xen_protozoan",
			EntityType.Builder.<XenProtozoanEntity>of(XenProtozoanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XenProtozoanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<GenericAttackEntity> GENERIC_ATTACK = register("entitybulletgeneric_attack",
			EntityType.Builder.<GenericAttackEntity>of(GenericAttackEntity::new, MobCategory.MISC).setCustomClientFactory(GenericAttackEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpamtonGSpamtonEntity.init();
			XenProtozoanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SPAMTON_G_SPAMTON, SpamtonGSpamtonEntity.createAttributes().build());
		event.put(XEN_PROTOZOAN, XenProtozoanEntity.createAttributes().build());
	}
}
