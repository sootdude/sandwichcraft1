package net.mcreator.breadcraft.procedures;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class SaltPotFullOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public int getFluidTankCapacity(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability -> _retval.set(capability.getTankCapacity(tank)));
				return _retval.get();
			}
		}.getFluidTankCapacity(world, new BlockPos(x, y, z), 1) == 1000) {
			world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 1);
		}
	}
}
