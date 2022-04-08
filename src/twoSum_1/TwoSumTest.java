package twoSum_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void Example1() {
		
		int [] nums = new int [] {2, 7, 11, 15};
		int target = 9;
		int [] expected = new int [] {0,1};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.twoSum(nums,target));
	}
	
	@Test
	void Example2() {
		
		int [] nums = new int [] {3,2,4};
		int target = 6;
		int [] expected = new int [] {1,2};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.twoSum(nums,target));
	}
	
	@Test
	void Example3() {
		
		int [] nums = new int [] {3,3};
		int target = 6;
		int [] expected = new int [] {0,1};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.twoSum(nums,target));
	}
}
