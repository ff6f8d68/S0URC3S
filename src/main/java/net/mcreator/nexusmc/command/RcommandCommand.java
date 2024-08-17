
package net.mcreator.nexusmc.command;

import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.Commands;

@Mod.EventBusSubscriber
public class RcommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("run")

				.then(Commands.argument("command", MessageArgument.message())));
	}
}
