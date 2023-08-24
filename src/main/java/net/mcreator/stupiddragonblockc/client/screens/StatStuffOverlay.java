
package net.mcreator.stupiddragonblockc.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
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
		if (StatStuffShowProcedure.execute(entity)) {
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						HPProcedure.execute(entity), posX + -213, posY + -120, -65536);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						KiProcedure.execute(entity), posX + -213, posY + -108, -16724788);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						TransformationProcedure.execute(entity), posX + -213, posY + -73, -1);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						TechniqueProcedure.execute(entity), posX + -213, posY + -61, -1);
			if (StatStuffShowProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						PowerPercentageProcedure.execute(entity), posX + -213, posY + -97, -1);
			if (ShowGoodAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -213, posY + -85, -6684673);
			if (ShowNeutralAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -213, posY + -85, -5537343);
			if (ShowEvilAlignmentProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						AlignmentStatsProcedure.execute(entity), posX + -213, posY + -85, -3407872);
			if (ShowUltraInstinctHeatProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						GetUIHeatProcedure.execute(entity), posX + -213, posY + -49, -1);
		}
	}
}
