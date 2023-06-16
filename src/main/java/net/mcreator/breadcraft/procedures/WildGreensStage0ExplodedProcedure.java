package net.mcreator.breadcraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WildGreensStage0ExplodedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemSeeds = ItemStack.EMPTY;
		itemSeeds = new ItemStack(BreadcraftModItems.WILD_GREENS_SEEDS.get());
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeeds);
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
