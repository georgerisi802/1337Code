package bestTime_121;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bestTimeTest {

	@Test
	void Example1() {
		int [] prices = new int[] {7,1,5,3,6,4};
		int expected = 5;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxProfit(prices));
	}
	
	@Test
	void Example2() {
		int [] prices = new int[] {7,6,4,3,1};
		int expected = 0;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxProfit(prices));
	}
	
	@Test
	void Custom1() {
		int [] prices = new int[] {7,7,11,1,8,3,6,4};
		int expected = 7;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxProfit(prices));
	}

}
