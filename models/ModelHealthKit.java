// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelHealthKit extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelHealthKit() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(27, 0).addBox(-4.0F, 5.0F, 2.0F, 8.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 5.0F, 2.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 34).addBox(-3.0F, -5.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 5.0F, 5.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
		cube_r2.setTextureOffset(0, 58).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0F, 5.0F, 5.0F);
		Body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5236F);
		cube_r3.setTextureOffset(0, 58).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.0F, 9.0F, 4.0F);
		Body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
		cube_r4.setTextureOffset(1, 46).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, 9.0F, 4.0F);
		Body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
		cube_r5.setTextureOffset(1, 46).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}