package net.mcreator.breadcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class AgingCaskUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_CHEDDAR_CHEESE.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.WHITE_CHEDDAR.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("craftingTime", 1200);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 2;
						final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_CHEDDAR.get());
						_setstack.setCount((int) (1 + new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 2)));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 1;
						final int _amount = 1;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("craftingProgress", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_CHEDDAR_CHEESE.get() && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("craftingTime", 1200);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 2;
							final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_CHEDDAR.get());
							_setstack.setCount((int) (1 + new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 2)));
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final int _amount = 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("craftingProgress", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.WHITE_CHEDDAR.get() && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.AGED_WHITE_CHEDDAR.get() && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("craftingTime", 1200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 2;
								final ItemStack _setstack = new ItemStack(BreadcraftModItems.AGED_WHITE_CHEDDAR.get());
								_setstack.setCount((int) (1 + new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 2)));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 1;
								final int _amount = 1;
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_slotid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
									}
								});
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("craftingProgress", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.WHITE_CHEDDAR.get() && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("craftingTime", 1200);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = 2;
									final ItemStack _setstack = new ItemStack(BreadcraftModItems.AGED_WHITE_CHEDDAR.get());
									_setstack.setCount((int) (1 + new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 2)));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = 1;
									final int _amount = 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_slotid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
										}
									});
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("craftingProgress", 0);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					} else {
						if ((new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_COLBY_CHEESE.get() && (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.COLBY_CHEESE.get() && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("craftingTime", 1200);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 2;
										final ItemStack _setstack = new ItemStack(BreadcraftModItems.COLBY_CHEESE.get());
										_setstack.setCount((int) (1 + new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 2)));
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 1;
										final int _amount = 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
											}
										});
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("craftingProgress", 0);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						} else {
							if ((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_COLBY_CHEESE.get() && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("craftingTime", 1200);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
									{
										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _slotid = 2;
											final ItemStack _setstack = new ItemStack(BreadcraftModItems.COLBY_CHEESE.get());
											_setstack.setCount((int) (1 + new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 2)));
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
									{
										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _slotid = 1;
											final int _amount = 1;
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													ItemStack _stk = capability.getStackInSlot(_slotid).copy();
													_stk.shrink(_amount);
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
												}
											});
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("craftingProgress", 0);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
								}
							} else {
								if ((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_PARMESAN.get() && (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.PARMESAN.get() && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("craftingTime", 1200);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 2;
												final ItemStack _setstack = new ItemStack(BreadcraftModItems.PARMESAN.get());
												_setstack.setCount((int) (1 + new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 2)));
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 1;
												final int _amount = 1;
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable) {
														ItemStack _stk = capability.getStackInSlot(_slotid).copy();
														_stk.shrink(_amount);
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
													}
												});
											}
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("craftingProgress", 0);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								} else {
									if ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_PARMESAN.get() && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("craftingTime", 1200);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getTileData().getDouble(tag);
														return -1;
													}
												}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
											{
												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
												if (_ent != null) {
													final int _slotid = 2;
													final ItemStack _setstack = new ItemStack(BreadcraftModItems.PARMESAN.get());
													_setstack.setCount((int) (1 + new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 2)));
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
											{
												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
												if (_ent != null) {
													final int _slotid = 1;
													final int _amount = 1;
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable) {
															ItemStack _stk = capability.getStackInSlot(_slotid).copy();
															_stk.shrink(_amount);
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
														}
													});
												}
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("craftingProgress", 0);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										}
									} else {
										if ((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_GOUDA.get() && (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.GOUDA.get() && new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("craftingTime", 1200);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getTileData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getTileData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 2;
														final ItemStack _setstack = new ItemStack(BreadcraftModItems.GOUDA.get());
														_setstack.setCount((int) (1 + new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 2)));
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
															if (capability instanceof IItemHandlerModifiable)
																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
														});
													}
												}
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 1;
														final int _amount = 1;
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
															if (capability instanceof IItemHandlerModifiable) {
																ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																_stk.shrink(_amount);
																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
															}
														});
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getTileData().putDouble("craftingProgress", 0);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
											}
										} else {
											if ((new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_GOUDA.get() && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getTileData().putDouble("craftingTime", 1200);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																BlockEntity blockEntity = world.getBlockEntity(pos);
																if (blockEntity != null)
																	return blockEntity.getTileData().getDouble(tag);
																return -1;
															}
														}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getTileData().getDouble(tag);
														return -1;
													}
												}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
													{
														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
														if (_ent != null) {
															final int _slotid = 2;
															final ItemStack _setstack = new ItemStack(BreadcraftModItems.GOUDA.get());
															_setstack.setCount((int) (1 + new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 2)));
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																if (capability instanceof IItemHandlerModifiable)
																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
															});
														}
													}
													{
														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
														if (_ent != null) {
															final int _slotid = 1;
															final int _amount = 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																if (capability instanceof IItemHandlerModifiable) {
																	ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																	_stk.shrink(_amount);
																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																}
															});
														}
													}
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
														}
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getTileData().putDouble("craftingProgress", 0);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
											} else {
												if ((new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_BRIE.get() && (new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.BRIE.get() && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getTileData().putDouble("craftingTime", 1200);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																	BlockEntity blockEntity = world.getBlockEntity(pos);
																	if (blockEntity != null)
																		return blockEntity.getTileData().getDouble(tag);
																	return -1;
																}
															}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
													if (new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getTileData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 2;
																final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIE.get());
																_setstack.setCount((int) (1 + new Object() {
																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																		return _retval.get();
																	}
																}.getAmount(world, new BlockPos(x, y, z), 2)));
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable)
																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																});
															}
														}
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 1;
																final int _amount = 1;
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable) {
																		ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																		_stk.shrink(_amount);
																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																	}
																});
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getTileData().putDouble("craftingProgress", 0);
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
													}
												} else {
													if ((new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_BRIE.get() && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getTileData().putDouble("craftingTime", 1200);
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																		BlockEntity blockEntity = world.getBlockEntity(pos);
																		if (blockEntity != null)
																			return blockEntity.getTileData().getDouble(tag);
																		return -1;
																	}
																}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
														if (new Object() {
															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																BlockEntity blockEntity = world.getBlockEntity(pos);
																if (blockEntity != null)
																	return blockEntity.getTileData().getDouble(tag);
																return -1;
															}
														}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
															{
																BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																if (_ent != null) {
																	final int _slotid = 2;
																	final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIE.get());
																	_setstack.setCount((int) (1 + new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 2)));
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable)
																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																	});
																}
															}
															{
																BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																if (_ent != null) {
																	final int _slotid = 1;
																	final int _amount = 1;
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																		}
																	});
																}
															}
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
																}
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getTileData().putDouble("craftingProgress", 0);
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
														}
													} else {
														if ((new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_BLUE_CHEESE.get() && (new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == BreadcraftModItems.BLUE_CHEESE.get() && new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getTileData().putDouble("craftingTime", 1200);
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																			BlockEntity blockEntity = world.getBlockEntity(pos);
																			if (blockEntity != null)
																				return blockEntity.getTileData().getDouble(tag);
																			return -1;
																		}
																	}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
															if (new Object() {
																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																	BlockEntity blockEntity = world.getBlockEntity(pos);
																	if (blockEntity != null)
																		return blockEntity.getTileData().getDouble(tag);
																	return -1;
																}
															}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 2;
																		final ItemStack _setstack = new ItemStack(BreadcraftModItems.BLUE_CHEESE.get());
																		_setstack.setCount((int) (1 + new Object() {
																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicInteger _retval = new AtomicInteger(0);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																				return _retval.get();
																			}
																		}.getAmount(world, new BlockPos(x, y, z), 2)));
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable)
																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																		});
																	}
																}
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 1;
																		final int _amount = 1;
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable) {
																				ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																				_stk.shrink(_amount);
																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																			}
																		});
																	}
																}
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getTileData().putDouble("craftingProgress", 0);
																	if (world instanceof Level _level)
																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																}
															}
														} else {
															if ((new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRESSED_BLUE_CHEESE.get() && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getTileData().putDouble("craftingTime", 1200);
																	if (world instanceof Level _level)
																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																}
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getTileData().putDouble("craftingProgress", (new Object() {
																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																				BlockEntity blockEntity = world.getBlockEntity(pos);
																				if (blockEntity != null)
																					return blockEntity.getTileData().getDouble(tag);
																				return -1;
																			}
																		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
																	if (world instanceof Level _level)
																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																}
																if (new Object() {
																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																		BlockEntity blockEntity = world.getBlockEntity(pos);
																		if (blockEntity != null)
																			return blockEntity.getTileData().getDouble(tag);
																		return -1;
																	}
																}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 1200 && new Object() {
																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																		return _retval.get();
																	}
																}.getAmount(world, new BlockPos(x, y, z), 2) <= 63) {
																	{
																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 2;
																			final ItemStack _setstack = new ItemStack(BreadcraftModItems.BLUE_CHEESE.get());
																			_setstack.setCount((int) (1 + new Object() {
																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos(x, y, z), 2)));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable)
																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																			});
																		}
																	}
																	{
																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 1;
																			final int _amount = 1;
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable) {
																					ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																					_stk.shrink(_amount);
																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																				}
																			});
																		}
																	}
																	if (world instanceof Level _level) {
																		if (!_level.isClientSide()) {
																			_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1);
																		} else {
																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break")), SoundSource.NEUTRAL, 1, 1, false);
																		}
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getTileData().putDouble("craftingProgress", 0);
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
