// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVEGETA_SS_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vegeta_ss_1"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelVEGETA_SS_1(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(0.0F, -15.0F, -3.49F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-2.0F, -16.0F, -0.99F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hair.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -7.0F, 2.5F, -1.4483F, -1.4804F, 1.3932F));

		PartDefinition cube_r2 = Hair.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -7.0F, 2.5F, -1.918F, -1.4754F, 1.8649F));

		PartDefinition cube_r3 = Hair.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -9.5F, 2.5F, -1.918F, -1.4754F, 1.8649F));

		PartDefinition cube_r4 = Hair.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -9.5F, 2.5F, -1.4483F, -1.4804F, 1.3932F));

		PartDefinition cube_r5 = Hair.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 2.5F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -11.5F, 2.5F, -1.4483F, -1.4804F, 1.3932F));

		PartDefinition cube_r6 = Hair.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -11.5F, 2.5F, -1.918F, -1.4754F, 1.8649F));

		PartDefinition cube_r7 = Hair.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 2.5F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -12.0F, -0.5F, -1.4483F, -1.4804F, 1.3932F));

		PartDefinition cube_r8 = Hair.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 1.5F, 6.75F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -12.0F, -0.5F, -1.918F, -1.4754F, 1.8649F));

		PartDefinition cube_r9 = Hair.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(80, 100).addBox(-3.75F, 1.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -12.0F, -0.5F, -0.5663F, -1.403F, 0.5053F));

		PartDefinition cube_r10 = Hair.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 2.5F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -11.0F, -0.5F, -1.4483F, -1.4804F, 1.5241F));

		PartDefinition cube_r11 = Hair.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(-2.75F, 1.0F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-1.5F, 1.5F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -11.0F, -0.5F, -1.918F, -1.4754F, 1.9958F));

		PartDefinition cube_r12 = Hair.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 2.5F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -10.5F, 2.5F, -1.4483F, -1.4804F, 1.5241F));

		PartDefinition cube_r13 = Hair.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -10.5F, 2.5F, -1.918F, -1.4754F, 1.9958F));

		PartDefinition cube_r14 = Hair.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -8.5F, 2.5F, -1.4483F, -1.4804F, 1.5241F));

		PartDefinition cube_r15 = Hair.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -8.5F, 2.5F, -1.918F, -1.4754F, 1.9958F));

		PartDefinition cube_r16 = Hair.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -6.0F, 2.5F, -1.918F, -1.4754F, 1.9958F));

		PartDefinition cube_r17 = Hair.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -6.0F, 2.5F, -1.4483F, -1.4804F, 1.5241F));

		PartDefinition cube_r18 = Hair.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.5F, -3.0F, 0.0761F, 0.0478F, 0.003F));

		PartDefinition cube_r19 = Hair.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(-1.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-3.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.5F, -3.0F, 0.0761F, 0.0043F, -0.0003F));

		PartDefinition cube_r20 = Hair.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(80, 100).addBox(-6.0F, 3.0F, 6.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.5F, -3.0F, 0.0761F, -0.0392F, -0.0036F));

		PartDefinition cube_r21 = Hair.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(80, 100).addBox(-4.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.5F, -3.0F, 0.0761F, 0.0043F, -0.0003F));

		PartDefinition cube_r22 = Hair.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 2.0F, 6.25F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.5F, -2.0F, -0.0986F, 0.0476F, -0.0053F));

		PartDefinition cube_r23 = Hair.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(-1.5F, 2.0F, 6.25F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-3.5F, 2.0F, 6.25F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.5F, -2.0F, -0.0985F, 0.0042F, -0.001F));

		PartDefinition cube_r24 = Hair.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(80, 100).addBox(-6.0F, 2.0F, 6.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.5F, -2.0F, -0.0986F, -0.0392F, 0.0033F));

		PartDefinition cube_r25 = Hair.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(80, 100).addBox(-4.5F, 2.0F, 6.25F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.5F, -2.0F, -0.0985F, 0.0042F, -0.001F));

		PartDefinition cube_r26 = Hair.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(80, 100).addBox(-4.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -0.0548F, 0.0043F, -0.0009F));

		PartDefinition cube_r27 = Hair.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(80, 100).addBox(-6.0F, 3.0F, 6.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -0.0549F, -0.0393F, 0.0015F));

		PartDefinition cube_r28 = Hair.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(-3.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-1.5F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -0.0548F, 0.0043F, -0.0009F));

		PartDefinition cube_r29 = Hair.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(80, 100).addBox(0.0F, 3.0F, 6.25F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -0.0549F, 0.0478F, -0.0032F));

		PartDefinition cube_r30 = Hair.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(2.5F, -6.0F, -2.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(1.5F, -7.0F, -2.25F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-0.5F, -6.0F, -2.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -2.8283F, -1.392F, 2.8323F));

		PartDefinition cube_r31 = Hair.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(0.0F, -5.0F, -1.75F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-1.5F, -6.0F, -1.75F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -2.0F, -0.0553F, -0.1264F, 0.0064F));

		PartDefinition cube_r32 = Hair.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.0F, -6.0F, -0.25F, 2.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.0F, -3.5F, -0.0447F, 0.218F, -0.0969F));

		PartDefinition cube_r33 = Hair.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(80, 100).addBox(-2.0F, -15.0F, 4.01F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0149F, -0.4809F, 0.0359F));

		PartDefinition cube_r34 = Hair.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(80, 100).addBox(-0.5F, -15.0F, 4.01F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0287F, -1.0917F, 0.0173F));

		PartDefinition cube_r35 = Hair.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(80, 100).addBox(1.0F, -16.0F, 2.01F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.055F, -1.4389F, -3.0565F));

		PartDefinition cube_r36 = Hair.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(80, 100).addBox(1.0F, -16.0F, -4.49F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0113F, -1.4389F, -3.0565F));

		PartDefinition cube_r37 = Hair.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(80, 100).addBox(-3.0F, -16.0F, -4.49F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1359F, -0.1308F, 3.0983F));

		PartDefinition cube_r38 = Hair.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(80, 100).addBox(-2.0F, -16.0F, -4.49F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, -0.1309F, 3.0543F));

		PartDefinition cube_r39 = Hair.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(80, 100).addBox(-2.0F, -16.0F, -3.49F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.5236F, 3.0543F));

		PartDefinition cube_r40 = Hair.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(80, 100)
						.addBox(-0.5F, -16.0F, -2.99F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 100)
						.addBox(-2.5F, -16.0F, -1.49F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, -0.0873F));

		PartDefinition cube_r41 = Hair.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(80, 100).addBox(-1.5F, -16.0F, -1.99F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, -0.0873F));

		PartDefinition cube_r42 = Hair.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(80, 100).addBox(2.0F, -16.0F, -1.99F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, -0.0873F));

		PartDefinition cube_r43 = Hair
				.addOrReplaceChild("cube_r43",
						CubeListBuilder.create().texOffs(80, 100).addBox(-0.5F, -15.0F, -3.99F, 2.0F, 8.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 94)
						.addBox(-4.0F, 1.0F, -2.5F, 8.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 125)
						.addBox(-2.0F, 6.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 125)
						.addBox(-2.0F, 8.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 125)
						.addBox(-2.0F, 10.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 88)
						.addBox(-4.0F, 2.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 88)
						.addBox(0.0F, 2.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(36, 28)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(-6.5F, -3.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(116, 9)
						.addBox(-8.5F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r44 = LeftArm.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(96, 0)
						.addBox(-16.5F, -3.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(116, 9)
						.addBox(-18.5F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 44)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 44)
						.addBox(-2.0F, 11.0F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(20, 28)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 44)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 44)
						.addBox(-2.0F, 11.0F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}