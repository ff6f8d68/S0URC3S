package net.mcreator.nexusmc.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nexusmc.item.NexusshardItem;

public class NexusshardItemModel extends GeoModel<NexusshardItem> {
	@Override
	public ResourceLocation getAnimationResource(NexusshardItem animatable) {
		return new ResourceLocation("nexus", "animations/shard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NexusshardItem animatable) {
		return new ResourceLocation("nexus", "geo/shard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NexusshardItem animatable) {
		return new ResourceLocation("nexus", "textures/item/rift.png");
	}
}
