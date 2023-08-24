
package net.mcreator.stupiddragonblockc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.stupiddragonblockc.entity.WhisMasterEntity;
import net.mcreator.stupiddragonblockc.client.model.ModelWhis_Master;

public class WhisMasterRenderer extends MobRenderer<WhisMasterEntity, ModelWhis_Master<WhisMasterEntity>> {
	public WhisMasterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWhis_Master(context.bakeLayer(ModelWhis_Master.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhisMasterEntity entity) {
		return new ResourceLocation("stupid_dbc:textures/entities/whis.png");
	}
}
