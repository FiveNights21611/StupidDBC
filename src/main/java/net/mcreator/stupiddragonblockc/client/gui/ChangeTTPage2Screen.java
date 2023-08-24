package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.ChangeTTPage2Menu;
import net.mcreator.stupiddragonblockc.procedures.ShowUltimateTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowUIProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowTPGProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSS4Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowIsUsingTPGProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowBeastTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS4Procedure;
import net.mcreator.stupiddragonblockc.procedures.IsUsingUltimateProcedure;
import net.mcreator.stupiddragonblockc.procedures.IsUsingUIProcedure;
import net.mcreator.stupiddragonblockc.procedures.IsUsingBeastProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtUltimateProcedure;
import net.mcreator.stupiddragonblockc.network.ChangeTTPage2ButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChangeTTPage2Screen extends AbstractContainerScreen<ChangeTTPage2Menu> {
	private final static HashMap<String, Object> guistate = ChangeTTPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_previous;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;
	ImageButton imagebutton_button2;
	ImageButton imagebutton_button3;
	ImageButton imagebutton_button4;

	public ChangeTTPage2Screen(ChangeTTPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/change_tt_page_2.png");

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
		if (ShowSS4Procedure.execute(entity))
			this.font.draw(poseStack,

					SS4Procedure.execute(entity), 3, 4, -205);
		if (AlreadyBoughtUltimateProcedure.execute(entity))
			this.font.draw(poseStack,

					IsUsingUltimateProcedure.execute(entity), 3, 33, -16777216);
		if (ShowBeastTrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					IsUsingBeastProcedure.execute(entity), 2, 62, -1);
		if (ShowTPGProcedure.execute(entity))
			this.font.draw(poseStack,

					ShowIsUsingTPGProcedure.execute(entity), 2, 91, -13421824);
		if (ShowUIProcedure.execute(entity))
			this.font.draw(poseStack,

					IsUsingUIProcedure.execute(entity), 2, 120, -3342337);
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
		imagebutton_previous = new ImageButton(this.leftPos + 2, this.topPos + 177, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_previous.png"), 12, 24, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(0, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous", imagebutton_previous);
		this.addRenderableWidget(imagebutton_previous);
		imagebutton_button = new ImageButton(this.leftPos + 2, this.topPos + 17, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button.png"), 12, 24, e -> {
			if (ShowSS4Procedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(1, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowSS4Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 2, this.topPos + 46, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button1.png"), 12, 24, e -> {
			if (ShowUltimateTrainingProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(2, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowUltimateTrainingProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
		imagebutton_button2 = new ImageButton(this.leftPos + 2, this.topPos + 75, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button2.png"), 12, 24, e -> {
			if (ShowBeastTrainingProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(3, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowBeastTrainingProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button2", imagebutton_button2);
		this.addRenderableWidget(imagebutton_button2);
		imagebutton_button3 = new ImageButton(this.leftPos + 2, this.topPos + 104, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button3.png"), 12, 24, e -> {
			if (ShowTPGProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(4, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowTPGProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button3", imagebutton_button3);
		this.addRenderableWidget(imagebutton_button3);
		imagebutton_button4 = new ImageButton(this.leftPos + 2, this.topPos + 133, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button4.png"), 12, 24, e -> {
			if (ShowUIProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTTPage2ButtonMessage(5, x, y, z));
				ChangeTTPage2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowUIProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button4", imagebutton_button4);
		this.addRenderableWidget(imagebutton_button4);
	}
}
