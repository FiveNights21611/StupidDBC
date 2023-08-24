
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.stupiddragonblockc.network.TransformationTypeMessage;
import net.mcreator.stupiddragonblockc.network.TransformMessage;
import net.mcreator.stupiddragonblockc.network.FlightMessage;
import net.mcreator.stupiddragonblockc.network.DebugKeybindMessage;
import net.mcreator.stupiddragonblockc.network.DeTransformMessage;
import net.mcreator.stupiddragonblockc.network.ChargeUpTrueMessage;
import net.mcreator.stupiddragonblockc.network.ChargeDownTrueMessage;
import net.mcreator.stupiddragonblockc.network.CharacterSheetMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StupidDbcModKeyMappings {
	public static final KeyMapping CHARACTER_SHEET = new KeyMapping("key.stupid_dbc.character_sheet", GLFW.GLFW_KEY_V, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CHARACTER_SHEET_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARACTER_SHEET_LASTPRESS);
				StupidDbcMod.PACKET_HANDLER.sendToServer(new CharacterSheetMessage(1, dt));
				CharacterSheetMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRANSFORM = new KeyMapping("key.stupid_dbc.transform", GLFW.GLFW_KEY_G, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformMessage(0, 0));
				TransformMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				TRANSFORM_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TRANSFORM_LASTPRESS);
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformMessage(1, dt));
				TransformMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DE_TRANSFORM = new KeyMapping("key.stupid_dbc.de_transform", GLFW.GLFW_KEY_H, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new DeTransformMessage(0, 0));
				DeTransformMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRANSFORMATION_TYPE = new KeyMapping("key.stupid_dbc.transformation_type", GLFW.GLFW_KEY_X, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTypeMessage(0, 0));
				TransformationTypeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHARGE_UP_TRUE = new KeyMapping("key.stupid_dbc.charge_up_true", GLFW.GLFW_KEY_C, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChargeUpTrueMessage(0, 0));
				ChargeUpTrueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_UP_TRUE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_UP_TRUE_LASTPRESS);
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChargeUpTrueMessage(1, dt));
				ChargeUpTrueMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHARGE_DOWN_TRUE = new KeyMapping("key.stupid_dbc.charge_down_true", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChargeDownTrueMessage(0, 0));
				ChargeDownTrueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_DOWN_TRUE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_DOWN_TRUE_LASTPRESS);
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChargeDownTrueMessage(1, dt));
				ChargeDownTrueMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DEBUG_KEYBIND = new KeyMapping("key.stupid_dbc.debug_keybind", GLFW.GLFW_KEY_0, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new DebugKeybindMessage(0, 0));
				DebugKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FLIGHT = new KeyMapping("key.stupid_dbc.flight", GLFW.GLFW_KEY_F, "key.categories.sdbc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FLIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - FLIGHT_LASTPRESS);
				StupidDbcMod.PACKET_HANDLER.sendToServer(new FlightMessage(1, dt));
				FlightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long CHARACTER_SHEET_LASTPRESS = 0;
	private static long TRANSFORM_LASTPRESS = 0;
	private static long CHARGE_UP_TRUE_LASTPRESS = 0;
	private static long CHARGE_DOWN_TRUE_LASTPRESS = 0;
	private static long FLIGHT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(CHARACTER_SHEET);
		event.register(TRANSFORM);
		event.register(DE_TRANSFORM);
		event.register(TRANSFORMATION_TYPE);
		event.register(CHARGE_UP_TRUE);
		event.register(CHARGE_DOWN_TRUE);
		event.register(DEBUG_KEYBIND);
		event.register(FLIGHT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				CHARACTER_SHEET.consumeClick();
				TRANSFORM.consumeClick();
				DE_TRANSFORM.consumeClick();
				TRANSFORMATION_TYPE.consumeClick();
				CHARGE_UP_TRUE.consumeClick();
				CHARGE_DOWN_TRUE.consumeClick();
				DEBUG_KEYBIND.consumeClick();
				FLIGHT.consumeClick();
			}
		}
	}
}
