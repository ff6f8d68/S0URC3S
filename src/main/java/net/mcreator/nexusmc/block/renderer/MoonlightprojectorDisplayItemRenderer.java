package net.mcreator.nexusmc.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.nexusmc.block.model.MoonlightprojectorDisplayModel;
import net.mcreator.nexusmc.block.display.MoonlightprojectorDisplayItem;

public class MoonlightprojectorDisplayItemRenderer extends GeoItemRenderer<MoonlightprojectorDisplayItem> {
	public MoonlightprojectorDisplayItemRenderer() {
		super(new MoonlightprojectorDisplayModel());
	}

	@Override
	public RenderType getRenderType(MoonlightprojectorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
