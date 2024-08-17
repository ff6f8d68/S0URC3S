package net.mcreator.nexusmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.nexusmc.network.NexusModVariables;

public class CameraBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x) {
		double camid = 0;
		double i = 0;
		i = 1;
		if (!NexusModVariables.camsx.isEmpty()) {
			for (int index0 = 0; index0 < (int) NexusModVariables.camsx.size(); index0++) {
				if ((NexusModVariables.camsx.get((int) (i - 1)) instanceof Double _d ? _d : 0) == x) {
					camid = i - 1;
				} else {
					i = i + 1;
				}
			}
			NexusModVariables.camsx.remove((int) camid);
			NexusModVariables.camsy.remove((int) camid);
			NexusModVariables.camsz.remove((int) camid);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("removed camera with the ID: " + (camid + 1))), false);
		}
	}
}
