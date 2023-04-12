
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.breadcraft.world.inventory.SaltPotGUIMenu;
import net.mcreator.breadcraft.world.inventory.ProofingBowlGuiMenu;
import net.mcreator.breadcraft.world.inventory.KneadingBoardMenuMenu;
import net.mcreator.breadcraft.world.inventory.CounterStorageMenu;
import net.mcreator.breadcraft.world.inventory.BreadOvenGuiMenu;
import net.mcreator.breadcraft.world.inventory.AgingCaskGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BreadcraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<KneadingBoardMenuMenu> KNEADING_BOARD_MENU = register("kneading_board_menu", (id, inv, extraData) -> new KneadingBoardMenuMenu(id, inv, extraData));
	public static final MenuType<SaltPotGUIMenu> SALT_POT_GUI = register("salt_pot_gui", (id, inv, extraData) -> new SaltPotGUIMenu(id, inv, extraData));
	public static final MenuType<CounterStorageMenu> COUNTER_STORAGE = register("counter_storage", (id, inv, extraData) -> new CounterStorageMenu(id, inv, extraData));
	public static final MenuType<BreadOvenGuiMenu> BREAD_OVEN_GUI = register("bread_oven_gui", (id, inv, extraData) -> new BreadOvenGuiMenu(id, inv, extraData));
	public static final MenuType<ProofingBowlGuiMenu> PROOFING_BOWL_GUI = register("proofing_bowl_gui", (id, inv, extraData) -> new ProofingBowlGuiMenu(id, inv, extraData));
	public static final MenuType<AgingCaskGuiMenu> AGING_CASK_GUI = register("aging_cask_gui", (id, inv, extraData) -> new AgingCaskGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
