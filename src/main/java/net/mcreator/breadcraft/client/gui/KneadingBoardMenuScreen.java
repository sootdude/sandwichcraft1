package net.mcreator.breadcraft.client.gui;

public class KneadingBoardMenuScreen extends AbstractContainerScreen<KneadingBoardMenuMenu> {

	private final static HashMap<String, Object> guistate = KneadingBoardMenuMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_knead;

	public KneadingBoardMenuScreen(KneadingBoardMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 164;
	}

	private static final ResourceLocation texture = new ResourceLocation("breadcraft:textures/screens/kneading_board_menu.png");

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
		this.blit(ms, this.leftPos + 75, this.topPos + 18, 0, 0, 24, 24, 24, 24);

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
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.kneading_board_menu.label_kneading_board"), 50, 5, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.kneading_board_menu.label_inventory"), 7, 68, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_knead = Button.builder(Component.translatable("gui.breadcraft.kneading_board_menu.button_knead"), e -> {
			if (true) {
				BreadcraftMod.PACKET_HANDLER.sendToServer(new KneadingBoardMenuButtonMessage(0, x, y, z));
				KneadingBoardMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 45, 51, 20).build();

		guistate.put("button:button_knead", button_knead);
		this.addRenderableWidget(button_knead);

	}

}
