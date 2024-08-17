
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.NexusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NexusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NexusMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NEXUS = REGISTRY.register("nexus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.nexus.nexus")).icon(() -> new ItemStack(NexusModItems.NEXUSTABICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NexusModItems.NEXUSRIFT_SPAWN_EGG.get());
				tabData.accept(NexusModBlocks.NEXUS_TREE_LEAVES.get().asItem());
				tabData.accept(NexusModItems.NEXUSSHARD.get());
				tabData.accept(NexusModBlocks.NEXUSSAPPLING.get().asItem());
				tabData.accept(NexusModItems.NEXUSCORE.get());
				tabData.accept(NexusModBlocks.NEXUSCOREBLOCK.get().asItem());
				tabData.accept(NexusModItems.EYESINTHEDARKNESS_SPAWN_EGG.get());
				tabData.accept(NexusModBlocks.NEXUS_TREE_WOOD.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_LOG.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_PLANKS.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_STAIRS.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_SLAB.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_FENCE.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_FENCE_GATE.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_PRESSURE_PLATE.get().asItem());
				tabData.accept(NexusModBlocks.NEXUS_TREE_BUTTON.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_WOOD.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_LOG.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_PLANKS.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_STAIRS.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_SLAB.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_FENCE.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_FENCE_GATE.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_PRESSURE_PLATE.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_BUTTON.get().asItem());
				tabData.accept(NexusModBlocks.VERY_DARK_OAK_LEAVES.get().asItem());
				tabData.accept(NexusModBlocks.NEXUSBRICKS.get().asItem());
				tabData.accept(NexusModBlocks.CORRUPTEDBLOCK.get().asItem());
				tabData.accept(NexusModBlocks.ELECTROLYZEDBLOCK.get().asItem());
				tabData.accept(NexusModBlocks.ELECTROLYZEDPILLAR.get().asItem());
				tabData.accept(NexusModBlocks.ELECTROLYZEDCRAFTINGTABLE.get().asItem());
				tabData.accept(NexusModItems.NETWORKDIALER.get());
				tabData.accept(NexusModItems.INFORMATIONFETCHER.get());
				tabData.accept(NexusModItems.WARPINGDEVICE.get());
				tabData.accept(NexusModItems.NEXUSRIFTITEM.get());
				tabData.accept(NexusModBlocks.MOONLIGHTPROJECTOR.get().asItem());
				tabData.accept(NexusModBlocks.LOGOBLOCK.get().asItem());
				tabData.accept(NexusModBlocks.TERMINAL.get().asItem());
				tabData.accept(NexusModBlocks.FL_0_WER_1.get().asItem());
				tabData.accept(NexusModBlocks.FLOWER_2.get().asItem());
				tabData.accept(NexusModBlocks.BLUELAMP.get().asItem());
				tabData.accept(NexusModBlocks.REDDOTS.get().asItem());
				tabData.accept(NexusModBlocks.OTHERBLUETHING.get().asItem());
				tabData.accept(NexusModBlocks.BROWNTHING.get().asItem());
				tabData.accept(NexusModBlocks.TERMINAL_2.get().asItem());
				tabData.accept(NexusModBlocks.CAMERA.get().asItem());
				tabData.accept(NexusModBlocks.MONITOR.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NexusModItems.NEXU_SSUS_SPAWN_EGG.get());
		}
	}
}
