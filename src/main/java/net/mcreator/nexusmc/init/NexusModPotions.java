
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.NexusMod;

public class NexusModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, NexusMod.MODID);
	public static final DeferredHolder<Potion, Potion> CCODES = REGISTRY.register("ccodes", () -> new Potion(new MobEffectInstance(NexusModMobEffects.CORRUPTEDC.get(), 3600, 0, false, true)));
}
