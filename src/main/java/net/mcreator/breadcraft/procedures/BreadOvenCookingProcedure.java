package net.mcreator.breadcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class BreadOvenCookingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double craftingTime = 0;
		double craftingProgress = 0;
		double fuel = 0;
		double fuelBar = 0;
		ItemStack wood = ItemStack.EMPTY;
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Items.COAL || (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Items.CHARCOAL)) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (1600 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Blocks.COAL_BLOCK.asItem()) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (16000 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Blocks.DRIED_KELP_BLOCK.asItem()) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (4000 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Items.BLAZE_ROD) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (2400 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == Items.LAVA_BUCKET) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final ItemStack _setstack = new ItemStack(Items.BUCKET);
					_setstack.setCount(1);
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (20000 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:fuel"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (300 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("breadcraft:fuel_200"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (200 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("breadcraft:fuel_150"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (150 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("breadcraft:fuel_100"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (100 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("breadcraft:fuel_67"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (67 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) >= 1 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") <= 5 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("breadcraft:fuel_50"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final int _amount = 1;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", (50 + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("fuelBar", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHITE_COUNTRY_LOAF.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingTime", 200);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
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
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHITE_COUNTRY_LOAF.get()) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_COUNTRY_LOAF.get());
						_setstack.setCount((int) (1 + new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 3)));
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingTime", 200);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
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
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_COUNTRY_LOAF.get());
							_setstack.setCount((int) (1 + new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 3)));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PRETZEL_BREAD.get() && new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingTime", 200);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
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
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PRETZEL_BREAD.get()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 3;
								final ItemStack _setstack = new ItemStack(BreadcraftModItems.PRETZEL_BREAD.get());
								_setstack.setCount((int) (1 + new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 3)));
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_slotid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
									}
								});
							}
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingTime", 200);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
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
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = 3;
									final ItemStack _setstack = new ItemStack(BreadcraftModItems.PRETZEL_BREAD.get());
									_setstack.setCount((int) (1 + new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 3)));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_slotid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
										}
									});
								}
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PRETZEL_ROLL.get() && new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingTime", 200);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
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
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PRETZEL_ROLL.get()) {
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 3;
										final ItemStack _setstack = new ItemStack(BreadcraftModItems.PRETZEL_ROLL.get());
										_setstack.setCount((int) (4 + new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 3)));
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
											}
										});
									}
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingTime", 200);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
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
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
									{
										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _slotid = 3;
											final ItemStack _setstack = new ItemStack(BreadcraftModItems.PRETZEL_ROLL.get());
											_setstack.setCount((int) (4 + new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 3)));
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													ItemStack _stk = capability.getStackInSlot(_slotid).copy();
													_stk.shrink(_amount);
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
												}
											});
										}
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicInteger _retval = new AtomicInteger(0);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), 3) <= 58 && (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.POT.get() && (new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PLAIN_BAGEL.get() && new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingTime", 200);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
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
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 3) <= 58 && new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PLAIN_BAGEL.get()) {
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 3;
												final ItemStack _setstack = new ItemStack(BreadcraftModItems.PLAIN_BAGEL.get());
												_setstack.setCount((int) (6 + new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 3)));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable) {
														ItemStack _stk = capability.getStackInSlot(_slotid).copy();
														_stk.shrink(_amount);
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
													}
												});
											}
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.POT.get() && new Object() {
										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("craftingTime", 200);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x, y, z);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
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
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
											{
												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
												if (_ent != null) {
													final int _slotid = 3;
													final ItemStack _setstack = new ItemStack(BreadcraftModItems.PLAIN_BAGEL.get());
													_setstack.setCount((int) (6 + new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 3)));
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable) {
															ItemStack _stk = capability.getStackInSlot(_slotid).copy();
															_stk.shrink(_amount);
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
														}
													});
												}
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicInteger _retval = new AtomicInteger(0);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && (new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BRIOCHE.get() && new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putDouble("craftingTime", 200);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
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
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BRIOCHE.get()) {
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 3;
														final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIOCHE.get());
														_setstack.setCount((int) (1 + new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 3)));
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
															if (capability instanceof IItemHandlerModifiable) {
																ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																_stk.shrink(_amount);
																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
															}
														});
													}
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
													return _retval.get();
												}
											}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && new Object() {
												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getDouble(tag);
													return -1;
												}
											}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble("craftingTime", 200);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (!world.isClientSide()) {
													BlockPos _bp = new BlockPos(x, y, z);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																BlockEntity blockEntity = world.getBlockEntity(pos);
																if (blockEntity != null)
																	return blockEntity.getPersistentData().getDouble(tag);
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
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
													{
														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
														if (_ent != null) {
															final int _slotid = 3;
															final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIOCHE.get());
															_setstack.setCount((int) (1 + new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 3)));
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																if (capability instanceof IItemHandlerModifiable) {
																	ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																	_stk.shrink(_amount);
																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																}
															});
														}
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && (new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHITE_BREAD.get() && new Object() {
													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getDouble(tag);
														return -1;
													}
												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putDouble("craftingTime", 200);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																	BlockEntity blockEntity = world.getBlockEntity(pos);
																	if (blockEntity != null)
																		return blockEntity.getPersistentData().getDouble(tag);
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
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHITE_BREAD.get()) {
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 3;
																final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_BREAD.get());
																_setstack.setCount((int) (1 + new Object() {
																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																		return _retval.get();
																	}
																}.getAmount(world, new BlockPos(x, y, z), 3)));
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																	if (capability instanceof IItemHandlerModifiable) {
																		ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																		_stk.shrink(_amount);
																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																	}
																});
															}
														}
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
															return _retval.get();
														}
													}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && new Object() {
														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
															BlockEntity blockEntity = world.getBlockEntity(pos);
															if (blockEntity != null)
																return blockEntity.getPersistentData().getDouble(tag);
															return -1;
														}
													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putDouble("craftingTime", 200);
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
														if (!world.isClientSide()) {
															BlockPos _bp = new BlockPos(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																		BlockEntity blockEntity = world.getBlockEntity(pos);
																		if (blockEntity != null)
																			return blockEntity.getPersistentData().getDouble(tag);
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
																	return blockEntity.getPersistentData().getDouble(tag);
																return -1;
															}
														}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																BlockEntity blockEntity = world.getBlockEntity(pos);
																if (blockEntity != null)
																	return blockEntity.getPersistentData().getDouble(tag);
																return -1;
															}
														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
															{
																BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																if (_ent != null) {
																	final int _slotid = 3;
																	final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHITE_BREAD.get());
																	_setstack.setCount((int) (1 + new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 3)));
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																		}
																	});
																}
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH.get() && new Object() {
															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicInteger _retval = new AtomicInteger(0);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																return _retval.get();
															}
														}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && (new Object() {
															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																BlockEntity _ent = world.getBlockEntity(pos);
																if (_ent != null)
																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																return _retval.get();
															}
														}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PUMPERNICKEL.get() && new Object() {
															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																BlockEntity blockEntity = world.getBlockEntity(pos);
																if (blockEntity != null)
																	return blockEntity.getPersistentData().getDouble(tag);
																return -1;
															}
														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																			BlockEntity blockEntity = world.getBlockEntity(pos);
																			if (blockEntity != null)
																				return blockEntity.getPersistentData().getDouble(tag);
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
																		return blockEntity.getPersistentData().getDouble(tag);
																	return -1;
																}
															}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																	BlockEntity blockEntity = world.getBlockEntity(pos);
																	if (blockEntity != null)
																		return blockEntity.getPersistentData().getDouble(tag);
																	return -1;
																}
															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.PUMPERNICKEL.get()) {
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 3;
																		final ItemStack _setstack = new ItemStack(BreadcraftModItems.PUMPERNICKEL.get());
																		_setstack.setCount((int) (1 + new Object() {
																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicInteger _retval = new AtomicInteger(0);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																				return _retval.get();
																			}
																		}.getAmount(world, new BlockPos(x, y, z), 3)));
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																			if (capability instanceof IItemHandlerModifiable) {
																				ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																				_stk.shrink(_amount);
																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																			}
																		});
																	}
																}
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH.get() && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																	return _retval.get();
																}
															}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && new Object() {
																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																	BlockEntity blockEntity = world.getBlockEntity(pos);
																	if (blockEntity != null)
																		return blockEntity.getPersistentData().getDouble(tag);
																	return -1;
																}
															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																	if (world instanceof Level _level)
																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																}
																if (!world.isClientSide()) {
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																	BlockState _bs = world.getBlockState(_bp);
																	if (_blockEntity != null)
																		_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																				BlockEntity blockEntity = world.getBlockEntity(pos);
																				if (blockEntity != null)
																					return blockEntity.getPersistentData().getDouble(tag);
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
																			return blockEntity.getPersistentData().getDouble(tag);
																		return -1;
																	}
																}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																		return _retval.get();
																	}
																}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																		BlockEntity blockEntity = world.getBlockEntity(pos);
																		if (blockEntity != null)
																			return blockEntity.getPersistentData().getDouble(tag);
																		return -1;
																	}
																}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																	{
																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 3;
																			final ItemStack _setstack = new ItemStack(BreadcraftModItems.PUMPERNICKEL.get());
																			_setstack.setCount((int) (1 + new Object() {
																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos(x, y, z), 3)));
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																				if (capability instanceof IItemHandlerModifiable) {
																					ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																					_stk.shrink(_amount);
																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																				}
																			});
																		}
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get() && new Object() {
																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicInteger _retval = new AtomicInteger(0);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																		return _retval.get();
																	}
																}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get() && (new Object() {
																	public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		BlockEntity _ent = world.getBlockEntity(pos);
																		if (_ent != null)
																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																		return _retval.get();
																	}
																}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.FOUGASSE.get() && new Object() {
																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																		BlockEntity blockEntity = world.getBlockEntity(pos);
																		if (blockEntity != null)
																			return blockEntity.getPersistentData().getDouble(tag);
																		return -1;
																	}
																}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																					BlockEntity blockEntity = world.getBlockEntity(pos);
																					if (blockEntity != null)
																						return blockEntity.getPersistentData().getDouble(tag);
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
																				return blockEntity.getPersistentData().getDouble(tag);
																			return -1;
																		}
																	}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																			BlockEntity blockEntity = world.getBlockEntity(pos);
																			if (blockEntity != null)
																				return blockEntity.getPersistentData().getDouble(tag);
																			return -1;
																		}
																	}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.FOUGASSE.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final ItemStack _setstack = new ItemStack(BreadcraftModItems.FOUGASSE.get());
																				_setstack.setCount((int) (1 + new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos(x, y, z), 3)));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		if (!world.isClientSide()) {
																			BlockPos _bp = new BlockPos(x, y, z);
																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_blockEntity != null)
																				_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get() && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																			return _retval.get();
																		}
																	}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get() && new Object() {
																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																			BlockEntity blockEntity = world.getBlockEntity(pos);
																			if (blockEntity != null)
																				return blockEntity.getPersistentData().getDouble(tag);
																			return -1;
																		}
																	}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																		if (!world.isClientSide()) {
																			BlockPos _bp = new BlockPos(x, y, z);
																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_blockEntity != null)
																				_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																			if (world instanceof Level _level)
																				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																		}
																		if (!world.isClientSide()) {
																			BlockPos _bp = new BlockPos(x, y, z);
																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_blockEntity != null)
																				_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																						BlockEntity blockEntity = world.getBlockEntity(pos);
																						if (blockEntity != null)
																							return blockEntity.getPersistentData().getDouble(tag);
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
																					return blockEntity.getPersistentData().getDouble(tag);
																				return -1;
																			}
																		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicInteger _retval = new AtomicInteger(0);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																				return _retval.get();
																			}
																		}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																				BlockEntity blockEntity = world.getBlockEntity(pos);
																				if (blockEntity != null)
																					return blockEntity.getPersistentData().getDouble(tag);
																				return -1;
																			}
																		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																			{
																				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																				if (_ent != null) {
																					final int _slotid = 3;
																					final ItemStack _setstack = new ItemStack(BreadcraftModItems.FOUGASSE.get());
																					_setstack.setCount((int) (1 + new Object() {
																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicInteger _retval = new AtomicInteger(0);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																							return _retval.get();
																						}
																					}.getAmount(world, new BlockPos(x, y, z), 3)));
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																							_stk.shrink(_amount);
																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																						}
																					});
																				}
																			}
																			if (!world.isClientSide()) {
																				BlockPos _bp = new BlockPos(x, y, z);
																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																				BlockState _bs = world.getBlockState(_bp);
																				if (_blockEntity != null)
																					_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.ENRICHED_DOUGH_WITH_FILLING.get() && new Object() {
																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicInteger _retval = new AtomicInteger(0);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																				return _retval.get();
																			}
																		}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && (new Object() {
																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																				BlockEntity _ent = world.getBlockEntity(pos);
																				if (_ent != null)
																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																				return _retval.get();
																			}
																		}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BABKA.get() && new Object() {
																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																				BlockEntity blockEntity = world.getBlockEntity(pos);
																				if (blockEntity != null)
																					return blockEntity.getPersistentData().getDouble(tag);
																				return -1;
																			}
																		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																			if (!world.isClientSide()) {
																				BlockPos _bp = new BlockPos(x, y, z);
																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																				BlockState _bs = world.getBlockState(_bp);
																				if (_blockEntity != null)
																					_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																				if (world instanceof Level _level)
																					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																			}
																			if (!world.isClientSide()) {
																				BlockPos _bp = new BlockPos(x, y, z);
																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																				BlockState _bs = world.getBlockState(_bp);
																				if (_blockEntity != null)
																					_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																							BlockEntity blockEntity = world.getBlockEntity(pos);
																							if (blockEntity != null)
																								return blockEntity.getPersistentData().getDouble(tag);
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
																						return blockEntity.getPersistentData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																					BlockEntity blockEntity = world.getBlockEntity(pos);
																					if (blockEntity != null)
																						return blockEntity.getPersistentData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BABKA.get()) {
																				{
																					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																					if (_ent != null) {
																						final int _slotid = 3;
																						final ItemStack _setstack = new ItemStack(BreadcraftModItems.BABKA.get());
																						_setstack.setCount((int) (1 + new Object() {
																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicInteger _retval = new AtomicInteger(0);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																								return _retval.get();
																							}
																						}.getAmount(world, new BlockPos(x, y, z), 3)));
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																								_stk.shrink(_amount);
																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																							}
																						});
																					}
																				}
																				if (!world.isClientSide()) {
																					BlockPos _bp = new BlockPos(x, y, z);
																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_blockEntity != null)
																						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.ENRICHED_DOUGH_WITH_FILLING.get() && new Object() {
																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																					BlockEntity _ent = world.getBlockEntity(pos);
																					if (_ent != null)
																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																					return _retval.get();
																				}
																			}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get() && new Object() {
																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																					BlockEntity blockEntity = world.getBlockEntity(pos);
																					if (blockEntity != null)
																						return blockEntity.getPersistentData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																				if (!world.isClientSide()) {
																					BlockPos _bp = new BlockPos(x, y, z);
																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_blockEntity != null)
																						_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																					if (world instanceof Level _level)
																						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																				}
																				if (!world.isClientSide()) {
																					BlockPos _bp = new BlockPos(x, y, z);
																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_blockEntity != null)
																						_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																								BlockEntity blockEntity = world.getBlockEntity(pos);
																								if (blockEntity != null)
																									return blockEntity.getPersistentData().getDouble(tag);
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
																							return blockEntity.getPersistentData().getDouble(tag);
																						return -1;
																					}
																				}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																						BlockEntity blockEntity = world.getBlockEntity(pos);
																						if (blockEntity != null)
																							return blockEntity.getPersistentData().getDouble(tag);
																						return -1;
																					}
																				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																					{
																						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																						if (_ent != null) {
																							final int _slotid = 3;
																							final ItemStack _setstack = new ItemStack(BreadcraftModItems.BABKA.get());
																							_setstack.setCount((int) (1 + new Object() {
																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicInteger _retval = new AtomicInteger(0);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																									return _retval.get();
																								}
																							}.getAmount(world, new BlockPos(x, y, z), 3)));
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																								if (capability instanceof IItemHandlerModifiable) {
																									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																									_stk.shrink(_amount);
																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																								}
																							});
																						}
																					}
																					if (!world.isClientSide()) {
																						BlockPos _bp = new BlockPos(x, y, z);
																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																						BlockState _bs = world.getBlockState(_bp);
																						if (_blockEntity != null)
																							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH.get() && new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && (new Object() {
																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																						return _retval.get();
																					}
																				}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.RYE_BREAD.get() && new Object() {
																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																						BlockEntity blockEntity = world.getBlockEntity(pos);
																						if (blockEntity != null)
																							return blockEntity.getPersistentData().getDouble(tag);
																						return -1;
																					}
																				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																					if (!world.isClientSide()) {
																						BlockPos _bp = new BlockPos(x, y, z);
																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																						BlockState _bs = world.getBlockState(_bp);
																						if (_blockEntity != null)
																							_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																						if (world instanceof Level _level)
																							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																					}
																					if (!world.isClientSide()) {
																						BlockPos _bp = new BlockPos(x, y, z);
																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																						BlockState _bs = world.getBlockState(_bp);
																						if (_blockEntity != null)
																							_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																									BlockEntity blockEntity = world.getBlockEntity(pos);
																									if (blockEntity != null)
																										return blockEntity.getPersistentData().getDouble(tag);
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
																								return blockEntity.getPersistentData().getDouble(tag);
																							return -1;
																						}
																					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicInteger _retval = new AtomicInteger(0);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																							return _retval.get();
																						}
																					}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																							BlockEntity blockEntity = world.getBlockEntity(pos);
																							if (blockEntity != null)
																								return blockEntity.getPersistentData().getDouble(tag);
																							return -1;
																						}
																					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.RYE_BREAD.get()) {
																						{
																							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																							if (_ent != null) {
																								final int _slotid = 3;
																								final ItemStack _setstack = new ItemStack(BreadcraftModItems.RYE_BREAD.get());
																								_setstack.setCount((int) (1 + new Object() {
																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicInteger _retval = new AtomicInteger(0);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																										return _retval.get();
																									}
																								}.getAmount(world, new BlockPos(x, y, z), 3)));
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																									if (capability instanceof IItemHandlerModifiable) {
																										ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																										_stk.shrink(_amount);
																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																									}
																								});
																							}
																						}
																						if (!world.isClientSide()) {
																							BlockPos _bp = new BlockPos(x, y, z);
																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																							BlockState _bs = world.getBlockState(_bp);
																							if (_blockEntity != null)
																								_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH.get() && new Object() {
																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicInteger _retval = new AtomicInteger(0);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																							return _retval.get();
																						}
																					}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																							BlockEntity _ent = world.getBlockEntity(pos);
																							if (_ent != null)
																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																							return _retval.get();
																						}
																					}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.DUTCH_OVEN.get() && new Object() {
																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																							BlockEntity blockEntity = world.getBlockEntity(pos);
																							if (blockEntity != null)
																								return blockEntity.getPersistentData().getDouble(tag);
																							return -1;
																						}
																					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																						if (!world.isClientSide()) {
																							BlockPos _bp = new BlockPos(x, y, z);
																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																							BlockState _bs = world.getBlockState(_bp);
																							if (_blockEntity != null)
																								_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																							if (world instanceof Level _level)
																								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																						}
																						if (!world.isClientSide()) {
																							BlockPos _bp = new BlockPos(x, y, z);
																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																							BlockState _bs = world.getBlockState(_bp);
																							if (_blockEntity != null)
																								_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																										BlockEntity blockEntity = world.getBlockEntity(pos);
																										if (blockEntity != null)
																											return blockEntity.getPersistentData().getDouble(tag);
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
																									return blockEntity.getPersistentData().getDouble(tag);
																								return -1;
																							}
																						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicInteger _retval = new AtomicInteger(0);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																								return _retval.get();
																							}
																						}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																								BlockEntity blockEntity = world.getBlockEntity(pos);
																								if (blockEntity != null)
																									return blockEntity.getPersistentData().getDouble(tag);
																								return -1;
																							}
																						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																							{
																								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																								if (_ent != null) {
																									final int _slotid = 3;
																									final ItemStack _setstack = new ItemStack(BreadcraftModItems.RYE_BREAD.get());
																									_setstack.setCount((int) (1 + new Object() {
																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicInteger _retval = new AtomicInteger(0);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																											return _retval.get();
																										}
																									}.getAmount(world, new BlockPos(x, y, z), 3)));
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																										if (capability instanceof IItemHandlerModifiable) {
																											ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																											_stk.shrink(_amount);
																											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																										}
																									});
																								}
																							}
																							if (!world.isClientSide()) {
																								BlockPos _bp = new BlockPos(x, y, z);
																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																								BlockState _bs = world.getBlockState(_bp);
																								if (_blockEntity != null)
																									_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicInteger _retval = new AtomicInteger(0);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																								return _retval.get();
																							}
																						}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SQUARE_PAN.get() && (new Object() {
																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																								BlockEntity _ent = world.getBlockEntity(pos);
																								if (_ent != null)
																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																								return _retval.get();
																							}
																						}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.MILK_BREAD.get() && new Object() {
																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																								BlockEntity blockEntity = world.getBlockEntity(pos);
																								if (blockEntity != null)
																									return blockEntity.getPersistentData().getDouble(tag);
																								return -1;
																							}
																						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																							if (!world.isClientSide()) {
																								BlockPos _bp = new BlockPos(x, y, z);
																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																								BlockState _bs = world.getBlockState(_bp);
																								if (_blockEntity != null)
																									_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																								if (world instanceof Level _level)
																									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																							}
																							if (!world.isClientSide()) {
																								BlockPos _bp = new BlockPos(x, y, z);
																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																								BlockState _bs = world.getBlockState(_bp);
																								if (_blockEntity != null)
																									_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																											BlockEntity blockEntity = world.getBlockEntity(pos);
																											if (blockEntity != null)
																												return blockEntity.getPersistentData().getDouble(tag);
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
																										return blockEntity.getPersistentData().getDouble(tag);
																									return -1;
																								}
																							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicInteger _retval = new AtomicInteger(0);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																									return _retval.get();
																								}
																							}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																									BlockEntity blockEntity = world.getBlockEntity(pos);
																									if (blockEntity != null)
																										return blockEntity.getPersistentData().getDouble(tag);
																									return -1;
																								}
																							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.MILK_BREAD.get()) {
																								{
																									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																									if (_ent != null) {
																										final int _slotid = 3;
																										final ItemStack _setstack = new ItemStack(BreadcraftModItems.MILK_BREAD.get());
																										_setstack.setCount((int) (1 + new Object() {
																											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicInteger _retval = new AtomicInteger(0);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																												return _retval.get();
																											}
																										}.getAmount(world, new BlockPos(x, y, z), 3)));
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																											if (capability instanceof IItemHandlerModifiable) {
																												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																												_stk.shrink(_amount);
																												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																											}
																										});
																									}
																								}
																								if (!world.isClientSide()) {
																									BlockPos _bp = new BlockPos(x, y, z);
																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																									BlockState _bs = world.getBlockState(_bp);
																									if (_blockEntity != null)
																										_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicInteger _retval = new AtomicInteger(0);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																									return _retval.get();
																								}
																							}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																									BlockEntity _ent = world.getBlockEntity(pos);
																									if (_ent != null)
																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																									return _retval.get();
																								}
																							}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SQUARE_PAN.get() && new Object() {
																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																									BlockEntity blockEntity = world.getBlockEntity(pos);
																									if (blockEntity != null)
																										return blockEntity.getPersistentData().getDouble(tag);
																									return -1;
																								}
																							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																								if (!world.isClientSide()) {
																									BlockPos _bp = new BlockPos(x, y, z);
																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																									BlockState _bs = world.getBlockState(_bp);
																									if (_blockEntity != null)
																										_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																									if (world instanceof Level _level)
																										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																								}
																								if (!world.isClientSide()) {
																									BlockPos _bp = new BlockPos(x, y, z);
																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																									BlockState _bs = world.getBlockState(_bp);
																									if (_blockEntity != null)
																										_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																												BlockEntity blockEntity = world.getBlockEntity(pos);
																												if (blockEntity != null)
																													return blockEntity.getPersistentData().getDouble(tag);
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
																											return blockEntity.getPersistentData().getDouble(tag);
																										return -1;
																									}
																								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicInteger _retval = new AtomicInteger(0);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																										return _retval.get();
																									}
																								}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																										BlockEntity blockEntity = world.getBlockEntity(pos);
																										if (blockEntity != null)
																											return blockEntity.getPersistentData().getDouble(tag);
																										return -1;
																									}
																								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																									{
																										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																										if (_ent != null) {
																											final int _slotid = 3;
																											final ItemStack _setstack = new ItemStack(BreadcraftModItems.MILK_BREAD.get());
																											_setstack.setCount((int) (1 + new Object() {
																												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicInteger _retval = new AtomicInteger(0);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																													return _retval.get();
																												}
																											}.getAmount(world, new BlockPos(x, y, z), 3)));
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																												if (capability instanceof IItemHandlerModifiable) {
																													ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																													_stk.shrink(_amount);
																													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																												}
																											});
																										}
																									}
																									if (!world.isClientSide()) {
																										BlockPos _bp = new BlockPos(x, y, z);
																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																										BlockState _bs = world.getBlockState(_bp);
																										if (_blockEntity != null)
																											_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicInteger _retval = new AtomicInteger(0);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																										return _retval.get();
																									}
																								}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && (new Object() {
																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && (new Object() {
																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																										BlockEntity _ent = world.getBlockEntity(pos);
																										if (_ent != null)
																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																										return _retval.get();
																									}
																								}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BRIOCHE_BUN.get() && new Object() {
																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																										BlockEntity blockEntity = world.getBlockEntity(pos);
																										if (blockEntity != null)
																											return blockEntity.getPersistentData().getDouble(tag);
																										return -1;
																									}
																								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																									if (!world.isClientSide()) {
																										BlockPos _bp = new BlockPos(x, y, z);
																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																										BlockState _bs = world.getBlockState(_bp);
																										if (_blockEntity != null)
																											_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																										if (world instanceof Level _level)
																											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																									}
																									if (!world.isClientSide()) {
																										BlockPos _bp = new BlockPos(x, y, z);
																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																										BlockState _bs = world.getBlockState(_bp);
																										if (_blockEntity != null)
																											_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																													BlockEntity blockEntity = world.getBlockEntity(pos);
																													if (blockEntity != null)
																														return blockEntity.getPersistentData().getDouble(tag);
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
																												return blockEntity.getPersistentData().getDouble(tag);
																											return -1;
																										}
																									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicInteger _retval = new AtomicInteger(0);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																											return _retval.get();
																										}
																									}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && new Object() {
																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																											BlockEntity blockEntity = world.getBlockEntity(pos);
																											if (blockEntity != null)
																												return blockEntity.getPersistentData().getDouble(tag);
																											return -1;
																										}
																									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BRIOCHE_BUN.get()) {
																										{
																											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																											if (_ent != null) {
																												final int _slotid = 3;
																												final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIOCHE_BUN.get());
																												_setstack.setCount((int) (4 + new Object() {
																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicInteger _retval = new AtomicInteger(0);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																														return _retval.get();
																													}
																												}.getAmount(world, new BlockPos(x, y, z), 3)));
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																													if (capability instanceof IItemHandlerModifiable) {
																														ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																														_stk.shrink(_amount);
																														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																													}
																												});
																											}
																										}
																										if (!world.isClientSide()) {
																											BlockPos _bp = new BlockPos(x, y, z);
																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																											BlockState _bs = world.getBlockState(_bp);
																											if (_blockEntity != null)
																												_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH.get() && new Object() {
																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicInteger _retval = new AtomicInteger(0);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																														.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																											return _retval.get();
																										}
																									}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																											BlockEntity _ent = world.getBlockEntity(pos);
																											if (_ent != null)
																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																											return _retval.get();
																										}
																									}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && new Object() {
																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																											BlockEntity blockEntity = world.getBlockEntity(pos);
																											if (blockEntity != null)
																												return blockEntity.getPersistentData().getDouble(tag);
																											return -1;
																										}
																									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																										if (!world.isClientSide()) {
																											BlockPos _bp = new BlockPos(x, y, z);
																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																											BlockState _bs = world.getBlockState(_bp);
																											if (_blockEntity != null)
																												_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																											if (world instanceof Level _level)
																												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																										}
																										if (!world.isClientSide()) {
																											BlockPos _bp = new BlockPos(x, y, z);
																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																											BlockState _bs = world.getBlockState(_bp);
																											if (_blockEntity != null)
																												_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																														BlockEntity blockEntity = world.getBlockEntity(pos);
																														if (blockEntity != null)
																															return blockEntity.getPersistentData().getDouble(tag);
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
																													return blockEntity.getPersistentData().getDouble(tag);
																												return -1;
																											}
																										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicInteger _retval = new AtomicInteger(0);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																												return _retval.get();
																											}
																										}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																												BlockEntity blockEntity = world.getBlockEntity(pos);
																												if (blockEntity != null)
																													return blockEntity.getPersistentData().getDouble(tag);
																												return -1;
																											}
																										}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																											{
																												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																												if (_ent != null) {
																													final int _slotid = 3;
																													final ItemStack _setstack = new ItemStack(BreadcraftModItems.BRIOCHE_BUN.get());
																													_setstack.setCount((int) (4 + new Object() {
																														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicInteger _retval = new AtomicInteger(0);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																															return _retval.get();
																														}
																													}.getAmount(world, new BlockPos(x, y, z), 3)));
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																														if (capability instanceof IItemHandlerModifiable) {
																															ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																															_stk.shrink(_amount);
																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																														}
																													});
																												}
																											}
																											if (!world.isClientSide()) {
																												BlockPos _bp = new BlockPos(x, y, z);
																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																												BlockState _bs = world.getBlockState(_bp);
																												if (_blockEntity != null)
																													_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																												return _retval.get();
																											}
																										}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
																											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicInteger _retval = new AtomicInteger(0);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																												return _retval.get();
																											}
																										}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && (new Object() {
																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																												return _retval.get();
																											}
																										}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && (new Object() {
																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																												BlockEntity _ent = world.getBlockEntity(pos);
																												if (_ent != null)
																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																															.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																												return _retval.get();
																											}
																										}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.DINNER_ROLL.get() && new Object() {
																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																												BlockEntity blockEntity = world.getBlockEntity(pos);
																												if (blockEntity != null)
																													return blockEntity.getPersistentData().getDouble(tag);
																												return -1;
																											}
																										}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																											if (!world.isClientSide()) {
																												BlockPos _bp = new BlockPos(x, y, z);
																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																												BlockState _bs = world.getBlockState(_bp);
																												if (_blockEntity != null)
																													_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																												if (world instanceof Level _level)
																													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																											}
																											if (!world.isClientSide()) {
																												BlockPos _bp = new BlockPos(x, y, z);
																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																												BlockState _bs = world.getBlockState(_bp);
																												if (_blockEntity != null)
																													_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																															BlockEntity blockEntity = world.getBlockEntity(pos);
																															if (blockEntity != null)
																																return blockEntity.getPersistentData().getDouble(tag);
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
																														return blockEntity.getPersistentData().getDouble(tag);
																													return -1;
																												}
																											}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicInteger _retval = new AtomicInteger(0);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																													return _retval.get();
																												}
																											}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && new Object() {
																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																													BlockEntity blockEntity = world.getBlockEntity(pos);
																													if (blockEntity != null)
																														return blockEntity.getPersistentData().getDouble(tag);
																													return -1;
																												}
																											}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																													return _retval.get();
																												}
																											}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.DINNER_ROLL.get()) {
																												{
																													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																													if (_ent != null) {
																														final int _slotid = 3;
																														final ItemStack _setstack = new ItemStack(BreadcraftModItems.DINNER_ROLL.get());
																														_setstack.setCount((int) (4 + new Object() {
																															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicInteger _retval = new AtomicInteger(0);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																return _retval.get();
																															}
																														}.getAmount(world, new BlockPos(x, y, z), 3)));
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																															if (capability instanceof IItemHandlerModifiable) {
																																ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																_stk.shrink(_amount);
																																((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																															}
																														});
																													}
																												}
																												if (!world.isClientSide()) {
																													BlockPos _bp = new BlockPos(x, y, z);
																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																													BlockState _bs = world.getBlockState(_bp);
																													if (_blockEntity != null)
																														_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																													return _retval.get();
																												}
																											}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
																												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicInteger _retval = new AtomicInteger(0);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																													return _retval.get();
																												}
																											}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																													BlockEntity _ent = world.getBlockEntity(pos);
																													if (_ent != null)
																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																													return _retval.get();
																												}
																											}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.ROUND_PAN.get() && new Object() {
																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																													BlockEntity blockEntity = world.getBlockEntity(pos);
																													if (blockEntity != null)
																														return blockEntity.getPersistentData().getDouble(tag);
																													return -1;
																												}
																											}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																												if (!world.isClientSide()) {
																													BlockPos _bp = new BlockPos(x, y, z);
																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																													BlockState _bs = world.getBlockState(_bp);
																													if (_blockEntity != null)
																														_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																													if (world instanceof Level _level)
																														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																												}
																												if (!world.isClientSide()) {
																													BlockPos _bp = new BlockPos(x, y, z);
																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																													BlockState _bs = world.getBlockState(_bp);
																													if (_blockEntity != null)
																														_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																if (blockEntity != null)
																																	return blockEntity.getPersistentData().getDouble(tag);
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
																															return blockEntity.getPersistentData().getDouble(tag);
																														return -1;
																													}
																												}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicInteger _retval = new AtomicInteger(0);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																														return _retval.get();
																													}
																												}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																														BlockEntity blockEntity = world.getBlockEntity(pos);
																														if (blockEntity != null)
																															return blockEntity.getPersistentData().getDouble(tag);
																														return -1;
																													}
																												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																													{
																														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																														if (_ent != null) {
																															final int _slotid = 3;
																															final ItemStack _setstack = new ItemStack(BreadcraftModItems.DINNER_ROLL.get());
																															_setstack.setCount((int) (4 + new Object() {
																																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicInteger _retval = new AtomicInteger(0);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																	return _retval.get();
																																}
																															}.getAmount(world, new BlockPos(x, y, z), 3)));
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																if (capability instanceof IItemHandlerModifiable) {
																																	ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																	_stk.shrink(_amount);
																																	((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																}
																															});
																														}
																													}
																													if (!world.isClientSide()) {
																														BlockPos _bp = new BlockPos(x, y, z);
																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																														BlockState _bs = world.getBlockState(_bp);
																														if (_blockEntity != null)
																															_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																														return _retval.get();
																													}
																												}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicInteger _retval = new AtomicInteger(0);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																														return _retval.get();
																													}
																												}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && (new Object() {
																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																														return _retval.get();
																													}
																												}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.RIDGED_PAN.get() && (new Object() {
																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																														BlockEntity _ent = world.getBlockEntity(pos);
																														if (_ent != null)
																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																	.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																														return _retval.get();
																													}
																												}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BAGUETTE.get() && new Object() {
																													public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																														BlockEntity blockEntity = world.getBlockEntity(pos);
																														if (blockEntity != null)
																															return blockEntity.getPersistentData().getDouble(tag);
																														return -1;
																													}
																												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																													if (!world.isClientSide()) {
																														BlockPos _bp = new BlockPos(x, y, z);
																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																														BlockState _bs = world.getBlockState(_bp);
																														if (_blockEntity != null)
																															_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																														if (world instanceof Level _level)
																															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																													}
																													if (!world.isClientSide()) {
																														BlockPos _bp = new BlockPos(x, y, z);
																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																														BlockState _bs = world.getBlockState(_bp);
																														if (_blockEntity != null)
																															_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																	if (blockEntity != null)
																																		return blockEntity.getPersistentData().getDouble(tag);
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
																																return blockEntity.getPersistentData().getDouble(tag);
																															return -1;
																														}
																													}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicInteger _retval = new AtomicInteger(0);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																															return _retval.get();
																														}
																													}.getAmount(world, new BlockPos(x, y, z), 3) <= 60 && new Object() {
																														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																															BlockEntity blockEntity = world.getBlockEntity(pos);
																															if (blockEntity != null)
																																return blockEntity.getPersistentData().getDouble(tag);
																															return -1;
																														}
																													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																															return _retval.get();
																														}
																													}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.BAGUETTE.get()) {
																														{
																															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																															if (_ent != null) {
																																final int _slotid = 3;
																																final ItemStack _setstack = new ItemStack(BreadcraftModItems.BAGUETTE.get());
																																_setstack.setCount((int) (4 + new Object() {
																																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																		AtomicInteger _retval = new AtomicInteger(0);
																																		BlockEntity _ent = world.getBlockEntity(pos);
																																		if (_ent != null)
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																					.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																		return _retval.get();
																																	}
																																}.getAmount(world, new BlockPos(x, y, z), 3)));
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																	if (capability instanceof IItemHandlerModifiable) {
																																		ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																		_stk.shrink(_amount);
																																		((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																	}
																																});
																															}
																														}
																														if (!world.isClientSide()) {
																															BlockPos _bp = new BlockPos(x, y, z);
																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																															BlockState _bs = world.getBlockState(_bp);
																															if (_blockEntity != null)
																																_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																															return _retval.get();
																														}
																													}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get() && new Object() {
																														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicInteger _retval = new AtomicInteger(0);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																															return _retval.get();
																														}
																													}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																															AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																															BlockEntity _ent = world.getBlockEntity(pos);
																															if (_ent != null)
																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																		.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																															return _retval.get();
																														}
																													}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.RIDGED_PAN.get() && new Object() {
																														public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																															BlockEntity blockEntity = world.getBlockEntity(pos);
																															if (blockEntity != null)
																																return blockEntity.getPersistentData().getDouble(tag);
																															return -1;
																														}
																													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																														if (!world.isClientSide()) {
																															BlockPos _bp = new BlockPos(x, y, z);
																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																															BlockState _bs = world.getBlockState(_bp);
																															if (_blockEntity != null)
																																_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																															if (world instanceof Level _level)
																																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																														}
																														if (!world.isClientSide()) {
																															BlockPos _bp = new BlockPos(x, y, z);
																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																															BlockState _bs = world.getBlockState(_bp);
																															if (_blockEntity != null)
																																_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																		BlockEntity blockEntity = world.getBlockEntity(pos);
																																		if (blockEntity != null)
																																			return blockEntity.getPersistentData().getDouble(tag);
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
																																	return blockEntity.getPersistentData().getDouble(tag);
																																return -1;
																															}
																														}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicInteger _retval = new AtomicInteger(0);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																return _retval.get();
																															}
																														}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																if (blockEntity != null)
																																	return blockEntity.getPersistentData().getDouble(tag);
																																return -1;
																															}
																														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																															{
																																BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																if (_ent != null) {
																																	final int _slotid = 3;
																																	final ItemStack _setstack = new ItemStack(BreadcraftModItems.BAGUETTE.get());
																																	_setstack.setCount((int) (4 + new Object() {
																																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																			AtomicInteger _retval = new AtomicInteger(0);
																																			BlockEntity _ent = world.getBlockEntity(pos);
																																			if (_ent != null)
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																			return _retval.get();
																																		}
																																	}.getAmount(world, new BlockPos(x, y, z), 3)));
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																		if (capability instanceof IItemHandlerModifiable) {
																																			ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																			_stk.shrink(_amount);
																																			((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																		}
																																	});
																																}
																															}
																															if (!world.isClientSide()) {
																																BlockPos _bp = new BlockPos(x, y, z);
																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																BlockState _bs = world.getBlockState(_bp);
																																if (_blockEntity != null)
																																	_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																return _retval.get();
																															}
																														}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
																															public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicInteger _retval = new AtomicInteger(0);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																return _retval.get();
																															}
																														}.getAmount(world, new BlockPos(x, y, z), 3) <= 58 && (new Object() {
																															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																return _retval.get();
																															}
																														}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get() && (new Object() {
																															public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																BlockEntity _ent = world.getBlockEntity(pos);
																																if (_ent != null)
																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																			.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																return _retval.get();
																															}
																														}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.SOFT_PRETZEL.get() && new Object() {
																															public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																if (blockEntity != null)
																																	return blockEntity.getPersistentData().getDouble(tag);
																																return -1;
																															}
																														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																															if (!world.isClientSide()) {
																																BlockPos _bp = new BlockPos(x, y, z);
																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																BlockState _bs = world.getBlockState(_bp);
																																if (_blockEntity != null)
																																	_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																if (world instanceof Level _level)
																																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																															}
																															if (!world.isClientSide()) {
																																BlockPos _bp = new BlockPos(x, y, z);
																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																BlockState _bs = world.getBlockState(_bp);
																																if (_blockEntity != null)
																																	_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																			BlockEntity blockEntity = world.getBlockEntity(pos);
																																			if (blockEntity != null)
																																				return blockEntity.getPersistentData().getDouble(tag);
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
																																		return blockEntity.getPersistentData().getDouble(tag);
																																	return -1;
																																}
																															}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicInteger _retval = new AtomicInteger(0);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																	return _retval.get();
																																}
																															}.getAmount(world, new BlockPos(x, y, z), 3) <= 58 && new Object() {
																																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																	if (blockEntity != null)
																																		return blockEntity.getPersistentData().getDouble(tag);
																																	return -1;
																																}
																															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																	return _retval.get();
																																}
																															}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.SOFT_PRETZEL.get()) {
																																{
																																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																	if (_ent != null) {
																																		final int _slotid = 3;
																																		final ItemStack _setstack = new ItemStack(BreadcraftModItems.SOFT_PRETZEL.get());
																																		_setstack.setCount((int) (6 + new Object() {
																																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicInteger _retval = new AtomicInteger(0);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																				return _retval.get();
																																			}
																																		}.getAmount(world, new BlockPos(x, y, z), 3)));
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																			if (capability instanceof IItemHandlerModifiable) {
																																				ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																				_stk.shrink(_amount);
																																				((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																			}
																																		});
																																	}
																																}
																																if (!world.isClientSide()) {
																																	BlockPos _bp = new BlockPos(x, y, z);
																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																	BlockState _bs = world.getBlockState(_bp);
																																	if (_blockEntity != null)
																																		_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																	return _retval.get();
																																}
																															}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PRETZEL_DOUGH.get() && new Object() {
																																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicInteger _retval = new AtomicInteger(0);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																	return _retval.get();
																																}
																															}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																	BlockEntity _ent = world.getBlockEntity(pos);
																																	if (_ent != null)
																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																				.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																	return _retval.get();
																																}
																															}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get() && new Object() {
																																public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																	if (blockEntity != null)
																																		return blockEntity.getPersistentData().getDouble(tag);
																																	return -1;
																																}
																															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																if (!world.isClientSide()) {
																																	BlockPos _bp = new BlockPos(x, y, z);
																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																	BlockState _bs = world.getBlockState(_bp);
																																	if (_blockEntity != null)
																																		_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																	if (world instanceof Level _level)
																																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																}
																																if (!world.isClientSide()) {
																																	BlockPos _bp = new BlockPos(x, y, z);
																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																	BlockState _bs = world.getBlockState(_bp);
																																	if (_blockEntity != null)
																																		_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																				BlockEntity blockEntity = world.getBlockEntity(pos);
																																				if (blockEntity != null)
																																					return blockEntity.getPersistentData().getDouble(tag);
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
																																			return blockEntity.getPersistentData().getDouble(tag);
																																		return -1;
																																	}
																																}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																	public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																		AtomicInteger _retval = new AtomicInteger(0);
																																		BlockEntity _ent = world.getBlockEntity(pos);
																																		if (_ent != null)
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																					.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																		return _retval.get();
																																	}
																																}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																	public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																		BlockEntity blockEntity = world.getBlockEntity(pos);
																																		if (blockEntity != null)
																																			return blockEntity.getPersistentData().getDouble(tag);
																																		return -1;
																																	}
																																}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																	{
																																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																		if (_ent != null) {
																																			final int _slotid = 3;
																																			final ItemStack _setstack = new ItemStack(BreadcraftModItems.SOFT_PRETZEL.get());
																																			_setstack.setCount((int) (6 + new Object() {
																																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicInteger _retval = new AtomicInteger(0);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																					return _retval.get();
																																				}
																																			}.getAmount(world, new BlockPos(x, y, z), 3)));
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																				if (capability instanceof IItemHandlerModifiable) {
																																					ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																					_stk.shrink(_amount);
																																					((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																				}
																																			});
																																		}
																																	}
																																	if (!world.isClientSide()) {
																																		BlockPos _bp = new BlockPos(x, y, z);
																																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																		BlockState _bs = world.getBlockState(_bp);
																																		if (_blockEntity != null)
																																			_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																			_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																					.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																		return _retval.get();
																																	}
																																}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get()
																																		&& new Object() {
																																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicInteger _retval = new AtomicInteger(0);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																				return _retval.get();
																																			}
																																		}.getAmount(world, new BlockPos(x, y, z), 3) <= 61 && (new Object() {
																																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																				return _retval.get();
																																			}
																																		}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.RIDGED_PAN.get()
																																		&& (new Object() {
																																			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																				return _retval.get();
																																			}
																																		}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.SUB_SANDWICH_LOAF.get()
																																		&& new Object() {
																																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																				BlockEntity blockEntity = world.getBlockEntity(pos);
																																				if (blockEntity != null)
																																					return blockEntity.getPersistentData().getDouble(tag);
																																				return -1;
																																			}
																																		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																	if (!world.isClientSide()) {
																																		BlockPos _bp = new BlockPos(x, y, z);
																																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																		BlockState _bs = world.getBlockState(_bp);
																																		if (_blockEntity != null)
																																			_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																		if (world instanceof Level _level)
																																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																	}
																																	if (!world.isClientSide()) {
																																		BlockPos _bp = new BlockPos(x, y, z);
																																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																		BlockState _bs = world.getBlockState(_bp);
																																		if (_blockEntity != null)
																																			_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																					BlockEntity blockEntity = world.getBlockEntity(pos);
																																					if (blockEntity != null)
																																						return blockEntity.getPersistentData().getDouble(tag);
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
																																				return blockEntity.getPersistentData().getDouble(tag);
																																			return -1;
																																		}
																																	}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																			AtomicInteger _retval = new AtomicInteger(0);
																																			BlockEntity _ent = world.getBlockEntity(pos);
																																			if (_ent != null)
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																			return _retval.get();
																																		}
																																	}.getAmount(world, new BlockPos(x, y, z), 3) <= 61 && new Object() {
																																		public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																			BlockEntity blockEntity = world.getBlockEntity(pos);
																																			if (blockEntity != null)
																																				return blockEntity.getPersistentData().getDouble(tag);
																																			return -1;
																																		}
																																	}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																		public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																			BlockEntity _ent = world.getBlockEntity(pos);
																																			if (_ent != null)
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																			return _retval.get();
																																		}
																																	}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.SUB_SANDWICH_LOAF.get()) {
																																		{
																																			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																			if (_ent != null) {
																																				final int _slotid = 3;
																																				final ItemStack _setstack = new ItemStack(BreadcraftModItems.SUB_SANDWICH_LOAF.get());
																																				_setstack.setCount((int) (3 + new Object() {
																																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicInteger _retval = new AtomicInteger(0);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																						return _retval.get();
																																					}
																																				}.getAmount(world, new BlockPos(x, y, z), 3)));
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																					if (capability instanceof IItemHandlerModifiable) {
																																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																						_stk.shrink(_amount);
																																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																					}
																																				});
																																			}
																																		}
																																		if (!world.isClientSide()) {
																																			BlockPos _bp = new BlockPos(x, y, z);
																																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																			BlockState _bs = world.getBlockState(_bp);
																																			if (_blockEntity != null)
																																				_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																						.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																			return _retval.get();
																																		}
																																	}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get()
																																			&& new Object() {
																																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicInteger _retval = new AtomicInteger(0);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																					return _retval.get();
																																				}
																																			}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																					return _retval.get();
																																				}
																																			}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.RIDGED_PAN.get()
																																			&& new Object() {
																																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																					BlockEntity blockEntity = world.getBlockEntity(pos);
																																					if (blockEntity != null)
																																						return blockEntity.getPersistentData().getDouble(tag);
																																					return -1;
																																				}
																																			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																		if (!world.isClientSide()) {
																																			BlockPos _bp = new BlockPos(x, y, z);
																																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																			BlockState _bs = world.getBlockState(_bp);
																																			if (_blockEntity != null)
																																				_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																			if (world instanceof Level _level)
																																				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																		}
																																		if (!world.isClientSide()) {
																																			BlockPos _bp = new BlockPos(x, y, z);
																																			BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																			BlockState _bs = world.getBlockState(_bp);
																																			if (_blockEntity != null)
																																				_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																						BlockEntity blockEntity = world.getBlockEntity(pos);
																																						if (blockEntity != null)
																																							return blockEntity.getPersistentData().getDouble(tag);
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
																																					return blockEntity.getPersistentData().getDouble(tag);
																																				return -1;
																																			}
																																		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																				AtomicInteger _retval = new AtomicInteger(0);
																																				BlockEntity _ent = world.getBlockEntity(pos);
																																				if (_ent != null)
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																				return _retval.get();
																																			}
																																		}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																				BlockEntity blockEntity = world.getBlockEntity(pos);
																																				if (blockEntity != null)
																																					return blockEntity.getPersistentData().getDouble(tag);
																																				return -1;
																																			}
																																		}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																			{
																																				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																				if (_ent != null) {
																																					final int _slotid = 3;
																																					final ItemStack _setstack = new ItemStack(BreadcraftModItems.SUB_SANDWICH_LOAF.get());
																																					_setstack.setCount((int) (3 + new Object() {
																																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicInteger _retval = new AtomicInteger(0);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																										capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																							return _retval.get();
																																						}
																																					}.getAmount(world, new BlockPos(x, y, z), 3)));
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																						if (capability instanceof IItemHandlerModifiable) {
																																							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																							_stk.shrink(_amount);
																																							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																						}
																																					});
																																				}
																																			}
																																			if (!world.isClientSide()) {
																																				BlockPos _bp = new BlockPos(x, y, z);
																																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																				BlockState _bs = world.getBlockState(_bp);
																																				if (_blockEntity != null)
																																					_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																				return _retval.get();
																																			}
																																		}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get()
																																				&& new Object() {
																																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicInteger _retval = new AtomicInteger(0);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																						return _retval.get();
																																					}
																																				}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																						return _retval.get();
																																					}
																																				}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get()
																																				&& (new Object() {
																																					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																						return _retval.get();
																																					}
																																				}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.FRENCH_BATARD.get()
																																				&& new Object() {
																																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																						BlockEntity blockEntity = world.getBlockEntity(pos);
																																						if (blockEntity != null)
																																							return blockEntity.getPersistentData().getDouble(tag);
																																						return -1;
																																					}
																																				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																			if (!world.isClientSide()) {
																																				BlockPos _bp = new BlockPos(x, y, z);
																																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																				BlockState _bs = world.getBlockState(_bp);
																																				if (_blockEntity != null)
																																					_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																				if (world instanceof Level _level)
																																					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																			}
																																			if (!world.isClientSide()) {
																																				BlockPos _bp = new BlockPos(x, y, z);
																																				BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																				BlockState _bs = world.getBlockState(_bp);
																																				if (_blockEntity != null)
																																					_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																							BlockEntity blockEntity = world.getBlockEntity(pos);
																																							if (blockEntity != null)
																																								return blockEntity.getPersistentData().getDouble(tag);
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
																																						return blockEntity.getPersistentData().getDouble(tag);
																																					return -1;
																																				}
																																			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicInteger _retval = new AtomicInteger(0);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																					return _retval.get();
																																				}
																																			}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																																				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																					BlockEntity blockEntity = world.getBlockEntity(pos);
																																					if (blockEntity != null)
																																						return blockEntity.getPersistentData().getDouble(tag);
																																					return -1;
																																				}
																																			}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																					BlockEntity _ent = world.getBlockEntity(pos);
																																					if (_ent != null)
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																					return _retval.get();
																																				}
																																			}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.FRENCH_BATARD.get()) {
																																				{
																																					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																					if (_ent != null) {
																																						final int _slotid = 3;
																																						final ItemStack _setstack = new ItemStack(BreadcraftModItems.FRENCH_BATARD.get());
																																						_setstack.setCount((int) (1 + new Object() {
																																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicInteger _retval = new AtomicInteger(0);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																								return _retval.get();
																																							}
																																						}.getAmount(world, new BlockPos(x, y, z), 3)));
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																							if (capability instanceof IItemHandlerModifiable) {
																																								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																								_stk.shrink(_amount);
																																								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																							}
																																						});
																																					}
																																				}
																																				if (!world.isClientSide()) {
																																					BlockPos _bp = new BlockPos(x, y, z);
																																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																					BlockState _bs = world.getBlockState(_bp);
																																					if (_blockEntity != null)
																																						_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																					return _retval.get();
																																				}
																																			}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_BASIC_DOUGH.get()
																																					&& new Object() {
																																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicInteger _retval = new AtomicInteger(0);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																										capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																							return _retval.get();
																																						}
																																					}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																							return _retval.get();
																																						}
																																					}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.SHEET_PAN.get()
																																					&& new Object() {
																																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																							BlockEntity blockEntity = world.getBlockEntity(pos);
																																							if (blockEntity != null)
																																								return blockEntity.getPersistentData().getDouble(tag);
																																							return -1;
																																						}
																																					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																				if (!world.isClientSide()) {
																																					BlockPos _bp = new BlockPos(x, y, z);
																																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																					BlockState _bs = world.getBlockState(_bp);
																																					if (_blockEntity != null)
																																						_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																					if (world instanceof Level _level)
																																						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																				}
																																				if (!world.isClientSide()) {
																																					BlockPos _bp = new BlockPos(x, y, z);
																																					BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																					BlockState _bs = world.getBlockState(_bp);
																																					if (_blockEntity != null)
																																						_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																								BlockEntity blockEntity = world.getBlockEntity(pos);
																																								if (blockEntity != null)
																																									return blockEntity.getPersistentData().getDouble(tag);
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
																																							return blockEntity.getPersistentData().getDouble(tag);
																																						return -1;
																																					}
																																				}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																						AtomicInteger _retval = new AtomicInteger(0);
																																						BlockEntity _ent = world.getBlockEntity(pos);
																																						if (_ent != null)
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																						return _retval.get();
																																					}
																																				}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																						BlockEntity blockEntity = world.getBlockEntity(pos);
																																						if (blockEntity != null)
																																							return blockEntity.getPersistentData().getDouble(tag);
																																						return -1;
																																					}
																																				}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																					{
																																						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																						if (_ent != null) {
																																							final int _slotid = 3;
																																							final ItemStack _setstack = new ItemStack(BreadcraftModItems.FRENCH_BATARD.get());
																																							_setstack.setCount((int) (1 + new Object() {
																																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicInteger _retval = new AtomicInteger(0);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																									return _retval.get();
																																								}
																																							}.getAmount(world, new BlockPos(x, y, z), 3)));
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																								if (capability instanceof IItemHandlerModifiable) {
																																									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																									_stk.shrink(_amount);
																																									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																								}
																																							});
																																						}
																																					}
																																					if (!world.isClientSide()) {
																																						BlockPos _bp = new BlockPos(x, y, z);
																																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																						BlockState _bs = world.getBlockState(_bp);
																																						if (_blockEntity != null)
																																							_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																						return _retval.get();
																																					}
																																				}.getItemStack(world, new BlockPos(x, y, z), 1)).getItem() == BreadcraftModItems.PROOFED_WHOLE_WHEAT_DOUGH
																																						.get() && new Object() {
																																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicInteger _retval = new AtomicInteger(0);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																								return _retval.get();
																																							}
																																						}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																								return _retval.get();
																																							}
																																						}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN.get()
																																						&& (new Object() {
																																							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																								return _retval.get();
																																							}
																																						}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHOLE_WHEAT_BREAD
																																								.get()
																																						&& new Object() {
																																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																								BlockEntity blockEntity = world.getBlockEntity(pos);
																																								if (blockEntity != null)
																																									return blockEntity.getPersistentData().getDouble(tag);
																																								return -1;
																																							}
																																						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																					if (!world.isClientSide()) {
																																						BlockPos _bp = new BlockPos(x, y, z);
																																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																						BlockState _bs = world.getBlockState(_bp);
																																						if (_blockEntity != null)
																																							_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																						if (world instanceof Level _level)
																																							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																					}
																																					if (!world.isClientSide()) {
																																						BlockPos _bp = new BlockPos(x, y, z);
																																						BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																						BlockState _bs = world.getBlockState(_bp);
																																						if (_blockEntity != null)
																																							_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																									BlockEntity blockEntity = world.getBlockEntity(pos);
																																									if (blockEntity != null)
																																										return blockEntity.getPersistentData().getDouble(tag);
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
																																								return blockEntity.getPersistentData().getDouble(tag);
																																							return -1;
																																						}
																																					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicInteger _retval = new AtomicInteger(0);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																										capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																							return _retval.get();
																																						}
																																					}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																																						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																							BlockEntity blockEntity = world.getBlockEntity(pos);
																																							if (blockEntity != null)
																																								return blockEntity.getPersistentData().getDouble(tag);
																																							return -1;
																																						}
																																					}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																							BlockEntity _ent = world.getBlockEntity(pos);
																																							if (_ent != null)
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																							return _retval.get();
																																						}
																																					}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == BreadcraftModItems.WHOLE_WHEAT_BREAD
																																							.get()) {
																																						{
																																							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																							if (_ent != null) {
																																								final int _slotid = 3;
																																								final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHOLE_WHEAT_BREAD.get());
																																								_setstack.setCount((int) (1 + new Object() {
																																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicInteger _retval = new AtomicInteger(0);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> _retval
																																															.set(capability.getStackInSlot(slotid).getCount()));
																																										return _retval.get();
																																									}
																																								}.getAmount(world, new BlockPos(x, y, z), 3)));
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																									if (capability instanceof IItemHandlerModifiable) {
																																										ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																										_stk.shrink(_amount);
																																										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																									}
																																								});
																																							}
																																						}
																																						if (!world.isClientSide()) {
																																							BlockPos _bp = new BlockPos(x, y, z);
																																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																							BlockState _bs = world.getBlockState(_bp);
																																							if (_blockEntity != null)
																																								_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																							return _retval.get();
																																						}
																																					}.getItemStack(world, new BlockPos(x, y, z), 1))
																																							.getItem() == BreadcraftModItems.PROOFED_WHOLE_WHEAT_DOUGH.get() && new Object() {
																																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicInteger _retval = new AtomicInteger(0);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																									return _retval.get();
																																								}
																																							}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																									return _retval.get();
																																								}
																																							}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == BreadcraftModItems.LOAF_PAN
																																									.get()
																																							&& new Object() {
																																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																									BlockEntity blockEntity = world.getBlockEntity(pos);
																																									if (blockEntity != null)
																																										return blockEntity.getPersistentData().getDouble(tag);
																																									return -1;
																																								}
																																							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																						if (!world.isClientSide()) {
																																							BlockPos _bp = new BlockPos(x, y, z);
																																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																							BlockState _bs = world.getBlockState(_bp);
																																							if (_blockEntity != null)
																																								_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																							if (world instanceof Level _level)
																																								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																						}
																																						if (!world.isClientSide()) {
																																							BlockPos _bp = new BlockPos(x, y, z);
																																							BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																							BlockState _bs = world.getBlockState(_bp);
																																							if (_blockEntity != null)
																																								_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																										BlockEntity blockEntity = world.getBlockEntity(pos);
																																										if (blockEntity != null)
																																											return blockEntity.getPersistentData().getDouble(tag);
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
																																									return blockEntity.getPersistentData().getDouble(tag);
																																								return -1;
																																							}
																																						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																								AtomicInteger _retval = new AtomicInteger(0);
																																								BlockEntity _ent = world.getBlockEntity(pos);
																																								if (_ent != null)
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																								return _retval.get();
																																							}
																																						}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																								BlockEntity blockEntity = world.getBlockEntity(pos);
																																								if (blockEntity != null)
																																									return blockEntity.getPersistentData().getDouble(tag);
																																								return -1;
																																							}
																																						}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																							{
																																								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																								if (_ent != null) {
																																									final int _slotid = 3;
																																									final ItemStack _setstack = new ItemStack(BreadcraftModItems.WHOLE_WHEAT_BREAD.get());
																																									_setstack.setCount((int) (1 + new Object() {
																																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicInteger _retval = new AtomicInteger(0);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).getCount()));
																																											return _retval.get();
																																										}
																																									}.getAmount(world, new BlockPos(x, y, z), 3)));
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																										if (capability instanceof IItemHandlerModifiable) {
																																											ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																											_stk.shrink(_amount);
																																											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																										}
																																									});
																																								}
																																							}
																																							if (!world.isClientSide()) {
																																								BlockPos _bp = new BlockPos(x, y, z);
																																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																								BlockState _bs = world.getBlockState(_bp);
																																								if (_blockEntity != null)
																																									_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																											capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																								return _retval.get();
																																							}
																																						}.getItemStack(world, new BlockPos(x, y, z), 1))
																																								.getItem() == BreadcraftModItems.PROOFED_WHOLE_WHEAT_DOUGH.get() && new Object() {
																																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicInteger _retval = new AtomicInteger(0);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> _retval
																																															.set(capability.getStackInSlot(slotid).getCount()));
																																										return _retval.get();
																																									}
																																								}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																													capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																										return _retval.get();
																																									}
																																								}.getItemStack(world, new BlockPos(x, y, z), 4))
																																										.getItem() == BreadcraftModItems.DUTCH_OVEN.get()
																																								&& (new Object() {
																																									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																													capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																										return _retval.get();
																																									}
																																								}.getItemStack(world, new BlockPos(x, y, z), 3))
																																										.getItem() == BreadcraftModItems.WHOLE_WHEAT_BOULE.get()
																																								&& new Object() {
																																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																										BlockEntity blockEntity = world.getBlockEntity(pos);
																																										if (blockEntity != null)
																																											return blockEntity.getPersistentData().getDouble(tag);
																																										return -1;
																																									}
																																								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																							if (!world.isClientSide()) {
																																								BlockPos _bp = new BlockPos(x, y, z);
																																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																								BlockState _bs = world.getBlockState(_bp);
																																								if (_blockEntity != null)
																																									_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																								if (world instanceof Level _level)
																																									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																							}
																																							if (!world.isClientSide()) {
																																								BlockPos _bp = new BlockPos(x, y, z);
																																								BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																								BlockState _bs = world.getBlockState(_bp);
																																								if (_blockEntity != null)
																																									_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																											BlockEntity blockEntity = world.getBlockEntity(pos);
																																											if (blockEntity != null)
																																												return blockEntity.getPersistentData().getDouble(tag);
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
																																										return blockEntity.getPersistentData().getDouble(tag);
																																									return -1;
																																								}
																																							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicInteger _retval = new AtomicInteger(0);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																																									return _retval.get();
																																								}
																																							}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																																								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																									BlockEntity blockEntity = world.getBlockEntity(pos);
																																									if (blockEntity != null)
																																										return blockEntity.getPersistentData().getDouble(tag);
																																									return -1;
																																								}
																																							}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																									BlockEntity _ent = world.getBlockEntity(pos);
																																									if (_ent != null)
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																									return _retval.get();
																																								}
																																							}.getItemStack(world, new BlockPos(x, y, z), 3))
																																									.getItem() == BreadcraftModItems.WHOLE_WHEAT_BOULE.get()) {
																																								{
																																									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																									if (_ent != null) {
																																										final int _slotid = 3;
																																										final ItemStack _setstack = new ItemStack(
																																												BreadcraftModItems.WHOLE_WHEAT_BOULE.get());
																																										_setstack.setCount((int) (1 + new Object() {
																																											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicInteger _retval = new AtomicInteger(0);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).getCount()));
																																												return _retval.get();
																																											}
																																										}.getAmount(world, new BlockPos(x, y, z), 3)));
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
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
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																																											if (capability instanceof IItemHandlerModifiable) {
																																												ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																												_stk.shrink(_amount);
																																												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																																											}
																																										});
																																									}
																																								}
																																								if (!world.isClientSide()) {
																																									BlockPos _bp = new BlockPos(x, y, z);
																																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																									BlockState _bs = world.getBlockState(_bp);
																																									if (_blockEntity != null)
																																										_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																												capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																									return _retval.get();
																																								}
																																							}.getItemStack(world, new BlockPos(x, y, z), 1))
																																									.getItem() == BreadcraftModItems.PROOFED_WHOLE_WHEAT_DOUGH.get() && new Object() {
																																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicInteger _retval = new AtomicInteger(0);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).getCount()));
																																											return _retval.get();
																																										}
																																									}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).copy()));
																																											return _retval.get();
																																										}
																																									}.getItemStack(world, new BlockPos(x, y, z), 4))
																																											.getItem() == BreadcraftModItems.DUTCH_OVEN.get()
																																									&& new Object() {
																																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																											BlockEntity blockEntity = world.getBlockEntity(pos);
																																											if (blockEntity != null)
																																												return blockEntity.getPersistentData().getDouble(tag);
																																											return -1;
																																										}
																																									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																								if (!world.isClientSide()) {
																																									BlockPos _bp = new BlockPos(x, y, z);
																																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																									BlockState _bs = world.getBlockState(_bp);
																																									if (_blockEntity != null)
																																										_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																									if (world instanceof Level _level)
																																										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																								}
																																								if (!world.isClientSide()) {
																																									BlockPos _bp = new BlockPos(x, y, z);
																																									BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																									BlockState _bs = world.getBlockState(_bp);
																																									if (_blockEntity != null)
																																										_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																												BlockEntity blockEntity = world.getBlockEntity(pos);
																																												if (blockEntity != null)
																																													return blockEntity.getPersistentData().getDouble(tag);
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
																																											return blockEntity.getPersistentData().getDouble(tag);
																																										return -1;
																																									}
																																								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																									public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																										AtomicInteger _retval = new AtomicInteger(0);
																																										BlockEntity _ent = world.getBlockEntity(pos);
																																										if (_ent != null)
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> _retval
																																															.set(capability.getStackInSlot(slotid).getCount()));
																																										return _retval.get();
																																									}
																																								}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																										BlockEntity blockEntity = world.getBlockEntity(pos);
																																										if (blockEntity != null)
																																											return blockEntity.getPersistentData().getDouble(tag);
																																										return -1;
																																									}
																																								}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																									{
																																										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																										if (_ent != null) {
																																											final int _slotid = 3;
																																											final ItemStack _setstack = new ItemStack(
																																													BreadcraftModItems.WHOLE_WHEAT_BOULE.get());
																																											_setstack.setCount((int) (1 + new Object() {
																																												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																													AtomicInteger _retval = new AtomicInteger(0);
																																													BlockEntity _ent = world.getBlockEntity(pos);
																																													if (_ent != null)
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> _retval.set(
																																																		capability.getStackInSlot(slotid).getCount()));
																																													return _retval.get();
																																												}
																																											}.getAmount(world, new BlockPos(x, y, z), 3)));
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> {
																																														if (capability instanceof IItemHandlerModifiable)
																																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid,
																																																	_setstack);
																																													});
																																										}
																																									}
																																									{
																																										BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																										if (_ent != null) {
																																											final int _slotid = 1;
																																											final int _amount = 1;
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																													.ifPresent(capability -> {
																																														if (capability instanceof IItemHandlerModifiable) {
																																															ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																																															_stk.shrink(_amount);
																																															((IItemHandlerModifiable) capability).setStackInSlot(_slotid,
																																																	_stk);
																																														}
																																													});
																																										}
																																									}
																																									if (!world.isClientSide()) {
																																										BlockPos _bp = new BlockPos(x, y, z);
																																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																										BlockState _bs = world.getBlockState(_bp);
																																										if (_blockEntity != null)
																																											_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(
																																													capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
																																										return _retval.get();
																																									}
																																								}.getItemStack(world, new BlockPos(x, y, z), 1))
																																										.getItem() == BreadcraftModItems.PROOFED_SOURDOUGH_DOUGH.get() && new Object() {
																																											public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicInteger _retval = new AtomicInteger(0);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).getCount()));
																																												return _retval.get();
																																											}
																																										}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																														ItemStack.EMPTY);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).copy()));
																																												return _retval.get();
																																											}
																																										}.getItemStack(world, new BlockPos(x, y, z), 4))
																																												.getItem() == BreadcraftModItems.LOAF_PAN.get()
																																										&& (new Object() {
																																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																														ItemStack.EMPTY);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).copy()));
																																												return _retval.get();
																																											}
																																										}.getItemStack(world, new BlockPos(x, y, z), 3))
																																												.getItem() == BreadcraftModItems.SOURDOUGH_SANDWICH_BREAD.get()
																																										&& new Object() {
																																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																												BlockEntity blockEntity = world.getBlockEntity(pos);
																																												if (blockEntity != null)
																																													return blockEntity.getPersistentData().getDouble(tag);
																																												return -1;
																																											}
																																										}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																									if (!world.isClientSide()) {
																																										BlockPos _bp = new BlockPos(x, y, z);
																																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																										BlockState _bs = world.getBlockState(_bp);
																																										if (_blockEntity != null)
																																											_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																										if (world instanceof Level _level)
																																											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																									}
																																									if (!world.isClientSide()) {
																																										BlockPos _bp = new BlockPos(x, y, z);
																																										BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																										BlockState _bs = world.getBlockState(_bp);
																																										if (_blockEntity != null)
																																											_blockEntity.getPersistentData().putDouble("craftingProgress", (new Object() {
																																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																													BlockEntity blockEntity = world.getBlockEntity(pos);
																																													if (blockEntity != null)
																																														return blockEntity.getPersistentData().getDouble(tag);
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
																																												return blockEntity.getPersistentData().getDouble(tag);
																																											return -1;
																																										}
																																									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200 && new Object() {
																																										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicInteger _retval = new AtomicInteger(0);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).getCount()));
																																											return _retval.get();
																																										}
																																									}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																																										public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																											BlockEntity blockEntity = world.getBlockEntity(pos);
																																											if (blockEntity != null)
																																												return blockEntity.getPersistentData().getDouble(tag);
																																											return -1;
																																										}
																																									}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1 && (new Object() {
																																										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																																											BlockEntity _ent = world.getBlockEntity(pos);
																																											if (_ent != null)
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).copy()));
																																											return _retval.get();
																																										}
																																									}.getItemStack(world, new BlockPos(x, y, z), 3))
																																											.getItem() == BreadcraftModItems.SOURDOUGH_SANDWICH_BREAD.get()) {
																																										{
																																											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																											if (_ent != null) {
																																												final int _slotid = 3;
																																												final ItemStack _setstack = new ItemStack(
																																														BreadcraftModItems.SOURDOUGH_SANDWICH_BREAD.get());
																																												_setstack.setCount((int) (1 + new Object() {
																																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																														AtomicInteger _retval = new AtomicInteger(0);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(capability
																																																			.getStackInSlot(slotid).getCount()));
																																														return _retval.get();
																																													}
																																												}.getAmount(world, new BlockPos(x, y, z), 3)));
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> {
																																															if (capability instanceof IItemHandlerModifiable)
																																																((IItemHandlerModifiable) capability)
																																																		.setStackInSlot(_slotid, _setstack);
																																														});
																																											}
																																										}
																																										{
																																											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																											if (_ent != null) {
																																												final int _slotid = 1;
																																												final int _amount = 1;
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> {
																																															if (capability instanceof IItemHandlerModifiable) {
																																																ItemStack _stk = capability.getStackInSlot(_slotid)
																																																		.copy();
																																																_stk.shrink(_amount);
																																																((IItemHandlerModifiable) capability)
																																																		.setStackInSlot(_slotid, _stk);
																																															}
																																														});
																																											}
																																										}
																																										if (!world.isClientSide()) {
																																											BlockPos _bp = new BlockPos(x, y, z);
																																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																											BlockState _bs = world.getBlockState(_bp);
																																											if (_blockEntity != null)
																																												_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
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
																																												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																														.ifPresent(capability -> _retval
																																																.set(capability.getStackInSlot(slotid).copy()));
																																											return _retval.get();
																																										}
																																									}.getItemStack(world, new BlockPos(x, y, z), 1))
																																											.getItem() == BreadcraftModItems.PROOFED_SOURDOUGH_DOUGH.get()
																																											&& new Object() {
																																												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																													AtomicInteger _retval = new AtomicInteger(0);
																																													BlockEntity _ent = world.getBlockEntity(pos);
																																													if (_ent != null)
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> _retval.set(
																																																		capability.getStackInSlot(slotid).getCount()));
																																													return _retval.get();
																																												}
																																											}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																														int slotid) {
																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																															ItemStack.EMPTY);
																																													BlockEntity _ent = world.getBlockEntity(pos);
																																													if (_ent != null)
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> _retval
																																																		.set(capability.getStackInSlot(slotid).copy()));
																																													return _retval.get();
																																												}
																																											}.getItemStack(world, new BlockPos(x, y, z), 4))
																																													.getItem() == BreadcraftModItems.LOAF_PAN.get()
																																											&& new Object() {
																																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																													BlockEntity blockEntity = world.getBlockEntity(pos);
																																													if (blockEntity != null)
																																														return blockEntity.getPersistentData().getDouble(tag);
																																													return -1;
																																												}
																																											}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																										if (!world.isClientSide()) {
																																											BlockPos _bp = new BlockPos(x, y, z);
																																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																											BlockState _bs = world.getBlockState(_bp);
																																											if (_blockEntity != null)
																																												_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																											if (world instanceof Level _level)
																																												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																										}
																																										if (!world.isClientSide()) {
																																											BlockPos _bp = new BlockPos(x, y, z);
																																											BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																											BlockState _bs = world.getBlockState(_bp);
																																											if (_blockEntity != null)
																																												_blockEntity.getPersistentData().putDouble("craftingProgress",
																																														(new Object() {
																																															public double getValue(LevelAccessor world, BlockPos pos,
																																																	String tag) {
																																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																																if (blockEntity != null)
																																																	return blockEntity.getPersistentData().getDouble(tag);
																																																return -1;
																																															}
																																														}.getValue(world, new BlockPos(x, y, z), "craftingProgress")
																																																+ 1));
																																											if (world instanceof Level _level)
																																												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																										}
																																										if (new Object() {
																																											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																												BlockEntity blockEntity = world.getBlockEntity(pos);
																																												if (blockEntity != null)
																																													return blockEntity.getPersistentData().getDouble(tag);
																																												return -1;
																																											}
																																										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200
																																												&& new Object() {
																																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																														AtomicInteger _retval = new AtomicInteger(0);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(capability
																																																			.getStackInSlot(slotid).getCount()));
																																														return _retval.get();
																																													}
																																												}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																																													public double getValue(LevelAccessor world, BlockPos pos,
																																															String tag) {
																																														BlockEntity blockEntity = world.getBlockEntity(pos);
																																														if (blockEntity != null)
																																															return blockEntity.getPersistentData().getDouble(tag);
																																														return -1;
																																													}
																																												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																											{
																																												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																												if (_ent != null) {
																																													final int _slotid = 3;
																																													final ItemStack _setstack = new ItemStack(
																																															BreadcraftModItems.SOURDOUGH_SANDWICH_BREAD.get());
																																													_setstack.setCount((int) (1 + new Object() {
																																														public int getAmount(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicInteger _retval = new AtomicInteger(0);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).getCount()));
																																															return _retval.get();
																																														}
																																													}.getAmount(world, new BlockPos(x, y, z), 3)));
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> {
																																																if (capability instanceof IItemHandlerModifiable)
																																																	((IItemHandlerModifiable) capability)
																																																			.setStackInSlot(_slotid, _setstack);
																																															});
																																												}
																																											}
																																											{
																																												BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																												if (_ent != null) {
																																													final int _slotid = 1;
																																													final int _amount = 1;
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> {
																																																if (capability instanceof IItemHandlerModifiable) {
																																																	ItemStack _stk = capability.getStackInSlot(_slotid)
																																																			.copy();
																																																	_stk.shrink(_amount);
																																																	((IItemHandlerModifiable) capability)
																																																			.setStackInSlot(_slotid, _stk);
																																																}
																																															});
																																												}
																																											}
																																											if (!world.isClientSide()) {
																																												BlockPos _bp = new BlockPos(x, y, z);
																																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																												BlockState _bs = world.getBlockState(_bp);
																																												if (_blockEntity != null)
																																													_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
																																												if (world instanceof Level _level)
																																													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																											}
																																										}
																																									} else {
																																										if ((new Object() {
																																											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
																																												AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																														ItemStack.EMPTY);
																																												BlockEntity _ent = world.getBlockEntity(pos);
																																												if (_ent != null)
																																													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																															.ifPresent(capability -> _retval
																																																	.set(capability.getStackInSlot(slotid).copy()));
																																												return _retval.get();
																																											}
																																										}.getItemStack(world, new BlockPos(x, y, z), 1))
																																												.getItem() == BreadcraftModItems.PROOFED_SOURDOUGH_DOUGH.get()
																																												&& new Object() {
																																													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																																														AtomicInteger _retval = new AtomicInteger(0);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(capability
																																																			.getStackInSlot(slotid).getCount()));
																																														return _retval.get();
																																													}
																																												}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && (new Object() {
																																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																															int slotid) {
																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																ItemStack.EMPTY);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(
																																																			capability.getStackInSlot(slotid).copy()));
																																														return _retval.get();
																																													}
																																												}.getItemStack(world, new BlockPos(x, y, z), 4))
																																														.getItem() == BreadcraftModItems.DUTCH_OVEN.get()
																																												&& (new Object() {
																																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																															int slotid) {
																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																ItemStack.EMPTY);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(
																																																			capability.getStackInSlot(slotid).copy()));
																																														return _retval.get();
																																													}
																																												}.getItemStack(world, new BlockPos(x, y, z), 3))
																																														.getItem() == BreadcraftModItems.SOURDOUGH_BOULE.get()
																																												&& new Object() {
																																													public double getValue(LevelAccessor world, BlockPos pos,
																																															String tag) {
																																														BlockEntity blockEntity = world.getBlockEntity(pos);
																																														if (blockEntity != null)
																																															return blockEntity.getPersistentData().getDouble(tag);
																																														return -1;
																																													}
																																												}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																											if (!world.isClientSide()) {
																																												BlockPos _bp = new BlockPos(x, y, z);
																																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																												BlockState _bs = world.getBlockState(_bp);
																																												if (_blockEntity != null)
																																													_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																												if (world instanceof Level _level)
																																													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																											}
																																											if (!world.isClientSide()) {
																																												BlockPos _bp = new BlockPos(x, y, z);
																																												BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																												BlockState _bs = world.getBlockState(_bp);
																																												if (_blockEntity != null)
																																													_blockEntity.getPersistentData().putDouble("craftingProgress",
																																															(new Object() {
																																																public double getValue(LevelAccessor world, BlockPos pos,
																																																		String tag) {
																																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																																	if (blockEntity != null)
																																																		return blockEntity.getPersistentData()
																																																				.getDouble(tag);
																																																	return -1;
																																																}
																																															}.getValue(world, new BlockPos(x, y, z), "craftingProgress")
																																																	+ 1));
																																												if (world instanceof Level _level)
																																													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																											}
																																											if (new Object() {
																																												public double getValue(LevelAccessor world, BlockPos pos, String tag) {
																																													BlockEntity blockEntity = world.getBlockEntity(pos);
																																													if (blockEntity != null)
																																														return blockEntity.getPersistentData().getDouble(tag);
																																													return -1;
																																												}
																																											}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200
																																													&& new Object() {
																																														public int getAmount(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicInteger _retval = new AtomicInteger(0);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).getCount()));
																																															return _retval.get();
																																														}
																																													}.getAmount(world, new BlockPos(x, y, z), 3) <= 63 && new Object() {
																																														public double getValue(LevelAccessor world, BlockPos pos,
																																																String tag) {
																																															BlockEntity blockEntity = world.getBlockEntity(pos);
																																															if (blockEntity != null)
																																																return blockEntity.getPersistentData().getDouble(tag);
																																															return -1;
																																														}
																																													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1
																																													&& (new Object() {
																																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																	ItemStack.EMPTY);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).copy()));
																																															return _retval.get();
																																														}
																																													}.getItemStack(world, new BlockPos(x, y, z), 3))
																																															.getItem() == BreadcraftModItems.SOURDOUGH_BOULE.get()) {
																																												{
																																													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																													if (_ent != null) {
																																														final int _slotid = 3;
																																														final ItemStack _setstack = new ItemStack(
																																																BreadcraftModItems.SOURDOUGH_BOULE.get());
																																														_setstack.setCount((int) (1 + new Object() {
																																															public int getAmount(LevelAccessor world, BlockPos pos,
																																																	int slotid) {
																																																AtomicInteger _retval = new AtomicInteger(0);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.getCount()));
																																																return _retval.get();
																																															}
																																														}.getAmount(world, new BlockPos(x, y, z), 3)));
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> {
																																																	if (capability instanceof IItemHandlerModifiable)
																																																		((IItemHandlerModifiable) capability)
																																																				.setStackInSlot(_slotid, _setstack);
																																																});
																																													}
																																												}
																																												{
																																													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																													if (_ent != null) {
																																														final int _slotid = 1;
																																														final int _amount = 1;
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> {
																																																	if (capability instanceof IItemHandlerModifiable) {
																																																		ItemStack _stk = capability
																																																				.getStackInSlot(_slotid).copy();
																																																		_stk.shrink(_amount);
																																																		((IItemHandlerModifiable) capability)
																																																				.setStackInSlot(_slotid, _stk);
																																																	}
																																																});
																																													}
																																												}
																																												if (!world.isClientSide()) {
																																													BlockPos _bp = new BlockPos(x, y, z);
																																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																													BlockState _bs = world.getBlockState(_bp);
																																													if (_blockEntity != null)
																																														_blockEntity.getPersistentData().putDouble("craftingProgress", 0);
																																													if (world instanceof Level _level)
																																														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																												}
																																											}
																																										} else {
																																											if ((new Object() {
																																												public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																														int slotid) {
																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																															ItemStack.EMPTY);
																																													BlockEntity _ent = world.getBlockEntity(pos);
																																													if (_ent != null)
																																														_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																.ifPresent(capability -> _retval
																																																		.set(capability.getStackInSlot(slotid).copy()));
																																													return _retval.get();
																																												}
																																											}.getItemStack(world, new BlockPos(x, y, z), 1))
																																													.getItem() == BreadcraftModItems.PROOFED_SOURDOUGH_DOUGH.get()
																																													&& new Object() {
																																														public int getAmount(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicInteger _retval = new AtomicInteger(0);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).getCount()));
																																															return _retval.get();
																																														}
																																													}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && (new Object() {
																																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																	ItemStack.EMPTY);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).copy()));
																																															return _retval.get();
																																														}
																																													}.getItemStack(world, new BlockPos(x, y, z), 4))
																																															.getItem() == BreadcraftModItems.DUTCH_OVEN.get()
																																													&& new Object() {
																																														public double getValue(LevelAccessor world, BlockPos pos,
																																																String tag) {
																																															BlockEntity blockEntity = world.getBlockEntity(pos);
																																															if (blockEntity != null)
																																																return blockEntity.getPersistentData().getDouble(tag);
																																															return -1;
																																														}
																																													}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																												if (!world.isClientSide()) {
																																													BlockPos _bp = new BlockPos(x, y, z);
																																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																													BlockState _bs = world.getBlockState(_bp);
																																													if (_blockEntity != null)
																																														_blockEntity.getPersistentData().putDouble("craftingTime", 200);
																																													if (world instanceof Level _level)
																																														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																												}
																																												if (!world.isClientSide()) {
																																													BlockPos _bp = new BlockPos(x, y, z);
																																													BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																													BlockState _bs = world.getBlockState(_bp);
																																													if (_blockEntity != null)
																																														_blockEntity.getPersistentData().putDouble("craftingProgress",
																																																(new Object() {
																																																	public double getValue(LevelAccessor world,
																																																			BlockPos pos, String tag) {
																																																		BlockEntity blockEntity = world
																																																				.getBlockEntity(pos);
																																																		if (blockEntity != null)
																																																			return blockEntity.getPersistentData()
																																																					.getDouble(tag);
																																																		return -1;
																																																	}
																																																}.getValue(world, new BlockPos(x, y, z),
																																																		"craftingProgress") + 1));
																																													if (world instanceof Level _level)
																																														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																												}
																																												if (new Object() {
																																													public double getValue(LevelAccessor world, BlockPos pos,
																																															String tag) {
																																														BlockEntity blockEntity = world.getBlockEntity(pos);
																																														if (blockEntity != null)
																																															return blockEntity.getPersistentData().getDouble(tag);
																																														return -1;
																																													}
																																												}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200
																																														&& new Object() {
																																															public int getAmount(LevelAccessor world, BlockPos pos,
																																																	int slotid) {
																																																AtomicInteger _retval = new AtomicInteger(0);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.getCount()));
																																																return _retval.get();
																																															}
																																														}.getAmount(world, new BlockPos(x, y, z), 3) == 0
																																														&& new Object() {
																																															public double getValue(LevelAccessor world, BlockPos pos,
																																																	String tag) {
																																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																																if (blockEntity != null)
																																																	return blockEntity.getPersistentData().getDouble(tag);
																																																return -1;
																																															}
																																														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																													{
																																														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																														if (_ent != null) {
																																															final int _slotid = 3;
																																															final ItemStack _setstack = new ItemStack(
																																																	BreadcraftModItems.SOURDOUGH_BOULE.get());
																																															_setstack.setCount((int) (1 + new Object() {
																																																public int getAmount(LevelAccessor world, BlockPos pos,
																																																		int slotid) {
																																																	AtomicInteger _retval = new AtomicInteger(0);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.getCount()));
																																																	return _retval.get();
																																																}
																																															}.getAmount(world, new BlockPos(x, y, z), 3)));
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> {
																																																		if (capability instanceof IItemHandlerModifiable)
																																																			((IItemHandlerModifiable) capability)
																																																					.setStackInSlot(_slotid, _setstack);
																																																	});
																																														}
																																													}
																																													{
																																														BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																																														if (_ent != null) {
																																															final int _slotid = 1;
																																															final int _amount = 1;
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> {
																																																		if (capability instanceof IItemHandlerModifiable) {
																																																			ItemStack _stk = capability
																																																					.getStackInSlot(_slotid).copy();
																																																			_stk.shrink(_amount);
																																																			((IItemHandlerModifiable) capability)
																																																					.setStackInSlot(_slotid, _stk);
																																																		}
																																																	});
																																														}
																																													}
																																													if (!world.isClientSide()) {
																																														BlockPos _bp = new BlockPos(x, y, z);
																																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																														BlockState _bs = world.getBlockState(_bp);
																																														if (_blockEntity != null)
																																															_blockEntity.getPersistentData().putDouble("craftingProgress",
																																																	0);
																																														if (world instanceof Level _level)
																																															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																													}
																																												}
																																											} else {
																																												if ((new Object() {
																																													public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																															int slotid) {
																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																ItemStack.EMPTY);
																																														BlockEntity _ent = world.getBlockEntity(pos);
																																														if (_ent != null)
																																															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																	.ifPresent(capability -> _retval.set(
																																																			capability.getStackInSlot(slotid).copy()));
																																														return _retval.get();
																																													}
																																												}.getItemStack(world, new BlockPos(x, y, z), 1))
																																														.getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get()
																																														&& new Object() {
																																															public int getAmount(LevelAccessor world, BlockPos pos,
																																																	int slotid) {
																																																AtomicInteger _retval = new AtomicInteger(0);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.getCount()));
																																																return _retval.get();
																																															}
																																														}.getAmount(world, new BlockPos(x, y, z), 3) <= 63
																																														&& (new Object() {
																																															public ItemStack getItemStack(LevelAccessor world,
																																																	BlockPos pos, int slotid) {
																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																		ItemStack.EMPTY);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.copy()));
																																																return _retval.get();
																																															}
																																														}.getItemStack(world, new BlockPos(x, y, z), 4))
																																																.getItem() == BreadcraftModItems.SQUARE_PAN.get()
																																														&& (new Object() {
																																															public ItemStack getItemStack(LevelAccessor world,
																																																	BlockPos pos, int slotid) {
																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																		ItemStack.EMPTY);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.copy()));
																																																return _retval.get();
																																															}
																																														}.getItemStack(world, new BlockPos(x, y, z), 3))
																																																.getItem() == BreadcraftModItems.FOCACCIA.get()
																																														&& new Object() {
																																															public double getValue(LevelAccessor world, BlockPos pos,
																																																	String tag) {
																																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																																if (blockEntity != null)
																																																	return blockEntity.getPersistentData().getDouble(tag);
																																																return -1;
																																															}
																																														}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																													if (!world.isClientSide()) {
																																														BlockPos _bp = new BlockPos(x, y, z);
																																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																														BlockState _bs = world.getBlockState(_bp);
																																														if (_blockEntity != null)
																																															_blockEntity.getPersistentData().putDouble("craftingTime",
																																																	200);
																																														if (world instanceof Level _level)
																																															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																													}
																																													if (!world.isClientSide()) {
																																														BlockPos _bp = new BlockPos(x, y, z);
																																														BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																														BlockState _bs = world.getBlockState(_bp);
																																														if (_blockEntity != null)
																																															_blockEntity.getPersistentData().putDouble("craftingProgress",
																																																	(new Object() {
																																																		public double getValue(LevelAccessor world,
																																																				BlockPos pos, String tag) {
																																																			BlockEntity blockEntity = world
																																																					.getBlockEntity(pos);
																																																			if (blockEntity != null)
																																																				return blockEntity.getPersistentData()
																																																						.getDouble(tag);
																																																			return -1;
																																																		}
																																																	}.getValue(world, new BlockPos(x, y, z),
																																																			"craftingProgress") + 1));
																																														if (world instanceof Level _level)
																																															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																													}
																																													if (new Object() {
																																														public double getValue(LevelAccessor world, BlockPos pos,
																																																String tag) {
																																															BlockEntity blockEntity = world.getBlockEntity(pos);
																																															if (blockEntity != null)
																																																return blockEntity.getPersistentData().getDouble(tag);
																																															return -1;
																																														}
																																													}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 200
																																															&& new Object() {
																																																public int getAmount(LevelAccessor world, BlockPos pos,
																																																		int slotid) {
																																																	AtomicInteger _retval = new AtomicInteger(0);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.getCount()));
																																																	return _retval.get();
																																																}
																																															}.getAmount(world, new BlockPos(x, y, z), 3) <= 63
																																															&& new Object() {
																																																public double getValue(LevelAccessor world, BlockPos pos,
																																																		String tag) {
																																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																																	if (blockEntity != null)
																																																		return blockEntity.getPersistentData()
																																																				.getDouble(tag);
																																																	return -1;
																																																}
																																															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1
																																															&& (new Object() {
																																																public ItemStack getItemStack(LevelAccessor world,
																																																		BlockPos pos, int slotid) {
																																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																			ItemStack.EMPTY);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.copy()));
																																																	return _retval.get();
																																																}
																																															}.getItemStack(world, new BlockPos(x, y, z), 3))
																																																	.getItem() == BreadcraftModItems.FOCACCIA.get()) {
																																														{
																																															BlockEntity _ent = world
																																																	.getBlockEntity(new BlockPos(x, y, z));
																																															if (_ent != null) {
																																																final int _slotid = 3;
																																																final ItemStack _setstack = new ItemStack(
																																																		BreadcraftModItems.FOCACCIA.get());
																																																_setstack.setCount((int) (1 + new Object() {
																																																	public int getAmount(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicInteger _retval = new AtomicInteger(0);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.getCount()));
																																																		return _retval.get();
																																																	}
																																																}.getAmount(world, new BlockPos(x, y, z), 3)));
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> {
																																																			if (capability instanceof IItemHandlerModifiable)
																																																				((IItemHandlerModifiable) capability)
																																																						.setStackInSlot(_slotid,
																																																								_setstack);
																																																		});
																																															}
																																														}
																																														{
																																															BlockEntity _ent = world
																																																	.getBlockEntity(new BlockPos(x, y, z));
																																															if (_ent != null) {
																																																final int _slotid = 1;
																																																final int _amount = 1;
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> {
																																																			if (capability instanceof IItemHandlerModifiable) {
																																																				ItemStack _stk = capability
																																																						.getStackInSlot(_slotid).copy();
																																																				_stk.shrink(_amount);
																																																				((IItemHandlerModifiable) capability)
																																																						.setStackInSlot(_slotid, _stk);
																																																			}
																																																		});
																																															}
																																														}
																																														if (!world.isClientSide()) {
																																															BlockPos _bp = new BlockPos(x, y, z);
																																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																															BlockState _bs = world.getBlockState(_bp);
																																															if (_blockEntity != null)
																																																_blockEntity.getPersistentData()
																																																		.putDouble("craftingProgress", 0);
																																															if (world instanceof Level _level)
																																																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																														}
																																													}
																																												} else {
																																													if ((new Object() {
																																														public ItemStack getItemStack(LevelAccessor world, BlockPos pos,
																																																int slotid) {
																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																	ItemStack.EMPTY);
																																															BlockEntity _ent = world.getBlockEntity(pos);
																																															if (_ent != null)
																																																_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
																																																		.ifPresent(capability -> _retval.set(capability
																																																				.getStackInSlot(slotid).copy()));
																																															return _retval.get();
																																														}
																																													}.getItemStack(world, new BlockPos(x, y, z), 1))
																																															.getItem() == BreadcraftModItems.PROOFED_HERB_DOUGH.get()
																																															&& new Object() {
																																																public int getAmount(LevelAccessor world, BlockPos pos,
																																																		int slotid) {
																																																	AtomicInteger _retval = new AtomicInteger(0);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.getCount()));
																																																	return _retval.get();
																																																}
																																															}.getAmount(world, new BlockPos(x, y, z), 3) == 0
																																															&& (new Object() {
																																																public ItemStack getItemStack(LevelAccessor world,
																																																		BlockPos pos, int slotid) {
																																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																			ItemStack.EMPTY);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.copy()));
																																																	return _retval.get();
																																																}
																																															}.getItemStack(world, new BlockPos(x, y, z), 4))
																																																	.getItem() == BreadcraftModItems.SQUARE_PAN.get()
																																															&& new Object() {
																																																public double getValue(LevelAccessor world, BlockPos pos,
																																																		String tag) {
																																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																																	if (blockEntity != null)
																																																		return blockEntity.getPersistentData()
																																																				.getDouble(tag);
																																																	return -1;
																																																}
																																															}.getValue(world, new BlockPos(x, y, z), "fuelBar") >= 1) {
																																														if (!world.isClientSide()) {
																																															BlockPos _bp = new BlockPos(x, y, z);
																																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																															BlockState _bs = world.getBlockState(_bp);
																																															if (_blockEntity != null)
																																																_blockEntity.getPersistentData().putDouble("craftingTime",
																																																		200);
																																															if (world instanceof Level _level)
																																																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																														}
																																														if (!world.isClientSide()) {
																																															BlockPos _bp = new BlockPos(x, y, z);
																																															BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																															BlockState _bs = world.getBlockState(_bp);
																																															if (_blockEntity != null)
																																																_blockEntity.getPersistentData()
																																																		.putDouble("craftingProgress", (new Object() {
																																																			public double getValue(LevelAccessor world,
																																																					BlockPos pos, String tag) {
																																																				BlockEntity blockEntity = world
																																																						.getBlockEntity(pos);
																																																				if (blockEntity != null)
																																																					return blockEntity.getPersistentData()
																																																							.getDouble(tag);
																																																				return -1;
																																																			}
																																																		}.getValue(world, new BlockPos(x, y, z),
																																																				"craftingProgress") + 1));
																																															if (world instanceof Level _level)
																																																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																														}
																																														if (new Object() {
																																															public double getValue(LevelAccessor world, BlockPos pos,
																																																	String tag) {
																																																BlockEntity blockEntity = world.getBlockEntity(pos);
																																																if (blockEntity != null)
																																																	return blockEntity.getPersistentData().getDouble(tag);
																																																return -1;
																																															}
																																														}.getValue(world, new BlockPos(x, y, z),
																																																"craftingProgress") >= 200 && new Object() {
																																																	public int getAmount(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicInteger _retval = new AtomicInteger(0);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.getCount()));
																																																		return _retval.get();
																																																	}
																																																}.getAmount(world, new BlockPos(x, y, z), 3) == 0
																																																&& new Object() {
																																																	public double getValue(LevelAccessor world,
																																																			BlockPos pos, String tag) {
																																																		BlockEntity blockEntity = world
																																																				.getBlockEntity(pos);
																																																		if (blockEntity != null)
																																																			return blockEntity.getPersistentData()
																																																					.getDouble(tag);
																																																		return -1;
																																																	}
																																																}.getValue(world, new BlockPos(x, y, z),
																																																		"fuelBar") >= 1) {
																																															{
																																																BlockEntity _ent = world
																																																		.getBlockEntity(new BlockPos(x, y, z));
																																																if (_ent != null) {
																																																	final int _slotid = 3;
																																																	final ItemStack _setstack = new ItemStack(
																																																			BreadcraftModItems.FOCACCIA.get());
																																																	_setstack.setCount((int) (1 + new Object() {
																																																		public int getAmount(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicInteger _retval = new AtomicInteger(0);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.getCount()));
																																																			return _retval.get();
																																																		}
																																																	}.getAmount(world, new BlockPos(x, y, z), 3)));
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null).ifPresent(capability -> {
																																																				if (capability instanceof IItemHandlerModifiable)
																																																					((IItemHandlerModifiable) capability)
																																																							.setStackInSlot(_slotid,
																																																									_setstack);
																																																			});
																																																}
																																															}
																																															{
																																																BlockEntity _ent = world
																																																		.getBlockEntity(new BlockPos(x, y, z));
																																																if (_ent != null) {
																																																	final int _slotid = 1;
																																																	final int _amount = 1;
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null).ifPresent(capability -> {
																																																				if (capability instanceof IItemHandlerModifiable) {
																																																					ItemStack _stk = capability
																																																							.getStackInSlot(_slotid)
																																																							.copy();
																																																					_stk.shrink(_amount);
																																																					((IItemHandlerModifiable) capability)
																																																							.setStackInSlot(_slotid,
																																																									_stk);
																																																				}
																																																			});
																																																}
																																															}
																																															if (!world.isClientSide()) {
																																																BlockPos _bp = new BlockPos(x, y, z);
																																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																BlockState _bs = world.getBlockState(_bp);
																																																if (_blockEntity != null)
																																																	_blockEntity.getPersistentData()
																																																			.putDouble("craftingProgress", 0);
																																																if (world instanceof Level _level)
																																																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																															}
																																														}
																																													} else {
																																														if ((new Object() {
																																															public ItemStack getItemStack(LevelAccessor world,
																																																	BlockPos pos, int slotid) {
																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																		ItemStack.EMPTY);
																																																BlockEntity _ent = world.getBlockEntity(pos);
																																																if (_ent != null)
																																																	_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																			null)
																																																			.ifPresent(capability -> _retval
																																																					.set(capability.getStackInSlot(slotid)
																																																							.copy()));
																																																return _retval.get();
																																															}
																																														}.getItemStack(world, new BlockPos(x, y, z), 1))
																																																.getItem() == BreadcraftModItems.BANANA_BREAD_BATTER.get()
																																																&& new Object() {
																																																	public int getAmount(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicInteger _retval = new AtomicInteger(0);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.getCount()));
																																																		return _retval.get();
																																																	}
																																																}.getAmount(world, new BlockPos(x, y, z), 3) <= 63
																																																&& (new Object() {
																																																	public ItemStack getItemStack(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																				ItemStack.EMPTY);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.copy()));
																																																		return _retval.get();
																																																	}
																																																}.getItemStack(world, new BlockPos(x, y, z), 4))
																																																		.getItem() == BreadcraftModItems.LOAF_PAN.get()
																																																&& (new Object() {
																																																	public ItemStack getItemStack(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																				ItemStack.EMPTY);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.copy()));
																																																		return _retval.get();
																																																	}
																																																}.getItemStack(world, new BlockPos(x, y, z), 3))
																																																		.getItem() == BreadcraftModItems.BANANA_BREAD
																																																				.get()
																																																&& new Object() {
																																																	public double getValue(LevelAccessor world,
																																																			BlockPos pos, String tag) {
																																																		BlockEntity blockEntity = world
																																																				.getBlockEntity(pos);
																																																		if (blockEntity != null)
																																																			return blockEntity.getPersistentData()
																																																					.getDouble(tag);
																																																		return -1;
																																																	}
																																																}.getValue(world, new BlockPos(x, y, z),
																																																		"fuelBar") >= 1) {
																																															if (!world.isClientSide()) {
																																																BlockPos _bp = new BlockPos(x, y, z);
																																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																BlockState _bs = world.getBlockState(_bp);
																																																if (_blockEntity != null)
																																																	_blockEntity.getPersistentData()
																																																			.putDouble("craftingTime", 200);
																																																if (world instanceof Level _level)
																																																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																															}
																																															if (!world.isClientSide()) {
																																																BlockPos _bp = new BlockPos(x, y, z);
																																																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																BlockState _bs = world.getBlockState(_bp);
																																																if (_blockEntity != null)
																																																	_blockEntity.getPersistentData()
																																																			.putDouble("craftingProgress", (new Object() {
																																																				public double getValue(
																																																						LevelAccessor world, BlockPos pos,
																																																						String tag) {
																																																					BlockEntity blockEntity = world
																																																							.getBlockEntity(pos);
																																																					if (blockEntity != null)
																																																						return blockEntity
																																																								.getPersistentData()
																																																								.getDouble(tag);
																																																					return -1;
																																																				}
																																																			}.getValue(world, new BlockPos(x, y, z),
																																																					"craftingProgress") + 1));
																																																if (world instanceof Level _level)
																																																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																															}
																																															if (new Object() {
																																																public double getValue(LevelAccessor world, BlockPos pos,
																																																		String tag) {
																																																	BlockEntity blockEntity = world.getBlockEntity(pos);
																																																	if (blockEntity != null)
																																																		return blockEntity.getPersistentData()
																																																				.getDouble(tag);
																																																	return -1;
																																																}
																																															}.getValue(world, new BlockPos(x, y, z),
																																																	"craftingProgress") >= 200 && new Object() {
																																																		public int getAmount(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicInteger _retval = new AtomicInteger(0);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.getCount()));
																																																			return _retval.get();
																																																		}
																																																	}.getAmount(world, new BlockPos(x, y, z), 3) <= 63
																																																	&& new Object() {
																																																		public double getValue(LevelAccessor world,
																																																				BlockPos pos, String tag) {
																																																			BlockEntity blockEntity = world
																																																					.getBlockEntity(pos);
																																																			if (blockEntity != null)
																																																				return blockEntity.getPersistentData()
																																																						.getDouble(tag);
																																																			return -1;
																																																		}
																																																	}.getValue(world, new BlockPos(x, y, z),
																																																			"fuelBar") >= 1
																																																	&& (new Object() {
																																																		public ItemStack getItemStack(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																					ItemStack.EMPTY);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.copy()));
																																																			return _retval.get();
																																																		}
																																																	}.getItemStack(world, new BlockPos(x, y, z), 3))
																																																			.getItem() == BreadcraftModItems.BANANA_BREAD
																																																					.get()) {
																																																{
																																																	BlockEntity _ent = world
																																																			.getBlockEntity(new BlockPos(x, y, z));
																																																	if (_ent != null) {
																																																		final int _slotid = 3;
																																																		final ItemStack _setstack = new ItemStack(
																																																				BreadcraftModItems.BANANA_BREAD.get());
																																																		_setstack.setCount((int) (1 + new Object() {
																																																			public int getAmount(LevelAccessor world,
																																																					BlockPos pos, int slotid) {
																																																				AtomicInteger _retval = new AtomicInteger(
																																																						0);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.getCount()));
																																																				return _retval.get();
																																																			}
																																																		}.getAmount(world, new BlockPos(x, y, z), 3)));
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null).ifPresent(capability -> {
																																																					if (capability instanceof IItemHandlerModifiable)
																																																						((IItemHandlerModifiable) capability)
																																																								.setStackInSlot(_slotid,
																																																										_setstack);
																																																				});
																																																	}
																																																}
																																																{
																																																	BlockEntity _ent = world
																																																			.getBlockEntity(new BlockPos(x, y, z));
																																																	if (_ent != null) {
																																																		final int _slotid = 1;
																																																		final int _amount = 1;
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null).ifPresent(capability -> {
																																																					if (capability instanceof IItemHandlerModifiable) {
																																																						ItemStack _stk = capability
																																																								.getStackInSlot(_slotid)
																																																								.copy();
																																																						_stk.shrink(_amount);
																																																						((IItemHandlerModifiable) capability)
																																																								.setStackInSlot(_slotid,
																																																										_stk);
																																																					}
																																																				});
																																																	}
																																																}
																																																if (!world.isClientSide()) {
																																																	BlockPos _bp = new BlockPos(x, y, z);
																																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																	BlockState _bs = world.getBlockState(_bp);
																																																	if (_blockEntity != null)
																																																		_blockEntity.getPersistentData()
																																																				.putDouble("craftingProgress", 0);
																																																	if (world instanceof Level _level)
																																																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																}
																																															}
																																														} else {
																																															if ((new Object() {
																																																public ItemStack getItemStack(LevelAccessor world,
																																																		BlockPos pos, int slotid) {
																																																	AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																			ItemStack.EMPTY);
																																																	BlockEntity _ent = world.getBlockEntity(pos);
																																																	if (_ent != null)
																																																		_ent.getCapability(ForgeCapabilities.ITEM_HANDLER,
																																																				null)
																																																				.ifPresent(capability -> _retval.set(
																																																						capability.getStackInSlot(slotid)
																																																								.copy()));
																																																	return _retval.get();
																																																}
																																															}.getItemStack(world, new BlockPos(x, y, z), 1))
																																																	.getItem() == BreadcraftModItems.BANANA_BREAD_BATTER
																																																			.get()
																																																	&& new Object() {
																																																		public int getAmount(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicInteger _retval = new AtomicInteger(0);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.getCount()));
																																																			return _retval.get();
																																																		}
																																																	}.getAmount(world, new BlockPos(x, y, z), 3) == 0
																																																	&& (new Object() {
																																																		public ItemStack getItemStack(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																					ItemStack.EMPTY);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.copy()));
																																																			return _retval.get();
																																																		}
																																																	}.getItemStack(world, new BlockPos(x, y, z), 4))
																																																			.getItem() == BreadcraftModItems.LOAF_PAN
																																																					.get()
																																																	&& new Object() {
																																																		public double getValue(LevelAccessor world,
																																																				BlockPos pos, String tag) {
																																																			BlockEntity blockEntity = world
																																																					.getBlockEntity(pos);
																																																			if (blockEntity != null)
																																																				return blockEntity.getPersistentData()
																																																						.getDouble(tag);
																																																			return -1;
																																																		}
																																																	}.getValue(world, new BlockPos(x, y, z),
																																																			"fuelBar") >= 1) {
																																																if (!world.isClientSide()) {
																																																	BlockPos _bp = new BlockPos(x, y, z);
																																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																	BlockState _bs = world.getBlockState(_bp);
																																																	if (_blockEntity != null)
																																																		_blockEntity.getPersistentData()
																																																				.putDouble("craftingTime", 200);
																																																	if (world instanceof Level _level)
																																																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																}
																																																if (!world.isClientSide()) {
																																																	BlockPos _bp = new BlockPos(x, y, z);
																																																	BlockEntity _blockEntity = world.getBlockEntity(_bp);
																																																	BlockState _bs = world.getBlockState(_bp);
																																																	if (_blockEntity != null)
																																																		_blockEntity.getPersistentData().putDouble(
																																																				"craftingProgress", (new Object() {
																																																					public double getValue(
																																																							LevelAccessor world,
																																																							BlockPos pos, String tag) {
																																																						BlockEntity blockEntity = world
																																																								.getBlockEntity(pos);
																																																						if (blockEntity != null)
																																																							return blockEntity
																																																									.getPersistentData()
																																																									.getDouble(tag);
																																																						return -1;
																																																					}
																																																				}.getValue(world, new BlockPos(x, y, z),
																																																						"craftingProgress") + 1));
																																																	if (world instanceof Level _level)
																																																		_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																}
																																																if (new Object() {
																																																	public double getValue(LevelAccessor world,
																																																			BlockPos pos, String tag) {
																																																		BlockEntity blockEntity = world
																																																				.getBlockEntity(pos);
																																																		if (blockEntity != null)
																																																			return blockEntity.getPersistentData()
																																																					.getDouble(tag);
																																																		return -1;
																																																	}
																																																}.getValue(world, new BlockPos(x, y, z),
																																																		"craftingProgress") >= 200 && new Object() {
																																																			public int getAmount(LevelAccessor world,
																																																					BlockPos pos, int slotid) {
																																																				AtomicInteger _retval = new AtomicInteger(
																																																						0);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.getCount()));
																																																				return _retval.get();
																																																			}
																																																		}.getAmount(world, new BlockPos(x, y, z), 3) == 0
																																																		&& new Object() {
																																																			public double getValue(LevelAccessor world,
																																																					BlockPos pos, String tag) {
																																																				BlockEntity blockEntity = world
																																																						.getBlockEntity(pos);
																																																				if (blockEntity != null)
																																																					return blockEntity.getPersistentData()
																																																							.getDouble(tag);
																																																				return -1;
																																																			}
																																																		}.getValue(world, new BlockPos(x, y, z),
																																																				"fuelBar") >= 1) {
																																																	{
																																																		BlockEntity _ent = world
																																																				.getBlockEntity(new BlockPos(x, y, z));
																																																		if (_ent != null) {
																																																			final int _slotid = 3;
																																																			final ItemStack _setstack = new ItemStack(
																																																					BreadcraftModItems.BANANA_BREAD
																																																							.get());
																																																			_setstack.setCount((int) (1 + new Object() {
																																																				public int getAmount(LevelAccessor world,
																																																						BlockPos pos, int slotid) {
																																																					AtomicInteger _retval = new AtomicInteger(
																																																							0);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.getCount()));
																																																					return _retval.get();
																																																				}
																																																			}.getAmount(world, new BlockPos(x, y, z),
																																																					3)));
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> {
																																																						if (capability instanceof IItemHandlerModifiable)
																																																							((IItemHandlerModifiable) capability)
																																																									.setStackInSlot(
																																																											_slotid,
																																																											_setstack);
																																																					});
																																																		}
																																																	}
																																																	{
																																																		BlockEntity _ent = world
																																																				.getBlockEntity(new BlockPos(x, y, z));
																																																		if (_ent != null) {
																																																			final int _slotid = 1;
																																																			final int _amount = 1;
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> {
																																																						if (capability instanceof IItemHandlerModifiable) {
																																																							ItemStack _stk = capability
																																																									.getStackInSlot(
																																																											_slotid)
																																																									.copy();
																																																							_stk.shrink(_amount);
																																																							((IItemHandlerModifiable) capability)
																																																									.setStackInSlot(
																																																											_slotid,
																																																											_stk);
																																																						}
																																																					});
																																																		}
																																																	}
																																																	if (!world.isClientSide()) {
																																																		BlockPos _bp = new BlockPos(x, y, z);
																																																		BlockEntity _blockEntity = world
																																																				.getBlockEntity(_bp);
																																																		BlockState _bs = world.getBlockState(_bp);
																																																		if (_blockEntity != null)
																																																			_blockEntity.getPersistentData()
																																																					.putDouble("craftingProgress", 0);
																																																		if (world instanceof Level _level)
																																																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																	}
																																																}
																																															} else {
																																																if ((new Object() {
																																																	public ItemStack getItemStack(LevelAccessor world,
																																																			BlockPos pos, int slotid) {
																																																		AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																				ItemStack.EMPTY);
																																																		BlockEntity _ent = world.getBlockEntity(pos);
																																																		if (_ent != null)
																																																			_ent.getCapability(
																																																					ForgeCapabilities.ITEM_HANDLER, null)
																																																					.ifPresent(capability -> _retval
																																																							.set(capability
																																																									.getStackInSlot(
																																																											slotid)
																																																									.copy()));
																																																		return _retval.get();
																																																	}
																																																}.getItemStack(world, new BlockPos(x, y, z), 1))
																																																		.getItem() == BreadcraftModItems.ENRICHED_DOUGH_WITH_FILLING
																																																				.get()
																																																		&& new Object() {
																																																			public int getAmount(LevelAccessor world,
																																																					BlockPos pos, int slotid) {
																																																				AtomicInteger _retval = new AtomicInteger(
																																																						0);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.getCount()));
																																																				return _retval.get();
																																																			}
																																																		}.getAmount(world, new BlockPos(x, y, z), 3) <= 60
																																																		&& (new Object() {
																																																			public ItemStack getItemStack(
																																																					LevelAccessor world, BlockPos pos,
																																																					int slotid) {
																																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																						ItemStack.EMPTY);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.copy()));
																																																				return _retval.get();
																																																			}
																																																		}.getItemStack(world, new BlockPos(x, y, z), 4))
																																																				.getItem() == BreadcraftModItems.SHEET_PAN
																																																						.get()
																																																		&& (new Object() {
																																																			public ItemStack getItemStack(
																																																					LevelAccessor world, BlockPos pos,
																																																					int slotid) {
																																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																						ItemStack.EMPTY);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.copy()));
																																																				return _retval.get();
																																																			}
																																																		}.getItemStack(world, new BlockPos(x, y, z), 3))
																																																				.getItem() == BreadcraftModItems.STICKY_BUN
																																																						.get()
																																																		&& new Object() {
																																																			public double getValue(LevelAccessor world,
																																																					BlockPos pos, String tag) {
																																																				BlockEntity blockEntity = world
																																																						.getBlockEntity(pos);
																																																				if (blockEntity != null)
																																																					return blockEntity.getPersistentData()
																																																							.getDouble(tag);
																																																				return -1;
																																																			}
																																																		}.getValue(world, new BlockPos(x, y, z),
																																																				"fuelBar") >= 1) {
																																																	if (!world.isClientSide()) {
																																																		BlockPos _bp = new BlockPos(x, y, z);
																																																		BlockEntity _blockEntity = world
																																																				.getBlockEntity(_bp);
																																																		BlockState _bs = world.getBlockState(_bp);
																																																		if (_blockEntity != null)
																																																			_blockEntity.getPersistentData()
																																																					.putDouble("craftingTime", 200);
																																																		if (world instanceof Level _level)
																																																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																	}
																																																	if (!world.isClientSide()) {
																																																		BlockPos _bp = new BlockPos(x, y, z);
																																																		BlockEntity _blockEntity = world
																																																				.getBlockEntity(_bp);
																																																		BlockState _bs = world.getBlockState(_bp);
																																																		if (_blockEntity != null)
																																																			_blockEntity.getPersistentData().putDouble(
																																																					"craftingProgress", (new Object() {
																																																						public double getValue(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								String tag) {
																																																							BlockEntity blockEntity = world
																																																									.getBlockEntity(pos);
																																																							if (blockEntity != null)
																																																								return blockEntity
																																																										.getPersistentData()
																																																										.getDouble(tag);
																																																							return -1;
																																																						}
																																																					}.getValue(world,
																																																							new BlockPos(x, y, z),
																																																							"craftingProgress") + 1));
																																																		if (world instanceof Level _level)
																																																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																	}
																																																	if (new Object() {
																																																		public double getValue(LevelAccessor world,
																																																				BlockPos pos, String tag) {
																																																			BlockEntity blockEntity = world
																																																					.getBlockEntity(pos);
																																																			if (blockEntity != null)
																																																				return blockEntity.getPersistentData()
																																																						.getDouble(tag);
																																																			return -1;
																																																		}
																																																	}.getValue(world, new BlockPos(x, y, z),
																																																			"craftingProgress") >= 200 && new Object() {
																																																				public int getAmount(LevelAccessor world,
																																																						BlockPos pos, int slotid) {
																																																					AtomicInteger _retval = new AtomicInteger(
																																																							0);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.getCount()));
																																																					return _retval.get();
																																																				}
																																																			}.getAmount(world, new BlockPos(x, y, z),
																																																					3) <= 60
																																																			&& new Object() {
																																																				public double getValue(
																																																						LevelAccessor world, BlockPos pos,
																																																						String tag) {
																																																					BlockEntity blockEntity = world
																																																							.getBlockEntity(pos);
																																																					if (blockEntity != null)
																																																						return blockEntity
																																																								.getPersistentData()
																																																								.getDouble(tag);
																																																					return -1;
																																																				}
																																																			}.getValue(world, new BlockPos(x, y, z),
																																																					"fuelBar") >= 1
																																																			&& (new Object() {
																																																				public ItemStack getItemStack(
																																																						LevelAccessor world, BlockPos pos,
																																																						int slotid) {
																																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																							ItemStack.EMPTY);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.copy()));
																																																					return _retval.get();
																																																				}
																																																			}.getItemStack(world, new BlockPos(x, y, z),
																																																					3))
																																																					.getItem() == BreadcraftModItems.STICKY_BUN
																																																							.get()) {
																																																		{
																																																			BlockEntity _ent = world.getBlockEntity(
																																																					new BlockPos(x, y, z));
																																																			if (_ent != null) {
																																																				final int _slotid = 3;
																																																				final ItemStack _setstack = new ItemStack(
																																																						BreadcraftModItems.STICKY_BUN
																																																								.get());
																																																				_setstack.setCount(
																																																						(int) (4 + new Object() {
																																																							public int getAmount(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicInteger _retval = new AtomicInteger(
																																																										0);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.getCount()));
																																																								return _retval.get();
																																																							}
																																																						}.getAmount(world,
																																																								new BlockPos(x, y, z),
																																																								3)));
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null).ifPresent(capability -> {
																																																							if (capability instanceof IItemHandlerModifiable)
																																																								((IItemHandlerModifiable) capability)
																																																										.setStackInSlot(
																																																												_slotid,
																																																												_setstack);
																																																						});
																																																			}
																																																		}
																																																		{
																																																			BlockEntity _ent = world.getBlockEntity(
																																																					new BlockPos(x, y, z));
																																																			if (_ent != null) {
																																																				final int _slotid = 1;
																																																				final int _amount = 1;
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null).ifPresent(capability -> {
																																																							if (capability instanceof IItemHandlerModifiable) {
																																																								ItemStack _stk = capability
																																																										.getStackInSlot(
																																																												_slotid)
																																																										.copy();
																																																								_stk.shrink(_amount);
																																																								((IItemHandlerModifiable) capability)
																																																										.setStackInSlot(
																																																												_slotid,
																																																												_stk);
																																																							}
																																																						});
																																																			}
																																																		}
																																																		if (!world.isClientSide()) {
																																																			BlockPos _bp = new BlockPos(x, y, z);
																																																			BlockEntity _blockEntity = world
																																																					.getBlockEntity(_bp);
																																																			BlockState _bs = world.getBlockState(_bp);
																																																			if (_blockEntity != null)
																																																				_blockEntity.getPersistentData()
																																																						.putDouble("craftingProgress", 0);
																																																			if (world instanceof Level _level)
																																																				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																		}
																																																	}
																																																} else {
																																																	if ((new Object() {
																																																		public ItemStack getItemStack(LevelAccessor world,
																																																				BlockPos pos, int slotid) {
																																																			AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																					ItemStack.EMPTY);
																																																			BlockEntity _ent = world.getBlockEntity(pos);
																																																			if (_ent != null)
																																																				_ent.getCapability(
																																																						ForgeCapabilities.ITEM_HANDLER,
																																																						null)
																																																						.ifPresent(capability -> _retval
																																																								.set(capability
																																																										.getStackInSlot(
																																																												slotid)
																																																										.copy()));
																																																			return _retval.get();
																																																		}
																																																	}.getItemStack(world, new BlockPos(x, y, z), 1))
																																																			.getItem() == BreadcraftModItems.ENRICHED_DOUGH_WITH_FILLING
																																																					.get()
																																																			&& new Object() {
																																																				public int getAmount(LevelAccessor world,
																																																						BlockPos pos, int slotid) {
																																																					AtomicInteger _retval = new AtomicInteger(
																																																							0);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.getCount()));
																																																					return _retval.get();
																																																				}
																																																			}.getAmount(world, new BlockPos(x, y, z),
																																																					3) == 0
																																																			&& (new Object() {
																																																				public ItemStack getItemStack(
																																																						LevelAccessor world, BlockPos pos,
																																																						int slotid) {
																																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																							ItemStack.EMPTY);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.copy()));
																																																					return _retval.get();
																																																				}
																																																			}.getItemStack(world, new BlockPos(x, y, z),
																																																					4))
																																																					.getItem() == BreadcraftModItems.SHEET_PAN
																																																							.get()
																																																			&& new Object() {
																																																				public double getValue(
																																																						LevelAccessor world, BlockPos pos,
																																																						String tag) {
																																																					BlockEntity blockEntity = world
																																																							.getBlockEntity(pos);
																																																					if (blockEntity != null)
																																																						return blockEntity
																																																								.getPersistentData()
																																																								.getDouble(tag);
																																																					return -1;
																																																				}
																																																			}.getValue(world, new BlockPos(x, y, z),
																																																					"fuelBar") >= 1) {
																																																		if (!world.isClientSide()) {
																																																			BlockPos _bp = new BlockPos(x, y, z);
																																																			BlockEntity _blockEntity = world
																																																					.getBlockEntity(_bp);
																																																			BlockState _bs = world.getBlockState(_bp);
																																																			if (_blockEntity != null)
																																																				_blockEntity.getPersistentData()
																																																						.putDouble("craftingTime", 200);
																																																			if (world instanceof Level _level)
																																																				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																		}
																																																		if (!world.isClientSide()) {
																																																			BlockPos _bp = new BlockPos(x, y, z);
																																																			BlockEntity _blockEntity = world
																																																					.getBlockEntity(_bp);
																																																			BlockState _bs = world.getBlockState(_bp);
																																																			if (_blockEntity != null)
																																																				_blockEntity.getPersistentData()
																																																						.putDouble("craftingProgress",
																																																								(new Object() {
																																																									public double getValue(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											String tag) {
																																																										BlockEntity blockEntity = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (blockEntity != null)
																																																											return blockEntity
																																																													.getPersistentData()
																																																													.getDouble(
																																																															tag);
																																																										return -1;
																																																									}
																																																								}.getValue(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										"craftingProgress")
																																																										+ 1));
																																																			if (world instanceof Level _level)
																																																				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																																																		}
																																																		if (new Object() {
																																																			public double getValue(LevelAccessor world,
																																																					BlockPos pos, String tag) {
																																																				BlockEntity blockEntity = world
																																																						.getBlockEntity(pos);
																																																				if (blockEntity != null)
																																																					return blockEntity.getPersistentData()
																																																							.getDouble(tag);
																																																				return -1;
																																																			}
																																																		}.getValue(world, new BlockPos(x, y, z),
																																																				"craftingProgress") >= 200
																																																				&& new Object() {
																																																					public int getAmount(
																																																							LevelAccessor world,
																																																							BlockPos pos, int slotid) {
																																																						AtomicInteger _retval = new AtomicInteger(
																																																								0);
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(pos);
																																																						if (_ent != null)
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> _retval
																																																													.set(capability
																																																															.getStackInSlot(
																																																																	slotid)
																																																															.getCount()));
																																																						return _retval.get();
																																																					}
																																																				}.getAmount(world, new BlockPos(x, y, z),
																																																						3) == 0
																																																				&& new Object() {
																																																					public double getValue(
																																																							LevelAccessor world,
																																																							BlockPos pos, String tag) {
																																																						BlockEntity blockEntity = world
																																																								.getBlockEntity(pos);
																																																						if (blockEntity != null)
																																																							return blockEntity
																																																									.getPersistentData()
																																																									.getDouble(tag);
																																																						return -1;
																																																					}
																																																				}.getValue(world, new BlockPos(x, y, z),
																																																						"fuelBar") >= 1) {
																																																			{
																																																				BlockEntity _ent = world.getBlockEntity(
																																																						new BlockPos(x, y, z));
																																																				if (_ent != null) {
																																																					final int _slotid = 3;
																																																					final ItemStack _setstack = new ItemStack(
																																																							BreadcraftModItems.STICKY_BUN
																																																									.get());
																																																					_setstack.setCount(
																																																							(int) (4 + new Object() {
																																																								public int getAmount(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicInteger _retval = new AtomicInteger(
																																																											0);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.getCount()));
																																																									return _retval.get();
																																																								}
																																																							}.getAmount(world,
																																																									new BlockPos(x, y, z),
																																																									3)));
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null)
																																																							.ifPresent(capability -> {
																																																								if (capability instanceof IItemHandlerModifiable)
																																																									((IItemHandlerModifiable) capability)
																																																											.setStackInSlot(
																																																													_slotid,
																																																													_setstack);
																																																							});
																																																				}
																																																			}
																																																			{
																																																				BlockEntity _ent = world.getBlockEntity(
																																																						new BlockPos(x, y, z));
																																																				if (_ent != null) {
																																																					final int _slotid = 1;
																																																					final int _amount = 1;
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null)
																																																							.ifPresent(capability -> {
																																																								if (capability instanceof IItemHandlerModifiable) {
																																																									ItemStack _stk = capability
																																																											.getStackInSlot(
																																																													_slotid)
																																																											.copy();
																																																									_stk.shrink(_amount);
																																																									((IItemHandlerModifiable) capability)
																																																											.setStackInSlot(
																																																													_slotid,
																																																													_stk);
																																																								}
																																																							});
																																																				}
																																																			}
																																																			if (!world.isClientSide()) {
																																																				BlockPos _bp = new BlockPos(x, y, z);
																																																				BlockEntity _blockEntity = world
																																																						.getBlockEntity(_bp);
																																																				BlockState _bs = world.getBlockState(_bp);
																																																				if (_blockEntity != null)
																																																					_blockEntity.getPersistentData()
																																																							.putDouble("craftingProgress",
																																																									0);
																																																				if (world instanceof Level _level)
																																																					_level.sendBlockUpdated(_bp, _bs, _bs,
																																																							3);
																																																			}
																																																		}
																																																	} else {
																																																		if ((new Object() {
																																																			public ItemStack getItemStack(
																																																					LevelAccessor world, BlockPos pos,
																																																					int slotid) {
																																																				AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																						ItemStack.EMPTY);
																																																				BlockEntity _ent = world
																																																						.getBlockEntity(pos);
																																																				if (_ent != null)
																																																					_ent.getCapability(
																																																							ForgeCapabilities.ITEM_HANDLER,
																																																							null).ifPresent(
																																																									capability -> _retval
																																																											.set(capability
																																																													.getStackInSlot(
																																																															slotid)
																																																													.copy()));
																																																				return _retval.get();
																																																			}
																																																		}.getItemStack(world, new BlockPos(x, y, z), 1))
																																																				.getItem() == BreadcraftModItems.DARK_DOUGH_WITH_FILLING
																																																						.get()
																																																				&& new Object() {
																																																					public int getAmount(
																																																							LevelAccessor world,
																																																							BlockPos pos, int slotid) {
																																																						AtomicInteger _retval = new AtomicInteger(
																																																								0);
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(pos);
																																																						if (_ent != null)
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> _retval
																																																													.set(capability
																																																															.getStackInSlot(
																																																																	slotid)
																																																															.getCount()));
																																																						return _retval.get();
																																																					}
																																																				}.getAmount(world, new BlockPos(x, y, z),
																																																						3) <= 63
																																																				&& (new Object() {
																																																					public ItemStack getItemStack(
																																																							LevelAccessor world,
																																																							BlockPos pos, int slotid) {
																																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																								ItemStack.EMPTY);
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(pos);
																																																						if (_ent != null)
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> _retval
																																																													.set(capability
																																																															.getStackInSlot(
																																																																	slotid)
																																																															.copy()));
																																																						return _retval.get();
																																																					}
																																																				}.getItemStack(world,
																																																						new BlockPos(x, y, z), 4))
																																																						.getItem() == BreadcraftModItems.DUTCH_OVEN
																																																								.get()
																																																				&& (new Object() {
																																																					public ItemStack getItemStack(
																																																							LevelAccessor world,
																																																							BlockPos pos, int slotid) {
																																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																								ItemStack.EMPTY);
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(pos);
																																																						if (_ent != null)
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> _retval
																																																													.set(capability
																																																															.getStackInSlot(
																																																																	slotid)
																																																															.copy()));
																																																						return _retval.get();
																																																					}
																																																				}.getItemStack(world,
																																																						new BlockPos(x, y, z), 3))
																																																						.getItem() == BreadcraftModItems.CHOCOLATE_SOURDOUGH
																																																								.get()
																																																				&& new Object() {
																																																					public double getValue(
																																																							LevelAccessor world,
																																																							BlockPos pos, String tag) {
																																																						BlockEntity blockEntity = world
																																																								.getBlockEntity(pos);
																																																						if (blockEntity != null)
																																																							return blockEntity
																																																									.getPersistentData()
																																																									.getDouble(tag);
																																																						return -1;
																																																					}
																																																				}.getValue(world, new BlockPos(x, y, z),
																																																						"fuelBar") >= 1) {
																																																			if (!world.isClientSide()) {
																																																				BlockPos _bp = new BlockPos(x, y, z);
																																																				BlockEntity _blockEntity = world
																																																						.getBlockEntity(_bp);
																																																				BlockState _bs = world.getBlockState(_bp);
																																																				if (_blockEntity != null)
																																																					_blockEntity.getPersistentData()
																																																							.putDouble("craftingTime",
																																																									200);
																																																				if (world instanceof Level _level)
																																																					_level.sendBlockUpdated(_bp, _bs, _bs,
																																																							3);
																																																			}
																																																			if (!world.isClientSide()) {
																																																				BlockPos _bp = new BlockPos(x, y, z);
																																																				BlockEntity _blockEntity = world
																																																						.getBlockEntity(_bp);
																																																				BlockState _bs = world.getBlockState(_bp);
																																																				if (_blockEntity != null)
																																																					_blockEntity.getPersistentData()
																																																							.putDouble("craftingProgress",
																																																									(new Object() {
																																																										public double getValue(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												String tag) {
																																																											BlockEntity blockEntity = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (blockEntity != null)
																																																												return blockEntity
																																																														.getPersistentData()
																																																														.getDouble(
																																																																tag);
																																																											return -1;
																																																										}
																																																									}.getValue(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											"craftingProgress")
																																																											+ 1));
																																																				if (world instanceof Level _level)
																																																					_level.sendBlockUpdated(_bp, _bs, _bs,
																																																							3);
																																																			}
																																																			if (new Object() {
																																																				public double getValue(
																																																						LevelAccessor world, BlockPos pos,
																																																						String tag) {
																																																					BlockEntity blockEntity = world
																																																							.getBlockEntity(pos);
																																																					if (blockEntity != null)
																																																						return blockEntity
																																																								.getPersistentData()
																																																								.getDouble(tag);
																																																					return -1;
																																																				}
																																																			}.getValue(world, new BlockPos(x, y, z),
																																																					"craftingProgress") >= 200
																																																					&& new Object() {
																																																						public int getAmount(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								int slotid) {
																																																							AtomicInteger _retval = new AtomicInteger(
																																																									0);
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(pos);
																																																							if (_ent != null)
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> _retval
																																																														.set(capability
																																																																.getStackInSlot(
																																																																		slotid)
																																																																.getCount()));
																																																							return _retval.get();
																																																						}
																																																					}.getAmount(world,
																																																							new BlockPos(x, y, z),
																																																							3) <= 63
																																																					&& new Object() {
																																																						public double getValue(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								String tag) {
																																																							BlockEntity blockEntity = world
																																																									.getBlockEntity(pos);
																																																							if (blockEntity != null)
																																																								return blockEntity
																																																										.getPersistentData()
																																																										.getDouble(tag);
																																																							return -1;
																																																						}
																																																					}.getValue(world,
																																																							new BlockPos(x, y, z),
																																																							"fuelBar") >= 1
																																																					&& (new Object() {
																																																						public ItemStack getItemStack(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								int slotid) {
																																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																									ItemStack.EMPTY);
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(pos);
																																																							if (_ent != null)
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> _retval
																																																														.set(capability
																																																																.getStackInSlot(
																																																																		slotid)
																																																																.copy()));
																																																							return _retval.get();
																																																						}
																																																					}.getItemStack(world,
																																																							new BlockPos(x, y, z), 3))
																																																							.getItem() == BreadcraftModItems.CHOCOLATE_SOURDOUGH
																																																									.get()) {
																																																				{
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(new BlockPos(
																																																									x, y, z));
																																																					if (_ent != null) {
																																																						final int _slotid = 3;
																																																						final ItemStack _setstack = new ItemStack(
																																																								BreadcraftModItems.CHOCOLATE_SOURDOUGH
																																																										.get());
																																																						_setstack.setCount(
																																																								(int) (1 + new Object() {
																																																									public int getAmount(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											int slotid) {
																																																										AtomicInteger _retval = new AtomicInteger(
																																																												0);
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (_ent != null)
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> _retval
																																																																	.set(capability
																																																																			.getStackInSlot(
																																																																					slotid)
																																																																			.getCount()));
																																																										return _retval
																																																												.get();
																																																									}
																																																								}.getAmount(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										3)));
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null)
																																																								.ifPresent(capability -> {
																																																									if (capability instanceof IItemHandlerModifiable)
																																																										((IItemHandlerModifiable) capability)
																																																												.setStackInSlot(
																																																														_slotid,
																																																														_setstack);
																																																								});
																																																					}
																																																				}
																																																				{
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(new BlockPos(
																																																									x, y, z));
																																																					if (_ent != null) {
																																																						final int _slotid = 1;
																																																						final int _amount = 1;
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null)
																																																								.ifPresent(capability -> {
																																																									if (capability instanceof IItemHandlerModifiable) {
																																																										ItemStack _stk = capability
																																																												.getStackInSlot(
																																																														_slotid)
																																																												.copy();
																																																										_stk.shrink(
																																																												_amount);
																																																										((IItemHandlerModifiable) capability)
																																																												.setStackInSlot(
																																																														_slotid,
																																																														_stk);
																																																									}
																																																								});
																																																					}
																																																				}
																																																				if (!world.isClientSide()) {
																																																					BlockPos _bp = new BlockPos(x, y, z);
																																																					BlockEntity _blockEntity = world
																																																							.getBlockEntity(_bp);
																																																					BlockState _bs = world
																																																							.getBlockState(_bp);
																																																					if (_blockEntity != null)
																																																						_blockEntity.getPersistentData()
																																																								.putDouble(
																																																										"craftingProgress",
																																																										0);
																																																					if (world instanceof Level _level)
																																																						_level.sendBlockUpdated(_bp, _bs,
																																																								_bs, 3);
																																																				}
																																																			}
																																																		} else {
																																																			if ((new Object() {
																																																				public ItemStack getItemStack(
																																																						LevelAccessor world, BlockPos pos,
																																																						int slotid) {
																																																					AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																							ItemStack.EMPTY);
																																																					BlockEntity _ent = world
																																																							.getBlockEntity(pos);
																																																					if (_ent != null)
																																																						_ent.getCapability(
																																																								ForgeCapabilities.ITEM_HANDLER,
																																																								null).ifPresent(
																																																										capability -> _retval
																																																												.set(capability
																																																														.getStackInSlot(
																																																																slotid)
																																																														.copy()));
																																																					return _retval.get();
																																																				}
																																																			}.getItemStack(world, new BlockPos(x, y, z),
																																																					1))
																																																					.getItem() == BreadcraftModItems.DARK_DOUGH_WITH_FILLING
																																																							.get()
																																																					&& new Object() {
																																																						public int getAmount(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								int slotid) {
																																																							AtomicInteger _retval = new AtomicInteger(
																																																									0);
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(pos);
																																																							if (_ent != null)
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> _retval
																																																														.set(capability
																																																																.getStackInSlot(
																																																																		slotid)
																																																																.getCount()));
																																																							return _retval.get();
																																																						}
																																																					}.getAmount(world,
																																																							new BlockPos(x, y, z), 3) == 0
																																																					&& (new Object() {
																																																						public ItemStack getItemStack(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								int slotid) {
																																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																									ItemStack.EMPTY);
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(pos);
																																																							if (_ent != null)
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> _retval
																																																														.set(capability
																																																																.getStackInSlot(
																																																																		slotid)
																																																																.copy()));
																																																							return _retval.get();
																																																						}
																																																					}.getItemStack(world,
																																																							new BlockPos(x, y, z), 4))
																																																							.getItem() == BreadcraftModItems.DUTCH_OVEN
																																																									.get()
																																																					&& new Object() {
																																																						public double getValue(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								String tag) {
																																																							BlockEntity blockEntity = world
																																																									.getBlockEntity(pos);
																																																							if (blockEntity != null)
																																																								return blockEntity
																																																										.getPersistentData()
																																																										.getDouble(tag);
																																																							return -1;
																																																						}
																																																					}.getValue(world,
																																																							new BlockPos(x, y, z),
																																																							"fuelBar") >= 1) {
																																																				if (!world.isClientSide()) {
																																																					BlockPos _bp = new BlockPos(x, y, z);
																																																					BlockEntity _blockEntity = world
																																																							.getBlockEntity(_bp);
																																																					BlockState _bs = world
																																																							.getBlockState(_bp);
																																																					if (_blockEntity != null)
																																																						_blockEntity.getPersistentData()
																																																								.putDouble("craftingTime",
																																																										200);
																																																					if (world instanceof Level _level)
																																																						_level.sendBlockUpdated(_bp, _bs,
																																																								_bs, 3);
																																																				}
																																																				if (!world.isClientSide()) {
																																																					BlockPos _bp = new BlockPos(x, y, z);
																																																					BlockEntity _blockEntity = world
																																																							.getBlockEntity(_bp);
																																																					BlockState _bs = world
																																																							.getBlockState(_bp);
																																																					if (_blockEntity != null)
																																																						_blockEntity.getPersistentData()
																																																								.putDouble(
																																																										"craftingProgress",
																																																										(new Object() {
																																																											public double getValue(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													String tag) {
																																																												BlockEntity blockEntity = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (blockEntity != null)
																																																													return blockEntity
																																																															.getPersistentData()
																																																															.getDouble(
																																																																	tag);
																																																												return -1;
																																																											}
																																																										}.getValue(world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												"craftingProgress")
																																																												+ 1));
																																																					if (world instanceof Level _level)
																																																						_level.sendBlockUpdated(_bp, _bs,
																																																								_bs, 3);
																																																				}
																																																				if (new Object() {
																																																					public double getValue(
																																																							LevelAccessor world,
																																																							BlockPos pos, String tag) {
																																																						BlockEntity blockEntity = world
																																																								.getBlockEntity(pos);
																																																						if (blockEntity != null)
																																																							return blockEntity
																																																									.getPersistentData()
																																																									.getDouble(tag);
																																																						return -1;
																																																					}
																																																				}.getValue(world, new BlockPos(x, y, z),
																																																						"craftingProgress") >= 200
																																																						&& new Object() {
																																																							public int getAmount(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicInteger _retval = new AtomicInteger(
																																																										0);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.getCount()));
																																																								return _retval.get();
																																																							}
																																																						}.getAmount(world,
																																																								new BlockPos(x, y, z),
																																																								3) == 0
																																																						&& new Object() {
																																																							public double getValue(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									String tag) {
																																																								BlockEntity blockEntity = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (blockEntity != null)
																																																									return blockEntity
																																																											.getPersistentData()
																																																											.getDouble(
																																																													tag);
																																																								return -1;
																																																							}
																																																						}.getValue(world,
																																																								new BlockPos(x, y, z),
																																																								"fuelBar") >= 1) {
																																																					{
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(
																																																										new BlockPos(x, y,
																																																												z));
																																																						if (_ent != null) {
																																																							final int _slotid = 3;
																																																							final ItemStack _setstack = new ItemStack(
																																																									BreadcraftModItems.CHOCOLATE_SOURDOUGH
																																																											.get());
																																																							_setstack.setCount((int) (1
																																																									+ new Object() {
																																																										public int getAmount(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicInteger _retval = new AtomicInteger(
																																																													0);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.getCount()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getAmount(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											3)));
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> {
																																																												if (capability instanceof IItemHandlerModifiable)
																																																													((IItemHandlerModifiable) capability)
																																																															.setStackInSlot(
																																																																	_slotid,
																																																																	_setstack);
																																																											});
																																																						}
																																																					}
																																																					{
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(
																																																										new BlockPos(x, y,
																																																												z));
																																																						if (_ent != null) {
																																																							final int _slotid = 1;
																																																							final int _amount = 1;
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> {
																																																												if (capability instanceof IItemHandlerModifiable) {
																																																													ItemStack _stk = capability
																																																															.getStackInSlot(
																																																																	_slotid)
																																																															.copy();
																																																													_stk.shrink(
																																																															_amount);
																																																													((IItemHandlerModifiable) capability)
																																																															.setStackInSlot(
																																																																	_slotid,
																																																																	_stk);
																																																												}
																																																											});
																																																						}
																																																					}
																																																					if (!world.isClientSide()) {
																																																						BlockPos _bp = new BlockPos(x, y,
																																																								z);
																																																						BlockEntity _blockEntity = world
																																																								.getBlockEntity(_bp);
																																																						BlockState _bs = world
																																																								.getBlockState(_bp);
																																																						if (_blockEntity != null)
																																																							_blockEntity
																																																									.getPersistentData()
																																																									.putDouble(
																																																											"craftingProgress",
																																																											0);
																																																						if (world instanceof Level _level)
																																																							_level.sendBlockUpdated(_bp,
																																																									_bs, _bs, 3);
																																																					}
																																																				}
																																																			} else {
																																																				if ((new Object() {
																																																					public ItemStack getItemStack(
																																																							LevelAccessor world,
																																																							BlockPos pos, int slotid) {
																																																						AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																								ItemStack.EMPTY);
																																																						BlockEntity _ent = world
																																																								.getBlockEntity(pos);
																																																						if (_ent != null)
																																																							_ent.getCapability(
																																																									ForgeCapabilities.ITEM_HANDLER,
																																																									null).ifPresent(
																																																											capability -> _retval
																																																													.set(capability
																																																															.getStackInSlot(
																																																																	slotid)
																																																															.copy()));
																																																						return _retval.get();
																																																					}
																																																				}.getItemStack(world,
																																																						new BlockPos(x, y, z), 1))
																																																						.getItem() == BreadcraftModItems.ROLLED_BASIC_DOUGH
																																																								.get()
																																																						&& new Object() {
																																																							public int getAmount(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicInteger _retval = new AtomicInteger(
																																																										0);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.getCount()));
																																																								return _retval.get();
																																																							}
																																																						}.getAmount(world,
																																																								new BlockPos(x, y, z),
																																																								3) <= 52
																																																						&& (new Object() {
																																																							public ItemStack getItemStack(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																										ItemStack.EMPTY);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.copy()));
																																																								return _retval.get();
																																																							}
																																																						}.getItemStack(world,
																																																								new BlockPos(x, y, z), 4))
																																																								.getItem() == BreadcraftModItems.SHEET_PAN
																																																										.get()
																																																						&& (new Object() {
																																																							public ItemStack getItemStack(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																										ItemStack.EMPTY);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.copy()));
																																																								return _retval.get();
																																																							}
																																																						}.getItemStack(world,
																																																								new BlockPos(x, y, z), 3))
																																																								.getItem() == BreadcraftModItems.CRACKERS
																																																										.get()
																																																						&& new Object() {
																																																							public double getValue(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									String tag) {
																																																								BlockEntity blockEntity = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (blockEntity != null)
																																																									return blockEntity
																																																											.getPersistentData()
																																																											.getDouble(
																																																													tag);
																																																								return -1;
																																																							}
																																																						}.getValue(world,
																																																								new BlockPos(x, y, z),
																																																								"fuelBar") >= 1) {
																																																					if (!world.isClientSide()) {
																																																						BlockPos _bp = new BlockPos(x, y,
																																																								z);
																																																						BlockEntity _blockEntity = world
																																																								.getBlockEntity(_bp);
																																																						BlockState _bs = world
																																																								.getBlockState(_bp);
																																																						if (_blockEntity != null)
																																																							_blockEntity
																																																									.getPersistentData()
																																																									.putDouble(
																																																											"craftingTime",
																																																											200);
																																																						if (world instanceof Level _level)
																																																							_level.sendBlockUpdated(_bp,
																																																									_bs, _bs, 3);
																																																					}
																																																					if (!world.isClientSide()) {
																																																						BlockPos _bp = new BlockPos(x, y,
																																																								z);
																																																						BlockEntity _blockEntity = world
																																																								.getBlockEntity(_bp);
																																																						BlockState _bs = world
																																																								.getBlockState(_bp);
																																																						if (_blockEntity != null)
																																																							_blockEntity
																																																									.getPersistentData()
																																																									.putDouble(
																																																											"craftingProgress",
																																																											(new Object() {
																																																												public double getValue(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														String tag) {
																																																													BlockEntity blockEntity = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (blockEntity != null)
																																																														return blockEntity
																																																																.getPersistentData()
																																																																.getDouble(
																																																																		tag);
																																																													return -1;
																																																												}
																																																											}.getValue(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													"craftingProgress")
																																																													+ 1));
																																																						if (world instanceof Level _level)
																																																							_level.sendBlockUpdated(_bp,
																																																									_bs, _bs, 3);
																																																					}
																																																					if (new Object() {
																																																						public double getValue(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								String tag) {
																																																							BlockEntity blockEntity = world
																																																									.getBlockEntity(pos);
																																																							if (blockEntity != null)
																																																								return blockEntity
																																																										.getPersistentData()
																																																										.getDouble(tag);
																																																							return -1;
																																																						}
																																																					}.getValue(world,
																																																							new BlockPos(x, y, z),
																																																							"craftingProgress") >= 200
																																																							&& new Object() {
																																																								public int getAmount(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicInteger _retval = new AtomicInteger(
																																																											0);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.getCount()));
																																																									return _retval.get();
																																																								}
																																																							}.getAmount(world,
																																																									new BlockPos(x, y, z),
																																																									3) <= 52
																																																							&& new Object() {
																																																								public double getValue(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										String tag) {
																																																									BlockEntity blockEntity = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (blockEntity != null)
																																																										return blockEntity
																																																												.getPersistentData()
																																																												.getDouble(
																																																														tag);
																																																									return -1;
																																																								}
																																																							}.getValue(world,
																																																									new BlockPos(x, y, z),
																																																									"fuelBar") >= 1
																																																							&& (new Object() {
																																																								public ItemStack getItemStack(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																											ItemStack.EMPTY);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.copy()));
																																																									return _retval.get();
																																																								}
																																																							}.getItemStack(world,
																																																									new BlockPos(x, y, z),
																																																									3))
																																																									.getItem() == BreadcraftModItems.CRACKERS
																																																											.get()) {
																																																						{
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(
																																																											new BlockPos(
																																																													x, y,
																																																													z));
																																																							if (_ent != null) {
																																																								final int _slotid = 3;
																																																								final ItemStack _setstack = new ItemStack(
																																																										BreadcraftModItems.CRACKERS
																																																												.get());
																																																								_setstack.setCount(
																																																										(int) (12
																																																												+ new Object() {
																																																													public int getAmount(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicInteger _retval = new AtomicInteger(
																																																																0);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.getCount()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getAmount(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														3)));
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> {
																																																													if (capability instanceof IItemHandlerModifiable)
																																																														((IItemHandlerModifiable) capability)
																																																																.setStackInSlot(
																																																																		_slotid,
																																																																		_setstack);
																																																												});
																																																							}
																																																						}
																																																						{
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(
																																																											new BlockPos(
																																																													x, y,
																																																													z));
																																																							if (_ent != null) {
																																																								final int _slotid = 1;
																																																								final int _amount = 1;
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> {
																																																													if (capability instanceof IItemHandlerModifiable) {
																																																														ItemStack _stk = capability
																																																																.getStackInSlot(
																																																																		_slotid)
																																																																.copy();
																																																														_stk.shrink(
																																																																_amount);
																																																														((IItemHandlerModifiable) capability)
																																																																.setStackInSlot(
																																																																		_slotid,
																																																																		_stk);
																																																													}
																																																												});
																																																							}
																																																						}
																																																						if (!world.isClientSide()) {
																																																							BlockPos _bp = new BlockPos(x,
																																																									y, z);
																																																							BlockEntity _blockEntity = world
																																																									.getBlockEntity(_bp);
																																																							BlockState _bs = world
																																																									.getBlockState(_bp);
																																																							if (_blockEntity != null)
																																																								_blockEntity
																																																										.getPersistentData()
																																																										.putDouble(
																																																												"craftingProgress",
																																																												0);
																																																							if (world instanceof Level _level)
																																																								_level.sendBlockUpdated(
																																																										_bp, _bs, _bs, 3);
																																																						}
																																																					}
																																																				} else {
																																																					if ((new Object() {
																																																						public ItemStack getItemStack(
																																																								LevelAccessor world,
																																																								BlockPos pos,
																																																								int slotid) {
																																																							AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																									ItemStack.EMPTY);
																																																							BlockEntity _ent = world
																																																									.getBlockEntity(pos);
																																																							if (_ent != null)
																																																								_ent.getCapability(
																																																										ForgeCapabilities.ITEM_HANDLER,
																																																										null).ifPresent(
																																																												capability -> _retval
																																																														.set(capability
																																																																.getStackInSlot(
																																																																		slotid)
																																																																.copy()));
																																																							return _retval.get();
																																																						}
																																																					}.getItemStack(world,
																																																							new BlockPos(x, y, z), 1))
																																																							.getItem() == BreadcraftModItems.ROLLED_BASIC_DOUGH
																																																									.get()
																																																							&& new Object() {
																																																								public int getAmount(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicInteger _retval = new AtomicInteger(
																																																											0);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.getCount()));
																																																									return _retval.get();
																																																								}
																																																							}.getAmount(world,
																																																									new BlockPos(x, y, z),
																																																									3) == 0
																																																							&& (new Object() {
																																																								public ItemStack getItemStack(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																											ItemStack.EMPTY);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.copy()));
																																																									return _retval.get();
																																																								}
																																																							}.getItemStack(world,
																																																									new BlockPos(x, y, z),
																																																									4))
																																																									.getItem() == BreadcraftModItems.SHEET_PAN
																																																											.get()
																																																							&& new Object() {
																																																								public double getValue(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										String tag) {
																																																									BlockEntity blockEntity = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (blockEntity != null)
																																																										return blockEntity
																																																												.getPersistentData()
																																																												.getDouble(
																																																														tag);
																																																									return -1;
																																																								}
																																																							}.getValue(world,
																																																									new BlockPos(x, y, z),
																																																									"fuelBar") >= 1) {
																																																						if (!world.isClientSide()) {
																																																							BlockPos _bp = new BlockPos(x,
																																																									y, z);
																																																							BlockEntity _blockEntity = world
																																																									.getBlockEntity(_bp);
																																																							BlockState _bs = world
																																																									.getBlockState(_bp);
																																																							if (_blockEntity != null)
																																																								_blockEntity
																																																										.getPersistentData()
																																																										.putDouble(
																																																												"craftingTime",
																																																												200);
																																																							if (world instanceof Level _level)
																																																								_level.sendBlockUpdated(
																																																										_bp, _bs, _bs, 3);
																																																						}
																																																						if (!world.isClientSide()) {
																																																							BlockPos _bp = new BlockPos(x,
																																																									y, z);
																																																							BlockEntity _blockEntity = world
																																																									.getBlockEntity(_bp);
																																																							BlockState _bs = world
																																																									.getBlockState(_bp);
																																																							if (_blockEntity != null)
																																																								_blockEntity
																																																										.getPersistentData()
																																																										.putDouble(
																																																												"craftingProgress",
																																																												(new Object() {
																																																													public double getValue(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															String tag) {
																																																														BlockEntity blockEntity = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (blockEntity != null)
																																																															return blockEntity
																																																																	.getPersistentData()
																																																																	.getDouble(
																																																																			tag);
																																																														return -1;
																																																													}
																																																												}.getValue(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														"craftingProgress")
																																																														+ 1));
																																																							if (world instanceof Level _level)
																																																								_level.sendBlockUpdated(
																																																										_bp, _bs, _bs, 3);
																																																						}
																																																						if (new Object() {
																																																							public double getValue(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									String tag) {
																																																								BlockEntity blockEntity = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (blockEntity != null)
																																																									return blockEntity
																																																											.getPersistentData()
																																																											.getDouble(
																																																													tag);
																																																								return -1;
																																																							}
																																																						}.getValue(world,
																																																								new BlockPos(x, y, z),
																																																								"craftingProgress") >= 200
																																																								&& new Object() {
																																																									public int getAmount(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											int slotid) {
																																																										AtomicInteger _retval = new AtomicInteger(
																																																												0);
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (_ent != null)
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> _retval
																																																																	.set(capability
																																																																			.getStackInSlot(
																																																																					slotid)
																																																																			.getCount()));
																																																										return _retval
																																																												.get();
																																																									}
																																																								}.getAmount(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										3) == 0
																																																								&& new Object() {
																																																									public double getValue(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											String tag) {
																																																										BlockEntity blockEntity = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (blockEntity != null)
																																																											return blockEntity
																																																													.getPersistentData()
																																																													.getDouble(
																																																															tag);
																																																										return -1;
																																																									}
																																																								}.getValue(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										"fuelBar") >= 1) {
																																																							{
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z));
																																																								if (_ent != null) {
																																																									final int _slotid = 3;
																																																									final ItemStack _setstack = new ItemStack(
																																																											BreadcraftModItems.CRACKERS
																																																													.get());
																																																									_setstack.setCount(
																																																											(int) (12
																																																													+ new Object() {
																																																														public int getAmount(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																int slotid) {
																																																															AtomicInteger _retval = new AtomicInteger(
																																																																	0);
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (_ent != null)
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> _retval
																																																																						.set(capability
																																																																								.getStackInSlot(
																																																																										slotid)
																																																																								.getCount()));
																																																															return _retval
																																																																	.get();
																																																														}
																																																													}.getAmount(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															3)));
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> {
																																																														if (capability instanceof IItemHandlerModifiable)
																																																															((IItemHandlerModifiable) capability)
																																																																	.setStackInSlot(
																																																																			_slotid,
																																																																			_setstack);
																																																													});
																																																								}
																																																							}
																																																							{
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z));
																																																								if (_ent != null) {
																																																									final int _slotid = 1;
																																																									final int _amount = 1;
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> {
																																																														if (capability instanceof IItemHandlerModifiable) {
																																																															ItemStack _stk = capability
																																																																	.getStackInSlot(
																																																																			_slotid)
																																																																	.copy();
																																																															_stk.shrink(
																																																																	_amount);
																																																															((IItemHandlerModifiable) capability)
																																																																	.setStackInSlot(
																																																																			_slotid,
																																																																			_stk);
																																																														}
																																																													});
																																																								}
																																																							}
																																																							if (!world.isClientSide()) {
																																																								BlockPos _bp = new BlockPos(
																																																										x, y, z);
																																																								BlockEntity _blockEntity = world
																																																										.getBlockEntity(
																																																												_bp);
																																																								BlockState _bs = world
																																																										.getBlockState(
																																																												_bp);
																																																								if (_blockEntity != null)
																																																									_blockEntity
																																																											.getPersistentData()
																																																											.putDouble(
																																																													"craftingProgress",
																																																													0);
																																																								if (world instanceof Level _level)
																																																									_level.sendBlockUpdated(
																																																											_bp, _bs, _bs,
																																																											3);
																																																							}
																																																						}
																																																					} else {
																																																						if ((new Object() {
																																																							public ItemStack getItemStack(
																																																									LevelAccessor world,
																																																									BlockPos pos,
																																																									int slotid) {
																																																								AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																										ItemStack.EMPTY);
																																																								BlockEntity _ent = world
																																																										.getBlockEntity(
																																																												pos);
																																																								if (_ent != null)
																																																									_ent.getCapability(
																																																											ForgeCapabilities.ITEM_HANDLER,
																																																											null)
																																																											.ifPresent(
																																																													capability -> _retval
																																																															.set(capability
																																																																	.getStackInSlot(
																																																																			slotid)
																																																																	.copy()));
																																																								return _retval.get();
																																																							}
																																																						}.getItemStack(world,
																																																								new BlockPos(x, y, z), 1))
																																																								.getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH
																																																										.get()
																																																								&& new Object() {
																																																									public int getAmount(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											int slotid) {
																																																										AtomicInteger _retval = new AtomicInteger(
																																																												0);
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (_ent != null)
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> _retval
																																																																	.set(capability
																																																																			.getStackInSlot(
																																																																					slotid)
																																																																			.getCount()));
																																																										return _retval
																																																												.get();
																																																									}
																																																								}.getAmount(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										3) <= 63
																																																								&& (new Object() {
																																																									public ItemStack getItemStack(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											int slotid) {
																																																										AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																												ItemStack.EMPTY);
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (_ent != null)
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> _retval
																																																																	.set(capability
																																																																			.getStackInSlot(
																																																																					slotid)
																																																																			.copy()));
																																																										return _retval
																																																												.get();
																																																									}
																																																								}.getItemStack(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										4))
																																																										.getItem() == BreadcraftModItems.SHEET_PAN
																																																												.get()
																																																								&& (new Object() {
																																																									public ItemStack getItemStack(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											int slotid) {
																																																										AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																												ItemStack.EMPTY);
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (_ent != null)
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> _retval
																																																																	.set(capability
																																																																			.getStackInSlot(
																																																																					slotid)
																																																																			.copy()));
																																																										return _retval
																																																												.get();
																																																									}
																																																								}.getItemStack(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										3))
																																																										.getItem() == BreadcraftModItems.CHALLAH
																																																												.get()
																																																								&& new Object() {
																																																									public double getValue(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											String tag) {
																																																										BlockEntity blockEntity = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (blockEntity != null)
																																																											return blockEntity
																																																													.getPersistentData()
																																																													.getDouble(
																																																															tag);
																																																										return -1;
																																																									}
																																																								}.getValue(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										"fuelBar") >= 1) {
																																																							if (!world.isClientSide()) {
																																																								BlockPos _bp = new BlockPos(
																																																										x, y, z);
																																																								BlockEntity _blockEntity = world
																																																										.getBlockEntity(
																																																												_bp);
																																																								BlockState _bs = world
																																																										.getBlockState(
																																																												_bp);
																																																								if (_blockEntity != null)
																																																									_blockEntity
																																																											.getPersistentData()
																																																											.putDouble(
																																																													"craftingTime",
																																																													200);
																																																								if (world instanceof Level _level)
																																																									_level.sendBlockUpdated(
																																																											_bp, _bs, _bs,
																																																											3);
																																																							}
																																																							if (!world.isClientSide()) {
																																																								BlockPos _bp = new BlockPos(
																																																										x, y, z);
																																																								BlockEntity _blockEntity = world
																																																										.getBlockEntity(
																																																												_bp);
																																																								BlockState _bs = world
																																																										.getBlockState(
																																																												_bp);
																																																								if (_blockEntity != null)
																																																									_blockEntity
																																																											.getPersistentData()
																																																											.putDouble(
																																																													"craftingProgress",
																																																													(new Object() {
																																																														public double getValue(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																String tag) {
																																																															BlockEntity blockEntity = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (blockEntity != null)
																																																																return blockEntity
																																																																		.getPersistentData()
																																																																		.getDouble(
																																																																				tag);
																																																															return -1;
																																																														}
																																																													}.getValue(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															"craftingProgress")
																																																															+ 1));
																																																								if (world instanceof Level _level)
																																																									_level.sendBlockUpdated(
																																																											_bp, _bs, _bs,
																																																											3);
																																																							}
																																																							if (new Object() {
																																																								public double getValue(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										String tag) {
																																																									BlockEntity blockEntity = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (blockEntity != null)
																																																										return blockEntity
																																																												.getPersistentData()
																																																												.getDouble(
																																																														tag);
																																																									return -1;
																																																								}
																																																							}.getValue(world,
																																																									new BlockPos(x, y, z),
																																																									"craftingProgress") >= 200
																																																									&& new Object() {
																																																										public int getAmount(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicInteger _retval = new AtomicInteger(
																																																													0);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.getCount()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getAmount(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											3) <= 63
																																																									&& new Object() {
																																																										public double getValue(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												String tag) {
																																																											BlockEntity blockEntity = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (blockEntity != null)
																																																												return blockEntity
																																																														.getPersistentData()
																																																														.getDouble(
																																																																tag);
																																																											return -1;
																																																										}
																																																									}.getValue(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											"fuelBar") >= 1
																																																									&& (new Object() {
																																																										public ItemStack getItemStack(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																													ItemStack.EMPTY);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.copy()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getItemStack(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											3))
																																																											.getItem() == BreadcraftModItems.CHALLAH
																																																													.get()) {
																																																								{
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z));
																																																									if (_ent != null) {
																																																										final int _slotid = 3;
																																																										final ItemStack _setstack = new ItemStack(
																																																												BreadcraftModItems.CHALLAH
																																																														.get());
																																																										_setstack
																																																												.setCount(
																																																														(int) (1 + new Object() {
																																																															public int getAmount(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	int slotid) {
																																																																AtomicInteger _retval = new AtomicInteger(
																																																																		0);
																																																																BlockEntity _ent = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (_ent != null)
																																																																	_ent.getCapability(
																																																																			ForgeCapabilities.ITEM_HANDLER,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> _retval
																																																																							.set(capability
																																																																									.getStackInSlot(
																																																																											slotid)
																																																																									.getCount()));
																																																																return _retval
																																																																		.get();
																																																															}
																																																														}.getAmount(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																3)));
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> {
																																																															if (capability instanceof IItemHandlerModifiable)
																																																																((IItemHandlerModifiable) capability)
																																																																		.setStackInSlot(
																																																																				_slotid,
																																																																				_setstack);
																																																														});
																																																									}
																																																								}
																																																								{
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z));
																																																									if (_ent != null) {
																																																										final int _slotid = 1;
																																																										final int _amount = 1;
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> {
																																																															if (capability instanceof IItemHandlerModifiable) {
																																																																ItemStack _stk = capability
																																																																		.getStackInSlot(
																																																																				_slotid)
																																																																		.copy();
																																																																_stk.shrink(
																																																																		_amount);
																																																																((IItemHandlerModifiable) capability)
																																																																		.setStackInSlot(
																																																																				_slotid,
																																																																				_stk);
																																																															}
																																																														});
																																																									}
																																																								}
																																																								if (!world
																																																										.isClientSide()) {
																																																									BlockPos _bp = new BlockPos(
																																																											x, y, z);
																																																									BlockEntity _blockEntity = world
																																																											.getBlockEntity(
																																																													_bp);
																																																									BlockState _bs = world
																																																											.getBlockState(
																																																													_bp);
																																																									if (_blockEntity != null)
																																																										_blockEntity
																																																												.getPersistentData()
																																																												.putDouble(
																																																														"craftingProgress",
																																																														0);
																																																									if (world instanceof Level _level)
																																																										_level.sendBlockUpdated(
																																																												_bp, _bs,
																																																												_bs, 3);
																																																								}
																																																							}
																																																						} else {
																																																							if ((new Object() {
																																																								public ItemStack getItemStack(
																																																										LevelAccessor world,
																																																										BlockPos pos,
																																																										int slotid) {
																																																									AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																											ItemStack.EMPTY);
																																																									BlockEntity _ent = world
																																																											.getBlockEntity(
																																																													pos);
																																																									if (_ent != null)
																																																										_ent.getCapability(
																																																												ForgeCapabilities.ITEM_HANDLER,
																																																												null)
																																																												.ifPresent(
																																																														capability -> _retval
																																																																.set(capability
																																																																		.getStackInSlot(
																																																																				slotid)
																																																																		.copy()));
																																																									return _retval.get();
																																																								}
																																																							}.getItemStack(world,
																																																									new BlockPos(x, y, z),
																																																									1))
																																																									.getItem() == BreadcraftModItems.PROOFED_ENRICHED_DOUGH
																																																											.get()
																																																									&& new Object() {
																																																										public int getAmount(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicInteger _retval = new AtomicInteger(
																																																													0);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.getCount()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getAmount(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											3) == 0
																																																									&& (new Object() {
																																																										public ItemStack getItemStack(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																													ItemStack.EMPTY);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.copy()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getItemStack(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											4))
																																																											.getItem() == BreadcraftModItems.SHEET_PAN
																																																													.get()
																																																									&& new Object() {
																																																										public double getValue(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												String tag) {
																																																											BlockEntity blockEntity = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (blockEntity != null)
																																																												return blockEntity
																																																														.getPersistentData()
																																																														.getDouble(
																																																																tag);
																																																											return -1;
																																																										}
																																																									}.getValue(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											"fuelBar") >= 1) {
																																																								if (!world
																																																										.isClientSide()) {
																																																									BlockPos _bp = new BlockPos(
																																																											x, y, z);
																																																									BlockEntity _blockEntity = world
																																																											.getBlockEntity(
																																																													_bp);
																																																									BlockState _bs = world
																																																											.getBlockState(
																																																													_bp);
																																																									if (_blockEntity != null)
																																																										_blockEntity
																																																												.getPersistentData()
																																																												.putDouble(
																																																														"craftingTime",
																																																														200);
																																																									if (world instanceof Level _level)
																																																										_level.sendBlockUpdated(
																																																												_bp, _bs,
																																																												_bs, 3);
																																																								}
																																																								if (!world
																																																										.isClientSide()) {
																																																									BlockPos _bp = new BlockPos(
																																																											x, y, z);
																																																									BlockEntity _blockEntity = world
																																																											.getBlockEntity(
																																																													_bp);
																																																									BlockState _bs = world
																																																											.getBlockState(
																																																													_bp);
																																																									if (_blockEntity != null)
																																																										_blockEntity
																																																												.getPersistentData()
																																																												.putDouble(
																																																														"craftingProgress",
																																																														(new Object() {
																																																															public double getValue(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	String tag) {
																																																																BlockEntity blockEntity = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (blockEntity != null)
																																																																	return blockEntity
																																																																			.getPersistentData()
																																																																			.getDouble(
																																																																					tag);
																																																																return -1;
																																																															}
																																																														}.getValue(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																"craftingProgress")
																																																																+ 1));
																																																									if (world instanceof Level _level)
																																																										_level.sendBlockUpdated(
																																																												_bp, _bs,
																																																												_bs, 3);
																																																								}
																																																								if (new Object() {
																																																									public double getValue(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											String tag) {
																																																										BlockEntity blockEntity = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (blockEntity != null)
																																																											return blockEntity
																																																													.getPersistentData()
																																																													.getDouble(
																																																															tag);
																																																										return -1;
																																																									}
																																																								}.getValue(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										"craftingProgress") >= 200
																																																										&& new Object() {
																																																											public int getAmount(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													int slotid) {
																																																												AtomicInteger _retval = new AtomicInteger(
																																																														0);
																																																												BlockEntity _ent = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (_ent != null)
																																																													_ent.getCapability(
																																																															ForgeCapabilities.ITEM_HANDLER,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> _retval
																																																																			.set(capability
																																																																					.getStackInSlot(
																																																																							slotid)
																																																																					.getCount()));
																																																												return _retval
																																																														.get();
																																																											}
																																																										}.getAmount(world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												3) == 0
																																																										&& new Object() {
																																																											public double getValue(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													String tag) {
																																																												BlockEntity blockEntity = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (blockEntity != null)
																																																													return blockEntity
																																																															.getPersistentData()
																																																															.getDouble(
																																																																	tag);
																																																												return -1;
																																																											}
																																																										}.getValue(world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												"fuelBar") >= 1) {
																																																									{
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z));
																																																										if (_ent != null) {
																																																											final int _slotid = 3;
																																																											final ItemStack _setstack = new ItemStack(
																																																													BreadcraftModItems.CHALLAH
																																																															.get());
																																																											_setstack
																																																													.setCount(
																																																															(int) (1 + new Object() {
																																																																public int getAmount(
																																																																		LevelAccessor world,
																																																																		BlockPos pos,
																																																																		int slotid) {
																																																																	AtomicInteger _retval = new AtomicInteger(
																																																																			0);
																																																																	BlockEntity _ent = world
																																																																			.getBlockEntity(
																																																																					pos);
																																																																	if (_ent != null)
																																																																		_ent.getCapability(
																																																																				ForgeCapabilities.ITEM_HANDLER,
																																																																				null)
																																																																				.ifPresent(
																																																																						capability -> _retval
																																																																								.set(capability
																																																																										.getStackInSlot(
																																																																												slotid)
																																																																										.getCount()));
																																																																	return _retval
																																																																			.get();
																																																																}
																																																															}.getAmount(
																																																																	world,
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z),
																																																																	3)));
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> {
																																																																if (capability instanceof IItemHandlerModifiable)
																																																																	((IItemHandlerModifiable) capability)
																																																																			.setStackInSlot(
																																																																					_slotid,
																																																																					_setstack);
																																																															});
																																																										}
																																																									}
																																																									{
																																																										BlockEntity _ent = world
																																																												.getBlockEntity(
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z));
																																																										if (_ent != null) {
																																																											final int _slotid = 1;
																																																											final int _amount = 1;
																																																											_ent.getCapability(
																																																													ForgeCapabilities.ITEM_HANDLER,
																																																													null)
																																																													.ifPresent(
																																																															capability -> {
																																																																if (capability instanceof IItemHandlerModifiable) {
																																																																	ItemStack _stk = capability
																																																																			.getStackInSlot(
																																																																					_slotid)
																																																																			.copy();
																																																																	_stk.shrink(
																																																																			_amount);
																																																																	((IItemHandlerModifiable) capability)
																																																																			.setStackInSlot(
																																																																					_slotid,
																																																																					_stk);
																																																																}
																																																															});
																																																										}
																																																									}
																																																									if (!world
																																																											.isClientSide()) {
																																																										BlockPos _bp = new BlockPos(
																																																												x, y, z);
																																																										BlockEntity _blockEntity = world
																																																												.getBlockEntity(
																																																														_bp);
																																																										BlockState _bs = world
																																																												.getBlockState(
																																																														_bp);
																																																										if (_blockEntity != null)
																																																											_blockEntity
																																																													.getPersistentData()
																																																													.putDouble(
																																																															"craftingProgress",
																																																															0);
																																																										if (world instanceof Level _level)
																																																											_level.sendBlockUpdated(
																																																													_bp,
																																																													_bs,
																																																													_bs,
																																																													3);
																																																									}
																																																								}
																																																							} else {
																																																								if (new Object() {
																																																									public double getValue(
																																																											LevelAccessor world,
																																																											BlockPos pos,
																																																											String tag) {
																																																										BlockEntity blockEntity = world
																																																												.getBlockEntity(
																																																														pos);
																																																										if (blockEntity != null)
																																																											return blockEntity
																																																													.getPersistentData()
																																																													.getDouble(
																																																															tag);
																																																										return -1;
																																																									}
																																																								}.getValue(world,
																																																										new BlockPos(x, y,
																																																												z),
																																																										"fuelBar") == 0
																																																										&& new Object() {
																																																											public int getAmount(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													int slotid) {
																																																												AtomicInteger _retval = new AtomicInteger(
																																																														0);
																																																												BlockEntity _ent = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (_ent != null)
																																																													_ent.getCapability(
																																																															ForgeCapabilities.ITEM_HANDLER,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> _retval
																																																																			.set(capability
																																																																					.getStackInSlot(
																																																																							slotid)
																																																																					.getCount()));
																																																												return _retval
																																																														.get();
																																																											}
																																																										}.getAmount(world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												3) >= 1) {
																																																									if (!world
																																																											.isClientSide()) {
																																																										BlockPos _bp = new BlockPos(
																																																												x, y, z);
																																																										BlockEntity _blockEntity = world
																																																												.getBlockEntity(
																																																														_bp);
																																																										BlockState _bs = world
																																																												.getBlockState(
																																																														_bp);
																																																										if (_blockEntity != null)
																																																											_blockEntity
																																																													.getPersistentData()
																																																													.putDouble(
																																																															"craftingProgress",
																																																															((new Object() {
																																																																public double getValue(
																																																																		LevelAccessor world,
																																																																		BlockPos pos,
																																																																		String tag) {
																																																																	BlockEntity blockEntity = world
																																																																			.getBlockEntity(
																																																																					pos);
																																																																	if (blockEntity != null)
																																																																		return blockEntity
																																																																				.getPersistentData()
																																																																				.getDouble(
																																																																						tag);
																																																																	return -1;
																																																																}
																																																															}.getValue(
																																																																	world,
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z),
																																																																	"craftingProgress"))
																																																																	- 1));
																																																										if (world instanceof Level _level)
																																																											_level.sendBlockUpdated(
																																																													_bp,
																																																													_bs,
																																																													_bs,
																																																													3);
																																																									}
																																																								} else {
																																																									if ((new Object() {
																																																										public ItemStack getItemStack(
																																																												LevelAccessor world,
																																																												BlockPos pos,
																																																												int slotid) {
																																																											AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																													ItemStack.EMPTY);
																																																											BlockEntity _ent = world
																																																													.getBlockEntity(
																																																															pos);
																																																											if (_ent != null)
																																																												_ent.getCapability(
																																																														ForgeCapabilities.ITEM_HANDLER,
																																																														null)
																																																														.ifPresent(
																																																																capability -> _retval
																																																																		.set(capability
																																																																				.getStackInSlot(
																																																																						slotid)
																																																																				.copy()));
																																																											return _retval
																																																													.get();
																																																										}
																																																									}.getItemStack(world,
																																																											new BlockPos(
																																																													x, y,
																																																													z),
																																																											1))
																																																											.getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH
																																																													.get()
																																																											&& new Object() {
																																																												public int getAmount(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														int slotid) {
																																																													AtomicInteger _retval = new AtomicInteger(
																																																															0);
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (_ent != null)
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> _retval
																																																																				.set(capability
																																																																						.getStackInSlot(
																																																																								slotid)
																																																																						.getCount()));
																																																													return _retval
																																																															.get();
																																																												}
																																																											}.getAmount(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													3) <= 63
																																																											&& (new Object() {
																																																												public ItemStack getItemStack(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														int slotid) {
																																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																															ItemStack.EMPTY);
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (_ent != null)
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> _retval
																																																																				.set(capability
																																																																						.getStackInSlot(
																																																																								slotid)
																																																																						.copy()));
																																																													return _retval
																																																															.get();
																																																												}
																																																											}.getItemStack(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													4))
																																																													.getItem() == BreadcraftModItems.SQUARE_PAN
																																																															.get()
																																																											&& (new Object() {
																																																												public ItemStack getItemStack(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														int slotid) {
																																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																															ItemStack.EMPTY);
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (_ent != null)
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> _retval
																																																																				.set(capability
																																																																						.getStackInSlot(
																																																																								slotid)
																																																																						.copy()));
																																																													return _retval
																																																															.get();
																																																												}
																																																											}.getItemStack(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													3))
																																																													.getItem() == BreadcraftModItems.GUINNESS_BREAD
																																																															.get()
																																																											&& new Object() {
																																																												public double getValue(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														String tag) {
																																																													BlockEntity blockEntity = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (blockEntity != null)
																																																														return blockEntity
																																																																.getPersistentData()
																																																																.getDouble(
																																																																		tag);
																																																													return -1;
																																																												}
																																																											}.getValue(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													"fuelBar") >= 1) {
																																																										if (!world
																																																												.isClientSide()) {
																																																											BlockPos _bp = new BlockPos(
																																																													x, y,
																																																													z);
																																																											BlockEntity _blockEntity = world
																																																													.getBlockEntity(
																																																															_bp);
																																																											BlockState _bs = world
																																																													.getBlockState(
																																																															_bp);
																																																											if (_blockEntity != null)
																																																												_blockEntity
																																																														.getPersistentData()
																																																														.putDouble(
																																																																"craftingTime",
																																																																200);
																																																											if (world instanceof Level _level)
																																																												_level.sendBlockUpdated(
																																																														_bp,
																																																														_bs,
																																																														_bs,
																																																														3);
																																																										}
																																																										if (!world
																																																												.isClientSide()) {
																																																											BlockPos _bp = new BlockPos(
																																																													x, y,
																																																													z);
																																																											BlockEntity _blockEntity = world
																																																													.getBlockEntity(
																																																															_bp);
																																																											BlockState _bs = world
																																																													.getBlockState(
																																																															_bp);
																																																											if (_blockEntity != null)
																																																												_blockEntity
																																																														.getPersistentData()
																																																														.putDouble(
																																																																"craftingProgress",
																																																																(new Object() {
																																																																	public double getValue(
																																																																			LevelAccessor world,
																																																																			BlockPos pos,
																																																																			String tag) {
																																																																		BlockEntity blockEntity = world
																																																																				.getBlockEntity(
																																																																						pos);
																																																																		if (blockEntity != null)
																																																																			return blockEntity
																																																																					.getPersistentData()
																																																																					.getDouble(
																																																																							tag);
																																																																		return -1;
																																																																	}
																																																																}.getValue(
																																																																		world,
																																																																		new BlockPos(
																																																																				x,
																																																																				y,
																																																																				z),
																																																																		"craftingProgress")
																																																																		+ 1));
																																																											if (world instanceof Level _level)
																																																												_level.sendBlockUpdated(
																																																														_bp,
																																																														_bs,
																																																														_bs,
																																																														3);
																																																										}
																																																										if (new Object() {
																																																											public double getValue(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													String tag) {
																																																												BlockEntity blockEntity = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (blockEntity != null)
																																																													return blockEntity
																																																															.getPersistentData()
																																																															.getDouble(
																																																																	tag);
																																																												return -1;
																																																											}
																																																										}.getValue(world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												"craftingProgress") >= 200
																																																												&& new Object() {
																																																													public int getAmount(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicInteger _retval = new AtomicInteger(
																																																																0);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.getCount()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getAmount(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														3) <= 63
																																																												&& new Object() {
																																																													public double getValue(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															String tag) {
																																																														BlockEntity blockEntity = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (blockEntity != null)
																																																															return blockEntity
																																																																	.getPersistentData()
																																																																	.getDouble(
																																																																			tag);
																																																														return -1;
																																																													}
																																																												}.getValue(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														"fuelBar") >= 1
																																																												&& (new Object() {
																																																													public ItemStack getItemStack(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																ItemStack.EMPTY);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.copy()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getItemStack(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														3))
																																																														.getItem() == BreadcraftModItems.GUINNESS_BREAD
																																																																.get()) {
																																																											{
																																																												BlockEntity _ent = world
																																																														.getBlockEntity(
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z));
																																																												if (_ent != null) {
																																																													final int _slotid = 3;
																																																													final ItemStack _setstack = new ItemStack(
																																																															BreadcraftModItems.GUINNESS_BREAD
																																																																	.get());
																																																													_setstack
																																																															.setCount(
																																																																	(int) (1 + new Object() {
																																																																		public int getAmount(
																																																																				LevelAccessor world,
																																																																				BlockPos pos,
																																																																				int slotid) {
																																																																			AtomicInteger _retval = new AtomicInteger(
																																																																					0);
																																																																			BlockEntity _ent = world
																																																																					.getBlockEntity(
																																																																							pos);
																																																																			if (_ent != null)
																																																																				_ent.getCapability(
																																																																						ForgeCapabilities.ITEM_HANDLER,
																																																																						null)
																																																																						.ifPresent(
																																																																								capability -> _retval
																																																																										.set(capability
																																																																												.getStackInSlot(
																																																																														slotid)
																																																																												.getCount()));
																																																																			return _retval
																																																																					.get();
																																																																		}
																																																																	}.getAmount(
																																																																			world,
																																																																			new BlockPos(
																																																																					x,
																																																																					y,
																																																																					z),
																																																																			3)));
																																																													_ent.getCapability(
																																																															ForgeCapabilities.ITEM_HANDLER,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> {
																																																																		if (capability instanceof IItemHandlerModifiable)
																																																																			((IItemHandlerModifiable) capability)
																																																																					.setStackInSlot(
																																																																							_slotid,
																																																																							_setstack);
																																																																	});
																																																												}
																																																											}
																																																											{
																																																												BlockEntity _ent = world
																																																														.getBlockEntity(
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z));
																																																												if (_ent != null) {
																																																													final int _slotid = 1;
																																																													final int _amount = 1;
																																																													_ent.getCapability(
																																																															ForgeCapabilities.ITEM_HANDLER,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> {
																																																																		if (capability instanceof IItemHandlerModifiable) {
																																																																			ItemStack _stk = capability
																																																																					.getStackInSlot(
																																																																							_slotid)
																																																																					.copy();
																																																																			_stk.shrink(
																																																																					_amount);
																																																																			((IItemHandlerModifiable) capability)
																																																																					.setStackInSlot(
																																																																							_slotid,
																																																																							_stk);
																																																																		}
																																																																	});
																																																												}
																																																											}
																																																											if (!world
																																																													.isClientSide()) {
																																																												BlockPos _bp = new BlockPos(
																																																														x,
																																																														y,
																																																														z);
																																																												BlockEntity _blockEntity = world
																																																														.getBlockEntity(
																																																																_bp);
																																																												BlockState _bs = world
																																																														.getBlockState(
																																																																_bp);
																																																												if (_blockEntity != null)
																																																													_blockEntity
																																																															.getPersistentData()
																																																															.putDouble(
																																																																	"craftingProgress",
																																																																	0);
																																																												if (world instanceof Level _level)
																																																													_level.sendBlockUpdated(
																																																															_bp,
																																																															_bs,
																																																															_bs,
																																																															3);
																																																											}
																																																										}
																																																									} else {
																																																										if ((new Object() {
																																																											public ItemStack getItemStack(
																																																													LevelAccessor world,
																																																													BlockPos pos,
																																																													int slotid) {
																																																												AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																														ItemStack.EMPTY);
																																																												BlockEntity _ent = world
																																																														.getBlockEntity(
																																																																pos);
																																																												if (_ent != null)
																																																													_ent.getCapability(
																																																															ForgeCapabilities.ITEM_HANDLER,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> _retval
																																																																			.set(capability
																																																																					.getStackInSlot(
																																																																							slotid)
																																																																					.copy()));
																																																												return _retval
																																																														.get();
																																																											}
																																																										}.getItemStack(
																																																												world,
																																																												new BlockPos(
																																																														x,
																																																														y,
																																																														z),
																																																												1))
																																																												.getItem() == BreadcraftModItems.PROOFED_DARK_DOUGH
																																																														.get()
																																																												&& new Object() {
																																																													public int getAmount(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicInteger _retval = new AtomicInteger(
																																																																0);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.getCount()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getAmount(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														3) == 0
																																																												&& (new Object() {
																																																													public ItemStack getItemStack(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																ItemStack.EMPTY);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.copy()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getItemStack(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														4))
																																																														.getItem() == BreadcraftModItems.SQUARE_PAN
																																																																.get()
																																																												&& new Object() {
																																																													public double getValue(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															String tag) {
																																																														BlockEntity blockEntity = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (blockEntity != null)
																																																															return blockEntity
																																																																	.getPersistentData()
																																																																	.getDouble(
																																																																			tag);
																																																														return -1;
																																																													}
																																																												}.getValue(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														"fuelBar") >= 1) {
																																																											if (!world
																																																													.isClientSide()) {
																																																												BlockPos _bp = new BlockPos(
																																																														x,
																																																														y,
																																																														z);
																																																												BlockEntity _blockEntity = world
																																																														.getBlockEntity(
																																																																_bp);
																																																												BlockState _bs = world
																																																														.getBlockState(
																																																																_bp);
																																																												if (_blockEntity != null)
																																																													_blockEntity
																																																															.getPersistentData()
																																																															.putDouble(
																																																																	"craftingTime",
																																																																	200);
																																																												if (world instanceof Level _level)
																																																													_level.sendBlockUpdated(
																																																															_bp,
																																																															_bs,
																																																															_bs,
																																																															3);
																																																											}
																																																											if (!world
																																																													.isClientSide()) {
																																																												BlockPos _bp = new BlockPos(
																																																														x,
																																																														y,
																																																														z);
																																																												BlockEntity _blockEntity = world
																																																														.getBlockEntity(
																																																																_bp);
																																																												BlockState _bs = world
																																																														.getBlockState(
																																																																_bp);
																																																												if (_blockEntity != null)
																																																													_blockEntity
																																																															.getPersistentData()
																																																															.putDouble(
																																																																	"craftingProgress",
																																																																	(new Object() {
																																																																		public double getValue(
																																																																				LevelAccessor world,
																																																																				BlockPos pos,
																																																																				String tag) {
																																																																			BlockEntity blockEntity = world
																																																																					.getBlockEntity(
																																																																							pos);
																																																																			if (blockEntity != null)
																																																																				return blockEntity
																																																																						.getPersistentData()
																																																																						.getDouble(
																																																																								tag);
																																																																			return -1;
																																																																		}
																																																																	}.getValue(
																																																																			world,
																																																																			new BlockPos(
																																																																					x,
																																																																					y,
																																																																					z),
																																																																			"craftingProgress")
																																																																			+ 1));
																																																												if (world instanceof Level _level)
																																																													_level.sendBlockUpdated(
																																																															_bp,
																																																															_bs,
																																																															_bs,
																																																															3);
																																																											}
																																																											if (new Object() {
																																																												public double getValue(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														String tag) {
																																																													BlockEntity blockEntity = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (blockEntity != null)
																																																														return blockEntity
																																																																.getPersistentData()
																																																																.getDouble(
																																																																		tag);
																																																													return -1;
																																																												}
																																																											}.getValue(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													"craftingProgress") >= 200
																																																													&& new Object() {
																																																														public int getAmount(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																int slotid) {
																																																															AtomicInteger _retval = new AtomicInteger(
																																																																	0);
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (_ent != null)
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> _retval
																																																																						.set(capability
																																																																								.getStackInSlot(
																																																																										slotid)
																																																																								.getCount()));
																																																															return _retval
																																																																	.get();
																																																														}
																																																													}.getAmount(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															3) == 0
																																																													&& new Object() {
																																																														public double getValue(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																String tag) {
																																																															BlockEntity blockEntity = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (blockEntity != null)
																																																																return blockEntity
																																																																		.getPersistentData()
																																																																		.getDouble(
																																																																				tag);
																																																															return -1;
																																																														}
																																																													}.getValue(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															"fuelBar") >= 1) {
																																																												{
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z));
																																																													if (_ent != null) {
																																																														final int _slotid = 3;
																																																														final ItemStack _setstack = new ItemStack(
																																																																BreadcraftModItems.GUINNESS_BREAD
																																																																		.get());
																																																														_setstack
																																																																.setCount(
																																																																		(int) (1 + new Object() {
																																																																			public int getAmount(
																																																																					LevelAccessor world,
																																																																					BlockPos pos,
																																																																					int slotid) {
																																																																				AtomicInteger _retval = new AtomicInteger(
																																																																						0);
																																																																				BlockEntity _ent = world
																																																																						.getBlockEntity(
																																																																								pos);
																																																																				if (_ent != null)
																																																																					_ent.getCapability(
																																																																							ForgeCapabilities.ITEM_HANDLER,
																																																																							null)
																																																																							.ifPresent(
																																																																									capability -> _retval
																																																																											.set(capability
																																																																													.getStackInSlot(
																																																																															slotid)
																																																																													.getCount()));
																																																																				return _retval
																																																																						.get();
																																																																			}
																																																																		}.getAmount(
																																																																				world,
																																																																				new BlockPos(
																																																																						x,
																																																																						y,
																																																																						z),
																																																																				3)));
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> {
																																																																			if (capability instanceof IItemHandlerModifiable)
																																																																				((IItemHandlerModifiable) capability)
																																																																						.setStackInSlot(
																																																																								_slotid,
																																																																								_setstack);
																																																																		});
																																																													}
																																																												}
																																																												{
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z));
																																																													if (_ent != null) {
																																																														final int _slotid = 1;
																																																														final int _amount = 1;
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> {
																																																																			if (capability instanceof IItemHandlerModifiable) {
																																																																				ItemStack _stk = capability
																																																																						.getStackInSlot(
																																																																								_slotid)
																																																																						.copy();
																																																																				_stk.shrink(
																																																																						_amount);
																																																																				((IItemHandlerModifiable) capability)
																																																																						.setStackInSlot(
																																																																								_slotid,
																																																																								_stk);
																																																																			}
																																																																		});
																																																													}
																																																												}
																																																												if (!world
																																																														.isClientSide()) {
																																																													BlockPos _bp = new BlockPos(
																																																															x,
																																																															y,
																																																															z);
																																																													BlockEntity _blockEntity = world
																																																															.getBlockEntity(
																																																																	_bp);
																																																													BlockState _bs = world
																																																															.getBlockState(
																																																																	_bp);
																																																													if (_blockEntity != null)
																																																														_blockEntity
																																																																.getPersistentData()
																																																																.putDouble(
																																																																		"craftingProgress",
																																																																		0);
																																																													if (world instanceof Level _level)
																																																														_level.sendBlockUpdated(
																																																																_bp,
																																																																_bs,
																																																																_bs,
																																																																3);
																																																												}
																																																											}
																																																										} else {
																																																											if ((new Object() {
																																																												public ItemStack getItemStack(
																																																														LevelAccessor world,
																																																														BlockPos pos,
																																																														int slotid) {
																																																													AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																															ItemStack.EMPTY);
																																																													BlockEntity _ent = world
																																																															.getBlockEntity(
																																																																	pos);
																																																													if (_ent != null)
																																																														_ent.getCapability(
																																																																ForgeCapabilities.ITEM_HANDLER,
																																																																null)
																																																																.ifPresent(
																																																																		capability -> _retval
																																																																				.set(capability
																																																																						.getStackInSlot(
																																																																								slotid)
																																																																						.copy()));
																																																													return _retval
																																																															.get();
																																																												}
																																																											}.getItemStack(
																																																													world,
																																																													new BlockPos(
																																																															x,
																																																															y,
																																																															z),
																																																													1))
																																																													.getItem() == BreadcraftModItems.ROLLED_ENRICHED_DOUGH
																																																															.get()
																																																													&& new Object() {
																																																														public int getAmount(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																int slotid) {
																																																															AtomicInteger _retval = new AtomicInteger(
																																																																	0);
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (_ent != null)
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> _retval
																																																																						.set(capability
																																																																								.getStackInSlot(
																																																																										slotid)
																																																																								.getCount()));
																																																															return _retval
																																																																	.get();
																																																														}
																																																													}.getAmount(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															3) <= 58
																																																													&& (new Object() {
																																																														public ItemStack getItemStack(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																int slotid) {
																																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																	ItemStack.EMPTY);
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (_ent != null)
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> _retval
																																																																						.set(capability
																																																																								.getStackInSlot(
																																																																										slotid)
																																																																								.copy()));
																																																															return _retval
																																																																	.get();
																																																														}
																																																													}.getItemStack(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															4))
																																																															.getItem() == BreadcraftModItems.SHEET_PAN
																																																																	.get()
																																																													&& (new Object() {
																																																														public ItemStack getItemStack(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																int slotid) {
																																																															AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																	ItemStack.EMPTY);
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (_ent != null)
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> _retval
																																																																						.set(capability
																																																																								.getStackInSlot(
																																																																										slotid)
																																																																								.copy()));
																																																															return _retval
																																																																	.get();
																																																														}
																																																													}.getItemStack(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															3))
																																																															.getItem() == BreadcraftModItems.CROISSANT
																																																																	.get()
																																																													&& new Object() {
																																																														public double getValue(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																String tag) {
																																																															BlockEntity blockEntity = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (blockEntity != null)
																																																																return blockEntity
																																																																		.getPersistentData()
																																																																		.getDouble(
																																																																				tag);
																																																															return -1;
																																																														}
																																																													}.getValue(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															"fuelBar") >= 1) {
																																																												if (!world
																																																														.isClientSide()) {
																																																													BlockPos _bp = new BlockPos(
																																																															x,
																																																															y,
																																																															z);
																																																													BlockEntity _blockEntity = world
																																																															.getBlockEntity(
																																																																	_bp);
																																																													BlockState _bs = world
																																																															.getBlockState(
																																																																	_bp);
																																																													if (_blockEntity != null)
																																																														_blockEntity
																																																																.getPersistentData()
																																																																.putDouble(
																																																																		"craftingTime",
																																																																		200);
																																																													if (world instanceof Level _level)
																																																														_level.sendBlockUpdated(
																																																																_bp,
																																																																_bs,
																																																																_bs,
																																																																3);
																																																												}
																																																												if (!world
																																																														.isClientSide()) {
																																																													BlockPos _bp = new BlockPos(
																																																															x,
																																																															y,
																																																															z);
																																																													BlockEntity _blockEntity = world
																																																															.getBlockEntity(
																																																																	_bp);
																																																													BlockState _bs = world
																																																															.getBlockState(
																																																																	_bp);
																																																													if (_blockEntity != null)
																																																														_blockEntity
																																																																.getPersistentData()
																																																																.putDouble(
																																																																		"craftingProgress",
																																																																		(new Object() {
																																																																			public double getValue(
																																																																					LevelAccessor world,
																																																																					BlockPos pos,
																																																																					String tag) {
																																																																				BlockEntity blockEntity = world
																																																																						.getBlockEntity(
																																																																								pos);
																																																																				if (blockEntity != null)
																																																																					return blockEntity
																																																																							.getPersistentData()
																																																																							.getDouble(
																																																																									tag);
																																																																				return -1;
																																																																			}
																																																																		}.getValue(
																																																																				world,
																																																																				new BlockPos(
																																																																						x,
																																																																						y,
																																																																						z),
																																																																				"craftingProgress")
																																																																				+ 1));
																																																													if (world instanceof Level _level)
																																																														_level.sendBlockUpdated(
																																																																_bp,
																																																																_bs,
																																																																_bs,
																																																																3);
																																																												}
																																																												if (new Object() {
																																																													public double getValue(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															String tag) {
																																																														BlockEntity blockEntity = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (blockEntity != null)
																																																															return blockEntity
																																																																	.getPersistentData()
																																																																	.getDouble(
																																																																			tag);
																																																														return -1;
																																																													}
																																																												}.getValue(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														"craftingProgress") >= 200
																																																														&& new Object() {
																																																															public int getAmount(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	int slotid) {
																																																																AtomicInteger _retval = new AtomicInteger(
																																																																		0);
																																																																BlockEntity _ent = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (_ent != null)
																																																																	_ent.getCapability(
																																																																			ForgeCapabilities.ITEM_HANDLER,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> _retval
																																																																							.set(capability
																																																																									.getStackInSlot(
																																																																											slotid)
																																																																									.getCount()));
																																																																return _retval
																																																																		.get();
																																																															}
																																																														}.getAmount(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																3) <= 58
																																																														&& new Object() {
																																																															public double getValue(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	String tag) {
																																																																BlockEntity blockEntity = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (blockEntity != null)
																																																																	return blockEntity
																																																																			.getPersistentData()
																																																																			.getDouble(
																																																																					tag);
																																																																return -1;
																																																															}
																																																														}.getValue(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																"fuelBar") >= 1
																																																														&& (new Object() {
																																																															public ItemStack getItemStack(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	int slotid) {
																																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																		ItemStack.EMPTY);
																																																																BlockEntity _ent = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (_ent != null)
																																																																	_ent.getCapability(
																																																																			ForgeCapabilities.ITEM_HANDLER,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> _retval
																																																																							.set(capability
																																																																									.getStackInSlot(
																																																																											slotid)
																																																																									.copy()));
																																																																return _retval
																																																																		.get();
																																																															}
																																																														}.getItemStack(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																3))
																																																																.getItem() == BreadcraftModItems.CROISSANT
																																																																		.get()) {
																																																													{
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		new BlockPos(
																																																																				x,
																																																																				y,
																																																																				z));
																																																														if (_ent != null) {
																																																															final int _slotid = 3;
																																																															final ItemStack _setstack = new ItemStack(
																																																																	BreadcraftModItems.CROISSANT
																																																																			.get());
																																																															_setstack
																																																																	.setCount(
																																																																			(int) (6 + new Object() {
																																																																				public int getAmount(
																																																																						LevelAccessor world,
																																																																						BlockPos pos,
																																																																						int slotid) {
																																																																					AtomicInteger _retval = new AtomicInteger(
																																																																							0);
																																																																					BlockEntity _ent = world
																																																																							.getBlockEntity(
																																																																									pos);
																																																																					if (_ent != null)
																																																																						_ent.getCapability(
																																																																								ForgeCapabilities.ITEM_HANDLER,
																																																																								null)
																																																																								.ifPresent(
																																																																										capability -> _retval
																																																																												.set(capability
																																																																														.getStackInSlot(
																																																																																slotid)
																																																																														.getCount()));
																																																																					return _retval
																																																																							.get();
																																																																				}
																																																																			}.getAmount(
																																																																					world,
																																																																					new BlockPos(
																																																																							x,
																																																																							y,
																																																																							z),
																																																																					3)));
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> {
																																																																				if (capability instanceof IItemHandlerModifiable)
																																																																					((IItemHandlerModifiable) capability)
																																																																							.setStackInSlot(
																																																																									_slotid,
																																																																									_setstack);
																																																																			});
																																																														}
																																																													}
																																																													{
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		new BlockPos(
																																																																				x,
																																																																				y,
																																																																				z));
																																																														if (_ent != null) {
																																																															final int _slotid = 1;
																																																															final int _amount = 1;
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> {
																																																																				if (capability instanceof IItemHandlerModifiable) {
																																																																					ItemStack _stk = capability
																																																																							.getStackInSlot(
																																																																									_slotid)
																																																																							.copy();
																																																																					_stk.shrink(
																																																																							_amount);
																																																																					((IItemHandlerModifiable) capability)
																																																																							.setStackInSlot(
																																																																									_slotid,
																																																																									_stk);
																																																																				}
																																																																			});
																																																														}
																																																													}
																																																													if (!world
																																																															.isClientSide()) {
																																																														BlockPos _bp = new BlockPos(
																																																																x,
																																																																y,
																																																																z);
																																																														BlockEntity _blockEntity = world
																																																																.getBlockEntity(
																																																																		_bp);
																																																														BlockState _bs = world
																																																																.getBlockState(
																																																																		_bp);
																																																														if (_blockEntity != null)
																																																															_blockEntity
																																																																	.getPersistentData()
																																																																	.putDouble(
																																																																			"craftingProgress",
																																																																			0);
																																																														if (world instanceof Level _level)
																																																															_level.sendBlockUpdated(
																																																																	_bp,
																																																																	_bs,
																																																																	_bs,
																																																																	3);
																																																													}
																																																												}
																																																											} else {
																																																												if ((new Object() {
																																																													public ItemStack getItemStack(
																																																															LevelAccessor world,
																																																															BlockPos pos,
																																																															int slotid) {
																																																														AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																ItemStack.EMPTY);
																																																														BlockEntity _ent = world
																																																																.getBlockEntity(
																																																																		pos);
																																																														if (_ent != null)
																																																															_ent.getCapability(
																																																																	ForgeCapabilities.ITEM_HANDLER,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> _retval
																																																																					.set(capability
																																																																							.getStackInSlot(
																																																																									slotid)
																																																																							.copy()));
																																																														return _retval
																																																																.get();
																																																													}
																																																												}.getItemStack(
																																																														world,
																																																														new BlockPos(
																																																																x,
																																																																y,
																																																																z),
																																																														1))
																																																														.getItem() == BreadcraftModItems.ROLLED_ENRICHED_DOUGH
																																																																.get()
																																																														&& new Object() {
																																																															public int getAmount(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	int slotid) {
																																																																AtomicInteger _retval = new AtomicInteger(
																																																																		0);
																																																																BlockEntity _ent = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (_ent != null)
																																																																	_ent.getCapability(
																																																																			ForgeCapabilities.ITEM_HANDLER,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> _retval
																																																																							.set(capability
																																																																									.getStackInSlot(
																																																																											slotid)
																																																																									.getCount()));
																																																																return _retval
																																																																		.get();
																																																															}
																																																														}.getAmount(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																3) == 0
																																																														&& (new Object() {
																																																															public ItemStack getItemStack(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	int slotid) {
																																																																AtomicReference<ItemStack> _retval = new AtomicReference<>(
																																																																		ItemStack.EMPTY);
																																																																BlockEntity _ent = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (_ent != null)
																																																																	_ent.getCapability(
																																																																			ForgeCapabilities.ITEM_HANDLER,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> _retval
																																																																							.set(capability
																																																																									.getStackInSlot(
																																																																											slotid)
																																																																									.copy()));
																																																																return _retval
																																																																		.get();
																																																															}
																																																														}.getItemStack(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																4))
																																																																.getItem() == BreadcraftModItems.SHEET_PAN
																																																																		.get()
																																																														&& new Object() {
																																																															public double getValue(
																																																																	LevelAccessor world,
																																																																	BlockPos pos,
																																																																	String tag) {
																																																																BlockEntity blockEntity = world
																																																																		.getBlockEntity(
																																																																				pos);
																																																																if (blockEntity != null)
																																																																	return blockEntity
																																																																			.getPersistentData()
																																																																			.getDouble(
																																																																					tag);
																																																																return -1;
																																																															}
																																																														}.getValue(
																																																																world,
																																																																new BlockPos(
																																																																		x,
																																																																		y,
																																																																		z),
																																																																"fuelBar") >= 1) {
																																																													if (!world
																																																															.isClientSide()) {
																																																														BlockPos _bp = new BlockPos(
																																																																x,
																																																																y,
																																																																z);
																																																														BlockEntity _blockEntity = world
																																																																.getBlockEntity(
																																																																		_bp);
																																																														BlockState _bs = world
																																																																.getBlockState(
																																																																		_bp);
																																																														if (_blockEntity != null)
																																																															_blockEntity
																																																																	.getPersistentData()
																																																																	.putDouble(
																																																																			"craftingTime",
																																																																			200);
																																																														if (world instanceof Level _level)
																																																															_level.sendBlockUpdated(
																																																																	_bp,
																																																																	_bs,
																																																																	_bs,
																																																																	3);
																																																													}
																																																													if (!world
																																																															.isClientSide()) {
																																																														BlockPos _bp = new BlockPos(
																																																																x,
																																																																y,
																																																																z);
																																																														BlockEntity _blockEntity = world
																																																																.getBlockEntity(
																																																																		_bp);
																																																														BlockState _bs = world
																																																																.getBlockState(
																																																																		_bp);
																																																														if (_blockEntity != null)
																																																															_blockEntity
																																																																	.getPersistentData()
																																																																	.putDouble(
																																																																			"craftingProgress",
																																																																			(new Object() {
																																																																				public double getValue(
																																																																						LevelAccessor world,
																																																																						BlockPos pos,
																																																																						String tag) {
																																																																					BlockEntity blockEntity = world
																																																																							.getBlockEntity(
																																																																									pos);
																																																																					if (blockEntity != null)
																																																																						return blockEntity
																																																																								.getPersistentData()
																																																																								.getDouble(
																																																																										tag);
																																																																					return -1;
																																																																				}
																																																																			}.getValue(
																																																																					world,
																																																																					new BlockPos(
																																																																							x,
																																																																							y,
																																																																							z),
																																																																					"craftingProgress")
																																																																					+ 1));
																																																														if (world instanceof Level _level)
																																																															_level.sendBlockUpdated(
																																																																	_bp,
																																																																	_bs,
																																																																	_bs,
																																																																	3);
																																																													}
																																																													if (new Object() {
																																																														public double getValue(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																String tag) {
																																																															BlockEntity blockEntity = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (blockEntity != null)
																																																																return blockEntity
																																																																		.getPersistentData()
																																																																		.getDouble(
																																																																				tag);
																																																															return -1;
																																																														}
																																																													}.getValue(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															"craftingProgress") >= 200
																																																															&& new Object() {
																																																																public int getAmount(
																																																																		LevelAccessor world,
																																																																		BlockPos pos,
																																																																		int slotid) {
																																																																	AtomicInteger _retval = new AtomicInteger(
																																																																			0);
																																																																	BlockEntity _ent = world
																																																																			.getBlockEntity(
																																																																					pos);
																																																																	if (_ent != null)
																																																																		_ent.getCapability(
																																																																				ForgeCapabilities.ITEM_HANDLER,
																																																																				null)
																																																																				.ifPresent(
																																																																						capability -> _retval
																																																																								.set(capability
																																																																										.getStackInSlot(
																																																																												slotid)
																																																																										.getCount()));
																																																																	return _retval
																																																																			.get();
																																																																}
																																																															}.getAmount(
																																																																	world,
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z),
																																																																	3) == 0
																																																															&& new Object() {
																																																																public double getValue(
																																																																		LevelAccessor world,
																																																																		BlockPos pos,
																																																																		String tag) {
																																																																	BlockEntity blockEntity = world
																																																																			.getBlockEntity(
																																																																					pos);
																																																																	if (blockEntity != null)
																																																																		return blockEntity
																																																																				.getPersistentData()
																																																																				.getDouble(
																																																																						tag);
																																																																	return -1;
																																																																}
																																																															}.getValue(
																																																																	world,
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z),
																																																																	"fuelBar") >= 1) {
																																																														{
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			new BlockPos(
																																																																					x,
																																																																					y,
																																																																					z));
																																																															if (_ent != null) {
																																																																final int _slotid = 3;
																																																																final ItemStack _setstack = new ItemStack(
																																																																		BreadcraftModItems.CROISSANT
																																																																				.get());
																																																																_setstack
																																																																		.setCount(
																																																																				(int) (6 + new Object() {
																																																																					public int getAmount(
																																																																							LevelAccessor world,
																																																																							BlockPos pos,
																																																																							int slotid) {
																																																																						AtomicInteger _retval = new AtomicInteger(
																																																																								0);
																																																																						BlockEntity _ent = world
																																																																								.getBlockEntity(
																																																																										pos);
																																																																						if (_ent != null)
																																																																							_ent.getCapability(
																																																																									ForgeCapabilities.ITEM_HANDLER,
																																																																									null)
																																																																									.ifPresent(
																																																																											capability -> _retval
																																																																													.set(capability
																																																																															.getStackInSlot(
																																																																																	slotid)
																																																																															.getCount()));
																																																																						return _retval
																																																																								.get();
																																																																					}
																																																																				}.getAmount(
																																																																						world,
																																																																						new BlockPos(
																																																																								x,
																																																																								y,
																																																																								z),
																																																																						3)));
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> {
																																																																					if (capability instanceof IItemHandlerModifiable)
																																																																						((IItemHandlerModifiable) capability)
																																																																								.setStackInSlot(
																																																																										_slotid,
																																																																										_setstack);
																																																																				});
																																																															}
																																																														}
																																																														{
																																																															BlockEntity _ent = world
																																																																	.getBlockEntity(
																																																																			new BlockPos(
																																																																					x,
																																																																					y,
																																																																					z));
																																																															if (_ent != null) {
																																																																final int _slotid = 1;
																																																																final int _amount = 1;
																																																																_ent.getCapability(
																																																																		ForgeCapabilities.ITEM_HANDLER,
																																																																		null)
																																																																		.ifPresent(
																																																																				capability -> {
																																																																					if (capability instanceof IItemHandlerModifiable) {
																																																																						ItemStack _stk = capability
																																																																								.getStackInSlot(
																																																																										_slotid)
																																																																								.copy();
																																																																						_stk.shrink(
																																																																								_amount);
																																																																						((IItemHandlerModifiable) capability)
																																																																								.setStackInSlot(
																																																																										_slotid,
																																																																										_stk);
																																																																					}
																																																																				});
																																																															}
																																																														}
																																																														if (!world
																																																																.isClientSide()) {
																																																															BlockPos _bp = new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z);
																																																															BlockEntity _blockEntity = world
																																																																	.getBlockEntity(
																																																																			_bp);
																																																															BlockState _bs = world
																																																																	.getBlockState(
																																																																			_bp);
																																																															if (_blockEntity != null)
																																																																_blockEntity
																																																																		.getPersistentData()
																																																																		.putDouble(
																																																																				"craftingProgress",
																																																																				0);
																																																															if (world instanceof Level _level)
																																																																_level.sendBlockUpdated(
																																																																		_bp,
																																																																		_bs,
																																																																		_bs,
																																																																		3);
																																																														}
																																																													}
																																																												} else {
																																																													if (new Object() {
																																																														public double getValue(
																																																																LevelAccessor world,
																																																																BlockPos pos,
																																																																String tag) {
																																																															BlockEntity blockEntity = world
																																																																	.getBlockEntity(
																																																																			pos);
																																																															if (blockEntity != null)
																																																																return blockEntity
																																																																		.getPersistentData()
																																																																		.getDouble(
																																																																				tag);
																																																															return -1;
																																																														}
																																																													}.getValue(
																																																															world,
																																																															new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															"fuelBar") == 0
																																																															&& new Object() {
																																																																public int getAmount(
																																																																		LevelAccessor world,
																																																																		BlockPos pos,
																																																																		int slotid) {
																																																																	AtomicInteger _retval = new AtomicInteger(
																																																																			0);
																																																																	BlockEntity _ent = world
																																																																			.getBlockEntity(
																																																																					pos);
																																																																	if (_ent != null)
																																																																		_ent.getCapability(
																																																																				ForgeCapabilities.ITEM_HANDLER,
																																																																				null)
																																																																				.ifPresent(
																																																																						capability -> _retval
																																																																								.set(capability
																																																																										.getStackInSlot(
																																																																												slotid)
																																																																										.getCount()));
																																																																	return _retval
																																																																			.get();
																																																																}
																																																															}.getAmount(
																																																																	world,
																																																																	new BlockPos(
																																																																			x,
																																																																			y,
																																																																			z),
																																																																	3) >= 1) {
																																																														if (!world
																																																																.isClientSide()) {
																																																															BlockPos _bp = new BlockPos(
																																																																	x,
																																																																	y,
																																																																	z);
																																																															BlockEntity _blockEntity = world
																																																																	.getBlockEntity(
																																																																			_bp);
																																																															BlockState _bs = world
																																																																	.getBlockState(
																																																																			_bp);
																																																															if (_blockEntity != null)
																																																																_blockEntity
																																																																		.getPersistentData()
																																																																		.putDouble(
																																																																				"craftingProgress",
																																																																				((new Object() {
																																																																					public double getValue(
																																																																							LevelAccessor world,
																																																																							BlockPos pos,
																																																																							String tag) {
																																																																						BlockEntity blockEntity = world
																																																																								.getBlockEntity(
																																																																										pos);
																																																																						if (blockEntity != null)
																																																																							return blockEntity
																																																																									.getPersistentData()
																																																																									.getDouble(
																																																																											tag);
																																																																						return -1;
																																																																					}
																																																																				}.getValue(
																																																																						world,
																																																																						new BlockPos(
																																																																								x,
																																																																								y,
																																																																								z),
																																																																						"craftingProgress"))
																																																																						- 1));
																																																															if (world instanceof Level _level)
																																																																_level.sendBlockUpdated(
																																																																		_bp,
																																																																		_bs,
																																																																		_bs,
																																																																		3);
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
								}
							}
						}
					}
				}
			}
		}
	}
}
