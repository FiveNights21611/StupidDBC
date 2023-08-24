package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.TechniqueTrainingMenuMenu;
import net.mcreator.stupiddragonblockc.procedures.ShowUltraInstinctOmenProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx5Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx50Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx4Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx3Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx2Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx20Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx10Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenx100Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetUIOmenTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx5TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx50TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx4TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx3TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx2TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx20TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx10TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenx100TrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetKaiokenTrainingProcedure;
import net.mcreator.stupiddragonblockc.network.TechniqueTrainingMenuButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TechniqueTrainingMenuScreen extends AbstractContainerScreen<TechniqueTrainingMenuMenu> {
	private final static HashMap<String, Object> guistate = TechniqueTrainingMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_stats;
	ImageButton imagebutton_skillsbutton;
	ImageButton imagebutton_transformationtraining;
	ImageButton imagebutton_techniquetraining;

	public TechniqueTrainingMenuScreen(TechniqueTrainingMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 225;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/technique_training_menu.png");

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
		if (ShowKaiokenx4Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx4TrainingProcedure.execute(entity), 3, 31, -52429);
		if (ShowKaiokenx5Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx5TrainingProcedure.execute(entity), 3, 40, -65536);
		if (ShowKaiokenx10Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx10TrainingProcedure.execute(entity), 3, 49, -3407872);
		if (ShowKaiokenx20Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx20TrainingProcedure.execute(entity), 3, 58, -6750208);
		if (ShowKaiokenx50Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx50TrainingProcedure.execute(entity), 3, 67, -10092544);
		if (ShowUltraInstinctOmenProcedure.execute(entity))
			this.font.draw(poseStack,

					GetUIOmenTrainingProcedure.execute(entity), 3, 86, -3342337);
		if (ShowKaiokenx2Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx2TrainingProcedure.execute(entity), 3, 12, -26215);
		if (ShowKaiokenProcedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenTrainingProcedure.execute(entity), 3, 2, -13108);
		if (ShowKaiokenx3Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx3TrainingProcedure.execute(entity), 3, 21, -39322);
		if (ShowKaiokenx100Procedure.execute(entity))
			this.font.draw(poseStack,

					GetKaiokenx100TrainingProcedure.execute(entity), 3, 77, -13434880);
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
		imagebutton_stats = new ImageButton(this.leftPos + 2, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_stats.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TechniqueTrainingMenuButtonMessage(0, x, y, z));
				TechniqueTrainingMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stats", imagebutton_stats);
		this.addRenderableWidget(imagebutton_stats);
		imagebutton_skillsbutton = new ImageButton(this.leftPos + 21, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_skillsbutton.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TechniqueTrainingMenuButtonMessage(1, x, y, z));
				TechniqueTrainingMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillsbutton", imagebutton_skillsbutton);
		this.addRenderableWidget(imagebutton_skillsbutton);
		imagebutton_transformationtraining = new ImageButton(this.leftPos + 41, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_transformationtraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TechniqueTrainingMenuButtonMessage(2, x, y, z));
				TechniqueTrainingMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_transformationtraining", imagebutton_transformationtraining);
		this.addRenderableWidget(imagebutton_transformationtraining);
		imagebutton_techniquetraining = new ImageButton(this.leftPos + 61, this.topPos + 167, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_techniquetraining.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new TechniqueTrainingMenuButtonMessage(3, x, y, z));
				TechniqueTrainingMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_techniquetraining", imagebutton_techniquetraining);
		this.addRenderableWidget(imagebutton_techniquetraining);
	}
}
