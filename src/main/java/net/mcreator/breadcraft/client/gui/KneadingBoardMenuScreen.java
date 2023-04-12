
package net.mcreator.breadcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.breadcraft.world.inventory.KneadingBoardMenuMenu;
import net.mcreator.breadcraft.network.KneadingBoardMenuButtonMessage;
import net.mcreator.breadcraft.BreadcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

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
		this.font.draw(poseStack, new TranslatableComponent("gui.breadcraft.kneading_board_menu.label_kneading_board"), 50, 5, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.breadcraft.kneading_board_menu.label_inventory"), 7, 68, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_knead = new Button(this.leftPos + 61, this.topPos + 45, 51, 20, new TranslatableComponent("gui.breadcraft.kneading_board_menu.button_knead"), e -> {
			if (true) {
				BreadcraftMod.PACKET_HANDLER.sendToServer(new KneadingBoardMenuButtonMessage(0, x, y, z));
				KneadingBoardMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_knead", button_knead);
		this.addRenderableWidget(button_knead);
	}
}
