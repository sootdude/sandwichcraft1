package net.mcreator.breadcraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MustardGrowthScoreConditionProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		BlockState blockFarmland = Blocks.AIR.defaultBlockState();
		double numberScore = 0;
		String textTag = "";
		String textNamespace = "";
		textNamespace = "breadcraft";
		textTag = "mustard";
		blockFarmland = Blocks.FARMLAND.defaultBlockState();
		numberScore = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip3
						? (world.getBlockState(BlockPos.containing(x, y - 1, z))).getValue(_getip3)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip7
						? (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getValue(_getip7)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip11
						? (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getValue(_getip11)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip15
						? (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getValue(_getip15)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip19
						? (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getValue(_getip19)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip23
						? (world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getValue(_getip23)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip27
						? (world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getValue(_getip27)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip31
						? (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getValue(_getip31)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == blockFarmland.getBlock()
				&& ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock().getStateDefinition().getProperty("moisture") instanceof IntegerProperty _getip35
						? (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getValue(_getip35)
						: -1) == 7) {
			numberScore = numberScore + 1;
		}
		if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))
				&& !(world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& !(world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))) {
			numberScore = numberScore + 1;
		} else if (!(world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& !(world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))) {
			numberScore = numberScore + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))) {
			numberScore = numberScore - 3;
		} else if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))
				&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))) {
			numberScore = numberScore - 2;
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))) {
			numberScore = numberScore - 2;
		} else if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))
				&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH))))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation(((textNamespace + ":" + textTag)).toLowerCase(java.util.Locale.ENGLISH)))))) {
			numberScore = numberScore - 1;
		}
		return numberScore;
	}
}
