package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.nexusmc.init.NexusModMobEffects;
import net.mcreator.nexusmc.NexusMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NodeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(NexusModMobEffects.CORRUPTEDC.get())) {
			if (event instanceof ICancellableEvent _cancellable) {
				_cancellable.setCanceled(true);
			}
			entity.setInvisible(true);
			{
				Entity _ent = entity;
				_ent.teleportTo((x + Mth.nextDouble(RandomSource.create(), -5, 5)),
						(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + Mth.nextDouble(RandomSource.create(), -5, 5)), (int) (z + Mth.nextDouble(RandomSource.create(), -5, 5))) + 1),
						(z + Mth.nextDouble(RandomSource.create(), -5, 5)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + Mth.nextDouble(RandomSource.create(), -5, 5)),
							(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + Mth.nextDouble(RandomSource.create(), -5, 5)), (int) (z + Mth.nextDouble(RandomSource.create(), -5, 5))) + 1),
							(z + Mth.nextDouble(RandomSource.create(), -5, 5)), _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.enderman.teleport")), SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.enderman.teleport")), SoundSource.MASTER, 1, 1, false);
				}
			}
			if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ())));
			NexusMod.queueServerWork(20, () -> {
				entity.setInvisible(false);
			});
		}
	}
}
