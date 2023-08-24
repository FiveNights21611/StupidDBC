package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.CommunicatorHubMenu;
import net.mcreator.stupiddragonblockc.network.CommunicatorHubButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CommunicatorHubScreen extends AbstractContainerScreen<CommunicatorHubMenu> {
	private final static HashMap<String, Object> guistate = CommunicatorHubMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_goku;
	Button button_picollo;

	public CommunicatorHubScreen(CommunicatorHubMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 106;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/communicator_hub.png");

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
		this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.communicator_hub.label_universal_communicator"), 33, 5, -12829636);
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
		button_goku = new Button(this.leftPos + 5, this.topPos + 21, 46, 20, Component.translatable("gui.stupid_dbc.communicator_hub.button_goku"), e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new CommunicatorHubButtonMessage(0, x, y, z));
				CommunicatorHubButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_goku", button_goku);
		this.addRenderableWidget(button_goku);
		button_picollo = new Button(this.leftPos + 5, this.topPos + 53, 61, 20, Component.translatable("gui.stupid_dbc.communicator_hub.button_picollo"), e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new CommunicatorHubButtonMessage(1, x, y, z));
				CommunicatorHubButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_picollo", button_picollo);
		this.addRenderableWidget(button_picollo);
	}
}
