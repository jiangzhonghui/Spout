/*
 * This file is part of SpoutAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutAPI is licensed under the SpoutDev License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.api.math;

import org.spout.api.util.StringUtil;

/**
 * A 3-dimensional vector represented by int-precision x,y coordinates
 */
public class IntVector3 extends IntVector2 {

	private int z;

	public IntVector3(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	/**
	 * Sets the Z coordinate
	 * 
	 * @param z
	 */
	public void setZ(int z) {
		this.z = z;
	}
	
	/**
	 * Gets the Z coordinate
	 *
	 * @return The Z coordinate
	 */
	public int getZ() {
		return z;
	}
	
	/**
	 * Adds the given vector to this vector
	 * 
	 * @param other
	 */
	public void add(IntVector3 other) {
		super.add(other);
		z += other.z;
	}
	
	@Override
	public String toString() {
		return StringUtil.toString(getX(), getY(), getZ());
	}
	
}
