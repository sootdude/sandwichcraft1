package net.mcreator.breadcraft.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CaperSeedsRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockFarmland = Blocks.AIR.defaultBlockState();
		BlockState blockStag0 = Blocks.AIR.defaultBlockState();
		ItemStack itemSeeds = ItemStack.EMPTY;
		itemSeeds = new ItemStack(BreadcraftModItems.CAPER_SEEDS.get());
		blockStag0 = BreadcraftModBlocks.CAPER_STAGE_0.get().defaultBlockState();
		blockFarmland = Blocks.FARMLAND.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemSeeds.getItem() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == blockFarmland.getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), blockStag0, 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = itemSeeds;
					_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemSeeds.getItem() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == blockFarmland.getBlock()
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.OFF_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), blockStag0, 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = itemSeeds;
					_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount() - 1));
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
