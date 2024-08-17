package net.mcreator.nexusmc.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nexusmc.entity.EyesinthedarknessEntity;

public class EyesinthedarknessModel extends GeoModel<EyesinthedarknessEntity> {
	@Override
	public ResourceLocation getAnimationResource(EyesinthedarknessEntity entity) {
		return new ResourceLocation("nexus", "animations/eyes_in_the_darkness.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EyesinthedarknessEntity entity) {
		return new ResourceLocation("nexus", "geo/eyes_in_the_darkness.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EyesinthedarknessEntity entity) {
		return new ResourceLocation("nexus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
