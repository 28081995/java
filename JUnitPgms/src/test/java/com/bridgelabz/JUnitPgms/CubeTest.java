package com.bridgelabz.JUnitPgms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author bridgelabz
 *
 */
public class CubeTest {

	@BeforeClass
	public static void SetUpBeforeClass() {
		System.out.println("BeforeClass");
	}

	@Before
	public void Before() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		System.out.println("testcase for cube");
		assertEquals(8, FindCube.cube(2));
	}

	@After
	public void SetUpAfter() {
		System.out.println("After");
	}

	@AfterClass
	public static void SetUpAfterClass() // method setupAfterClass should be static
	{
		System.out.println("AfterClass");
	}

}
