
package net.mcreator.stupiddragonblockc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.world.inventory.ChangeTTPage2Menu;
import net.mcreator.stupiddragonblockc.procedures.OpenTTChangeProcedure;
import net.mcreator.stupiddragonblockc.procedures.IsUsingTPGProcedure;
import net.mcreator.stupiddragonblockc.procedures.IsUsingSS4Procedure;
import net.mcreator.stupiddragonblockc.procedures.GonnaUseUIProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoUltimateProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoBeastProcedure;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChangeTTPage2ButtonMessage {
	private final int buttonID, x, y, z;

	public ChangeTTPage2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChangeTTPage2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChangeTTPage2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChangeTTPage2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = ChangeTTPage2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenTTChangeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			IsUsingSS4Procedure.execute(entity);
		}
		if (buttonID == 2) {

			DoUltimateProcedure.execute(entity);
		}
		if (buttonID == 3) {

			DoBeastProcedure.execute(entity);
		}
		if (buttonID == 4) {

			IsUsingTPGProcedure.execute(entity);
		}
		if (buttonID == 5) {

			GonnaUseUIProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StupidDbcMod.addNetworkMessage(ChangeTTPage2ButtonMessage.class, ChangeTTPage2ButtonMessage::buffer, ChangeTTPage2ButtonMessage::new, ChangeTTPage2ButtonMessage::handler);
	}
}
