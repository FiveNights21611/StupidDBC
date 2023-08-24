
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stupiddragonblockc.client.renderer.WhisMasterRenderer;
import net.mcreator.stupiddragonblockc.client.renderer.VegetaSS1Renderer;
import net.mcreator.stupiddragonblockc.client.renderer.KingKaiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StupidDbcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StupidDbcModEntities.KING_KAI.get(), KingKaiRenderer::new);
		event.registerEntityRenderer(StupidDbcModEntities.VEGETA_SS_1.get(), VegetaSS1Renderer::new);
		event.registerEntityRenderer(StupidDbcModEntities.WHIS_MASTER.get(), WhisMasterRenderer::new);
	}
}
