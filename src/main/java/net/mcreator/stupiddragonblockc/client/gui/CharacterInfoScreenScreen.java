package net.mcreator.stupiddragonblockc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.world.inventory.CharacterInfoScreenMenu;
import net.mcreator.stupiddragonblockc.procedures.ShowTailEnabledProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowSaiyanNameProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowEnableTailProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowEarthNameProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetTailProcedure;
import net.mcreator.stupiddragonblockc.network.CharacterInfoScreenButtonMessage;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CharacterInfoScreenScreen extends AbstractContainerScreen<CharacterInfoScreenMenu> {
	private final static HashMap<String, Object> guistate = CharacterInfoScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox SaiyanName;
	EditBox EarthName;
	Checkbox hasEarthName;
	Button button_finish_making_character;
	ImageButton imagebutton_buttonnew;

	public CharacterInfoScreenScreen(CharacterInfoScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stupid_dbc:textures/screens/character_info_screen.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		SaiyanName.render(ms, mouseX, mouseY, partialTicks);
		EarthName.render(ms, mouseX, mouseY, partialTicks);
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
		if (SaiyanName.isFocused())
			return SaiyanName.keyPressed(key, b, c);
		if (EarthName.isFocused())
			return EarthName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		SaiyanName.tick();
		EarthName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		if (ShowSaiyanNameProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.character_info_screen.label_what_is_your_saiyan_name"), 2, 3, -12829636);
		if (ShowEarthNameProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.stupid_dbc.character_info_screen.label_what_is_your_earth_name"), 2, 70, -12829636);
		if (ShowTailEnabledProcedure.execute(entity))
			this.font.draw(poseStack,

					GetTailProcedure.execute(entity), 20, 109, -12829636);
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
		SaiyanName = new EditBox(this.font, this.leftPos + 2, this.topPos + 13, 120, 20, Component.translatable("gui.stupid_dbc.character_info_screen.SaiyanName")) {
			{
				setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.SaiyanName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.SaiyanName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.SaiyanName").getString());
				else
					setSuggestion(null);
			}
		};
		SaiyanName.setMaxLength(32767);
		guistate.put("text:SaiyanName", SaiyanName);
		this.addWidget(this.SaiyanName);
		EarthName = new EditBox(this.font, this.leftPos + 2, this.topPos + 81, 120, 20, Component.translatable("gui.stupid_dbc.character_info_screen.EarthName")) {
			{
				setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.EarthName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.EarthName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.stupid_dbc.character_info_screen.EarthName").getString());
				else
					setSuggestion(null);
			}
		};
		EarthName.setMaxLength(32767);
		guistate.put("text:EarthName", EarthName);
		this.addWidget(this.EarthName);
		button_finish_making_character = new Button(this.leftPos + 14, this.topPos + 141, 145, 20, Component.translatable("gui.stupid_dbc.character_info_screen.button_finish_making_character"), e -> {
			if (true) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new CharacterInfoScreenButtonMessage(0, x, y, z));
				CharacterInfoScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_finish_making_character", button_finish_making_character);
		this.addRenderableWidget(button_finish_making_character);
		imagebutton_buttonnew = new ImageButton(this.leftPos + 3, this.topPos + 105, 16, 16, 0, 0, 16, new ResourceLocation("stupid_dbc:textures/screens/atlas/imagebutton_buttonnew.png"), 16, 32, e -> {
			if (ShowEnableTailProcedure.execute(entity)) {
				StupidDbcMod.PACKET_HANDLER.sendToServer(new CharacterInfoScreenButtonMessage(1, x, y, z));
				CharacterInfoScreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowEnableTailProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonnew", imagebutton_buttonnew);
		this.addRenderableWidget(imagebutton_buttonnew);
		hasEarthName = new Checkbox(this.leftPos + 2, this.topPos + 37, 20, 20, Component.translatable("gui.stupid_dbc.character_info_screen.hasEarthName"), false);
		guistate.put("checkbox:hasEarthName", hasEarthName);
		this.addRenderableWidget(hasEarthName);
	}
}
