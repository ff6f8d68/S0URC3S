package net.mcreator.nexusmc.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.nexusmc.init.NexusModBlockEntities;
import net.mcreator.nexusmc.block.renderer.MoonlightprojectorTileRenderer;
import net.mcreator.nexusmc.block.entity.MoonlightprojectorTileEntity;
import net.mcreator.nexusmc.NexusMod;

@Mod.EventBusSubscriber(modid = NexusMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<MoonlightprojectorTileEntity>) NexusModBlockEntities.MOONLIGHTPROJECTOR.get(), context -> new MoonlightprojectorTileRenderer());
	}
}
