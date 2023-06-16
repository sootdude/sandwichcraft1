package net.mcreator.breadcraft.client.gui;

public class BreadOvenGuiScreen extends AbstractContainerScreen<BreadOvenGuiMenu> {

	private final static HashMap<String, Object> guistate = BreadOvenGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BreadOvenGuiScreen(BreadOvenGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 168;
	}

	private static final ResourceLocation texture = new ResourceLocation("breadcraft:textures/screens/bread_oven_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrow2.png"));
		this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);

		if (

		EmptyarrowbarProcedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrow2.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar1Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill1.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar2Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill2.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar3Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill3.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar4Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill4.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar5Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill5.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar6Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill6.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar7Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill7.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		Arrowbar8Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill8.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}
		if (

		ArrowbardoneProcedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowfill9.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 30, 0, 0, 24, 24, 24, 24);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/pan.png"));
		this.blit(ms, this.leftPos + 136, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughshape.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + 18, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceoff.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		if (

		Fuelcheck12Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon12.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck13Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon13.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck11Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon11.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck10Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon10.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck9Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon9.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck8Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon8.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck7Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon7.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck6Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon6.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck5Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon5.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck4Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon4.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck3Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon3.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck2Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon2.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (

		Fuelcheck1Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/furnaceon.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.bread_oven_gui.label_bread_oven"), 61, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.bread_oven_gui.label_inventory"), 7, 72, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
