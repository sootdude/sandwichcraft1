
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ThymeItem extends Item {
	public ThymeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}