/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <set>
#include <vector>
#include <map>
#include <algorithm>

class Solution{
public:
	std::vector<std::vector<int>> threeSum(std::vector<int>& nums){

		std::unordered_multimap<int, std::pair<unsigned int, unsigned int>> intermediateSums; // <sums of pairs, <index, index>>
		for(size_t i=0; i<nums.size()-1; ++i){
			for(size_t j=i+1; j<nums.size(); ++j){
				intermediateSums.insert(std::make_pair(nums[i] + nums[j], std::make_pair(i, j)));
			}
		}
		std::vector<int> innerResult;
		std::set<std::vector<int>> resultSet{};
		for(size_t i=0; i<nums.size(); ++i){
			auto range = intermediateSums.equal_range(-nums[i]);
			for(auto iter = range.first; iter != range.second; ++iter){
				if((iter->second.first != i) && (iter->second.second != i)){
					innerResult = {nums[i], nums[iter->second.first], nums[iter->second.second]};
					std::sort(std::begin(innerResult), std::end(innerResult));
					resultSet.insert(innerResult);
				}
			}
		}
		std::vector<std::vector<int>> results{resultSet.begin(), resultSet.end()};
		return results;
	}
};

#endif /* SOLUTION_H_ */
