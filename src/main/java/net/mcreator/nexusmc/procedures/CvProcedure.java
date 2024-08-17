package net.mcreator.nexusmc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.nexusmc.network.NexusModVariables;

import java.util.HashMap;

public class CvProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		Direction dir = Direction.NORTH;
		double camids = 0;
		double tempx = 0;
		double tempy = 0;
		double tempz = 0;
		tempx = entity.getX();
		tempy = entity.getY();
		tempz = entity.getZ();
		camids = (int) new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:cid") ? ((EditBox) guistate.get("text:cid")).getValue() : "") - 1;
		{
			NexusModVariables.PlayerVariables _vars = entity.getData(NexusModVariables.PLAYER_VARIABLES);
			_vars.temp_camID = (int) new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:cid") ? ((EditBox) guistate.get("text:cid")).getValue() : "") - 1;
			_vars.syncPlayerVariables(entity);
		}
		dir = NexusModVariables.camdir.get((int) camids) instanceof Direction _d ? _d : Direction.UP;
		{
			Entity _ent = entity;
			_ent.teleportTo(((NexusModVariables.camsx.get((int) camids) instanceof Double _d ? _d : 0) + 0.5), ((NexusModVariables.camsy.get((int) camids) instanceof Double _d ? _d : 0) - 1),
					((NexusModVariables.camsz.get((int) camids) instanceof Double _d ? _d : 0) + 0.5));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(((NexusModVariables.camsx.get((int) camids) instanceof Double _d ? _d : 0) + 0.5), ((NexusModVariables.camsy.get((int) camids) instanceof Double _d ? _d : 0) - 1),
						((NexusModVariables.camsz.get((int) camids) instanceof Double _d ? _d : 0) + 0.5), _ent.getYRot(), _ent.getXRot());
		}
		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((dir.getStepX()), (dir.getStepY()), (dir.getStepZ())));
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("execute as @p run " + "effect give @s nexus:cobweb infinite 1 true"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("execute as @p run " + "effect give @s minecraft:slow_falling infinite 255 true"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("execute as @p run " + "effect give @s minecraft:jump_boost infinite 128 true"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("execute as @p run " + "effect give @s minecraft:slowness infinite 255 true"));
		if (entity.isShiftKeyDown()) {
			{
				Entity _ent = entity;
				_ent.teleportTo(tempx, tempy, tempz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(tempx, tempy, tempz, _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		}
	}
}
