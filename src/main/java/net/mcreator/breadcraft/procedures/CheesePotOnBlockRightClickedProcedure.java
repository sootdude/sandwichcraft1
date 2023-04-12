package net.mcreator.breadcraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.breadcraft.init.BreadcraftModItems;
import net.mcreator.breadcraft.init.BreadcraftModBlocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class CheesePotOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MILK_BUCKET && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 1;
					final ItemStack _setstack = new ItemStack(Items.MILK_BUCKET);
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.MILK_BUCKET);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.BUCKET);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BreadcraftModItems.BREADCRAFT_SALT.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
					final ItemStack _setstack = new ItemStack(BreadcraftModItems.BREADCRAFT_SALT.get());
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BreadcraftModItems.BREADCRAFT_SALT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BreadcraftModItems.LEMON_JUICE.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 3) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 3;
					final ItemStack _setstack = new ItemStack(BreadcraftModItems.LEMON_JUICE.get());
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BreadcraftModItems.LEMON_JUICE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BreadcraftModItems.RENNET.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 4;
					final ItemStack _setstack = new ItemStack(BreadcraftModItems.RENNET.get());
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BreadcraftModItems.RENNET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.YELLOW_DYE && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 5) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 5;
					final ItemStack _setstack = new ItemStack(Items.YELLOW_DYE);
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.YELLOW_DYE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_MUSHROOM.asItem() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 6) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.BROWN_MUSHROOM);
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.BROWN_MUSHROOM);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BreadcraftModItems.CREAM.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 7) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 7;
					final ItemStack _setstack = new ItemStack(BreadcraftModItems.CREAM.get());
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BreadcraftModItems.CREAM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BreadcraftModItems.OIL.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 8) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 8;
					final ItemStack _setstack = new ItemStack(BreadcraftModItems.OIL.get());
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BreadcraftModItems.OIL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_FUNGUS.asItem() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 9;
					final ItemStack _setstack = new ItemStack(Blocks.WARPED_FUNGUS);
					_setstack.setCount(1);
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.WARPED_FUNGUS);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GLASS_BOTTLE)) : false) && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 4) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 4;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BreadcraftModItems.RENNET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 5) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 5;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.YELLOW_DYE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 3) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 3;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BreadcraftModItems.LEMON_JUICE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 2) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 2;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BreadcraftModItems.BREADCRAFT_SALT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity.isShiftKeyDown() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BUCKET)) : false) && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 1) == 1) {
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.MILK_BUCKET);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BUCKET);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 6) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 6;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BROWN_MUSHROOM);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 7) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 7;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BreadcraftModItems.CREAM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 8) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 8;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BreadcraftModItems.OIL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (entity.isShiftKeyDown() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), 9) == 1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 9;
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
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.WARPED_FUNGUS);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 3) == 1 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 2;
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
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
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
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 4;
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
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 60);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 140);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.MOZZARELLA_CURDS.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 200);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
			} else {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
					if (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 2;
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
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 4;
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
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 60);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 140);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.CHEDDAR_CHEESE_CURDS.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 200);
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
					} else {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
							if (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 2) == 0 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 3) == 1 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 4) == 0 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 7) == 1 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 3;
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
								{
									BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _slotid = 7;
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
								{
									BlockPos _bp = new BlockPos(x, y, z);
									BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 60);
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 140);
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.CREAM_CHEESE.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 200);
								{
									BlockPos _bp = new BlockPos(x, y, z);
									BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
							} else {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
									if (new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 5) == 1 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
										public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicInteger _retval = new AtomicInteger(0);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 2;
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
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 4;
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
										{
											BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
											if (_ent != null) {
												final int _slotid = 5;
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
										{
											BlockPos _bp = new BlockPos(x, y, z);
											BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 60);
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 140);
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.COLBY_CHEESE_CURDS.get()));
													entityToSpawn.setPickUpDelay(10);
													_level.addFreshEntity(entityToSpawn);
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 200);
										{
											BlockPos _bp = new BlockPos(x, y, z);
											BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
									} else {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
											if (new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 6) == 1 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
												public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
													AtomicInteger _retval = new AtomicInteger(0);
													BlockEntity _ent = world.getBlockEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 2;
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
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 4;
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
												{
													BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
													if (_ent != null) {
														final int _slotid = 6;
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
												{
													BlockPos _bp = new BlockPos(x, y, z);
													BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 60);
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 140);
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.GOUDA_CHEESE_CURDS.get()));
															entityToSpawn.setPickUpDelay(10);
															_level.addFreshEntity(entityToSpawn);
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 200);
												{
													BlockPos _bp = new BlockPos(x, y, z);
													BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
											} else {
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
													if (new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 8) == 1 && new Object() {
														public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
															AtomicInteger _retval = new AtomicInteger(0);
															BlockEntity _ent = world.getBlockEntity(pos);
															if (_ent != null)
																_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
															return _retval.get();
														}
													}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 2;
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
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 4;
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
														{
															BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
															if (_ent != null) {
																final int _slotid = 8;
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
														{
															BlockPos _bp = new BlockPos(x, y, z);
															BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 60);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 140);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (world instanceof Level _level && !_level.isClientSide()) {
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.PARMESAN_CURDS.get()));
																	entityToSpawn.setPickUpDelay(10);
																	_level.addFreshEntity(entityToSpawn);
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 200);
														{
															BlockPos _bp = new BlockPos(x, y, z);
															BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
													} else {
														if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
															if (new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 7) == 1 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
																public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	BlockEntity _ent = world.getBlockEntity(pos);
																	if (_ent != null)
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos(x, y, z), 9) == 0) {
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 2;
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
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 4;
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
																{
																	BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																	if (_ent != null) {
																		final int _slotid = 7;
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
																{
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
																			}
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 60);
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
																			}
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 140);
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (world instanceof Level _level && !_level.isClientSide()) {
																			ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.BRIE_CHEESE_CURDS.get()));
																			entityToSpawn.setPickUpDelay(10);
																			_level.addFreshEntity(entityToSpawn);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 200);
																{
																	BlockPos _bp = new BlockPos(x, y, z);
																	BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
															} else {
																if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
																	if (new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 1) == 1 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 2) == 1 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 3) == 0 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 4) == 1 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 5) == 0 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 6) == 0 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 7) == 0 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 8) == 0 && new Object() {
																		public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																			AtomicInteger _retval = new AtomicInteger(0);
																			BlockEntity _ent = world.getBlockEntity(pos);
																			if (_ent != null)
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																			return _retval.get();
																		}
																	}.getAmount(world, new BlockPos(x, y, z), 9) == 1) {
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
																			}
																		}
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
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
																		{
																			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
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
																		{
																			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
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
																		{
																			BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
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
																		{
																			BlockPos _bp = new BlockPos(x, y, z);
																			BlockState _bs = BreadcraftModBlocks.CHEESE_POT_CRAFTING.get().defaultBlockState();
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
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof Level _level) {
																					if (!_level.isClientSide()) {
																						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1,
																								1);
																					} else {
																						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
																					}
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 60);
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof Level _level) {
																					if (!_level.isClientSide()) {
																						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1);
																					} else {
																						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.brewing_stand.brew")), SoundSource.NEUTRAL, 1, 1, false);
																					}
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 140);
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof Level _level && !_level.isClientSide()) {
																					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(BreadcraftModItems.BLUE_CHEESE_CURDS.get()));
																					entityToSpawn.setPickUpDelay(10);
																					_level.addFreshEntity(entityToSpawn);
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 200);
																		{
																			BlockPos _bp = new BlockPos(x, y, z);
																			BlockState _bs = BreadcraftModBlocks.CHEESE_POT.get().defaultBlockState();
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
