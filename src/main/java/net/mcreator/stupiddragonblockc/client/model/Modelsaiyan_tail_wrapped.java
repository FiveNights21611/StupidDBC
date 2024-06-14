package net.mcreator.stupiddragonblockc.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsaiyan_tail_wrapped<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stupid_dbc", "modelsaiyan_tail_wrapped"), "main");
	public final ModelPart Body;
	public final ModelPart WrappedTail;
	public final ModelPart TailPart5;
	public final ModelPart TailPart6;
	public final ModelPart TailPart7;
	public final ModelPart TailPart8;

	public Modelsaiyan_tail_wrapped(ModelPart root) {
		this.Body = root.getChild("Body");
		this.WrappedTail = root.getChild("WrappedTail");
		this.TailPart5 = root.getChild("TailPart5");
		this.TailPart6 = root.getChild("TailPart6");
		this.TailPart7 = root.getChild("TailPart7");
		this.TailPart8 = root.getChild("TailPart8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition WrappedTail = Body.addOrReplaceChild("WrappedTail", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 2.0F));
		PartDefinition TailPart5 = WrappedTail.addOrReplaceChild("TailPart5", CubeListBuilder.create().texOffs(-1, 61).addBox(-5.0F, -1.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TailPart6 = TailPart5.addOrReplaceChild("TailPart6", CubeListBuilder.create().texOffs(35, 34).addBox(4.0F, -1.0F, -10.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition TailPart7 = TailPart6.addOrReplaceChild("TailPart7", CubeListBuilder.create().texOffs(-1, 61).addBox(-5.0F, -1.0F, -17.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition TailPart8 = TailPart7.addOrReplaceChild("TailPart8", CubeListBuilder.create().texOffs(35, 34).addBox(-5.0F, -1.0F, -22.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
