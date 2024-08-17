
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.potion.CorruptedcMobEffect;
import net.mcreator.nexusmc.potion.CobwebMobEffect;
import net.mcreator.nexusmc.NexusMod;

public class NexusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, NexusMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> CORRUPTEDC = REGISTRY.register("corruptedc", () -> new CorruptedcMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> COBWEB = REGISTRY.register("cobweb", () -> new CobwebMobEffect());
}
