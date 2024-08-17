package net.mcreator.nexusmc.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nexusmc.entity.NexusriftEntity;

public class NexusriftModel extends GeoModel<NexusriftEntity> {
	@Override
	public ResourceLocation getAnimationResource(NexusriftEntity entity) {
		return new ResourceLocation("nexus", "animations/rift.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NexusriftEntity entity) {
		return new ResourceLocation("nexus", "geo/rift.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NexusriftEntity entity) {
		return new ResourceLocation("nexus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
