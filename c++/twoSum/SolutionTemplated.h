/*
 * SolutionTemplated.h
 *
 *  Created on: Jul 17, 2023
 *      Author: george
 */

#ifndef SOLUTIONTEMPLATED_H_
#define SOLUTIONTEMPLATED_H_

#include <vector>
#include <unordered_map>

template<typename T>
class SolutionTemplated {
public:
	std::vector<T> twoSum(std::vector<T>& nums, T target){

		std::vector<T> returnVec;
		std::unordered_map<T, T> map;

		for(size_t i=0; i < nums.size(); ++i){

			if(map.count(target - nums[i]) > 0){
				returnVec.emplace_back(i);
				returnVec.emplace_back(map.at(target - nums[i]));
				return returnVec;
			}
			else map.insert(std::make_pair(nums[i], i));
		}

		// Question states that there is always exactly one solution, so this is
		// never hit.
		return returnVec;
	}

};

#endif /* SOLUTIONTEMPLATED_H_ */
