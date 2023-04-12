
package net.mcreator.breadcraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.breadcraft.world.inventory.SaltPotGUIMenu;
import net.mcreator.breadcraft.procedures.ProgressbardoneProcedure;
import net.mcreator.breadcraft.procedures.ProgressbarProcedure;
import net.mcreator.breadcraft.procedures.Progressbar9Procedure;
import net.mcreator.breadcraft.procedures.Progressbar8Procedure;
import net.mcreator.breadcraft.procedures.Progressbar7Procedure;
import net.mcreator.breadcraft.procedures.Progressbar6Procedure;
import net.mcreator.breadcraft.procedures.Progressbar5Procedure;
import net.mcreator.breadcraft.procedures.Progressbar57Procedure;
import net.mcreator.breadcraft.procedures.Progressbar56Procedure;
import net.mcreator.breadcraft.procedures.Progressbar55Procedure;
import net.mcreator.breadcraft.procedures.Progressbar54Procedure;
import net.mcreator.breadcraft.procedures.Progressbar53Procedure;
import net.mcreator.breadcraft.procedures.Progressbar52Procedure;
import net.mcreator.breadcraft.procedures.Progressbar51Procedure;
import net.mcreator.breadcraft.procedures.Progressbar50Procedure;
import net.mcreator.breadcraft.procedures.Progressbar4Procedure;
import net.mcreator.breadcraft.procedures.Progressbar49Procedure;
import net.mcreator.breadcraft.procedures.Progressbar48Procedure;
import net.mcreator.breadcraft.procedures.Progressbar47Procedure;
import net.mcreator.breadcraft.procedures.Progressbar46Procedure;
import net.mcreator.breadcraft.procedures.Progressbar45Procedure;
import net.mcreator.breadcraft.procedures.Progressbar44Procedure;
import net.mcreator.breadcraft.procedures.Progressbar43Procedure;
import net.mcreator.breadcraft.procedures.Progressbar42Procedure;
import net.mcreator.breadcraft.procedures.Progressbar41Procedure;
import net.mcreator.breadcraft.procedures.Progressbar40Procedure;
import net.mcreator.breadcraft.procedures.Progressbar3Procedure;
import net.mcreator.breadcraft.procedures.Progressbar39Procedure;
import net.mcreator.breadcraft.procedures.Progressbar38Procedure;
import net.mcreator.breadcraft.procedures.Progressbar37Procedure;
import net.mcreator.breadcraft.procedures.Progressbar36Procedure;
import net.mcreator.breadcraft.procedures.Progressbar35Procedure;
import net.mcreator.breadcraft.procedures.Progressbar34Procedure;
import net.mcreator.breadcraft.procedures.Progressbar33Procedure;
import net.mcreator.breadcraft.procedures.Progressbar32Procedure;
import net.mcreator.breadcraft.procedures.Progressbar31Procedure;
import net.mcreator.breadcraft.procedures.Progressbar30Procedure;
import net.mcreator.breadcraft.procedures.Progressbar2Procedure;
import net.mcreator.breadcraft.procedures.Progressbar29Procedure;
import net.mcreator.breadcraft.procedures.Progressbar28Procedure;
import net.mcreator.breadcraft.procedures.Progressbar27Procedure;
import net.mcreator.breadcraft.procedures.Progressbar26Procedure;
import net.mcreator.breadcraft.procedures.Progressbar25Procedure;
import net.mcreator.breadcraft.procedures.Progressbar24Procedure;
import net.mcreator.breadcraft.procedures.Progressbar23Procedure;
import net.mcreator.breadcraft.procedures.Progressbar22Procedure;
import net.mcreator.breadcraft.procedures.Progressbar21Procedure;
import net.mcreator.breadcraft.procedures.Progressbar20Procedure;
import net.mcreator.breadcraft.procedures.Progressbar19Procedure;
import net.mcreator.breadcraft.procedures.Progressbar18Procedure;
import net.mcreator.breadcraft.procedures.Progressbar17Procedure;
import net.mcreator.breadcraft.procedures.Progressbar16Procedure;
import net.mcreator.breadcraft.procedures.Progressbar15Procedure;
import net.mcreator.breadcraft.procedures.Progressbar14Procedure;
import net.mcreator.breadcraft.procedures.Progressbar13Procedure;
import net.mcreator.breadcraft.procedures.Progressbar12Procedure;
import net.mcreator.breadcraft.procedures.Progressbar11Procedure;
import net.mcreator.breadcraft.procedures.Progressbar10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SaltPotGUIScreen extends AbstractContainerScreen<SaltPotGUIMenu> {
	private final static HashMap<String, Object> guistate = SaltPotGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SaltPotGUIScreen(SaltPotGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 154;
	}

	private static final ResourceLocation texture = new ResourceLocation("breadcraft:textures/screens/salt_pot_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbarempty.png"));
		this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);

		if (ProgressbarProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar1.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar1_2.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar2.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar3.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar4.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar5.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar6.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar7.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar8.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar9.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar10.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar11.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar12.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar13.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar14.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar15.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar16.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar17.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar18.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar19.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar20.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar21.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar23Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar22.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar24Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar23.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar24.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar26Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar25.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar27Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar26.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar28Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar27.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar29Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar28.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar30Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar29.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar31Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar31.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar32Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar32.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar33Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar33.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar34Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar34.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar35Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar35.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar36Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar36.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar37Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar37.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar38Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar38.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar39Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar39.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar40Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar40.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar41Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar41.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar42Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar42.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar43Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar43.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar44Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar44.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar45Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar45.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar46Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar46.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar47Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar47.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar48Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar48.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar49Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar49.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar50Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar50.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar51Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar51.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar52Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar52.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar53Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar53.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar54Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar54.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar55Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar55.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar56Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar56.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (Progressbar57Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar57.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
		}
		if (ProgressbardoneProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("breadcraft:textures/screens/progressbar58.png"));
			this.blit(ms, this.leftPos + 23, this.topPos + 27, 0, 0, 128, 32, 128, 32);
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
		this.font.draw(poseStack, new TranslatableComponent("gui.breadcraft.salt_pot_gui.label_salt_pot"), 65, 6, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.breadcraft.salt_pot_gui.label_inventory"), 7, 58, -12829636);
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
