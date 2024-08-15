
package net.mcreator.stevemaycry.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.stevemaycry.StevemaycryMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RoyalGuardMessage {
	int type, pressedms;

	public RoyalGuardMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public RoyalGuardMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(RoyalGuardMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(RoyalGuardMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StevemaycryMod.addNetworkMessage(RoyalGuardMessage.class, RoyalGuardMessage::buffer, RoyalGuardMessage::new, RoyalGuardMessage::handler);
	}
}
