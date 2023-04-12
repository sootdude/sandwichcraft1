
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class PotItem extends Item {
	public PotItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
