
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.nexusmc.client.renderer.NexusriftRenderer;
import net.mcreator.nexusmc.client.renderer.NEXUSsusRenderer;
import net.mcreator.nexusmc.client.renderer.EyesinthedarknessRenderer;
import net.mcreator.nexusmc.client.renderer.CorruptedplayerentityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NexusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NexusModEntities.NEXUSRIFT.get(), NexusriftRenderer::new);
		event.registerEntityRenderer(NexusModEntities.EYESINTHEDARKNESS.get(), EyesinthedarknessRenderer::new);
		event.registerEntityRenderer(NexusModEntities.CORRUPTEDPLAYERENTITY.get(), CorruptedplayerentityRenderer::new);
		event.registerEntityRenderer(NexusModEntities.NEXU_SSUS.get(), NEXUSsusRenderer::new);
	}
}
