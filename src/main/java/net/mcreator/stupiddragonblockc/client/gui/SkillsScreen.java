package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.SkillsMenu;
import net.mcreator.stupiddragonblockc.procedures.UltimateLevelProcedure;
import net.mcreator.stupiddragonblockc.procedures.TPCostSFProcedure;
import net.mcreator.stupiddragonblockc.procedures.TPCostKaioProcedure;
import net.mcreator.stupiddragonblockc.procedures.TPCostGFProcedure;
import net.mcreator.stupiddragonblockc.procedures.SuperFormLevelProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowUltimateUpgradesProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowGodFormProcedure;
import net.mcreator.stupiddragonblockc.procedures.KaiokenLevelProcedure;
import net.mcreator.stupiddragonblockc.procedures.GodFormLevelProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetThePriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.FlyPriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.FlyLevelProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtUltimateProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtFlyProcedure;
import net.mcreator.stupiddragonblockc.network.SkillsButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillsScreen extends AbstractContainerScreen<SkillsMenu> {
	private final static HashMap<String, Object> guistate = SkillsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;
	ImageButton imagebutton_button2;
	ImageButton imagebutton_button3;
	ImageButton imagebutton_button4;
	ImageButton imagebutton_stats;
	ImageButton imagebutton_skillsbutton;
	ImageButton imagebutton_transformationtraining;
	ImageButton imagebutton_techniquetraining;

	public SkillsScreen(SkillsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/skills.png");

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

				SuperFormLevelProcedure.execute(entity), 20, 9, -12829636);
		this.font.draw(poseStack,

				TPCostSFProcedure.execute(entity), 6, 21, -12829636);
		if (ShowKaiokenProcedure.execute(entity))
			this.font.draw(poseStack,

					KaiokenLevelProcedure.execute(entity), 20, 39, -12829636);
		if (ShowKaiokenProcedure.execute(entity))
			this.font.draw(poseStack,

					TPCostKaioProcedure.execute(entity), 6, 51, -12829636);
		if (ShowGodFormProcedure.execute(entity))
			this.font.draw(poseStack,

					GodFormLevelProcedure.execute(entity), 20, 67, -12829636);
		if (ShowGodFormProcedure.execute(entity))
			this.font.draw(poseStack,

					TPCostGFProcedure.execute(entity), 6, 79, -12829636);
		if (AlreadyBoughtUltimateProcedure.execute(entity))
			this.font.draw(poseStack,

					UltimateLevelProcedure.execute(entity), 20, 97, -12829636);
		if (ShowUltimateUpgradesProcedure.execute(entity))
			this.font.draw(poseStack,

					GetThePriceProcedure.execute(entity), 6, 110, -12829636);
		if (AlreadyBoughtFlyProcedure.execute(entity))
			this.font.draw(poseStack,

					FlyLevelProcedure.execute(entity), 19, 127, -12829636);
		if (AlreadyBoughtFlyProcedure.execute(entity))
			this.font.draw(poseStack,

					FlyPriceProcedure.execute(entity), 6, 139, -12829636);
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
		imagebutton_button = new ImageButton(this.leftPos + 2, this.topPos + 94, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button.png"), 16, 32, e -> {
			if (ShowUltimateUpgradesProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(0, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowUltimateUpgradesProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 2, this.topPos + 5, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button1.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(1, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
		imagebutton_button2 = new ImageButton(this.leftPos + 2, this.topPos + 35, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button2.png"), 16, 32, e -> {
			if (ShowKaiokenProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(2, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowKaiokenProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button2", imagebutton_button2);
		this.addRenderableWidget(imagebutton_button2);
		imagebutton_button3 = new ImageButton(this.leftPos + 2, this.topPos + 63, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button3.png"), 16, 32, e -> {
			if (ShowGodFormProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(3, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowGodFormProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button3", imagebutton_button3);
		this.addRenderableWidget(imagebutton_button3);
		imagebutton_button4 = new ImageButton(this.leftPos + 2, this.topPos + 123, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button4.png"), 16, 32, e -> {
			if (AlreadyBoughtFlyProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(4, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (AlreadyBoughtFlyProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button4", imagebutton_button4);
		this.addRenderableWidget(imagebutton_button4);
		imagebutton_stats = new ImageButton(this.leftPos + 5, this.topPos + 167, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_stats.png"), 12, 24, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(5, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stats", imagebutton_stats);
		this.addRenderableWidget(imagebutton_stats);
		imagebutton_skillsbutton = new ImageButton(this.leftPos + 22, this.topPos + 167, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_skillsbutton.png"), 12, 24, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(6, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillsbutton", imagebutton_skillsbutton);
		this.addRenderableWidget(imagebutton_skillsbutton);
		imagebutton_transformationtraining = new ImageButton(this.leftPos + 39, this.topPos + 167, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_transformationtraining.png"), 12, 24, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(7, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_transformationtraining", imagebutton_transformationtraining);
		this.addRenderableWidget(imagebutton_transformationtraining);
		imagebutton_techniquetraining = new ImageButton(this.leftPos + 56, this.topPos + 167, 12, 12, 0, 0, 12, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_techniquetraining.png"), 12, 24, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(8, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_techniquetraining", imagebutton_techniquetraining);
		this.addRenderableWidget(imagebutton_techniquetraining);
	}
}
