
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class SlicedMozzarellaItem extends Item {
	public SlicedMozzarellaItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_CHEESE_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(2f)

				.build()));
	}
}
