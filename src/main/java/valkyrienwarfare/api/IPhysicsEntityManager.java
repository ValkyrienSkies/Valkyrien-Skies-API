package valkyrienwarfare.api;

import javax.annotation.Nullable;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IPhysicsEntityManager {

	/**
	 * If the given BlockPos is in ship space then this returns the IPhysicsEntity
	 * pertaining to the pos. If the BlockPos is not in ship space then returns
	 * null.
	 * 
	 * @param world
	 * @param pos
	 * @return
	 */
	@Nullable
	IPhysicsEntity getPhysicsEntityFromShipSpace(World world, BlockPos pos);

	default boolean isBlockPosManagedByPhysicsEntity(World world, BlockPos pos) {
		return getPhysicsEntityFromShipSpace(world, pos) != null;
	}
}
