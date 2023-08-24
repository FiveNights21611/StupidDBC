package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.MakeCharacterMenu;
import net.mcreator.stupiddragonblockc.procedures.PlayerEntityShowInMenuProcedure;
import net.mcreator.stupiddragonblockc.procedures.InBetweenRaceProcedure;
import net.mcreator.stupiddragonblockc.network.MakeCharacterButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MakeCharacterScreen extends AbstractContainerScreen<MakeCharacterMenu> {
	private final static HashMap<String, Object> guistate = MakeCharacterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_change_race;
	Button button_create_character;

	public MakeCharacterScreen(MakeCharacterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 236;
		this.imageHeight = 100;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/make_character.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (PlayerEntityShowInMenuProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 36, this.topPos + 96, 50, 0f + (float) Math.atan((this.leftPos + 36 - mouseX) / 40.0), (float) Math.atan((this.topPos + 46 - mouseY) / 40.0), livingEntity);
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
		this.font.draw(poseStack,

				InBetweenRaceProcedure.execute(entity), 160, 37, -12829636);
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
		button_change_race = new Button(this.leftPos + 76, this.topPos + 32, 82, 20, Component.translatable("gui.stupid_dbc.make_character.button_change_race"), e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new MakeCharacterButtonMessage(0, x, y, z));
				MakeCharacterButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_change_race", button_change_race);
		this.addRenderableWidget(button_change_race);
		button_create_character = new Button(this.leftPos + 102, this.topPos + 75, 108, 20, Component.translatable("gui.stupid_dbc.make_character.button_create_character"), e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new MakeCharacterButtonMessage(1, x, y, z));
				MakeCharacterButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_create_character", button_create_character);
		this.addRenderableWidget(button_create_character);
	}
}
