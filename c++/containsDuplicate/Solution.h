/*
Given an integer array nums, return true if any value appears at least twice in
the array, and return false if every element is distinct.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <set>

class Solution{
public:
	bool containsDuplicate(std::vector<int>& nums){

		if(nums.size() < 2) return false; // Too short for dupes

		// Iterate through nums and insert into set
		std::set<int> history;
		bool unique;
		for(int n : nums){
			// Set insert returns boolean, true if inserted, false if duplicate
			unique = (history.insert(n)).second;
			if(!unique) return true;
		}
		return false;
	}
};

#endif /* SOLUTION_H_ */
