/*
Given an integer array nums, find the
subarray with the largest sum, and return its sum.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <algorithm>

class Solution{
	public:
	int maxSubarray(std::vector<int>& nums){
		if(nums.size() == 1) return nums[0];

		int prefix = 0;
		int maxSum = nums[0];

		for(size_t i=0; i < nums.size(); ++i){
			prefix += nums[i];
			maxSum = std::max(prefix, maxSum);
			if(prefix < 0) prefix = 0;
		}
		return maxSum;
	}
};



#endif /* SOLUTION_H_ */
