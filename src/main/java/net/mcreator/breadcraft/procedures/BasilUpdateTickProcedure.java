package net.mcreator.breadcraft.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModBlocks;

import java.util.Map;

public class BasilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numberGrowthCondition = 0;
		double randomNumber = 0;
		boolean canDrop = false;
		boolean logicLightGrowthCondition = false;
		boolean logicDropType = false;
		BlockState blockFarmland = Blocks.AIR.defaultBlockState();
		BlockState blockStage0 = Blocks.AIR.defaultBlockState();
		BlockState blockStage6 = Blocks.AIR.defaultBlockState();
		BlockState blockStage5 = Blocks.AIR.defaultBlockState();
		BlockState blockStage7 = Blocks.AIR.defaultBlockState();
		BlockState blockStage2 = Blocks.AIR.defaultBlockState();
		BlockState blockStage1 = Blocks.AIR.defaultBlockState();
		BlockState blockStage4 = Blocks.AIR.defaultBlockState();
		BlockState blockStage3 = Blocks.AIR.defaultBlockState();
		BlockState blockSoulSand = Blocks.AIR.defaultBlockState();
		logicLightGrowthCondition = BasilLightGrowthConditionProcedure.execute(world, x, y, z);
		numberGrowthCondition = BasilGrowthScoreConditionProcedure.execute(world, x, y, z);
		blockSoulSand = Blocks.SOUL_SAND.defaultBlockState();
		blockFarmland = Blocks.FARMLAND.defaultBlockState();
		blockStage0 = BreadcraftModBlocks.BASIL_STAGE_0.get().defaultBlockState();
		blockStage1 = BreadcraftModBlocks.BASIL_STAGE_1.get().defaultBlockState();
		blockStage2 = BreadcraftModBlocks.BASIL_STAGE_2.get().defaultBlockState();
		blockStage3 = BreadcraftModBlocks.BASIL_STAGE_3.get().defaultBlockState();
		blockStage4 = BreadcraftModBlocks.BASIL_STAGE_4.get().defaultBlockState();
		blockStage5 = BreadcraftModBlocks.BASIL_STAGE_5.get().defaultBlockState();
		blockStage6 = BreadcraftModBlocks.BASIL_STAGE_6.get().defaultBlockState();
		blockStage7 = BreadcraftModBlocks.BASIL_STAGE_7.get().defaultBlockState();
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == blockSoulSand.getBlock()) && (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			{
				BlockPos _pos = new BlockPos(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0.5, y + 0.5, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == blockFarmland.getBlock()) || (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.WATER
				&& (((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip10 ? (world.getBlockState(new BlockPos(x, y + 1, z))).getValue(_getip10) : -1) >= 1
						&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip12 ? (world.getBlockState(new BlockPos(x, y + 1, z))).getValue(_getip12) : -1) <= 7
						|| ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip14 ? (world.getBlockState(new BlockPos(x + 1, y, z))).getValue(_getip14) : -1) == 14
						|| ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip16 ? (world.getBlockState(new BlockPos(x - 1, y, z))).getValue(_getip16) : -1) == 14
						|| ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip18 ? (world.getBlockState(new BlockPos(x, y, z + 1))).getValue(_getip18) : -1) == 14
						|| ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock().getStateDefinition().getProperty("level") instanceof IntegerProperty _getip20
								? (world.getBlockState(new BlockPos(x, y, z - 1))).getValue(_getip20)
								: -1) == 14)) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage7.getBlock())) {
				logicDropType = true;
				canDrop = true;
			} else {
				logicDropType = false;
				canDrop = true;
			}
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage7.getBlock())) {
			if (logicLightGrowthCondition == true) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "GrowthTime") > 0) {
					randomNumber = Math.random();
					if (randomNumber > 1 / numberGrowthCondition) {
						randomNumber = Math.random();
						if (randomNumber >= 0.4) {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("GrowthTime", ((new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "GrowthTime")) - 1));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						} else {
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "GrowthTime") < new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "TotalGrowthTime")) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("GrowthTime", (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "GrowthTime") + 1));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("GrowthTime", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "TotalGrowthTime")));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "GrowthTime") == 0) {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage0.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage1;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage1.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage2;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage2.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage3;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage3.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage4;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage4.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage5;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage5.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage6;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockStage6.getBlock()) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = blockStage7;
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
			}
		}
		if (canDrop == true) {
			if (logicDropType == true) {
				BasilStage0ExplodedProcedure.execute(world, x, y, z);
			} else {
				BasilStage7ExplodedProcedure.execute(world, x, y, z);
			}
		}
	}
}
