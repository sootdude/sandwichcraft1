package net.mcreator.breadcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BasilLightGrowthConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(new BlockPos(x + 0.5, y + 0.5, z + 0.5)) >= 9) {
			return true;
		}
		return false;
	}
}
