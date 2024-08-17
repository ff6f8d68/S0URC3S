package net.mcreator.nexusmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.nexusmc.NexusMod;

public class ExplodesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 1000; index0++) {
			NexusMod.queueServerWork(10, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + Mth.nextDouble(RandomSource.create(), -20, 20)), (y + Mth.nextDouble(RandomSource.create(), -35, 5)), (z + Mth.nextDouble(RandomSource.create(), -20, 20)), 10, Level.ExplosionInteraction.TNT);
			});
		}
	}
}
