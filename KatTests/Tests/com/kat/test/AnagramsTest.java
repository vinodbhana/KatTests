package com.kat.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import KatTest.KatTests.Test1;

class AnagramsTest {

	@Test
	void testString1Null() {

		Test1 t1 = new Test1();
		String s1 = null;
		String s2 = "ABC";
		boolean anagrams = t1.isAnagrams(s1, s2);
		assertEquals(anagrams, false);
	}

	@Test
	void testString2Null() {

		Test1 t1 = new Test1();
		String s1 = "ABC";
		String s2 = null;
		boolean anagrams = t1.isAnagrams(s1, s2);
		assertEquals(anagrams, false);
	}

	@Test
	void testDiffLength() {

		Test1 t1 = new Test1();
		String s1 = "ABC";
		String s2 = "DCBA";
		boolean anagrams = t1.isAnagrams(s1, s2);
		assertEquals(anagrams, false);
	}

	@Test
	void testNoAnagrams() {

		Test1 t1 = new Test1();
		String s1 = "ABC";
		String s2 = "BCA";
		boolean anagrams = t1.isAnagrams(s1, s2);
		assertEquals(anagrams, false);
	}

	@Test
	void testValidAnagrams() {

		Test1 t1 = new Test1();
		String s1 = "ABC";
		String s2 = "CBA";
		boolean anagrams = t1.isAnagrams(s1, s2);
		assertEquals(anagrams, true);
	}
}
