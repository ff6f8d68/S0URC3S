
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.NexusMod;

public class NexusModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(Registries.PAINTING_VARIANT, NexusMod.MODID);
	public static final DeferredHolder<PaintingVariant, PaintingVariant> LOGO = REGISTRY.register("logo", () -> new PaintingVariant(32, 16));
}
