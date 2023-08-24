package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.StatMenuMenu;
import net.mcreator.stupiddragonblockc.procedures.WillpowerProcedure;
import net.mcreator.stupiddragonblockc.procedures.TrueStrengthProcedure;
import net.mcreator.stupiddragonblockc.procedures.TrueDefenseProcedure;
import net.mcreator.stupiddragonblockc.procedures.TransformationStatsProcedure;
import net.mcreator.stupiddragonblockc.procedures.TechniqueStatsProcedure;
import net.mcreator.stupiddragonblockc.procedures.TPtoIncreaseStatProcedure;
import net.mcreator.stupiddragonblockc.procedures.SpiritProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowNeutralAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowGoodAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowEvilAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.RaceProcedure;
import net.mcreator.stupiddragonblockc.procedures.MultiplierProcedure;
import net.mcreator.stupiddragonblockc.procedures.MindProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseWilProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseStrengthProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseSpiritProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseMindProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseDefenseProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoIncreaseConProcedure;
import net.mcreator.stupiddragonblockc.procedures.ConstitutionProcedure;
import net.mcreator.stupiddragonblockc.procedures.AmountToBuyProcedure;
import net.mcreator.stupiddragonblockc.procedures.AmountOfTPProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlignmentStatsProcedure;
import net.mcreator.stupiddragonblockc.network.StatMenuButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StatMenuScreen extends AbstractContainerScreen<StatMenuMenu> {
	private final static HashMap<String, Object> guistate = StatMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;
	ImageButton imagebutton_button2;
	ImageButton imagebutton_button3;
	ImageButton imagebutton_button4;
	ImageButton imagebutton_button5;
	ImageButton imagebutton_button6;
	ImageButton imagebutton_stats;
	ImageButton imagebutton_skillsbutton;
	ImageButton imagebutton_transformationtraining;
	ImageButton imagebutton_techniquetraining;

	public StatMenuScreen(StatMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/stat_menu.png");

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

				TrueStrengthProcedure.execute(entity), 22, 38, -205);
		this.font.draw(poseStack,

				TrueDefenseProcedure.execute(entity), 22, 57, -205);
		this.font.draw(poseStack,

				ConstitutionProcedure.execute(entity), 22, 77, -205);
		this.font.draw(poseStack,

				WillpowerProcedure.execute(entity), 22, 97, -205);
		this.font.draw(poseStack,

				MindProcedure.execute(entity), 22, 118, -205);
		this.font.draw(poseStack,

				SpiritProcedure.execute(entity), 22, 138, -205);
		this.font.draw(poseStack,

				AmountOfTPProcedure.execute(entity), 6, 7, -12829636);
		this.font.draw(poseStack,

				RaceProcedure.execute(entity), 6, 19, -12829636);
		this.font.draw(poseStack,

				TransformationStatsProcedure.execute(entity), 192, 5, -12829636);
		this.font.draw(poseStack,

				TechniqueStatsProcedure.execute(entity), 192, 17, -12829636);
		this.font.draw(poseStack,

				TPtoIncreaseStatProcedure.execute(entity), 217, 152, -12829636);
		if (ShowGoodAlignmentProcedure.execute(entity))
			this.font.draw(poseStack,

					AlignmentStatsProcedure.execute(entity), 192, 30, -6684673);
		this.font.draw(poseStack,

				AmountToBuyProcedure.execute(entity), 236, 139, -12829636);
		this.font.draw(poseStack,

				MultiplierProcedure.execute(entity), 87, 77, -205);
		if (ShowNeutralAlignmentProcedure.execute(entity))
			this.font.draw(poseStack,

					AlignmentStatsProcedure.execute(entity), 192, 30, -5340220);
		if (ShowEvilAlignmentProcedure.execute(entity))
			this.font.draw(poseStack,

					AlignmentStatsProcedure.execute(entity), 192, 30, -3407872);
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
			if (DoIncreaseStrengthProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(0, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseStrengthProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 4, this.topPos + 54, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button1.png"), 16, 32, e -> {
			if (DoIncreaseDefenseProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(1, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseDefenseProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
		imagebutton_button2 = new ImageButton(this.leftPos + 4, this.topPos + 74, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button2.png"), 16, 32, e -> {
			if (DoIncreaseConProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(2, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseConProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button2", imagebutton_button2);
		this.addRenderableWidget(imagebutton_button2);
		imagebutton_button3 = new ImageButton(this.leftPos + 4, this.topPos + 94, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button3.png"), 16, 32, e -> {
			if (DoIncreaseWilProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(3, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseWilProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button3", imagebutton_button3);
		this.addRenderableWidget(imagebutton_button3);
		imagebutton_button4 = new ImageButton(this.leftPos + 4, this.topPos + 114, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button4.png"), 16, 32, e -> {
			if (DoIncreaseMindProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(4, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseMindProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button4", imagebutton_button4);
		this.addRenderableWidget(imagebutton_button4);
		imagebutton_button5 = new ImageButton(this.leftPos + 4, this.topPos + 135, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button5.png"), 16, 32, e -> {
			if (DoIncreaseSpiritProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(5, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoIncreaseSpiritProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button5", imagebutton_button5);
		this.addRenderableWidget(imagebutton_button5);
		imagebutton_button6 = new ImageButton(this.leftPos + 217, this.topPos + 134, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button6.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(6, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button6", imagebutton_button6);
		this.addRenderableWidget(imagebutton_button6);
		imagebutton_stats = new ImageButton(this.leftPos + 2, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_stats.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(7, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stats", imagebutton_stats);
		this.addRenderableWidget(imagebutton_stats);
		imagebutton_skillsbutton = new ImageButton(this.leftPos + 21, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_skillsbutton.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(8, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillsbutton", imagebutton_skillsbutton);
		this.addRenderableWidget(imagebutton_skillsbutton);
		imagebutton_transformationtraining = new ImageButton(this.leftPos + 41, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_transformationtraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(9, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_transformationtraining", imagebutton_transformationtraining);
		this.addRenderableWidget(imagebutton_transformationtraining);
		imagebutton_techniquetraining = new ImageButton(this.leftPos + 60, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_techniquetraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new StatMenuButtonMessage(10, x, y, z));
				StatMenuButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_techniquetraining", imagebutton_techniquetraining);
		this.addRenderableWidget(imagebutton_techniquetraining);
	}
}
