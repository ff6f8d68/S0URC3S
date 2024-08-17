package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.nexusmc.network.NexusModVariables;
import net.mcreator.nexusmc.NexusMod;

import java.util.HashMap;

public class ButtonclickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		String command = "";
		if ((guistate.containsKey("text:command") ? ((EditBox) guistate.get("text:command")).getValue() : "").contains("master ")) {
			command = (guistate.containsKey("text:command") ? ((EditBox) guistate.get("text:command")).getValue() : "").replace("master ", " ");
			if (command.contains("selfdestruct")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("/execute as @p at @s run " + "selfdestruct"));
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("/execute as @p at @s run " + command));
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("/execute as @p at @s run " + (guistate.containsKey("text:command") ? ((EditBox) guistate.get("text:command")).getValue() : "")));
		}
		NexusModVariables.terminal_chache.add((guistate.containsKey("text:command") ? ((EditBox) guistate.get("text:command")).getValue() : ""));
		if (entity instanceof ServerPlayer _player && !world.isClientSide())
			PacketDistributor.PLAYER.with(_player).send(new NexusMod.TextboxSetMessage("command", ""));
	}
}
