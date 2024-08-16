package net.mcreator.stevemaycry.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stevemaycry.entity.SummonSwords1Entity;

public class SummonSwords1Model extends GeoModel<SummonSwords1Entity> {
	@Override
	public ResourceLocation getAnimationResource(SummonSwords1Entity entity) {
		return new ResourceLocation("stevemaycry", "animations/summonswords.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SummonSwords1Entity entity) {
		return new ResourceLocation("stevemaycry", "geo/summonswords.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SummonSwords1Entity entity) {
		return new ResourceLocation("stevemaycry", "textures/entities/" + entity.getTexture() + ".png");
	}

}
