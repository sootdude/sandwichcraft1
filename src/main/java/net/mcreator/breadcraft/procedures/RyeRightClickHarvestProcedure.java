package net.mcreator.breadcraft.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModItems;
import net.mcreator.breadcraft.init.BreadcraftModBlocks;

import java.util.Map;

public class RyeRightClickHarvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemCrop = ItemStack.EMPTY;
		ItemStack itemSeed = ItemStack.EMPTY;
		double randomNumber = 0;
		double cropnumber = 0;
		if (ModList.get().isLoaded("harvestwithease") || ModList.get().isLoaded("rightclickharvest") || ModList.get().isLoaded("right_click_get_crops")) {
			itemSeed = new ItemStack(BreadcraftModItems.RYE_SEEDS.get());
			itemCrop = new ItemStack(BreadcraftModItems.RYE.get());
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemCrop);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), itemSeed);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = BreadcraftModBlocks.STAGE_0.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
