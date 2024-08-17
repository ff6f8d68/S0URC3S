
package net.mcreator.nexusmc.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class NEXUS_treeLeavesBlock extends Block {
	public NEXUS_treeLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.glass.break")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.azalea_leaves.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.azalea_leaves.place")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.azalea_leaves.hit")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.azalea_leaves.fall"))))
				.strength(2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 300;
	}
}
