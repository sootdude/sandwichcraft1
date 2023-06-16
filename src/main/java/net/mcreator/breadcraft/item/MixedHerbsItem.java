
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class MixedHerbsItem extends Item {
	public MixedHerbsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}