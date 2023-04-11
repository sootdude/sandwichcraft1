
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BreadcraftModTabs {
	public static CreativeModeTab TAB_BREADCRAFT;
	public static CreativeModeTab TAB_DOUGH;
	public static CreativeModeTab TAB_BREADCRAFT_TOOLS;
	public static CreativeModeTab TAB_BREAD_TAB;
	public static CreativeModeTab TAB_CHEESE_TAB;
	public static CreativeModeTab TAB_SANDWICHESANDMORE;

	public static void load() {
		TAB_BREADCRAFT = new CreativeModeTab("tabbreadcraft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.WHITE_FLOUR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DOUGH = new CreativeModeTab("tabdough") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.BASIC_DOUGH.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BREADCRAFT_TOOLS = new CreativeModeTab("tabbreadcraft_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.MORTAR_PESTLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BREAD_TAB = new CreativeModeTab("tabbread_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.WHITE_COUNTRY_LOAF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CHEESE_TAB = new CreativeModeTab("tabcheese_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.CHEESE_ICON_PLACEHOLDER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SANDWICHESANDMORE = new CreativeModeTab("tabsandwichesandmore") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BreadcraftModItems.GRILLED_CHEESE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
