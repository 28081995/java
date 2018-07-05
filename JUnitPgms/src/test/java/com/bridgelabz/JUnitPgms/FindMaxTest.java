package com.bridgelabz.JUnitPgms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author bridgelabz
 *
 */
public class FindMaxTest {

	@Test
	public void test() {
		assertEquals(4, FindMax.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, FindMax.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

}
