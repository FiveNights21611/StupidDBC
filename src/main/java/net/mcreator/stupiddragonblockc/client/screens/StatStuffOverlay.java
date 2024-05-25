
package net.mcreator.stupiddragonblockc.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.procedures.TransformationProcedure;
import net.mcreator.stupiddragonblockc.procedures.TechniqueProcedure;
import net.mcreator.stupiddragonblockc.procedures.StatStuffShowProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowUltraInstinctHeatProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowNeutralAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowGoodAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.ShowEvilAlignmentProcedure;
import net.mcreator.stupiddragonblockc.procedures.PowerPercentageProcedure;
import net.mcreator.stupiddragonblockc.procedures.KiProcedure;
import net.mcreator.stupiddragonblockc.procedures.HPProcedure;
import net.mcreator.stupiddragonblockc.procedures.GetUIHeatProcedure;
import net.mcreator.stupiddragonblockc.procedures.AlignmentStatsProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StatStuffOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (StatStuffShowProcedure.execute(entity)) {
			if (StatStuffShowProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("stupid_dbc:textures/screens/blankstatstuff.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -214, posY + -120, 0, 0, 168, 60, 168, 60);
			}
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						HPProcedure.execute(entity), posX + -150, posY + -104, -65536);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						KiProcedure.execute(entity), posX + -150, posY + -84, -16724788);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						TransformationProcedure.execute(entity), posX + -159, posY + -53, -1);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						TechniqueProcedure.execute(entity), posX + -159, posY + -41, -1);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						PowerPercentageProcedure.execute(entity), posX + -196, posY + -96, -1);
			if (ShowGoodAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -159, posY + -66, -6684673);
			if (ShowNeutralAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -159, posY + -66, -5537343);
			if (ShowEvilAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -159, posY + -66, -3407872);
			if (ShowUltraInstinctHeatProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						GetUIHeatProcedure.execute(entity), posX + -23, posY + 8, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
