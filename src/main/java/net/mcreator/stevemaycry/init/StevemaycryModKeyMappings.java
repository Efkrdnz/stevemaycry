
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stevemaycry.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StevemaycryModKeyMappings {
	public static final KeyMapping SWORD_MASTER = new KeyMapping("key.stevemaycry.sword_master", GLFW.GLFW_KEY_X, "key.categories.dmc");
	public static final KeyMapping TRICKSTER = new KeyMapping("key.stevemaycry.trickster", GLFW.GLFW_KEY_Z, "key.categories.dmc");
	public static final KeyMapping ROYAL_GUARD = new KeyMapping("key.stevemaycry.royal_guard", GLFW.GLFW_KEY_C, "key.categories.dmc");
	public static final KeyMapping GUNSLINGER = new KeyMapping("key.stevemaycry.gunslinger", GLFW.GLFW_KEY_V, "key.categories.dmc");

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWORD_MASTER);
		event.register(TRICKSTER);
		event.register(ROYAL_GUARD);
		event.register(GUNSLINGER);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
			}
		}
	}
}
