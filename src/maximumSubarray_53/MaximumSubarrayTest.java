package maximumSubarray_53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

	@Test
	void example1() {
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int expected = 6;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxSubArray(nums));
	}
	@Test
	void example2() {
		int[] nums = new int[] {1};
		int expected = 1;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxSubArray(nums));
	}
	@Test
	void example3() {
		int[] nums = new int[] {5,4,-1,7,8};
		int expected = 23;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.maxSubArray(nums));
	}
}
