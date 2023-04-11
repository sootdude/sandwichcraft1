
package net.mcreator.breadcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.breadcraft.init.BreadcraftModTabs;

import java.util.List;

public class PotatoChipsItem extends Item {
	public PotatoChipsItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_SANDWICHESANDMORE).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.4f)

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A72Yet another variety of fried potato."));
	}
}
