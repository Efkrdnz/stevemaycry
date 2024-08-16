package net.mcreator.stevemaycry.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stevemaycry.entity.SummonSwords2Entity;

public class SummonSwords2Model extends GeoModel<SummonSwords2Entity> {
	@Override
	public ResourceLocation getAnimationResource(SummonSwords2Entity entity) {
		return new ResourceLocation("stevemaycry", "animations/summonswords2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SummonSwords2Entity entity) {
		return new ResourceLocation("stevemaycry", "geo/summonswords2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SummonSwords2Entity entity) {
		return new ResourceLocation("stevemaycry", "textures/entities/" + entity.getTexture() + ".png");
	}

}
