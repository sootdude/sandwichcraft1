package net.mcreator.breadcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.breadcraft.init.BreadcraftModItems;

public class MustardStage0ExplodedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemSeeds = ItemStack.EMPTY;
		itemSeeds = new ItemStack(BreadcraftModItems.MUSTARD_SEEDS.get());
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeeds);
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
