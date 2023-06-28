/*
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the
same element twice.

You can return the answer in any order.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <unordered_set>

class Solution {
public:
	std::vector<int> twoSum(std::vector<int>& nums, int target){

		std::vector<int> returnVec;
		std::unordered_set<int> set;

		for(size_t i=0; i < nums.size(); ++i){

			if(set.count(target - nums[i]) > 0){
				returnVec.emplace_back(nums[i]);
				returnVec.emplace_back(target - nums[i]);
				return returnVec;
			}
			else set.insert(nums[i]);
		}
		return returnVec;
	}

};

#endif /* SOLUTION_H_ */
