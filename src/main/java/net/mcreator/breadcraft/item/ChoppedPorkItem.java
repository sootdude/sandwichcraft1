
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class ChoppedPorkItem extends Item {
	public ChoppedPorkItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.65f)

				.meat().build()));
	}
}
