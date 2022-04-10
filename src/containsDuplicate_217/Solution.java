package containsDuplicate_217;

import java.util.*;
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */
class Solution {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length < 2) return false;
		
		HashSet<Integer> dupe = new HashSet<>();
		
		for(int i=0; i<nums.length; i++) {
			if(dupe.contains(nums[i])) return true;
			else dupe.add(nums[i]);
		}
		return false;
	}
}
// Runs in linear time