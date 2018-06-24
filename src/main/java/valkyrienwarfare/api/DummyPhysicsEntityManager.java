package valkyrienwarfare.api;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A dummy implementation of IPhysicsEntityManager thats used when VW isn't
 * installed. This class is explicitly made package protected, no external code
 * should ever use this.
 * 
 * @author thebest108
 *
 */
class DummyPhysicsEntityManager implements IPhysicsEntityManager {

	@Override
	public IPhysicsEntity getPhysicsEntityFromShipSpace(World world, BlockPos pos) {
		return null;
	}

}
