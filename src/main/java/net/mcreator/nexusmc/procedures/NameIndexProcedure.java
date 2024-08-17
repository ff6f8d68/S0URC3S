package net.mcreator.nexusmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class NameIndexProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		return InformationfetcherRightclickedProcedure.execute(world, x, y, z, entity).getDisplayName().getString();
	}
}
