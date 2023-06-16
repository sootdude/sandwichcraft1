
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class EnrichedDoughWithFillingItem extends Item {
	public EnrichedDoughWithFillingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}