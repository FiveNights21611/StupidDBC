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
public class Modelsaiyan_tail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stupid_dbc", "modelsaiyan_tail"), "main");
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart TailPart1;
	public final ModelPart TailPart2;
	public final ModelPart TailPart3;
	public final ModelPart TailPart4;

	public Modelsaiyan_tail(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Tail = root.getChild("Tail");
		this.TailPart1 = root.getChild("TailPart1");
		this.TailPart2 = root.getChild("TailPart2");
		this.TailPart3 = root.getChild("TailPart3");
		this.TailPart4 = root.getChild("TailPart4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 2.0F));
		PartDefinition TailPart1 = Tail.addOrReplaceChild("TailPart1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TailPart1_r1 = TailPart1.addOrReplaceChild("TailPart1_r1", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition TailPart2 = TailPart1.addOrReplaceChild("TailPart2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition TailPart2_r1 = TailPart2.addOrReplaceChild("TailPart2_r1", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.625F, -2.3125F, 0.2618F, 0.0F, 0.0F));
		PartDefinition TailPart3 = TailPart2.addOrReplaceChild("TailPart3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition TailPart3_r1 = TailPart3.addOrReplaceChild("TailPart3_r1", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.4375F, -3.0625F, 0.9599F, 0.0F, 0.0F));
		PartDefinition TailPart4 = TailPart3.addOrReplaceChild("TailPart4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition TailPart4_r1 = TailPart4.addOrReplaceChild("TailPart4_r1", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.125F, -6.0625F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
