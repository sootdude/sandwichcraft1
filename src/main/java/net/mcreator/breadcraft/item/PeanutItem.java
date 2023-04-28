
package net.mcreator.breadcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.breadcraft.procedures.PeanutRightClickedOnBlockProcedure;
import net.mcreator.breadcraft.init.BreadcraftModTabs;

public class PeanutItem extends Item {
	public PeanutItem() {
		super(new Item.Properties().tab(BreadcraftModTabs.TAB_BREADCRAFT).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.5f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PeanutRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
