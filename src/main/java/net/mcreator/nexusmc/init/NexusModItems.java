
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.nexusmc.item.WarpingdeviceItem;
import net.mcreator.nexusmc.item.NexustabiconItem;
import net.mcreator.nexusmc.item.NexusshardItem;
import net.mcreator.nexusmc.item.NexusriftitemItem;
import net.mcreator.nexusmc.item.NexuscoreItem;
import net.mcreator.nexusmc.item.NetworkdialerItem;
import net.mcreator.nexusmc.item.NEXUSCONNECTHUBItem;
import net.mcreator.nexusmc.item.InformationfetcherItem;
import net.mcreator.nexusmc.block.display.MoonlightprojectorDisplayItem;
import net.mcreator.nexusmc.NexusMod;

public class NexusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, NexusMod.MODID);
	public static final DeferredHolder<Item, Item> NEXUSRIFT_SPAWN_EGG = REGISTRY.register("nexusrift_spawn_egg", () -> new DeferredSpawnEggItem(NexusModEntities.NEXUSRIFT, -16777216, -16711681, new Item.Properties()));
	public static final DeferredHolder<Item, Item> NEXUSTABICON = REGISTRY.register("nexustabicon", () -> new NexustabiconItem());
	public static final DeferredHolder<Item, Item> NEXUS_TREE_WOOD = block(NexusModBlocks.NEXUS_TREE_WOOD);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_LOG = block(NexusModBlocks.NEXUS_TREE_LOG);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_PLANKS = block(NexusModBlocks.NEXUS_TREE_PLANKS);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_LEAVES = block(NexusModBlocks.NEXUS_TREE_LEAVES);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_STAIRS = block(NexusModBlocks.NEXUS_TREE_STAIRS);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_SLAB = block(NexusModBlocks.NEXUS_TREE_SLAB);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_FENCE = block(NexusModBlocks.NEXUS_TREE_FENCE);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_FENCE_GATE = block(NexusModBlocks.NEXUS_TREE_FENCE_GATE);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_PRESSURE_PLATE = block(NexusModBlocks.NEXUS_TREE_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> NEXUS_TREE_BUTTON = block(NexusModBlocks.NEXUS_TREE_BUTTON);
	public static final DeferredHolder<Item, Item> NEXUSSHARD = REGISTRY.register("nexusshard", () -> new NexusshardItem());
	public static final DeferredHolder<Item, Item> NEXUSSAPPLING = block(NexusModBlocks.NEXUSSAPPLING);
	public static final DeferredHolder<Item, Item> NEXUSCONNECTHUB = REGISTRY.register("nexusconnecthub", () -> new NEXUSCONNECTHUBItem());
	public static final DeferredHolder<Item, Item> NEXUSCORE = REGISTRY.register("nexuscore", () -> new NexuscoreItem());
	public static final DeferredHolder<Item, Item> NEXUSCOREBLOCK = block(NexusModBlocks.NEXUSCOREBLOCK);
	public static final DeferredHolder<Item, Item> EYESINTHEDARKNESS_SPAWN_EGG = REGISTRY.register("eyesinthedarkness_spawn_egg", () -> new DeferredSpawnEggItem(NexusModEntities.EYESINTHEDARKNESS, -16777216, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_WOOD = block(NexusModBlocks.VERY_DARK_OAK_WOOD);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_LOG = block(NexusModBlocks.VERY_DARK_OAK_LOG);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_PLANKS = block(NexusModBlocks.VERY_DARK_OAK_PLANKS);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_LEAVES = block(NexusModBlocks.VERY_DARK_OAK_LEAVES);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_STAIRS = block(NexusModBlocks.VERY_DARK_OAK_STAIRS);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_SLAB = block(NexusModBlocks.VERY_DARK_OAK_SLAB);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_FENCE = block(NexusModBlocks.VERY_DARK_OAK_FENCE);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_FENCE_GATE = block(NexusModBlocks.VERY_DARK_OAK_FENCE_GATE);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_PRESSURE_PLATE = block(NexusModBlocks.VERY_DARK_OAK_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> VERY_DARK_OAK_BUTTON = block(NexusModBlocks.VERY_DARK_OAK_BUTTON);
	public static final DeferredHolder<Item, Item> NEXUSBRICKS = block(NexusModBlocks.NEXUSBRICKS);
	public static final DeferredHolder<Item, Item> CORRUPTEDBLOCK = block(NexusModBlocks.CORRUPTEDBLOCK);
	public static final DeferredHolder<Item, Item> ELECTROLYZEDBLOCK = block(NexusModBlocks.ELECTROLYZEDBLOCK);
	public static final DeferredHolder<Item, Item> ELECTROLYZEDPILLAR = block(NexusModBlocks.ELECTROLYZEDPILLAR);
	public static final DeferredHolder<Item, Item> ELECTROLYZEDCRAFTINGTABLE = block(NexusModBlocks.ELECTROLYZEDCRAFTINGTABLE);
	public static final DeferredHolder<Item, Item> NETWORKDIALER = REGISTRY.register("networkdialer", () -> new NetworkdialerItem());
	public static final DeferredHolder<Item, Item> INFORMATIONFETCHER = REGISTRY.register("informationfetcher", () -> new InformationfetcherItem());
	public static final DeferredHolder<Item, Item> WARPINGDEVICE = REGISTRY.register("warpingdevice", () -> new WarpingdeviceItem());
	public static final DeferredHolder<Item, Item> NEXUSRIFTITEM = REGISTRY.register("nexusriftitem", () -> new NexusriftitemItem());
	public static final DeferredHolder<Item, Item> MOONLIGHTPROJECTOR = REGISTRY.register(NexusModBlocks.MOONLIGHTPROJECTOR.getId().getPath(), () -> new MoonlightprojectorDisplayItem(NexusModBlocks.MOONLIGHTPROJECTOR.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> LOGOBLOCK = block(NexusModBlocks.LOGOBLOCK);
	public static final DeferredHolder<Item, Item> TERMINAL = block(NexusModBlocks.TERMINAL);
	public static final DeferredHolder<Item, Item> NEXU_SSUS_SPAWN_EGG = REGISTRY.register("nexu_ssus_spawn_egg", () -> new DeferredSpawnEggItem(NexusModEntities.NEXU_SSUS, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> FL_0_WER_1 = block(NexusModBlocks.FL_0_WER_1);
	public static final DeferredHolder<Item, Item> FLOWER_2 = block(NexusModBlocks.FLOWER_2);
	public static final DeferredHolder<Item, Item> BLUELAMP = block(NexusModBlocks.BLUELAMP);
	public static final DeferredHolder<Item, Item> REDDOTS = block(NexusModBlocks.REDDOTS);
	public static final DeferredHolder<Item, Item> OTHERBLUETHING = block(NexusModBlocks.OTHERBLUETHING);
	public static final DeferredHolder<Item, Item> BROWNTHING = block(NexusModBlocks.BROWNTHING);
	public static final DeferredHolder<Item, Item> TERMINAL_2 = block(NexusModBlocks.TERMINAL_2);
	public static final DeferredHolder<Item, Item> CAMERA = block(NexusModBlocks.CAMERA);
	public static final DeferredHolder<Item, Item> MONITOR = block(NexusModBlocks.MONITOR);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
