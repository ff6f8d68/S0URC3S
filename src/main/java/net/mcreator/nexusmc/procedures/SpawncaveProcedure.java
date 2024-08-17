package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.nexusmc.init.NexusModEntities;
import net.mcreator.nexusmc.entity.EyesinthedarknessEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawncaveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean isentitynear = false;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 0) {
			if (!(!world.getEntitiesOfClass(EyesinthedarknessEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty())) {
				if (Mth.nextInt(RandomSource.create(), 1, 1000) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = NexusModEntities.EYESINTHEDARKNESS.get().spawn(_level, BlockPos.containing(x + 10, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		}
	}
}
