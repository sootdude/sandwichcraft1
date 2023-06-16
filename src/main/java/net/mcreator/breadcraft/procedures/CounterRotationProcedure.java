package net.mcreator.breadcraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CounterRotationProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z + 1);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z + 1);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z - 1);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z - 1);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x + 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BreadcraftModBlocks.COUNTER.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == BreadcraftModBlocks.COUNTER.get()) {
				{
					BlockPos _bp = BlockPos.containing(x - 1, y, z);
					BlockState _bs = BreadcraftModBlocks.BIRCH_COUNTER_CORNER.get().defaultBlockState();
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
