
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SquarePanItem extends Item {
	public SquarePanItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}