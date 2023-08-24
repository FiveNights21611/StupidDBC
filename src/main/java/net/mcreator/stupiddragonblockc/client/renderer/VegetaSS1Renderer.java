
package net.mcreator.stupiddragonblockc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.stupiddragonblockc.entity.VegetaSS1Entity;
import net.mcreator.stupiddragonblockc.client.model.ModelVEGETA_SS_1;

public class VegetaSS1Renderer extends MobRenderer<VegetaSS1Entity, ModelVEGETA_SS_1<VegetaSS1Entity>> {
	public VegetaSS1Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelVEGETA_SS_1(context.bakeLayer(ModelVEGETA_SS_1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VegetaSS1Entity entity) {
		return new ResourceLocation("stupid_dbc:textures/entities/the_vegeta.png");
	}
}
