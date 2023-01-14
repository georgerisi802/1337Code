package sumSubarrayRanges_2104;

import java.util.Arrays;

/*
 * You are given an integer array nums. The range of a subarray of nums is the difference 
 * between the largest and smallest element in the subarray.
 * 
 * Return the sum of all subarray ranges of nums. Can you find a solution with o(n) time complexity?
 * 
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */

class Solution {
	public long subArrayRanges(int[] nums) {
		long sum = 0;
		
		int[] subArr;
		for(int i : nums) {
			for(int j : nums) {
				subArr = Arrays.copyOfRange(nums, i, j);
				
				sum += range(Arrays.
			}
		}
    }
	
	private long range(int min, int max) {
		return (long)max - min;
	}
}
