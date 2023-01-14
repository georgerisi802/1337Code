package sumSubarrayRanges_2104;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSubarrayRangesTest {

	@Test
	void example1() {
		int[] nums = new int[] {1,2,3};
		
		long expected = 4;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.subArrayRanges(nums));
	}
	
	void example2() {
		int[] nums = new int[] {1,3,3};
		
		long expected = 4;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.subArrayRanges(nums));
	}
	
	void example3() {
		int[] nums = new int[] {4,-2,-3,4,1};
		
		long expected = 59;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.subArrayRanges(nums));
	}
}
