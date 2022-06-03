package longestHappyString_1405;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestHappyStringTest {

	@Test
	void example1() {
		int a = 1, b = 1, c = 7;
		String expected = "ccaccbcc";
		
		Solution sol = new Solution();
		
		assertEquals(expected,sol.longestDiverseString(a,b,c));
	}
	@Test
	void example2() {
		int a = 7, b = 1, c = 0;
		String expected = "aabaa";
		
		Solution sol = new Solution();
		
		assertEquals(expected,sol.longestDiverseString(a,b,c));
	}
	@Test
	void example3() {
		int a = 2, b = 7, c = 10;
		String expected = "ccbccbbccbbccaabbcc";
		String expected2 = "ccbccbcbcbcbcbcacab";
		
		Solution sol = new Solution();
		
		assertTrue(expected.equals(sol.longestDiverseString(a,b,c)) || 
				expected2.equals(sol.longestDiverseString(a,b,c)));
		
		//assertEquals(expected,sol.longestDiverseString(a,b,c));
	}
	@Test
	void empty() {
		int a = 0, b = 0, c = 0;
		String expected = "";
		
		Solution sol = new Solution();
		
		assertEquals(expected,sol.longestDiverseString(a,b,c));
	}
	@Test
	void repeat() {
		int a = 6, b = 0, c = 0;
		String expected = "aa";
		
		Solution sol = new Solution();
		
		assertEquals(expected,sol.longestDiverseString(a,b,c));
	}
}
