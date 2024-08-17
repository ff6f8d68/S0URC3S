
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.entity.NexusriftEntity;
import net.mcreator.nexusmc.entity.NEXUSsusEntity;
import net.mcreator.nexusmc.entity.EyesinthedarknessEntity;
import net.mcreator.nexusmc.entity.CorruptedplayerentityEntity;
import net.mcreator.nexusmc.NexusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NexusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, NexusMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<NexusriftEntity>> NEXUSRIFT = register("nexusrift",
			EntityType.Builder.<NexusriftEntity>of(NexusriftEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EyesinthedarknessEntity>> EYESINTHEDARKNESS = register("eyesinthedarkness",
			EntityType.Builder.<EyesinthedarknessEntity>of(EyesinthedarknessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorruptedplayerentityEntity>> CORRUPTEDPLAYERENTITY = register("corruptedplayerentity",
			EntityType.Builder.<CorruptedplayerentityEntity>of(CorruptedplayerentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NEXUSsusEntity>> NEXU_SSUS = register("nexu_ssus",
			EntityType.Builder.<NEXUSsusEntity>of(NEXUSsusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NexusriftEntity.init();
			EyesinthedarknessEntity.init();
			CorruptedplayerentityEntity.init();
			NEXUSsusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NEXUSRIFT.get(), NexusriftEntity.createAttributes().build());
		event.put(EYESINTHEDARKNESS.get(), EyesinthedarknessEntity.createAttributes().build());
		event.put(CORRUPTEDPLAYERENTITY.get(), CorruptedplayerentityEntity.createAttributes().build());
		event.put(NEXU_SSUS.get(), NEXUSsusEntity.createAttributes().build());
	}
}
