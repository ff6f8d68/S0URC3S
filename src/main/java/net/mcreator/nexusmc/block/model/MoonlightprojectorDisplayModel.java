package net.mcreator.nexusmc.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nexusmc.block.display.MoonlightprojectorDisplayItem;

public class MoonlightprojectorDisplayModel extends GeoModel<MoonlightprojectorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoonlightprojectorDisplayItem animatable) {
		return new ResourceLocation("nexus", "animations/moon_light_projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoonlightprojectorDisplayItem animatable) {
		return new ResourceLocation("nexus", "geo/moon_light_projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoonlightprojectorDisplayItem entity) {
		return new ResourceLocation("nexus", "textures/block/jm.png");
	}
}
