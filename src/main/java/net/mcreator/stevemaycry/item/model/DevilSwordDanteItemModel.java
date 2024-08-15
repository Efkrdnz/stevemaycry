package net.mcreator.stevemaycry.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stevemaycry.item.DevilSwordDanteItem;

public class DevilSwordDanteItemModel extends GeoModel<DevilSwordDanteItem> {
	@Override
	public ResourceLocation getAnimationResource(DevilSwordDanteItem animatable) {
		return new ResourceLocation("stevemaycry", "animations/dsd.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DevilSwordDanteItem animatable) {
		return new ResourceLocation("stevemaycry", "geo/dsd.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DevilSwordDanteItem animatable) {
		return new ResourceLocation("stevemaycry", "textures/item/dsdalt.png");
	}
}
