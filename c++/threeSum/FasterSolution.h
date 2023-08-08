/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */

#ifndef FASTERSOLUTION_H_
#define FASTERSOLUTION_H_

#include <set>
#include <vector>
#include <map>
#include <algorithm>

class FasterSolution{
public:
	std::vector<std::vector<int>> threeSum(std::vector<int>& nums){

		std::sort(nums.begin(), nums.end(), std::greater<int>()); //Must be sorted to work

		// Loop through all legal pairs and add them to a unique set
		std::set<std::vector<int>> tripleSet;
		std::vector<int> tempVec;
		for(auto iPtr = nums.cbegin(); iPtr < nums.cend(); iPtr++){
			auto jPtr = iPtr + 1;
			auto kPtr = nums.end() - 1;
			while(jPtr < kPtr){
				// if i + j+ k == 0, add to set
				if((*iPtr + *jPtr + *kPtr) == 0){
					tempVec = {*iPtr, *jPtr, *kPtr};
					std::sort(tempVec.begin(), tempVec.end()); // Unfortunately necessary for validating correct answer
					tripleSet.insert(tempVec);
					--kPtr;
				}
				// if i + j + k > 0, increment j
				else if((*iPtr + *jPtr + *kPtr) > 0) ++jPtr;
				// if i + j + k < 0, decrement k
				else --kPtr;
			}
		}
		std::vector<std::vector<int>> results{tripleSet.begin(), tripleSet.end()};
		return results;
	}
};

#endif /* FASTERSOLUTION_H_ */
