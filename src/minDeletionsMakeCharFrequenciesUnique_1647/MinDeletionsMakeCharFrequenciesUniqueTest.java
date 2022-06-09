package minDeletionsMakeCharFrequenciesUnique_1647;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinDeletionsMakeCharFrequenciesUniqueTest {

	@Test
	void example1() {
		String s = "aab";
		int expected = 0;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.minDeletions(s));
	}
	@Test
	void example2() {
		String s = "aaabbbcc";
		int expected = 2;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.minDeletions(s));
	}
	@Test
	void example3() {
		String s = "ceabaacb";
		int expected = 2;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.minDeletions(s));
	}
}
