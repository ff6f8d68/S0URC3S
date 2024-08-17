package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.event.ServerChatEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.mcreator.nexusmc.network.NexusModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GettextProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getRawText());
	}

	public static void execute(String text) {
		execute(null, text);
	}

	private static void execute(@Nullable Event event, String text) {
		if (text == null)
			return;
		NexusModVariables.cct = text;
	}
}
