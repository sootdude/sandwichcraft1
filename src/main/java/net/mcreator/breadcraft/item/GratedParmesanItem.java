
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class GratedParmesanItem extends Item {
	public GratedParmesanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(2f).build()));
	}
}