
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.nexusmc.block.Very_dark_oakWoodBlock;
import net.mcreator.nexusmc.block.Very_dark_oakStairsBlock;
import net.mcreator.nexusmc.block.Very_dark_oakSlabBlock;
import net.mcreator.nexusmc.block.Very_dark_oakPressurePlateBlock;
import net.mcreator.nexusmc.block.Very_dark_oakPlanksBlock;
import net.mcreator.nexusmc.block.Very_dark_oakLogBlock;
import net.mcreator.nexusmc.block.Very_dark_oakLeavesBlock;
import net.mcreator.nexusmc.block.Very_dark_oakFenceGateBlock;
import net.mcreator.nexusmc.block.Very_dark_oakFenceBlock;
import net.mcreator.nexusmc.block.Very_dark_oakButtonBlock;
import net.mcreator.nexusmc.block.TerminalBlock;
import net.mcreator.nexusmc.block.Terminal2Block;
import net.mcreator.nexusmc.block.ReddotsBlock;
import net.mcreator.nexusmc.block.OtherbluethingBlock;
import net.mcreator.nexusmc.block.NexussapplingBlock;
import net.mcreator.nexusmc.block.NexuscoreblockBlock;
import net.mcreator.nexusmc.block.NexusbricksBlock;
import net.mcreator.nexusmc.block.NEXUS_treeWoodBlock;
import net.mcreator.nexusmc.block.NEXUS_treeStairsBlock;
import net.mcreator.nexusmc.block.NEXUS_treeSlabBlock;
import net.mcreator.nexusmc.block.NEXUS_treePressurePlateBlock;
import net.mcreator.nexusmc.block.NEXUS_treePlanksBlock;
import net.mcreator.nexusmc.block.NEXUS_treeLogBlock;
import net.mcreator.nexusmc.block.NEXUS_treeLeavesBlock;
import net.mcreator.nexusmc.block.NEXUS_treeFenceGateBlock;
import net.mcreator.nexusmc.block.NEXUS_treeFenceBlock;
import net.mcreator.nexusmc.block.NEXUS_treeButtonBlock;
import net.mcreator.nexusmc.block.NEXUSCONNECTHUBPortalBlock;
import net.mcreator.nexusmc.block.MoonlightprojectorBlock;
import net.mcreator.nexusmc.block.MonitorBlock;
import net.mcreator.nexusmc.block.LogoblockBlock;
import net.mcreator.nexusmc.block.Flower2Block;
import net.mcreator.nexusmc.block.FL0WER1Block;
import net.mcreator.nexusmc.block.ElectrolyzedpillarBlock;
import net.mcreator.nexusmc.block.ElectrolyzedcraftingtableBlock;
import net.mcreator.nexusmc.block.ElectrolyzedblockBlock;
import net.mcreator.nexusmc.block.CorruptedblockBlock;
import net.mcreator.nexusmc.block.CameraBlock;
import net.mcreator.nexusmc.block.BrownthingBlock;
import net.mcreator.nexusmc.block.BluelampBlock;
import net.mcreator.nexusmc.NexusMod;

