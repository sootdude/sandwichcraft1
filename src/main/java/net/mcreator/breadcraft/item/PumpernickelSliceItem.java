
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class PumpernickelSliceItem extends Item {
	public PumpernickelSliceItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREAD_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.5f)

				.build()));
	}
}
