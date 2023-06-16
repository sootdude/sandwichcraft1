
package net.mcreator.breadcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SourdoughStarterItem extends Item {
	public SourdoughStarterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}