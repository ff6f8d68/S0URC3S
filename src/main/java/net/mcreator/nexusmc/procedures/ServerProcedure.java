package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.nexusmc.world.inventory.RSHMenu;
import net.mcreator.nexusmc.NexusMod;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@Mod.EventBusSubscriber
public class ServerProcedure {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xx = 0;
		double zz = 0;
		double rad = 0;
		double num = 0;
		double xxx = 0;
		double yyy = 0;
		double zzz = 0;
		Entity cmarker = null;
		String archname = "";
		xx = entity.getX();
		zz = entity.getZ();
		if (!world.isClientSide()) {
			if (entity instanceof ServerPlayer) {
				NexusMod.LOGGER.info(("redirecting you to the hub this can take upto " + 100 / 20 + " seconds"));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("redirecting you to the hub this can take upto " + 100 / 20 + " seconds")), false);
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					_ent.openMenu(new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("RSH");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new RSHMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				NexusMod.queueServerWork(100, () -> {
					if (entity instanceof Player _player)
						_player.closeContainer();
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("nexus:nexusconnecthub"));
						if (_player.level().dimension() == destinationType)
							return;
						ServerLevel nextLevel = _player.server.getLevel(destinationType);
						if (nextLevel != null) {
							_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
							_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
							_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
							for (MobEffectInstance _effectinstance : _player.getActiveEffects())
								_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
							_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
						}
					}
				});
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					archname = "\u00A7cbuilder";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					archname = "\u00A7cshaper";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					archname = "\u00A7cforger";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					archname = "\u00A7csculptor";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					archname = "\u00A79building";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					archname = "\u00A79shaping";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					archname = "\u00A79forging";
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					archname = "\u00A79sculpting";
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7f<NEXUS> this is now your tower and <" + archname + "\u00A7f> is now your manager click on the coordinates below to teleprt to your tower")),
							false);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @p run locate structure nexus:smalltower");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(0, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0)), 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
									.withSuppressedOutput(),
							"place structure nexus:core");
			}
		}
	}
}
