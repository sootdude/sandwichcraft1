package net.mcreator.breadcraft.client.gui;

public class AgingCaskGuiScreen extends AbstractContainerScreen<AgingCaskGuiMenu> {

	private final static HashMap<String, Object> guistate = AgingCaskGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AgingCaskGuiScreen(AgingCaskGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 158;
	}

	private static final ResourceLocation texture = new ResourceLocation("breadcraft:textures/screens/aging_cask_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/arrowplain.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 16, 0, 0, 24, 24, 24, 24);

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbarempty.png"));
		this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);

		if (

		CaskprogressProcedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar1.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress2Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar1_2.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress3Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar2.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress4Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar3.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress5Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar4.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress6Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar5.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress7Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar6.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress8Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar7.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress9Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar8.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress10Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar9.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress11Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar10.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress12Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar11.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress13Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar12.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress14Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar13.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress15Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar14.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress16Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar15.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress17Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar16.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress18Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar17.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress19Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar18.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress20Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar19.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress21Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar20.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress22Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar21.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress23Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar22.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress24Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar23.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress25Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar24.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress26Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar25.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress27Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar26.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress28Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar27.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress29Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar28.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress30Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar29.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress32Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar31.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress33Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar32.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress34Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar33.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress35Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar34.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress36Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar35.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress37Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar36.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress38Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar37.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress39Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar38.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress40Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar39.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress41Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar40.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress42Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar41.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress43Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar42.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress44Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar43.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress45Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar44.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress46Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar45.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress47Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar46.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress48Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar47.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress49Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar48.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress50Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar49.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress51Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar50.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress52Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar51.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress53Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar52.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress54Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar53.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress55Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar54.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress56Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar55.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress57Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar56.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress58Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar57.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
		}
		if (

		Caskprogress60Procedure.execute(world, x, y, z)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar58.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 30, 0, 0, 128, 32, 128, 32);
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
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.aging_cask_gui.label_cask"), 76, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.aging_cask_gui.label_inventory"), 7, 62, -12829636);
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
