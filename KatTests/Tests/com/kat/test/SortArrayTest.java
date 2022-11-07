package com.kat.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import KatTest.KatTests.Test1;

class SortArrayTest {

	@Test
	void testSortArrayNull() {

		Test1 t1 = new Test1();
		int arr[] = null;
		try {
			t1.sortArray(arr, 3);
			fail("Failed - no exception raised for null array.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testSortArrayLarge() throws Exception {
		Test1 t1 = new Test1();
		int arr[] = { 2, 12, 1, 9, 6 };
		int rtnArr[] = t1.sortArray(arr, 6);
		assertEquals(rtnArr.length, 5);

	}

	@Test
	void testSortArrayValid() throws Exception {

		Test1 t1 = new Test1();
		int arr[] = { 2, 12, 1, 9, 6 };
		int rtnArr[] = t1.sortArray(arr, 3);
		assertEquals(rtnArr.length, 3);
		assertEquals(rtnArr[0], 12);
		assertEquals(rtnArr[1], 9);
		assertEquals(rtnArr[2], 6);
	}
}
