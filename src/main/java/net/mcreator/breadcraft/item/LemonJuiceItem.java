
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class LemonJuiceItem extends Item {
	public LemonJuiceItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.GLASS_BOTTLE);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
