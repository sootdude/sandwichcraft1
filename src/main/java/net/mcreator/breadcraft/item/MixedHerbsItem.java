
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class MixedHerbsItem extends Item {
	public MixedHerbsItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
