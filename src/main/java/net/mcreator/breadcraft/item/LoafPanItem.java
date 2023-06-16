
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class LoafPanItem extends Item {
	public LoafPanItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}