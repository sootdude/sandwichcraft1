
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.breadcraft.client.gui.SaltPotGUIScreen;
import net.mcreator.breadcraft.client.gui.ProofingBowlGuiScreen;
import net.mcreator.breadcraft.client.gui.KneadingBoardMenuScreen;
import net.mcreator.breadcraft.client.gui.CounterStorageScreen;
import net.mcreator.breadcraft.client.gui.BreadOvenGuiScreen;
import net.mcreator.breadcraft.client.gui.AgingCaskGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BreadcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BreadcraftModMenus.KNEADING_BOARD_MENU.get(), KneadingBoardMenuScreen::new);
			MenuScreens.register(BreadcraftModMenus.SALT_POT_GUI.get(), SaltPotGUIScreen::new);
			MenuScreens.register(BreadcraftModMenus.COUNTER_STORAGE.get(), CounterStorageScreen::new);
			MenuScreens.register(BreadcraftModMenus.BREAD_OVEN_GUI.get(), BreadOvenGuiScreen::new);
			MenuScreens.register(BreadcraftModMenus.PROOFING_BOWL_GUI.get(), ProofingBowlGuiScreen::new);
			MenuScreens.register(BreadcraftModMenus.AGING_CASK_GUI.get(), AgingCaskGuiScreen::new);
		});
	}
}
