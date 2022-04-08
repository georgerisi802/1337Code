package twoSum_1;

import java.util.*;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that 
 * they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */

class Solution {
	public int[] twoSum(int [] nums, int target){
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			if(hm.containsKey(target - nums[i])) return new int [] {hm.get(target - nums[i]), i};
			else hm.put(nums[i],  i);
		}
		return new int [] {0,0}; // would be error
	}
}

