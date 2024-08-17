
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.NexusMod;

public class NexusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, NexusMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> NEXUS_RIFT = REGISTRY.register("nexus_rift", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nexus", "nexus_rift")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WARP = REGISTRY.register("warp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nexus", "warp")));
}
