package net.mcreator.nexusmc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.nexusmc.network.NexusModVariables;

public class TcurserProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "currently logged in as: " + entity.getData(NexusModVariables.PLAYER_VARIABLES).curse_r;
	}
}
