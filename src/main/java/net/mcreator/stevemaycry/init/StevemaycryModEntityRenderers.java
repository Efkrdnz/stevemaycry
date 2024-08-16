
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stevemaycry.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stevemaycry.client.renderer.SummonSwords2Renderer;
import net.mcreator.stevemaycry.client.renderer.SummonSwords1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StevemaycryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StevemaycryModEntities.SUMMON_SWORDS_1.get(), SummonSwords1Renderer::new);
		event.registerEntityRenderer(StevemaycryModEntities.SUMMON_SWORDS_2.get(), SummonSwords2Renderer::new);
	}
}
