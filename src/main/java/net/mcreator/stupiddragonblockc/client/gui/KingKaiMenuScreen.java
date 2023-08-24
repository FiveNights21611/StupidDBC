package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.KingKaiMenuMenu;
import net.mcreator.stupiddragonblockc.procedures.TPCostKaioProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowThePriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowKaiokenProcedure;
import net.mcreator.stupiddragonblockc.procedures.KingKaiEntityShowInMenuProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetThePriceProcedure;
import net.mcreator.stupiddragonblockc.procedures.DoNotShowKaiokenInVendorProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlreadyBoughtUltimateProcedure;
import net.mcreator.stupiddragonblockc.network.KingKaiMenuButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class KingKaiMenuScreen extends AbstractContainerScreen<KingKaiMenuMenu> {
	private final static HashMap<String, Object> guistate = KingKaiMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;

	public KingKaiMenuScreen(KingKaiMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/king_kai_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (KingKaiEntityShowInMenuProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 171, this.topPos + 161, 50, 0f + (float) Math.atan((this.leftPos + 171 - mouseX) / 40.0), (float) Math.atan((this.topPos + 111 - mouseY) / 40.0), livingEntity);
		}
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
		if (DoNotShowKaiokenInVendorProcedure.execute(entity))
			this.font.draw(poseStack,

					TPCostKaioProcedure.execute(entity), 69, 21, -12829636);
		if (ShowKaiokenProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.king_kai_menu.label_already_bought_kaioken"), 69, 21, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.king_kai_menu.label_kaioken"), 24, 21, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.king_kai_menu.label_king_kai"), 78, 3, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.king_kai_menu.label_ultimate"), 24, 52, -12829636);
		if (ShowThePriceProcedure.execute(entity))
			this.font.draw(poseStack,

					GetThePriceProcedure.execute(entity), 70, 52, -12829636);
		if (AlreadyBoughtUltimateProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.king_kai_menu.label_already_bought_ultimate"), 69, 52, -12829636);
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
		imagebutton_button = new ImageButton(this.leftPos + 7, this.topPos + 18, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button.png"), 16, 32, e -> {
			if (DoNotShowKaiokenInVendorProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new KingKaiMenuButtonMessage(0, x, y, z));
				KingKaiMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DoNotShowKaiokenInVendorProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 7, this.topPos + 49, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_button1.png"), 16, 32, e -> {
			if (ShowThePriceProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new KingKaiMenuButtonMessage(1, x, y, z));
				KingKaiMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowThePriceProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
	}
}