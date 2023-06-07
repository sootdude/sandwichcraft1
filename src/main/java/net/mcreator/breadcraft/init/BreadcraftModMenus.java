
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.breadcraft.world.inventory.SaltPotGUIMenu;
import net.mcreator.breadcraft.world.inventory.ProofingBowlGuiMenu;
import net.mcreator.breadcraft.world.inventory.KnifeBlockGuiMenu;
import net.mcreator.breadcraft.world.inventory.KneadingBoardMenuMenu;
import net.mcreator.breadcraft.world.inventory.CounterStorageMenu;
import net.mcreator.breadcraft.world.inventory.BreadOvenGuiMenu;
import net.mcreator.breadcraft.world.inventory.AgingCaskGuiMenu;
import net.mcreator.breadcraft.BreadcraftMod;

public class BreadcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BreadcraftMod.MODID);
	public static final RegistryObject<MenuType<KneadingBoardMenuMenu>> KNEADING_BOARD_MENU = REGISTRY.register("kneading_board_menu", () -> IForgeMenuType.create(KneadingBoardMenuMenu::new));
	public static final RegistryObject<MenuType<SaltPotGUIMenu>> SALT_POT_GUI = REGISTRY.register("salt_pot_gui", () -> IForgeMenuType.create(SaltPotGUIMenu::new));
	public static final RegistryObject<MenuType<CounterStorageMenu>> COUNTER_STORAGE = REGISTRY.register("counter_storage", () -> IForgeMenuType.create(CounterStorageMenu::new));
	public static final RegistryObject<MenuType<BreadOvenGuiMenu>> BREAD_OVEN_GUI = REGISTRY.register("bread_oven_gui", () -> IForgeMenuType.create(BreadOvenGuiMenu::new));
	public static final RegistryObject<MenuType<ProofingBowlGuiMenu>> PROOFING_BOWL_GUI = REGISTRY.register("proofing_bowl_gui", () -> IForgeMenuType.create(ProofingBowlGuiMenu::new));
	public static final RegistryObject<MenuType<AgingCaskGuiMenu>> AGING_CASK_GUI = REGISTRY.register("aging_cask_gui", () -> IForgeMenuType.create(AgingCaskGuiMenu::new));
	public static final RegistryObject<MenuType<KnifeBlockGuiMenu>> KNIFE_BLOCK_GUI = REGISTRY.register("knife_block_gui", () -> IForgeMenuType.create(KnifeBlockGuiMenu::new));
}
