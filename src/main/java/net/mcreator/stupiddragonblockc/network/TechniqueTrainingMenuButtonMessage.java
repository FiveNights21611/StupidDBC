
package net.mcreator.stupiddragonblockc.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.world.inventory.TechniqueTrainingMenuMenu;
import net.mcreator.stupiddragonblockc.procedures.ToTransformationTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ToStatsProcedure;
import net.mcreator.stupiddragonblockc.procedures.ToSkillsProcedure;
import net.mcreator.stupiddragonblockc.procedures.OpenTechniqueTrainingProcedure;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechniqueTrainingMenuButtonMessage {
	private final int buttonID, x, y, z;

	public TechniqueTrainingMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TechniqueTrainingMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TechniqueTrainingMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TechniqueTrainingMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = TechniqueTrainingMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToStatsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToSkillsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToTransformationTrainingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenTechniqueTrainingProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StupidDbcMod.addNetworkMessage(TechniqueTrainingMenuButtonMessage.class, TechniqueTrainingMenuButtonMessage::buffer, TechniqueTrainingMenuButtonMessage::new, TechniqueTrainingMenuButtonMessage::handler);
	}
}
