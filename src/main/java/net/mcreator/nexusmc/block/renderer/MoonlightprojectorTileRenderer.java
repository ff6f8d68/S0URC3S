package net.mcreator.nexusmc.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.nexusmc.block.model.MoonlightprojectorBlockModel;
import net.mcreator.nexusmc.block.entity.MoonlightprojectorTileEntity;

public class MoonlightprojectorTileRenderer extends GeoBlockRenderer<MoonlightprojectorTileEntity> {
	public MoonlightprojectorTileRenderer() {
		super(new MoonlightprojectorBlockModel());
	}

	@Override
	public RenderType getRenderType(MoonlightprojectorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