public class NexusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, NexusMod.MODID);
	public static final DeferredHolder<Block, Block> NEXUS_TREE_WOOD = REGISTRY.register("nexus_tree_wood", () -> new NEXUS_treeWoodBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_LOG = REGISTRY.register("nexus_tree_log", () -> new NEXUS_treeLogBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_PLANKS = REGISTRY.register("nexus_tree_planks", () -> new NEXUS_treePlanksBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_LEAVES = REGISTRY.register("nexus_tree_leaves", () -> new NEXUS_treeLeavesBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_STAIRS = REGISTRY.register("nexus_tree_stairs", () -> new NEXUS_treeStairsBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_SLAB = REGISTRY.register("nexus_tree_slab", () -> new NEXUS_treeSlabBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_FENCE = REGISTRY.register("nexus_tree_fence", () -> new NEXUS_treeFenceBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_FENCE_GATE = REGISTRY.register("nexus_tree_fence_gate", () -> new NEXUS_treeFenceGateBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_PRESSURE_PLATE = REGISTRY.register("nexus_tree_pressure_plate", () -> new NEXUS_treePressurePlateBlock());
	public static final DeferredHolder<Block, Block> NEXUS_TREE_BUTTON = REGISTRY.register("nexus_tree_button", () -> new NEXUS_treeButtonBlock());
	public static final DeferredHolder<Block, Block> NEXUSSAPPLING = REGISTRY.register("nexussappling", () -> new NexussapplingBlock());
	public static final DeferredHolder<Block, Block> NEXUSCONNECTHUB_PORTAL = REGISTRY.register("nexusconnecthub_portal", () -> new NEXUSCONNECTHUBPortalBlock());
	public static final DeferredHolder<Block, Block> NEXUSCOREBLOCK = REGISTRY.register("nexuscoreblock", () -> new NexuscoreblockBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_WOOD = REGISTRY.register("very_dark_oak_wood", () -> new Very_dark_oakWoodBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_LOG = REGISTRY.register("very_dark_oak_log", () -> new Very_dark_oakLogBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_PLANKS = REGISTRY.register("very_dark_oak_planks", () -> new Very_dark_oakPlanksBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_LEAVES = REGISTRY.register("very_dark_oak_leaves", () -> new Very_dark_oakLeavesBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_STAIRS = REGISTRY.register("very_dark_oak_stairs", () -> new Very_dark_oakStairsBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_SLAB = REGISTRY.register("very_dark_oak_slab", () -> new Very_dark_oakSlabBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_FENCE = REGISTRY.register("very_dark_oak_fence", () -> new Very_dark_oakFenceBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_FENCE_GATE = REGISTRY.register("very_dark_oak_fence_gate", () -> new Very_dark_oakFenceGateBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_PRESSURE_PLATE = REGISTRY.register("very_dark_oak_pressure_plate", () -> new Very_dark_oakPressurePlateBlock());
	public static final DeferredHolder<Block, Block> VERY_DARK_OAK_BUTTON = REGISTRY.register("very_dark_oak_button", () -> new Very_dark_oakButtonBlock());
	public static final DeferredHolder<Block, Block> NEXUSBRICKS = REGISTRY.register("nexusbricks", () -> new NexusbricksBlock());
	public static final DeferredHolder<Block, Block> CORRUPTEDBLOCK = REGISTRY.register("corruptedblock", () -> new CorruptedblockBlock());
	public static final DeferredHolder<Block, Block> ELECTROLYZEDBLOCK = REGISTRY.register("electrolyzedblock", () -> new ElectrolyzedblockBlock());
	public static final DeferredHolder<Block, Block> ELECTROLYZEDPILLAR = REGISTRY.register("electrolyzedpillar", () -> new ElectrolyzedpillarBlock());
	public static final DeferredHolder<Block, Block> ELECTROLYZEDCRAFTINGTABLE = REGISTRY.register("electrolyzedcraftingtable", () -> new ElectrolyzedcraftingtableBlock());
	public static final DeferredHolder<Block, Block> MOONLIGHTPROJECTOR = REGISTRY.register("moonlightprojector", () -> new MoonlightprojectorBlock());
	public static final DeferredHolder<Block, Block> LOGOBLOCK = REGISTRY.register("logoblock", () -> new LogoblockBlock());
	public static final DeferredHolder<Block, Block> TERMINAL = REGISTRY.register("terminal", () -> new TerminalBlock());
	public static final DeferredHolder<Block, Block> FL_0_WER_1 = REGISTRY.register("fl_0_wer_1", () -> new FL0WER1Block());
	public static final DeferredHolder<Block, Block> FLOWER_2 = REGISTRY.register("flower_2", () -> new Flower2Block());
	public static final DeferredHolder<Block, Block> BLUELAMP = REGISTRY.register("bluelamp", () -> new BluelampBlock());
	public static final DeferredHolder<Block, Block> REDDOTS = REGISTRY.register("reddots", () -> new ReddotsBlock());
	public static final DeferredHolder<Block, Block> OTHERBLUETHING = REGISTRY.register("otherbluething", () -> new OtherbluethingBlock());
	public static final DeferredHolder<Block, Block> BROWNTHING = REGISTRY.register("brownthing", () -> new BrownthingBlock());
	public static final DeferredHolder<Block, Block> TERMINAL_2 = REGISTRY.register("terminal_2", () -> new Terminal2Block());
	public static final DeferredHolder<Block, Block> CAMERA = REGISTRY.register("camera", () -> new CameraBlock());
	public static final DeferredHolder<Block, Block> MONITOR = REGISTRY.register("monitor", () -> new MonitorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
