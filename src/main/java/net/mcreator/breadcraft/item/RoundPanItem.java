
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class RoundPanItem extends Item {
	public RoundPanItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
