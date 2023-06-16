package net.mcreator.breadcraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ThymeStage0TrampledProcedure {
	@SubscribeEvent
	public static void onFarmlandTrampled(BlockEvent.FarmlandTrampleEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		ItemStack itemSeed = ItemStack.EMPTY;
		double randomNumber = 0;
		double cropnumber = 0;
		BlockState stage6 = Blocks.AIR.defaultBlockState();
		BlockState stage5 = Blocks.AIR.defaultBlockState();
		BlockState stage4 = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		stage0 = BreadcraftModBlocks.THYME_STAGE_0.get().defaultBlockState();
		stage1 = BreadcraftModBlocks.THYME_STAGE_1.get().defaultBlockState();
		stage2 = BreadcraftModBlocks.THYME_STAGE_2.get().defaultBlockState();
		stage3 = BreadcraftModBlocks.THYME_STAGE_3.get().defaultBlockState();
		stage4 = BreadcraftModBlocks.THYME_STAGE_4.get().defaultBlockState();
		stage5 = BreadcraftModBlocks.THYME_STAGE_5.get().defaultBlockState();
		stage6 = BreadcraftModBlocks.THYME_STAGE_6.get().defaultBlockState();
		itemSeed = new ItemStack(BreadcraftModItems.THYME_SEEDS.get());
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage0.getBlock() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage1.getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage2.getBlock() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage3.getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage4.getBlock() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage5.getBlock()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == stage6.getBlock()) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
