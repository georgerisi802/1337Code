package sumSubarrayMinimums_907;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSubarrayMinimumsTest {

	@Test
	void example1() {
		int[] arr = new int[] {3,1,2,4};
		
		int expected = 17;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.sumSubarrayMins(arr));
	}
	
	@Test
	void example2() {
		int[] arr = new int[] {11,81,94,43,3};
		
		int expected = 444;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.sumSubarrayMins(arr));
	}
	
}
