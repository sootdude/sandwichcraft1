
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class PressedBrieItem extends Item {
	public PressedBrieItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_CHEESE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
