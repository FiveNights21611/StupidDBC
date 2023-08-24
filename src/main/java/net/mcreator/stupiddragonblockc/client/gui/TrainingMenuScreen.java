package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.TrainingMenuMenu;
import net.mcreator.stupiddragonblockc.procedures.UltimateTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowUltimateTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSBlueProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSBEProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSS4Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSS4LBProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowOozaruProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowGoldenOozaruProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowGodKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowDemonicKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowBeastTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSGodTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSGodShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSG3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSG3Procedure;
import net.mcreator.stupiddragonblockc.procedures.SSG2TrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSG2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSG1TrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSBlueTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSBlueSHTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS4TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS4LBTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS3TrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS2TrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.OozaruTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GoldenOozaruTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GodKiAbsorbedProcedure;
import net.mcreator.stupiddragonblockc.procedures.FPSSTrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.FPSSTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.DemonicKiAbsorbedProcedure;
import net.mcreator.stupiddragonblockc.procedures.BuffedTrainingShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.BuffedTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.BeastTrainingProcedure;
import net.mcreator.stupiddragonblockc.network.TrainingMenuButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TrainingMenuScreen extends AbstractContainerScreen<TrainingMenuMenu> {
	private final static HashMap<String, Object> guistate = TrainingMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next;
	ImageButton imagebutton_stats;
	ImageButton imagebutton_skillsbutton;
	ImageButton imagebutton_transformationtraining;
	ImageButton imagebutton_techniquetraining;

	public TrainingMenuScreen(TrainingMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 225;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/training_menu.png");

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
		if (SSG1TrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					SSTrainingProcedure.execute(entity), 3, 12, -154);
		if (SSG2TrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					SSG2TrainingProcedure.execute(entity), 3, 31, -205);
		if (SSG3Procedure.execute(entity))
			this.font.draw(poseStack,

					SSG3TrainingProcedure.execute(entity), 3, 40, -256);
		if (FPSSTrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					FPSSTrainingProcedure.execute(entity), 2, 12, -256);
		if (SS2TrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					SS2TrainingProcedure.execute(entity), 3, 49, -3355648);
		if (SS3TrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					SS3TrainingProcedure.execute(entity), 3, 58, -10066432);
		if (SSGodShowProcedure.execute(entity))
			this.font.draw(poseStack,

					SSGodTrainingProcedure.execute(entity), 3, 67, -4123114);
		if (ShowSSBlueProcedure.execute(entity))
			this.font.draw(poseStack,

					SSBlueTrainingProcedure.execute(entity), 3, 86, -16495447);
		if (ShowGodKiProcedure.execute(entity))
			this.font.draw(poseStack,

					GodKiAbsorbedProcedure.execute(entity), 5, 151, -6823681);
		if (ShowDemonicKiProcedure.execute(entity))
			this.font.draw(poseStack,

					DemonicKiAbsorbedProcedure.execute(entity), 6, 151, -63480);
		if (BuffedTrainingShowProcedure.execute(entity))
			this.font.draw(poseStack,

					BuffedTrainingProcedure.execute(entity), 3, 12, -103);
		if (ShowOozaruProcedure.execute(entity))
			this.font.draw(poseStack,

					OozaruTrainingProcedure.execute(entity), 3, 2, -10079488);
		if (ShowGoldenOozaruProcedure.execute(entity))
			this.font.draw(poseStack,

					GoldenOozaruTrainingProcedure.execute(entity), 3, 21, -6711040);
		if (ShowSS4Procedure.execute(entity))
			this.font.draw(poseStack,

					SS4TrainingProcedure.execute(entity), 3, 77, -6750208);
		if (ShowSSBEProcedure.execute(entity))
			this.font.draw(poseStack,

					SSBlueSHTrainingProcedure.execute(entity), 3, 105, -16777114);
		if (ShowSS4LBProcedure.execute(entity))
			this.font.draw(poseStack,

					SS4LBTrainingProcedure.execute(entity), 3, 95, -3407872);
		if (ShowUltimateTrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					UltimateTrainingProcedure.execute(entity), 4, 116, -16777216);
		if (ShowBeastTrainingProcedure.execute(entity))
			this.font.draw(poseStack,

					BeastTrainingProcedure.execute(entity), 4, 127, -1);
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
		imagebutton_next = new ImageButton(this.leftPos + 205, this.topPos + -17, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_next.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TrainingMenuButtonMessage(0, x, y, z));
				TrainingMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next", imagebutton_next);
		this.addRenderableWidget(imagebutton_next);
		imagebutton_stats = new ImageButton(this.leftPos + 2, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_stats.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TrainingMenuButtonMessage(1, x, y, z));
				TrainingMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stats", imagebutton_stats);
		this.addRenderableWidget(imagebutton_stats);
		imagebutton_skillsbutton = new ImageButton(this.leftPos + 21, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_skillsbutton.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TrainingMenuButtonMessage(2, x, y, z));
				TrainingMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillsbutton", imagebutton_skillsbutton);
		this.addRenderableWidget(imagebutton_skillsbutton);
		imagebutton_transformationtraining = new ImageButton(this.leftPos + 41, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_transformationtraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TrainingMenuButtonMessage(3, x, y, z));
				TrainingMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_transformationtraining", imagebutton_transformationtraining);
		this.addRenderableWidget(imagebutton_transformationtraining);
		imagebutton_techniquetraining = new ImageButton(this.leftPos + 61, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_techniquetraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TrainingMenuButtonMessage(4, x, y, z));
				TrainingMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_techniquetraining", imagebutton_techniquetraining);
		this.addRenderableWidget(imagebutton_techniquetraining);
	}
}
