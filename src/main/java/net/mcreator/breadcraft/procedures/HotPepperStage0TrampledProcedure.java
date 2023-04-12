package net.mcreator.breadcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModItems;
import net.mcreator.breadcraft.init.BreadcraftModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HotPepperStage0TrampledProcedure {
	@SubscribeEvent
	public static void onFarmlandTrampled(BlockEvent.FarmlandTrampleEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
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
		stage0 = BreadcraftModBlocks.PEPPER_STAGE_0.get().defaultBlockState();
		stage1 = BreadcraftModBlocks.PEPPER_STAGE_1.get().defaultBlockState();
		stage2 = BreadcraftModBlocks.PEPPER_STAGE_2.get().defaultBlockState();
		stage3 = BreadcraftModBlocks.PEPPER_STAGE_3.get().defaultBlockState();
		stage4 = BreadcraftModBlocks.PEPPER_STAGE_4.get().defaultBlockState();
		stage5 = BreadcraftModBlocks.PEPPER_STAGE_5.get().defaultBlockState();
		stage6 = BreadcraftModBlocks.PEPPER_STAGE_6.get().defaultBlockState();
		itemSeed = new ItemStack(BreadcraftModItems.HOT_PEPPER_SEEDS.get());
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage0.getBlock() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage1.getBlock()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage2.getBlock() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage3.getBlock()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage4.getBlock() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage5.getBlock()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == stage6.getBlock()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.crop.break")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
