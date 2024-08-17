package net.mcreator.nexusmc.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.nexusmc.network.NexusModVariables;

public class CorruptedplayerentityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String dev = "";
		String name = "";
		String command_base = "";
		command_base = "execute as @e[type=nexus:corruptedplayerentity,limit=1,sort=nearest] at @s run say ";
		command_base = "execute as @e[type=nexus:corruptedplayerentity,limit=1,sort=nearest] at @s run say ";
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			dev = "atom20003113";
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			dev = "takeoversatyr42";
		}
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			name = "Laura Ann Mitchell";
		} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			name = "James Edward Sullivan";
		}
		if (Mth.nextInt(RandomSource.create(), 1, 50) == 1) {
			if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "" + ("Where is \u00A7k" + "steve")));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "" + ("I want to speak with Mr. \u00A7k" + dev)));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "It's your fault that \u00A7kAgent is free"));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "Found you"));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "" + ("Mr. \u00A7k" + name + "\u00A70 repurposed Nexus to contain something. Something far more dangerous that developers couldn't imagine")));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "He's no longer with us anymore"));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "My name is \u00A7kprototype"));
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "" + ("Where is \u00A7k" + "my friend")));
			}
		}
		if (NexusModVariables.cct.contains("follow me")) {
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(command_base + "ok"));
				FollowProcedure.execute(world, x, y, z, entity);
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								(command_base + "no"));
				} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								(command_base + "no why should i"));
				}
			}
		}
	}
}
