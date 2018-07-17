/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.particlejs.options;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.utilities.StaticStrings;

/**
 * The movement direction
 */
public enum ParticleMoveDirection
{
	none,
	top,
	top_right,
	right,
	bottom_right,
	bottom,
	bottom_left,
	left,
	top_left;

	@JsonValue
	@Override
	public String toString()
	{
		return super.toString()
		            .replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH);
	}
}