package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.TransformationTrainingPage2Menu;
import net.mcreator.stupiddragonblockc.procedures.TPGTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowTPGProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSRose3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSRose2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSBlue3Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSBlue2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetSSRose3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetSSRose2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetSSBlue3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetSSBlue2TrainingProcedure;
import net.mcreator.stupiddragonblockc.network.TransformationTrainingPage2ButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TransformationTrainingPage2Screen extends AbstractContainerScreen<TransformationTrainingPage2Menu> {
	private final static HashMap<String, Object> guistate = TransformationTrainingPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_previous;
	ImageButton imagebutton_stats;
	ImageButton imagebutton_skillsbutton;
	ImageButton imagebutton_transformationtraining;
	ImageButton imagebutton_techniquetraining;

	public TransformationTrainingPage2Screen(TransformationTrainingPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 225;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/transformation_training_page_2.png");

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
		if (ShowSSBlue2TrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					GetSSBlue2TrainingProcedure.execute(entity), 4, 4, -16777114);
		if (ShowSSBlue3Procedure.execute(entity))
			this.font.draw(poseStack,

					GetSSBlue3TrainingProcedure.execute(entity), 4, 14, -16777165);
		if (ShowSSRose2TrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					GetSSRose2TrainingProcedure.execute(entity), 4, 4, -6750055);
		if (ShowSSRose3TrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					GetSSRose3TrainingProcedure.execute(entity), 4, 14, -10092442);
		if (ShowTPGProcedure.execute(entity))
			this.font.draw(poseStack,

					TPGTrainingProcedure.execute(entity), 4, 26, -13421824);
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
		imagebutton_previous = new ImageButton(this.leftPos + 4, this.topPos + -17, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_previous.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTrainingPage2ButtonMessage(0, x, y, z));
				TransformationTrainingPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_previous", imagebutton_previous);
		this.addRenderableWidget(imagebutton_previous);
		imagebutton_stats = new ImageButton(this.leftPos + 2, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_stats.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTrainingPage2ButtonMessage(1, x, y, z));
				TransformationTrainingPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stats", imagebutton_stats);
		this.addRenderableWidget(imagebutton_stats);
		imagebutton_skillsbutton = new ImageButton(this.leftPos + 21, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_skillsbutton.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTrainingPage2ButtonMessage(2, x, y, z));
				TransformationTrainingPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillsbutton", imagebutton_skillsbutton);
		this.addRenderableWidget(imagebutton_skillsbutton);
		imagebutton_transformationtraining = new ImageButton(this.leftPos + 41, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_transformationtraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTrainingPage2ButtonMessage(3, x, y, z));
				TransformationTrainingPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_transformationtraining", imagebutton_transformationtraining);
		this.addRenderableWidget(imagebutton_transformationtraining);
		imagebutton_techniquetraining = new ImageButton(this.leftPos + 61, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_techniquetraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TransformationTrainingPage2ButtonMessage(4, x, y, z));
				TransformationTrainingPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_techniquetraining", imagebutton_techniquetraining);
		this.addRenderableWidget(imagebutton_techniquetraining);
	}
}
