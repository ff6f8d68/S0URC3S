package net.mcreator.nexusmc.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nexusmc.block.entity.MoonlightprojectorTileEntity;

public class MoonlightprojectorBlockModel extends GeoModel<MoonlightprojectorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoonlightprojectorTileEntity animatable) {
		return new ResourceLocation("nexus", "animations/moon_light_projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoonlightprojectorTileEntity animatable) {
		return new ResourceLocation("nexus", "geo/moon_light_projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoonlightprojectorTileEntity animatable) {
		return new ResourceLocation("nexus", "textures/block/jm.png");
	}
}
