package net.mcreator.breadcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.breadcraft.world.inventory.ProofingBowlGuiMenu;
import net.mcreator.breadcraft.procedures.Doughbar9Procedure;
import net.mcreator.breadcraft.procedures.Doughbar8Procedure;
import net.mcreator.breadcraft.procedures.Doughbar7Procedure;
import net.mcreator.breadcraft.procedures.Doughbar6Procedure;
import net.mcreator.breadcraft.procedures.Doughbar5Procedure;
import net.mcreator.breadcraft.procedures.Doughbar4Procedure;
import net.mcreator.breadcraft.procedures.Doughbar3Procedure;
import net.mcreator.breadcraft.procedures.Doughbar2Procedure;
import net.mcreator.breadcraft.procedures.Doughbar1Procedure;
import net.mcreator.breadcraft.procedures.Doughbar13Procedure;
import net.mcreator.breadcraft.procedures.Doughbar11Procedure;
import net.mcreator.breadcraft.procedures.Doughbar10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ProofingBowlGuiScreen extends AbstractContainerScreen<ProofingBowlGuiMenu> {
	private final static HashMap<String, Object> guistate = ProofingBowlGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ProofingBowlGuiScreen(ProofingBowlGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 143;
	}

	private static final ResourceLocation texture = new ResourceLocation("breadcraft:textures/screens/proofing_bowl_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar1.png"));
		this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);

		if (Doughbar1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar2.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar3.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar4.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar5.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar6.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar7.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar8.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar9.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar10.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar11.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar12.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
		}
		if (Doughbar13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/doughbar13.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 18, 0, 0, 40, 24, 40, 24);
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
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.proofing_bowl_gui.label_proofing_bowl"), 53, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.breadcraft.proofing_bowl_gui.label_inventory"), 7, 47, -12829636);
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
	}
}
