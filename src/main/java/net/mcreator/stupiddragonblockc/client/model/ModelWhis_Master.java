package net.mcreator.stupiddragonblockc.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelWhis_Master<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stupid_dbc", "model_whis_master"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelWhis_Master(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition cube_r1 = Hair.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 55).addBox(-3.99F, -2.5F, -4.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-0.01F, -2.5F, -4.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Hair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 55).addBox(-3.99F, -9.0F, -12.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-0.01F, -9.0F, -12.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Hair.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 55).addBox(-3.99F, -14.0F, -0.5F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-0.01F, -14.0F, -0.5F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-3.99F, -14.0F, -3.5F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-0.01F, -14.0F, -3.5F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 52).addBox(-3.99F, -7.0F, -4.0F, 4.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 52).addBox(-0.01F, -7.0F, -4.0F, 4.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(6, 29).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-3.0F, 2.0F, -8.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Staff = RightArm.addOrReplaceChild("Staff",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -7.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -2.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -2.0F, -5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -2.0F, -7.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Staff.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 0).addBox(4.0F, 0.5F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 1)
				.addBox(2.5F, 2.0F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 1).addBox(2.5F, -1.0F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, -1.5708F));
		PartDefinition cube_r6 = Staff.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(57, 1).addBox(-1.0F, -6.5F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 1).addBox(-1.0F, -3.5F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r7 = Staff.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, -2.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(5.0F, -2.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
