
package net.mcreator.stupiddragonblockc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.stupiddragonblockc.procedures.UndoChargeDownProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoChargingDownProcedure;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChargeDownTrueMessage {
	int type, pressedms;

	public ChargeDownTrueMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ChargeDownTrueMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ChargeDownTrueMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ChargeDownTrueMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			DoChargingDownProcedure.execute(entity);
		}
		if (type == 1) {

			UndoChargeDownProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StupidDbcMod.addNetworkMessage(ChargeDownTrueMessage.class, ChargeDownTrueMessage::buffer, ChargeDownTrueMessage::new, ChargeDownTrueMessage::handler);
	}
}
