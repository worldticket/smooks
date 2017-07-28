/*
 * Milyn - Copyright (C) 2006 - 2010
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (version 2.1) as published by the Free Software
 * Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU Lesser General Public License for more details:
 * http://www.gnu.org/licenses/lgpl.txt
 */

package org.milyn.function;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author <a href="mailto:maurice.zeijen@smies.com">maurice.zeijen@smies.com</a>
 */
public class UncapitalizeFirstFunctionTest {

	@Test
    public void test_execute() {
        UncapitalizeFirstFunction function = new UncapitalizeFirstFunction();

        assertEquals("maurice", function.execute("Maurice"));
        assertEquals("mAURICE", function.execute("MAURICE"));
        assertEquals(" maurice", function.execute(" Maurice"));
        assertEquals("maurice Zeijen", function.execute("Maurice Zeijen"));
    }

}
