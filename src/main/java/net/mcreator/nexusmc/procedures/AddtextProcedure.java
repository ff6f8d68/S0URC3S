package net.mcreator.nexusmc.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.mcreator.nexusmc.network.NexusModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AddtextProcedure {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		NexusModVariables.terminal_chache.clear();
		for (int index0 = 0; index0 < 9; index0++) {
			NexusModVariables.terminal_chache.add("[empty]");
		}
	}
}
