
package net.mcreator.nexusmc.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.nexusmc.procedures.CorruptedcOnEffectActiveTickProcedure;

public class CorruptedcMobEffect extends MobEffect {
	public CorruptedcMobEffect() {
		super(MobEffectCategory.NEUTRAL, -5635841);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CorruptedcOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}
}
