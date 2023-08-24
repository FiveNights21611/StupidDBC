package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.ChangeTransformationTypeMenu;
import net.mcreator.stupiddragonblockc.procedures.ShowSSRoseProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSGrade2Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSGodProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSSBlueProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSS2Procedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenTTProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowBuffedProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSRoseProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSGrade2Procedure;
import net.mcreator.stupiddragonblockc.procedures.SSGodProcedure;
import net.mcreator.stupiddragonblockc.procedures.SSBlueProcedure;
import net.mcreator.stupiddragonblockc.procedures.SS2Procedure;
import net.mcreator.stupiddragonblockc.procedures.KaiokenProcedure;
import net.mcreator.stupiddragonblockc.procedures.BuffedProcedure;
import net.mcreator.stupiddragonblockc.network.ChangeTransformationTypeButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChangeTransformationTypeScreen extends AbstractContainerScreen<ChangeTransformationTypeMenu> {
	private final static HashMap<String, Object> guistate = ChangeTransformationTypeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_next;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;
	ImageButton imagebutton_button2;
	ImageButton imagebutton_button3;
	ImageButton imagebutton_button4;

	public ChangeTransformationTypeScreen(ChangeTransformationTypeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/change_transformation_type.png");

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
		if (ShowSSGrade2Procedure.execute(entity))
			this.font.draw(poseStack,

					SSGrade2Procedure.execute(entity), 2, 4, -3355648);
		if (ShowSS2Procedure.execute(entity))
			this.font.draw(poseStack,

					SS2Procedure.execute(entity), 2, 33, -205);
		if (ShowKaiokenTTProcedure.execute(entity))
			this.font.draw(poseStack,

					KaiokenProcedure.execute(entity), 2, 62, -13434880);
		if (ShowSSGodProcedure.execute(entity))
			this.font.draw(poseStack,

					SSGodProcedure.execute(entity), 2, 91, -3407872);
		if (ShowSSBlueProcedure.execute(entity))
			this.font.draw(poseStack,

					SSBlueProcedure.execute(entity), 2, 120, -16750951);
		if (ShowBuffedProcedure.execute(entity))
			this.font.draw(poseStack,

					BuffedProcedure.execute(entity), 2, 4, -3355648);
		if (ShowSSRoseProcedure.execute(entity))
			this.font.draw(poseStack,

					SSRoseProcedure.execute(entity), 2, 120, -39169);
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
		imagebutton_next = new ImageButton(this.leftPos + 156, this.topPos + 177, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_next.png"), 16, 32, e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(0, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next", imagebutton_next);
		this.addRenderableWidget(imagebutton_next);
		imagebutton_button = new ImageButton(this.leftPos + 2, this.topPos + 15, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button.png"), 16, 32, e -> {
			if (ShowSSGrade2Procedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(1, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowSSGrade2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 2, this.topPos + 44, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button1.png"), 16, 32, e -> {
			if (ShowSS2Procedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(2, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowSS2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
		imagebutton_button2 = new ImageButton(this.leftPos + 2, this.topPos + 73, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button2.png"), 16, 32, e -> {
			if (ShowKaiokenTTProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(3, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowKaiokenTTProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button2", imagebutton_button2);
		this.addRenderableWidget(imagebutton_button2);
		imagebutton_button3 = new ImageButton(this.leftPos + 2, this.topPos + 102, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button3.png"), 16, 32, e -> {
			if (ShowSSGodProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(4, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowSSGodProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button3", imagebutton_button3);
		this.addRenderableWidget(imagebutton_button3);
		imagebutton_button4 = new ImageButton(this.leftPos + 2, this.topPos + 131, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button4.png"), 16, 32, e -> {
			if (ShowSSBlueProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new ChangeTransformationTypeButtonMessage(5, x, y, z));
				ChangeTransformationTypeButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowSSBlueProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button4", imagebutton_button4);
		this.addRenderableWidget(imagebutton_button4);
	}
}
