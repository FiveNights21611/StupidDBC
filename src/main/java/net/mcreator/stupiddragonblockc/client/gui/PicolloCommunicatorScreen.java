package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.PicolloCommunicatorMenu;
import net.mcreator.stupiddragonblockc.procedures.ShowPriceOfPotentialUnlockProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowPriceOfFlyProcedure;
import net.mcreator.stupiddragonblockc.procedures.PotentialUnlockPriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.FlyPriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoPicolloLinesProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtPotentialUnlockProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtFlyProcedure;
import net.mcreator.stupiddragonblockc.network.PicolloCommunicatorButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PicolloCommunicatorScreen extends AbstractContainerScreen<PicolloCommunicatorMenu> {
	private final static HashMap<String, Object> guistate = PicolloCommunicatorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button;
	ImageButton imagebutton_buttonnew;

	public PicolloCommunicatorScreen(PicolloCommunicatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/picollo_communicator.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				DoPicolloLinesProcedure.execute(entity), 2, 20, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.picollo_communicator.label_communicating_with_picollo"), 15, 2, -12829636);
		if (ShowPriceOfFlyProcedure.execute(entity))
			this.font.draw(poseStack,

					FlyPriceProcedure.execute(entity), 22, 38, -12829636);
		if (AlreadyBoughtFlyProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.picollo_communicator.label_already_bought_fly"), 23, 38, -12829636);
		if (ShowPriceOfPotentialUnlockProcedure.execute(entity))
			this.font.draw(poseStack,

					PotentialUnlockPriceProcedure.execute(entity), 22, 62, -12829636);
		if (AlreadyBoughtPotentialUnlockProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.picollo_communicator.label_already_unlocked_potential"), 22, 62, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_button = new ImageButton(this.leftPos + 4, this.topPos + 35, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new PicolloCommunicatorButtonMessage(0, x, y, z));
				PicolloCommunicatorButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_buttonnew = new ImageButton(this.leftPos + 4, this.topPos + 59, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_buttonnew.png"), 16, 32, e -> {
			if (ShowPriceOfPotentialUnlockProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new PicolloCommunicatorButtonMessage(1, x, y, z));
				PicolloCommunicatorButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowPriceOfPotentialUnlockProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonnew", imagebutton_buttonnew);
		this.addRenderableWidget(imagebutton_buttonnew);
	}
}
