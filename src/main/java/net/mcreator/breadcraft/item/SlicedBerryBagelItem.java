
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class SlicedBerryBagelItem extends Item {
	public SlicedBerryBagelItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREAD_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.7f)

				.build()));
	}
}
