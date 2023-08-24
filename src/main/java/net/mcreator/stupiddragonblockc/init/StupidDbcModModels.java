
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stupiddragonblockc.client.model.Modelsaiyan_tail;
import net.mcreator.stupiddragonblockc.client.model.Modelperson;
import net.mcreator.stupiddragonblockc.client.model.ModelkingKai;
import net.mcreator.stupiddragonblockc.client.model.ModelWhis_Master;
import net.mcreator.stupiddragonblockc.client.model.ModelVEGETA_SS_1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StupidDbcModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWhis_Master.LAYER_LOCATION, ModelWhis_Master::createBodyLayer);
		event.registerLayerDefinition(Modelsaiyan_tail.LAYER_LOCATION, Modelsaiyan_tail::createBodyLayer);
		event.registerLayerDefinition(ModelkingKai.LAYER_LOCATION, ModelkingKai::createBodyLayer);
		event.registerLayerDefinition(Modelperson.LAYER_LOCATION, Modelperson::createBodyLayer);
		event.registerLayerDefinition(ModelVEGETA_SS_1.LAYER_LOCATION, ModelVEGETA_SS_1::createBodyLayer);
	}
}
