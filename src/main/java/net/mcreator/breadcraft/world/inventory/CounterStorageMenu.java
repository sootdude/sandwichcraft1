
package net.mcreator.breadcraft.world.inventory;

import net.mcreator.breadcraft.BreadcraftMod;

public class CounterStorageMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public CounterStorageMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(BreadcraftModMenus.COUNTER_STORAGE.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(27);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 8, 17) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 26, 17) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 44, 17) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 62, 17) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 80, 17) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 98, 17) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 116, 17) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 134, 17) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 152, 17) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 8, 35) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 26, 35) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 44, 35) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 62, 35) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 80, 35) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 98, 35) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 116, 35) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 134, 35) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 152, 35) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 8, 53) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 26, 53) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 44, 53) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 62, 53) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 80, 53) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 98, 53) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 116, 53) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 134, 53) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 152, 53) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 27) {
				if (!this.moveItemStackTo(itemstack1, 27, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 27, false)) {
				if (index < 27 + 27) {
					if (!this.moveItemStackTo(itemstack1, 27 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 27, 27 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override /* failed to load code for net.minecraft.world.inventory.AbstractContainerMenu */
	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}