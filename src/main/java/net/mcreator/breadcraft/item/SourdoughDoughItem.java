
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class SourdoughDoughItem extends Item {
	public SourdoughDoughItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_DOUGH).stacksTo(64).rarity(Rarity.COMMON));
	}
}
