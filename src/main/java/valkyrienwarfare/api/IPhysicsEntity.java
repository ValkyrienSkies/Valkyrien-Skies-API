package valkyrienwarfare.api;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public interface IPhysicsEntity {

	/**
	 * Rotates a vector from global to ship space, or from ship to global space.
	 * Typically used when adjusting the velocity vector of entities.
	 * 
	 * @param vector
	 * @param transformType
	 * @return
	 */
	Vec3d rotateVector(Vec3d vector, TransformType transformType);

	/**
	 * Transforms a vector from global to ship space, or from ship to global space.
	 * Typically used when adjusting the position vector of entities.
	 * 
	 * @param vector
	 * @param transformType
	 * @return
	 */
	Vec3d transformVector(Vec3d vector, TransformType transformType);

}
