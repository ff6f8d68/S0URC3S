package net.mcreator.nexusmc.procedures;

import net.mcreator.nexusmc.network.NexusModVariables;

public class Old3Procedure {
	public static String execute() {
		String texxxxt = "";
		double number = 0;
		number = 3;
		if (NexusModVariables.terminal_chache.size() - 1 > 2) {
			texxxxt = NexusModVariables.terminal_chache.get((int) (NexusModVariables.terminal_chache.size() - number)) instanceof String _s ? _s : "";
		} else {
			texxxxt = "";
		}
		return texxxxt;
	}
}
