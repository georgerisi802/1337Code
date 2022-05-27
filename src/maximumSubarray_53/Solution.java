package maximumSubarray_53;

import java.lang.Math.*;
/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which 
 * has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and 
 * conquer approach, which is more subtle.
 */
class Solution {
	public int maxSubArray(int[] nums) {
		if(nums.length == 1) return nums[0];
		
		int curSum = nums[0];
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<nums.length; i++) {
			
		}
	}
}
