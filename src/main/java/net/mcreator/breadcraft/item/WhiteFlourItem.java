
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class WhiteFlourItem extends Item {
	public WhiteFlourItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}